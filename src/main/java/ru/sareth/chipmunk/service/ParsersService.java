package ru.sareth.chipmunk.service;

import java.util.List;

import ru.sareth.chipmunk.model.Parsers;

public interface ParsersService {
	void saveParser(Parsers parser);

	List<Parsers> findAllParsers();
	
	void deleteParserById(Integer id);
}
