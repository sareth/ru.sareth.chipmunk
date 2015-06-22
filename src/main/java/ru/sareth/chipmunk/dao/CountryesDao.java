package ru.sareth.chipmunk.dao;

import java.util.List;

import ru.sareth.chipmunk.model.Countryes;

public interface CountryesDao {
	void saveCountry(Countryes country);
	
	List<Countryes> findAllCountryes();
	
	void deleteCountryesById(Integer id);
}
