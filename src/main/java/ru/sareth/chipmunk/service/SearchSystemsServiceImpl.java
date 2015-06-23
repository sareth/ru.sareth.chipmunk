package ru.sareth.chipmunk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ru.sareth.chipmunk.dao.SearchSystemsDao;
import ru.sareth.chipmunk.model.SearchSystems;

@Service("searchSystemsService")
@Transactional
public class SearchSystemsServiceImpl implements SearchSystemsService {

	@Autowired
	SearchSystemsDao dao;
	public void saveSS(SearchSystems ss) {
		dao.saveSS(ss);
	}

	public List<SearchSystems> findAllSS() {
		return dao.findAllSS();
	}

	public void deleteSSById(Integer id) {
		dao.deleteSSById(id);
	}

}
