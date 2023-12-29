package com.example.demo.repositroy;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Employee;
import com.example.demo.entities.User;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query("select u from Employee u where u.email = :email")
	public User getEmployeeByUserName(@Param("email") String email);

	public User save(User user);

}
