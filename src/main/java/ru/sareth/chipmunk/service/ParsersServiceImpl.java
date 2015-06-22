package ru.sareth.chipmunk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ru.sareth.chipmunk.dao.ParsersDao;
import ru.sareth.chipmunk.model.Parsers;

@Service("parsersService")
@Transactional
public class ParsersServiceImpl implements ParsersService {

	@Autowired
	ParsersDao dao;
	
	public void saveParser(Parsers parser) {
		dao.saveParser(parser);
	}

	public List<Parsers> findAllParsers() {
		return dao.findAllParsers();
	}

	public void deleteParserById(Integer id) {
		dao.deleteParserById(id);	
	}

}
