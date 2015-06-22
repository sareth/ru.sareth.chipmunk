package ru.sareth.chipmunk.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import ru.sareth.chipmunk.model.Queryes;


@Repository("queryesDao")
public class QueryesDaoImpl extends AbstractDao implements QueryesDao {

	public void saveQuery(Queryes query) {
		persist(query);
	}

	@SuppressWarnings("unchecked")
	public List<Queryes> findAllQueryes() {
		Criteria criteria = getSession().createCriteria(Queryes.class);
		return (List<Queryes>) criteria.list();
	}
	
	public void deleteQueryesById(Integer id) {
		Query query = getSession().createSQLQuery("delete from queryes where id = :id");
		query.setInteger("id", id);
		query.executeUpdate();
	}

}
