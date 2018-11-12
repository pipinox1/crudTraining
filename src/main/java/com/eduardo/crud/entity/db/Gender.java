package com.eduardo.crud.entity.db;

public enum Gender {
	
	FEMALE("Female"),
	MALE("Male");
	
	private String genderName;

	 Gender(final String genderName) {
	        this.genderName = genderName;
	    }

	public String getGenderName() {
		return genderName;
	}

	public void setGenderName(String genderName) {
		this.genderName = genderName;
	}
	
		
	

}
