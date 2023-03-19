package com.udacity.mvc.Subjects;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SubjectsController {
	
	@Autowired 
	private SubjectsService SubjectsService;

	 @RequestMapping(value = "/Subjects")
	 public String getAllSubjects(Model model) 
	 {				
		List<Subjects> Subjects =  SubjectsService.getAllSubjects();
		
		model.addAttribute("Subjects", Subjects);
		
		return "Subjects";		
	 }	
	 	 
	 @RequestMapping(value = "/Subjects/{id}")
	 public Optional<Subjects> getSubjects(@PathVariable String id) {
	 	return SubjectsService.getSubjects(id);
	 }	 
	 
	 @RequestMapping(value = "/Subjects/name/{name}")
	 public List<Subjects> getSubjectssByName(@PathVariable String name) {
	 	return SubjectsService.getSubjectssByName(name);
	 }	

	  
	 @RequestMapping(value = "/Subjects/english/{english}")
	 public List<Subjects> getSubjectssByEnglish(@PathVariable String english) {
	 	return SubjectsService.getSubjectssByEnglish(english);
	 }	

	 @RequestMapping(value = "/Subjects/math/{math}")
	 public List<Subjects> getSubjectssByMath(@PathVariable String math) {
	 	return SubjectsService.getSubjectssByMath(math);
	 }	

	 @RequestMapping(value = "/Subjects/chinese/{chinese}")
	 public List<Subjects> getSubjectssByChinese(@PathVariable String chinese) {
	 	return SubjectsService.getSubjectssByChinese(chinese);
	 }	

	 @RequestMapping(value = "/Subjects/liberal/{liberal}")
	 public List<Subjects> getSubjectssByLiberal(@PathVariable String liberal) {
	 	return SubjectsService.getSubjectssByLiberal(liberal);
	 }	
	 
	 @RequestMapping(value = "/Subjects", method=RequestMethod.POST)
	 public void addSubjects(@RequestBody Subjects Subjects) {
		 SubjectsService.addSubjects(Subjects);
	 }
	 
	 @RequestMapping(value = "/Subjects/{id}", method = RequestMethod.PUT)
	 public void updateSubjects(@RequestBody Subjects Subjects,@PathVariable String id ) {
		 SubjectsService.updateSubjects(id, Subjects);
	 }
	 
	 @RequestMapping(value = "/Subjects/{id}", method = RequestMethod.DELETE)
	 public void deleteSubjects(@PathVariable String id) {
		 SubjectsService.deleteSubjects(id);
		 	 
	 }	 
}
