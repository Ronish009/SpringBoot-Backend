package com.ron.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.ron.model.User;
import com.ron.repository.UserRepository;


@SpringBootApplication
@ComponentScan("com.ron")
@EntityScan("com.ron.model")
@EnableJpaRepositories("com.ron.repository")
public class SpringBackEndApplication implements CommandLineRunner {
	public static void main(String[] args) {
	SpringApplication.run(SpringBackEndApplication.class, args);
	}
	
    @Autowired
	private UserRepository userRepository1;
    
	@Override
	public void run(String... args) throws Exception {
		this.userRepository1.save(new User("Ronish", "Shandilya", "ronish.shandilya@gmail.com"));
		this.userRepository1.save(new User("Preeti", "Shandilya", "preeti.shandilya@gmail.com"));
		this.userRepository1.save(new User("Rachit", "Shandilya", "rachit.shandilya@gmail.com"));
		
	}
}
