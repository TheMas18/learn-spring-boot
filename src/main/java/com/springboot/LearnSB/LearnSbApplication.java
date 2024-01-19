package com.springboot.LearnSB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springboot.LearnSB.Dao.UserRepository_JPA;
import com.springboot.LearnSB.Entities.User_JPA;

@SpringBootApplication
public class LearnSbApplication {


	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(LearnSbApplication.class, args);
	
	UserRepository_JPA userRepository = context.getBean(UserRepository_JPA.class);
	User_JPA user= new User_JPA();
	user.setName("Mas");
	user.setCity("Navi Mumbai");
	user.setStatus("Full Stack Developer");
	
	User_JPA u = userRepository.save(user);
	System.out.println(u);
	}

}
