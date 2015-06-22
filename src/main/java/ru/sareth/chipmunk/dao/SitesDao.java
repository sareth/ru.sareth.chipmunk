package ru.sareth.chipmunk.dao;

import java.util.List;
import ru.sareth.chipmunk.model.Sites;

public interface SitesDao {

	void saveSites(Sites site);
	
	List<Sites> findAllSites();
	
	void deleteSitesById(Integer id);
}
