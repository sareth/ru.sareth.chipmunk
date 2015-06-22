package ru.sareth.chipmunk.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import ru.sareth.chipmunk.model.Sites;

@Repository("sitesDao")
public class SitesDaoImpl extends AbstractDao implements SitesDao{

	public void saveSites(Sites site) {
		persist(site);
	}

	@SuppressWarnings("unchecked")
	public List<Sites> findAllSites() {
		Criteria criteria = getSession().createCriteria(Sites.class);
		return (List<Sites>) criteria.list();
	}

	public void deleteSitesById(Integer id) {
		Query query = getSession().createSQLQuery("delete from sites where id = :id");
		query.setInteger("id", id);
		query.executeUpdate();
	}
	
}
