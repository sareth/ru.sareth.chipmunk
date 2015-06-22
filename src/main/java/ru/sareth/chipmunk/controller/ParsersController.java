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

import ru.sareth.chipmunk.model.Parsers;
import ru.sareth.chipmunk.service.ParsersService;


@Controller
@RequestMapping("/parsers")
public class ParsersController {

	@Autowired
	ParsersService service;

	/*
	 * This method will list all existing employees.
	 */
	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	public String listParsers(ModelMap model) {

		List<Parsers> parsers = service.findAllParsers();
		model.addAttribute("parsers", parsers);//this is attribute of JSP page
		return "parsers/allparsers";//this is view
	}

	/*
	 * This method will provide the medium to add a new employee.
	 */
	@RequestMapping(value = { "/new" }, method = RequestMethod.GET)
	public String newParser(ModelMap model) {
		Parsers parser = new Parsers();
		model.addAttribute("parser", parser);
		return "parsers/addparser";
	}

	/*
	 * This method will be called on form submission, handling POST request for
	 * saving employee in database. It also validates the user input
	 */
	@RequestMapping(value = { "/new" }, method = RequestMethod.POST)
	public String saveParser(@Valid Parsers parser, BindingResult result,
			ModelMap model) {

		if (result.hasErrors()) {
			return "parsers/addparser";
		}

		service.saveParser(parser);

		model.addAttribute("success", "Parser " + parser.getUrl()
				+ " registered successfully");
		return "parsers/successaddparser";
	}

	/*
	 * This method will delete an employee by it's SSN value.
	 */
	
	@RequestMapping(value = { "/deleteparser-{id}" }, method = RequestMethod.GET)
	public String deleteParserId(@PathVariable String id) {
		service.deleteParserById(Integer.valueOf(id));
		return "redirect:/parsers/list";
	}
}
