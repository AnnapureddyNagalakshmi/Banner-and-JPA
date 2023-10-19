package com.DbJpa;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.DbJpa.entity.Player;
import com.DbJpa.repo.PlayerRepository;

@SpringBootApplication
public class DataJpaApp1Application {

	public static void main(String[] args) {
		 
		ConfigurableApplicationContext context= SpringApplication.run(DataJpaApp1Application.class, args);
		PlayerRepository p=context.getBean(PlayerRepository.class);	//getBean method is used to give the obj
		Player p1=new Player();
	p1.setPlayerId(101);
	p1.setPlayerName("kasi");
	p1.setPlayerAge(30);
	p1.setLocation("Markapuram");
	//p.save(p1);
	
	Player p2=new Player(102,"naga",29,"Ramapuram");
	Player p3=new Player(103,"suri",34,"Vizak");
	Player p4=new Player(104,"vamshi",27,"Kakinada");
	
	p.saveAll(Arrays.asList(p2,p3,p4));
	
	//To retrive single record
/*	Optional<Player> findBYId=p.findById(102);
	if(findBYId.isPresent()) {
		System.out.println(findBYId.get());
	}*/
	
	//List of elements by using id
	
	/*	Iterable<Player> allById=  p.findAllById(Arrays.asList(101,103,104));
		allById.forEach(player->{
		System.out.println(player);
		});
	*/
	
	//Print all records
/*	Iterable<Player> findAll=p.findAll();
	findAll.forEach(player->{
		System.out.println(player);
	});*/
	
	//Count the no. of records
/*	long count=p.count();
	System.out.println("Total records of the table :: "+count);
	*/
	
	//If the record is present or not
/*	boolean existsById=p.existsById(201);
	System.out.println("Records present or not :: "+existsById);
	*/
	
	//delete the record using id
	
/*	p.deleteById(101);*/
	
	//delete the multiple records using id
	
/*	p.deleteAllById(Arrays.asList(102,103));*/
}
	
}
