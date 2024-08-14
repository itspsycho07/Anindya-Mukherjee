package com.example.employeemanagementsystem.repository;

import com.example.employeemanagementsystem.model.Employee;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.PagingAndSortingRepository;


import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long>, PagingAndSortingRepository<Employee, Long>{

	 // Execute named query to find employees by department name
    List<Employee> findByDepartmentName(@Param("departmentName") String departmentName);

    // Execute named query to find employee by email
    Employee findByEmail(@Param("email") String email);
	    
	 // Find all employees with pagination
	    Page<Employee> findAll(Pageable pageable);
	    
	    // Find employees by department name with pagination
	    Page<Employee> findByDepartmentName(String departmentName, Pageable pageable);
}
