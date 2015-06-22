package ru.sareth.chipmunk.dao;

import java.util.List;

import ru.sareth.chipmunk.model.Parsers;

public interface ParsersDao {
	void saveParser(Parsers parser);
	
	List<Parsers> findAllParsers();
	
	void deleteParserById(Integer id);
}
