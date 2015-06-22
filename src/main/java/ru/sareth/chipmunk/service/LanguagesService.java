package ru.sareth.chipmunk.service;

import java.util.List;

import ru.sareth.chipmunk.model.Languages;

public interface LanguagesService {
void saveLanguage(Languages language);
	
	List<Languages> findAllLanguages();
	
	void deleteLanguageById(Integer id);
}
