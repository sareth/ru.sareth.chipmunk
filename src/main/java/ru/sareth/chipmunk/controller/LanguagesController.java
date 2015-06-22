package ru.sareth.chipmunk.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import ru.sareth.chipmunk.model.Languages;
import ru.sareth.chipmunk.service.LanguagesService;

@Controller
@RequestMapping("/languages")
public class LanguagesController {

	@Autowired
	LanguagesService service;

	/*
	 * This method will list all existing employees.
	 */
	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	public String listLanguages(ModelMap model) {

		List<Languages> languages = service.findAllLanguages();
		model.addAttribute("languages", languages);//this is attribute of JSP page
		return "languages/alllanguages";//this is view
	}

	/*
	 * This method will provide the medium to add a new employee.
	 */
	@RequestMapping(value = { "/new" }, method = RequestMethod.GET)
	public String newLanguage(ModelMap model) {
		Languages language = new Languages();
		model.addAttribute("language", language);
		return "languages/addlanguage";
	}

	/*
	 * This method will be called on form submission, handling POST request for
	 * saving employee in database. It also validates the user input
	 */
	@RequestMapping(value = { "/new" }, method = RequestMethod.POST)
	public String saveLanguage(@Valid Languages language, BindingResult result,
			ModelMap model) {

		if (result.hasErrors()) {
			return "languages/addlanguage";
		}

		service.saveLanguage(language);

		model.addAttribute("success", "Language " + language.getName()
				+ " registered successfully");
		return "languages/successaddlanguage";
	}

	/*
	 * This method will delete an employee by it's SSN value.
	 */
	
	@RequestMapping(value = { "/deletelanguage-{id}" }, method = RequestMethod.GET)
	public String deleteLanguageId(@PathVariable String id) {
		service.deleteLanguageById(Integer.valueOf(id));
		return "redirect:/languages/list";
	}

}
