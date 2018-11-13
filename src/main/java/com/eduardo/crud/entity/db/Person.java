package com.eduardo.crud.entity.db;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@JsonIgnoreProperties

public class Person implements Serializable {
	
	
	@Column(name="name_person",updatable=true,nullable= false,length=20)
	private String namePerson;
	
	@Column(name="lastname_person",updatable=true,nullable= false,length=20)
	private String lastnamePerson;
	
	 @Column(name="create_at_person", nullable = false, updatable = false)
	 @Temporal(TemporalType.TIMESTAMP)
	 @CreatedDate
	 private Date createdAt;
	
	@Column(name="age_person",updatable=true,nullable= false)
	private int agePerson;
	
	@Column(name="gender_person",updatable=true,nullable= false)
	@Enumerated(EnumType.STRING)
	private Gender genderPerson;
	
	@Id
	@Column(name="idcard_person",updatable=true,nullable= false,length=10)
	private String idCardPerson;
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_blood_type",nullable=false)
	private BloodType bloodTypePerson;
	
	

}
