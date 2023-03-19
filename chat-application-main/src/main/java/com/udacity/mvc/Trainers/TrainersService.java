package com.udacity.mvc.Trainers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainersService {
	
	@Autowired
	private TrainersRepository TrainersRepository;

   public List<Trainers> getAllTrainers() {
	   List<Trainers> Trainers  = new ArrayList<>();
	   
	   TrainersRepository.findAll()
	   .forEach(Trainers::add);
	   
	   return Trainers;
   }
   
   //returns list of Trainerss base on a given name
   public List<Trainers> getTrainerssByName(String name) {
	   List<Trainers> Trainers  = new ArrayList<>();
	   
	   TrainersRepository.findByName(name)
	   .forEach(Trainers::add);
	   
	   return Trainers;
   }

    //returns list of Trainerss base on a given degree
	public List<Trainers> getTrainerssByDegree(String degree) {
		List<Trainers> Trainers  = new ArrayList<>();
		
		
		
		return Trainers;
	}

	 //returns list of Trainerss base on a given session
	 public List<Trainers> getTrainerssBysession(String session) {
		List<Trainers> Trainers  = new ArrayList<>();
		
		
		return Trainers;
	}
   
   
   public Optional<Trainers> getTrainers(String id) {
	  return TrainersRepository.findById(id);
	}
   
   
   public void addTrainers(Trainers Trainers) {
	   TrainersRepository.save(Trainers);
	}
   
   public void deleteTrainers(String id) {
	   TrainersRepository.deleteById(id);
	}
   
   
   public void updateTrainers(String id, Trainers Trainers) {
		TrainersRepository.save(Trainers);
	}
   
   
   

}
