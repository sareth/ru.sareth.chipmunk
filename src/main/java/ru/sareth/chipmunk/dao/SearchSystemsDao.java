package ru.sareth.chipmunk.dao;

import java.util.List;

import ru.sareth.chipmunk.model.SearchSystems;


public interface SearchSystemsDao {
	
	void saveSS(SearchSystems ss);
	
	List<SearchSystems> findAllSS();
	
	void deleteSSById(Integer id);
}
