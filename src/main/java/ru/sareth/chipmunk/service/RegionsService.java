package ru.sareth.chipmunk.service;

import java.util.List;

import ru.sareth.chipmunk.model.Regions;

public interface RegionsService {
	
	void saveRegion(Regions region);
	
	List<Regions> findAllRegions();
	
	void deleteRegionsById(Integer id);
}
