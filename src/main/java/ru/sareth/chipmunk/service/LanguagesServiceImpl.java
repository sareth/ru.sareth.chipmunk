package ru.sareth.chipmunk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ru.sareth.chipmunk.dao.LanguagesDao;
import ru.sareth.chipmunk.model.Languages;

@Service("languagesService")
@Transactional
public class LanguagesServiceImpl implements LanguagesService{

	@Autowired
	private LanguagesDao dao;
	
	public void saveLanguage(Languages language) {
		dao.saveLanguage(language);
	}

	public List<Languages> findAllLanguages() {
		return dao.findAllLanguages();
	}

	public void deleteLanguageById(Integer id) {
		dao.deleteLanguageById(id);
	}

}
