package com.lenam.springboot.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lenam.springboot.jpa.entity.Employee;
import com.lenam.springboot.jpa.model.EmployeeDepartment;
import com.lenam.springboot.jpa.model.EmployeeFullName;

//@Repository
public interface EmployeeRepository  extends CrudRepository<Employee, Long>{
	
	List<Employee> findByAge(int age);
	List<Employee> findByFirstNameAndLastName(String firstName, String lastName);
	
	@Query("SELECT e.firstName, e.lastName,e.age FROM Employee e ORDER By e.age DESC")
	List<Object[]> getEmpFullName();
	
	
	@Query("SELECT NEW com.lenam.springboot.jpa.model.EmployeeFullName	 (concat(e.firstName,' ', e.lastName),e.age) FROM Employee e ORDER By e.age DESC")
	List<EmployeeFullName>  getEmpFullNameModel();
	@Query("SELECT NEW com.lenam.springboot.jpa.model.EmployeeDepartment (concat(e.firstName,' ', e.lastName),e.age,d.name) FROM Employee e, Department d where e.deptId = d.id ORDER By e.age DESC")
	List<EmployeeDepartment>  getEmpFullDepartment();
	
}
