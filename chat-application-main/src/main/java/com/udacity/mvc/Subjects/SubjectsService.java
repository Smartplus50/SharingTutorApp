package com.udacity.mvc.Subjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectsService {
	
	@Autowired
	private SubjectsRepository SubjectsRepository;

   public List<Subjects> getAllSubjects() {
	   List<Subjects> Subjects  = new ArrayList<>();
	   
	   SubjectsRepository.findAll()
	   .forEach(Subjects::add);
	   
	   return Subjects;
   }
   
   //returns list of Subjectss base on a given name
   public List<Subjects> getSubjectssByName(String name) {
	   List<Subjects> Subjects  = new ArrayList<>();
	   
	   SubjectsRepository.findByName(name)
	   .forEach(Subjects::add);
	   
	   return Subjects;
   }

    //returns list of Tutors based on subject English
	public List<Subjects> getSubjectssByEnglish(String english) {
		List<Subjects> Subjects  = new ArrayList<>();
		
		
		
		return Subjects;
	}

	 //returns list of Tutors based on subject Math
	 public List<Subjects> getSubjectssByMath(String math) {
		List<Subjects> Subjects  = new ArrayList<>();
		
		
		
		return Subjects;
	}

	 //returns list of Tutors based on subject English
	 public List<Subjects> getSubjectssByChinese(String chinese) {
		List<Subjects> Subjects  = new ArrayList<>();
		
		
		
		return Subjects;
	}


	 //returns list of Tutors based on subject English
	 public List<Subjects> getSubjectssByLiberal(String liberal) {
		List<Subjects> Subjects  = new ArrayList<>();
		
		
		
		return Subjects;
	}


   
   
   public Optional<Subjects> getSubjects(String id) {
	  return SubjectsRepository.findById(id);
	}
   
   
   public void addSubjects(Subjects Subjects) {
	   SubjectsRepository.save(Subjects);
	}
   
   public void deleteSubjects(String id) {
	   SubjectsRepository.deleteById(id);
	}
   
   
   public void updateSubjects(String id, Subjects Subjects) {
		SubjectsRepository.save(Subjects);
	}
   
   
   

}
