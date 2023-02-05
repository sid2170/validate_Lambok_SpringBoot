package com.demo.Library.Service;

import java.util.List;
import java.util.Optional;

import com.demo.Library.model.Library;

public interface LibraryService {
	
	public Library save(Library lib);
	
	public List<Library> find();
	
	public Library findById(Integer id);	
	public void delete(Integer id);
	
	public Library update(Library lib);

}
