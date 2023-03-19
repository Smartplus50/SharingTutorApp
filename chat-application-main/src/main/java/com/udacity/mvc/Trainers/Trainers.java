package com.udacity.mvc.Trainers;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trainers {
	
	@Id
	   private String id;
	   private String name;
	   private String degree;
	   private String session;	   

	public Trainers(String id, String name, String degree, String session) 
	{
		this.id = id;
		this.name = name;
		this.degree = degree;
		this.session = session;
	}	
	
	public Trainers() 
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
	public String getDegree() 
	{
		return degree;
	}
	public void setDegree(String degree) 
	{
		this.degree = degree;
	}
	public String getSession() 
	{
		return session;
	}
	public void setSession(String session) 
	{
		this.session = session;
	} 
}
