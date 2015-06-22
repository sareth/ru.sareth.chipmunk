package ru.sareth.chipmunk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ru.sareth.chipmunk.dao.CountryesDao;
import ru.sareth.chipmunk.model.Countryes;

@Service("countryesService")
@Transactional
public class CountryesServiceImpl implements CountryesService {
	
	@Autowired
	private CountryesDao dao;
	
	public void saveCountry(Countryes country) {
		dao.saveCountry(country);
	}

	public List<Countryes> findAllCountryes() {
		return dao.findAllCountryes();
	}

	public void deleteCountryesById(Integer id) {
		dao.deleteCountryesById(id);
	}

}
