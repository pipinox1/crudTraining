package com.eduardo.crud.entity.db;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class BloodType implements Serializable{
	
	@Column(name="name_bloodtype",updatable=true,nullable= false,length=10)
	private String nameBloodType;
	
	@Id
	@Column(name="id_bloodtype",updatable=true,nullable= false,length=10)
	private String IdBloodType;
	
	

}
