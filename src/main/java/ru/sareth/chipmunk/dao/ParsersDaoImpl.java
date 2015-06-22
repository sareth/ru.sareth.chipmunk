package ru.sareth.chipmunk.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import ru.sareth.chipmunk.model.Parsers;

@Repository("parsersDao")
public class ParsersDaoImpl extends AbstractDao implements ParsersDao{

	public void saveParser(Parsers parser) {
		persist(parser);
	}

	@SuppressWarnings("unchecked")
	public List<Parsers> findAllParsers() {
		Criteria criteria = getSession().createCriteria(Parsers.class);
		return (List<Parsers>) criteria.list();
	}

	public void deleteParserById(Integer id) {
		Query query = getSession().createSQLQuery("delete from parsers where id = :id");
		query.setInteger("id", id);
		query.executeUpdate();
	}

}
