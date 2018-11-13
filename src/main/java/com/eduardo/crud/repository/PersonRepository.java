package com.eduardo.crud.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eduardo.crud.entity.db.Person;

@Repository("personRepository")
public interface PersonRepository extends JpaRepository<Person,String>{
	
	List<Person> findAll();
	
	 Optional<Person> findByIdCardPerson(String idCardPerson);
	 
	
	
	 @SuppressWarnings("unchecked")
	Person save(Person person);

}
