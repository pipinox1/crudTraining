package com.eduardo.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduardo.crud.entity.db.Person;
import com.eduardo.crud.iservice.PersonIService;

@RestController
public class PersonController {
	
	@Autowired
	@Qualifier("personService")
	PersonIService personService;
	
	
	
	 @RequestMapping("/people")
	public List<Person> getPeople(){
		 
		 List<Person> list = personService.getAllPeople();
		 for(Person p : list) {
			 System.out.println();
		 }
		 
		
		return personService.getAllPeople();
		
	}
	

}
