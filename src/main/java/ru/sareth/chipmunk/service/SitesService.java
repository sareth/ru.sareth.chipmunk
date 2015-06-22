package ru.sareth.chipmunk.service;

import java.util.List;
import ru.sareth.chipmunk.model.Sites;

public interface SitesService {

	void saveSites(Sites site);
	
	List<Sites> findAllSites(); 
	
	void deleteSitesById(Integer id);
}
