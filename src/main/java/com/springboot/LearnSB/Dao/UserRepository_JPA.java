package com.springboot.LearnSB.Dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.LearnSB.Entities.User_JPA;

public interface UserRepository_JPA extends CrudRepository<User_JPA, Integer> {

}