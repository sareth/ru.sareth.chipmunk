package ru.sareth.chipmunk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ru.sareth.chipmunk.dao.RegionsDao;
import ru.sareth.chipmunk.model.Regions;

@Service("regionsService")
@Transactional
public class RegionsServiceImpl implements RegionsService {

	@Autowired
	RegionsDao dao;
	
	public void saveRegion(Regions region) {
		dao.saveRegion(region);
	}

	public List<Regions> findAllRegions() {
		return dao.findAllRegions();
	}

	public void deleteRegionsById(Integer id) {
		dao.deleteRegionsById(id);
	}

}
