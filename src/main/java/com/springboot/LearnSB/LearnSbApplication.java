package com.springboot.LearnSB;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springboot.LearnSB.Dao.UserRepository_JPA;
import com.springboot.LearnSB.Entities.User_JPA;

@SpringBootApplication
public class LearnSbApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(LearnSbApplication.class, args);

		UserRepository_JPA userRepository = context.getBean(UserRepository_JPA.class);

		// if you want to have save operation for single user then

//	User_JPA user= new User_JPA();
//	user.setName("Goku");
//	user.setCity("Thane");
//	user.setStatus("LAMP Stack Developer");
//	User_JPA u= userRepository.save(user);
//	System.out.println(u);
//	

		// if you want to have save operation for Multiple users then

//		User_JPA user1 = new User_JPA();
//
//		user1.setName("Goku");
//		user1.setCity("Thane");
//		user1.setStatus("LAMP Stack Developer");
//
//		User_JPA user2 = new User_JPA();
//		user2.setName("Vegeta");
//		user2.setCity("Rabale");
//		user2.setStatus("Mern Stack Developer");
//
//		List<User_JPA> users = List.of(user1, user2);
//		Iterable<User_JPA> result = userRepository.saveAll(users);
//
//		result.forEach(user -> {
//			System.out.println(user);
//		});

		
		//update the user of id 11
//		Optional<User_JPA> optional=userRepository.findById(3);
//		User_JPA user = optional.get();
//		user.setName("Manoj");
//		user.setCity("jaipur");
//		User_JPA updatedUser = userRepository.save(user);
//		System.out.println(user);
//		System.out.println(updatedUser);
		
		
		//how to get the data
		// findById(id) -> it will return Optional containing your data
		// if Optional dont have any data it hs to be surrounded by try catch 
		// because it will throw an exception
		
		
//		Iterable<User_JPA> itr = userRepository.findAll();
//		
//		itr.forEach(user->{
//			System.out.println(user);
//		});
		
		//how to delete the element
//		userRepository.deleteById(2);
		
		// it will delete all the users
//		Iterable<User_JPA> allUsers = userRepository.findAll();
//		allUsers.forEach(users->{
//			System.out.println(users);
//		});
//		userRepository.deleteAll(allUsers);
		
		
		
		
		
		
		
		
		
		
		
	}

}
