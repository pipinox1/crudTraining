package com.eduardo.crud.entity.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Person {
	
	
	@Column(name="name_person",updatable=true,nullable= false,length=20)
	private String namePerson;
	
	@Column(name="lastname_person",updatable=true,nullable= false,length=20)
	private String lastnamePerson;
	
	@Column(name="age_person",updatable=true,nullable= false)
	private int agePerson;
	
	@Column(name="gender_person",updatable=true,nullable= false)
	@Enumerated(EnumType.STRING)
	private Gender genderPerson;
	
	@Id
	@Column(name="idcard_person",updatable=true,nullable= false,length=10)
	private int idCardPerson;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_blood_type",nullable=false)
	private BloodType bloodTypePerson;
	
	

}
