package ru.sareth.chipmunk.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import ru.sareth.chipmunk.model.Countryes;


@Repository("countryesDao")
public class CountryesDaoImpl extends AbstractDao implements CountryesDao {

	public void saveCountry(Countryes country) {
		persist(country);
	}
	@SuppressWarnings("unchecked")
	public List<Countryes> findAllCountryes() {
		Criteria criteria = getSession().createCriteria(Countryes.class);
		return (List<Countryes>) criteria.list();
	}

	public void deleteCountryesById(Integer id) {
		Query query = getSession().createSQLQuery("delete from countryes where id = :id");
		query.setInteger("id", id);
		query.executeUpdate();
	}

}