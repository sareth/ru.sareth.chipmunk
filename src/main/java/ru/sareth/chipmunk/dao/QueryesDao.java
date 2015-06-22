package ru.sareth.chipmunk.dao;

import java.util.List;

import ru.sareth.chipmunk.model.Queryes;


public interface QueryesDao {

	void saveQuery(Queryes query);
	
	List<Queryes> findAllQueryes();
	
	void deleteQueryesById(Integer id);
}
