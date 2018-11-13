package com.eduardo.crud.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.eduardo.crud.entity.db.Person;
import com.eduardo.crud.iservice.PersonIService;

@RestController
@RequestMapping("/api")
public class PersonController {
	
	@Autowired
	@Qualifier("personService")
	PersonIService personService;
	
	

	
	 @GetMapping("/people")
	public List<Person> getPeople(){
		 
		 List<Person> list = personService.getAllPeople();
		 for(Person p : list) {
			 System.out.println();
		 }
		 
		
		return personService.getAllPeople();
		
	}
	 @GetMapping("/people/{idCardPerson}")
	 public Person editPerson(@Valid @PathVariable(value = "idCardPerson") String idCardPerson) {
		 
		
		 
		 return personService.getPersonByIdCard(idCardPerson);
			
	 
	 }
	 
	 @PostMapping("/people")
	 public Person createPerson(@RequestBody Person person) {
		 
		 
		return person;
		 
	 }
	 
	 @PutMapping("/people/{idCardPerson}")
	 public Person editPerson(@PathVariable(value = "idCardPerson") String idCardPerson, @RequestBody Person person) {
		 
		 return personService.editPerson(idCardPerson, person);
	 }
	 
	 
	 @DeleteMapping("/people/{idCardPerson}")
	 public ResponseEntity<?> deletePerson(@PathVariable(value="idCardPerson") String idCardPerson){
		 
		 personService.deletePerson(idCardPerson);
		 
		 return ResponseEntity.ok().build();
	 }
	 
	}
	


