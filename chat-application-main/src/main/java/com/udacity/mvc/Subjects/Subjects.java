package com.udacity.mvc.Subjects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subjects {
	
	@Id
	   private String id;
	   private String name;
	   private String english;
	   private String math;	   
	   private String chinese;
	   private String liberal;

	public Subjects(String id, String name, String subjects, String english, String math, String chinese, String liberal) 
	{
		this.id = id;
		this.name = name;
		this.english = english;
		this.math = math;
		this.chinese = chinese;
		this.liberal = liberal;
	}	
	
	public Subjects() 
	{
		
	}

	public String getId() 
	{
		return id;
	}
	public void setId(String id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}	   
	public String getEnglish() 
	{
		return english;
	}
	public void setEnglish(String english) 
	{
		this.english = english;
	}
	public String getMath() 
	{
		return math;
	}
	public void setMath(String math) 
	{
		this.math = math;
	}
	public String getChinese() 
	{
		return chinese;
	}
	public void setSChinese(String chinese) 
	{
		this.chinese = chinese;
	}
	public String getLiberal() 
	{
		return liberal;
	}
	public void setLiberal(String liberal) 
	{
		this.liberal = liberal;
	}
}
