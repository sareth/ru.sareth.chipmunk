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

import ru.sareth.chipmunk.model.SearchSystems;
import ru.sareth.chipmunk.service.SearchSystemsService;

@Controller
@RequestMapping("/searchsystems")
public class SearchSystemsController {

	@Autowired
	SearchSystemsService service;
	
	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	public String listSS(ModelMap model) {
		List<SearchSystems> ss = service.findAllSS();
		model.addAttribute("searchsystems", ss);//this is attribute of JSP page
		return "searchsystems/allss";
	}
	
	@RequestMapping(value = { "/new" }, method = RequestMethod.GET)
	public String newSS(ModelMap model) {
		SearchSystems ss = new SearchSystems();
		model.addAttribute("searchsystem", ss);
		return "searchsystems/addsearchsystem";
	}
	
	@RequestMapping(value = { "/new" }, method = RequestMethod.POST)
	public String saveSS(@Valid SearchSystems ss, BindingResult result,
			ModelMap model) {

		if (result.hasErrors()) {
			return "searchsystems/addsearchsystem";
		}

		service.saveSS(ss);

		model.addAttribute("success", "SearchSystem " + ss.getName()
				+ " registered successfully");
		return "searchsystems/successaddss";
	}
	
	@RequestMapping(value = { "/deletess-{id}" }, method = RequestMethod.GET)
	public String deleteRegionId(@PathVariable String id) {
		service.deleteSSById(Integer.valueOf(id));
		return "redirect:/searchsystems/list";
	}
}
