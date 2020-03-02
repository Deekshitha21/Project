package com.example.demo.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@RestController
@RequestMapping(path="/demo")
public class MainController {
	@Autowired
	private UserRepository userRepository;
	@PostMapping(path="/add")
	  public @ResponseBody String addNewUser (@RequestParam String name
	      , @RequestParam String dept) {

	    User n = new User();
	    n.setName(name);
	    n.setDept(dept);
	    userRepository.save(n);
	    return "Saved";
	}
	/*public  String addNewUser(@RequestBody User user)
	{
	    userRepository.save(user);
	    return "Saved";
	}*/
	@GetMapping(path="/all")
	public @ResponseBody Iterable<User> getAllUsers(){
		return userRepository.findAll();
	}
	@GetMapping("{id}") 
 	public Optional<User> getUser(@PathVariable Long id) { 
	    return userRepository.findById(id);
	}
	@PutMapping(path="/update/{id}")
	public  String updateNewUser(@PathVariable Long id,@RequestBody User user)
	{
		User u=userRepository.getOne(id);
		u.setName(user.getName()); 
		u.setDept(user.getDept()); 
		userRepository.save(u); 
	    return "Updated";
	}
 	@DeleteMapping(path="/delete/{id}") 
	public String deleteStudent(@PathVariable Long id) { 
	 		userRepository.findById(id); 
	 		userRepository.deleteById(id);
	 		return "delete";


}
}
