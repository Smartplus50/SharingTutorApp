package com.udacity.mvc.Subjects;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface SubjectsRepository extends CrudRepository<Subjects, String> {
	
	public List<Subjects> findByName(String name);


}
