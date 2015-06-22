package ru.sareth.chipmunk.service;

import java.util.List;

import ru.sareth.chipmunk.model.Queryes;


public interface QueryesService {

	void saveQuery(Queryes query);
	
	List<Queryes> findAllQueryes(); 
	
	void deleteQueryesById(Integer id);
}
