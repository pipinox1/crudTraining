package com.eduardo.crud.iservice;

import java.util.List;

import com.eduardo.crud.entity.db.Person;

public interface PersonIService {
	
	public List<Person> getAllPeople();
	
	public Person getPersonByIdCard(String idCardPerson);

	public Person editPerson(String id,Person person);
	
	public void deletePerson(String idCardPerson);
}
