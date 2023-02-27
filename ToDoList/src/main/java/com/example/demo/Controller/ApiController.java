package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Model.Task;
import com.example.demo.Repository.TaskRepo;
import com.example.demo.Service.ApiService;

@RestController
public class ApiController {

	@Autowired
	TaskRepo serviceRepository;
	@Autowired
	ApiService service;
	
	@GetMapping("/get")
	List<Task> getList(){
		return serviceRepository.findAll();
	}
	@PostMapping("/post")
	public Task create(@RequestBody Task t) {
		return serviceRepository.save(t);
	}
	@GetMapping("/get/{id}")
	public Optional<Task> getbyid(@PathVariable int id){
		return service.getTask(id);
	}
	@DeleteMapping("/del")
		public String delete(@RequestParam int id) {
			return service.deleteDetails(id);
		}
	
	
}
