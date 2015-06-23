package ru.sareth.chipmunk.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import ru.sareth.chipmunk.model.SearchSystems;

@Repository("searchSystemsDao")
public class SearchSystemsDaoImpl extends AbstractDao implements SearchSystemsDao {

	public void saveSS(SearchSystems ss) {
		persist(ss);
	}

	@SuppressWarnings("unchecked")
	public List<SearchSystems> findAllSS() {
		Criteria criteria = getSession().createCriteria(SearchSystems.class);
		return (List<SearchSystems>) criteria.list();
	}

	public void deleteSSById(Integer id) {
		Query query = getSession().createSQLQuery("delete from searchsystems where id = :id");
		query.setInteger("id", id);
		query.executeUpdate();
	}

}
