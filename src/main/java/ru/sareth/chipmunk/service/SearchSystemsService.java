package ru.sareth.chipmunk.service;

import java.util.List;

import ru.sareth.chipmunk.model.SearchSystems;

public interface SearchSystemsService {

	void saveSS(SearchSystems ss);
	
	List<SearchSystems> findAllSS();
	
	void deleteSSById(Integer id);
	
}
