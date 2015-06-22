package ru.sareth.chipmunk.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;


import ru.sareth.chipmunk.model.Regions;

@Repository("regionsDao")
public class RegionsDaoImpl extends AbstractDao implements RegionsDao{
	
	public void saveRegion(Regions region) {
		persist(region);
	}

	@SuppressWarnings("unchecked")
	public List<Regions> findAllRegions() {
		Criteria criteria = getSession().createCriteria(Regions.class);
		return (List<Regions>) criteria.list();
	}
	
	public void deleteRegionsById(Integer id) {
		Query query = getSession().createSQLQuery("delete from regions where id = :id");
		query.setInteger("id", id);
		query.executeUpdate();
	}
}
