package com.example.demo.repositroy;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	@Query("select u from User u where u.email = :email")
	public User getUserByUserName(@Param("email") String email);

	@Query("select u from User u where u.role = :role")
	public List<User> getUserByRole(@Param("role") String role);

	//User findByUserName(String userName);

	//List<User> findByRole(String role);
}
