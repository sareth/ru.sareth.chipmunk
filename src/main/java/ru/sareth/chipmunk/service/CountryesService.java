package ru.sareth.chipmunk.service;

import java.util.List;

import ru.sareth.chipmunk.model.Countryes;

public interface CountryesService {

	void saveCountry(Countryes country);
	
	List<Countryes> findAllCountryes(); 
	
	void deleteCountryesById(Integer id);
}
