package com.demo.Library.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Library.model.Library;

import com.demo.Library.Service.LibraryService;



@RestController
public class LibraryController {
	
	
	
	@Autowired
	LibraryService libservice;
	
	@PostMapping("/save")
	public Library save(@RequestBody Library lib) {
		return libservice.save(lib);
	}
	
	@GetMapping("/find")
	public List<Library> find(){
		
		return libservice.find();
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Integer id) {
		libservice.delete(id);
	}
	
	@PutMapping("/update")
	public Library update(@RequestBody Library lib) {
		
		return libservice.update(lib);
	}
	
	@PostMapping("/userSave")
	public ResponseEntity<Library> create(@RequestBody @Valid Library u) {
		
		
		return new ResponseEntity<>(libservice.save(u),HttpStatus.CREATED);
	}
	
	@GetMapping("/finduser/{x}")
	public ResponseEntity<Library> saveUser(@PathVariable Integer x) {
		return new ResponseEntity<>(libservice.findById(x),HttpStatus.CREATED);
	}

}
