package com.eduardo.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.eduardo.crud.entity.db.Person;
import com.eduardo.crud.iservice.PersonIService;
import com.eduardo.crud.repository.PersonRepository;

@Service("personService")
public class PersonService implements  PersonIService{
	
	@Autowired
	@Qualifier("personRepository")
	PersonRepository personRepository;

	@Override
	public List<Person> getAllPeople() {
		
		
		
		return personRepository.findAll();
	}


}
