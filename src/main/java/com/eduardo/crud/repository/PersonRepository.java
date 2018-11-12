package com.eduardo.crud.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eduardo.crud.entity.db.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person,Serializable>{
	
	List<Person> findAll();
	 
	Person findByIdCardPerson(String idCardPerson);
	
	 Person save(Person person);

}
