package ru.sareth.chipmunk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ru.sareth.chipmunk.dao.SitesDao;
import ru.sareth.chipmunk.model.Sites;


@Service("sitesService")
@Transactional
public class SitesServiceImpl implements SitesService{

	@Autowired
	private SitesDao dao;
	
	public void saveSites(Sites sites) {
		dao.saveSites(sites);
	}

	public List<Sites> findAllSites() {
		return dao.findAllSites();
	}
	
	public void deleteSitesById(Integer id){
		dao.deleteSitesById(id);
	}
}
