package ru.sareth.chipmunk.dao;

import java.util.List;

import ru.sareth.chipmunk.model.Regions;



public interface RegionsDao {
	void saveRegion(Regions region);
	
	List<Regions> findAllRegions();
	
	void deleteRegionsById(Integer id);
}
