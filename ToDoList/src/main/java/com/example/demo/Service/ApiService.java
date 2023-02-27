package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Model.Task;
import com.example.demo.Repository.TaskRepo;

@Service
public class ApiService {

	
	@Autowired
	TaskRepo  repository;
	
	public Optional<Task> getTask(int id){
		return repository.findById(id);
	}
	
	public String deleteDetails(int id) {
		repository.deleteById(id);
		return "id Deleted";
	}
}
