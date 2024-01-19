package com.springboot.LearnSB.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.springboot.LearnSB.Entities.User_JPA;

public interface UserRepository_JPA extends CrudRepository<User_JPA, Integer> {

	// Custom finder methods
	public List<User_JPA> findByName(String name);

	public List<User_JPA> findByNameAndCity(String name, String city);

	@Query("SELECT u FROM User_JPA u")
	public List<User_JPA> getAllUser();

	@Query("SELECT u FROM User_JPA u WHERE u.name= :n and u.city= :c")
	public List<User_JPA> getUserByName(@Param("n") String name, @Param("c") String city);
	
	
	//Native /sql queries
	@Query(value="SELECT * from user_jpa" , nativeQuery=true)
	public List<User_JPA> getUser();
	
}