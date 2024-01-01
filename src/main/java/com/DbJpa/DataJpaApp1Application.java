package com.DbJpa;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.DbJpa.entity.Player;
import com.DbJpa.repository.PlayerRepository;


@SpringBootApplication
public class DataJpaApp1Application {

	public static void main(String[] args) {
		 
		ConfigurableApplicationContext context= SpringApplication.run(DataJpaApp1Application.class, args);
		PlayerRepository p=context.getBean(PlayerRepository.class);	//getBean method is used to give the obj
		
		
	Player p1=new Player(101,"kasi",29,"Ramapuram");
	Player p2=new Player(102,"naga",29,"Ramapuram");
	Player p3=new Player(103,"suri",34,"Vizak");
	Player p4=new Player(104,"vamshi",27,"Kakinada");
	
	
	
}
	
}
