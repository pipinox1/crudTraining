package com.eduardo.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.eduardo.crud.ResourceNotFoundException;
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
	


	@Override
	public Person getPersonByIdCard(String idCardPerson) {
		// TODO Auto-generated method stub
		return personRepository.findByIdCardPerson(idCardPerson).orElseThrow(() -> new ResourceNotFoundException("Person", "idCardPerson", idCardPerson));
	}



	@Override
	public Person editPerson(String idCardPerson, Person person) {
		Person personedit = personRepository.findByIdCardPerson(idCardPerson).orElseThrow(() -> new ResourceNotFoundException("Person", "idCardPerson", idCardPerson));
		personedit.setAgePerson(person.getAgePerson());
		personedit.setBloodTypePerson(person.getBloodTypePerson());
		personedit.setCreatedAt(person.getCreatedAt());
		personedit.setGenderPerson(person.getGenderPerson());
		personedit.setNamePerson(person.getNamePerson());
		personedit.setLastnamePerson(person.getLastnamePerson());
		personedit.setIdCardPerson(person.getIdCardPerson());
		
		return personRepository.save(personedit);
	}



	@Override
	public void deletePerson(String idCardPerson) {
		
		Person persondelete = personRepository.findByIdCardPerson(idCardPerson).orElseThrow(() -> new ResourceNotFoundException("Person", "idCardPerson", idCardPerson));;
		personRepository.delete(persondelete);
		
	}
	


}
