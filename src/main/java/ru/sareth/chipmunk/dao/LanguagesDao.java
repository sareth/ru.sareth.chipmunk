package ru.sareth.chipmunk.dao;

import java.util.List;

import ru.sareth.chipmunk.model.Languages;

public interface LanguagesDao {
	void saveLanguage(Languages language);
	
	List<Languages> findAllLanguages();
	
	void deleteLanguageById(Integer id);
}
