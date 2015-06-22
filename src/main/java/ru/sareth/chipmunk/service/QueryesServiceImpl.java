package ru.sareth.chipmunk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ru.sareth.chipmunk.dao.QueryesDao;
import ru.sareth.chipmunk.model.Queryes;


@Service("queryesService")
@Transactional
public class QueryesServiceImpl implements QueryesService{

	@Autowired
	private QueryesDao dao;
	
	public void saveQuery(Queryes query) {
		dao.saveQuery(query);
	}
	
	public List<Queryes> findAllQueryes() {
		return dao.findAllQueryes();
	}
	
	public void deleteQueryesById(Integer id) {
		dao.deleteQueryesById(id);
	}
}
