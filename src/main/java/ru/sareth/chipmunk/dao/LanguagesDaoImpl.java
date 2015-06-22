package ru.sareth.chipmunk.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import ru.sareth.chipmunk.model.Languages;

@Repository("languagesDao")
public class LanguagesDaoImpl extends AbstractDao implements LanguagesDao {

	public void saveLanguage(Languages language) {
		persist(language);
	}

	@SuppressWarnings("unchecked")
	public List<Languages> findAllLanguages() {
		Criteria criteria = getSession().createCriteria(Languages.class);
		return (List<Languages>) criteria.list();
	}

	public void deleteLanguageById(Integer id) {
		Query query = getSession().createSQLQuery("delete from languages where id = :id");
		query.setInteger("id", id);
		query.executeUpdate();
	}

}
