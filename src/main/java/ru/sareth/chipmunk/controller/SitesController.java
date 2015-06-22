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

import ru.sareth.chipmunk.model.Sites;
import ru.sareth.chipmunk.service.SitesService;



@Controller
@RequestMapping("/sites")
public class SitesController {

	@Autowired
	SitesService service;

	/*
	 * This method will list all existing employees.
	 */
	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	public String listSites(ModelMap model) {

		List<Sites> sites = service.findAllSites();
		model.addAttribute("sites", sites);//this is attribute of JSP page
		return "sites/allsites";//this is view
	}

	/*
	 * This method will provide the medium to add a new employee.
	 */
	@RequestMapping(value = { "/new" }, method = RequestMethod.GET)
	public String newSite(ModelMap model) {
		Sites site = new Sites();
		model.addAttribute("site", site);
		return "sites/addsite";
	}

	/*
	 * This method will be called on form submission, handling POST request for
	 * saving employee in database. It also validates the user input
	 */
	@RequestMapping(value = { "/new" }, method = RequestMethod.POST)
	public String saveSite(@Valid Sites sites, BindingResult result,
			ModelMap model) {

		if (result.hasErrors()) {
			return "sites/addsite";
		}

		service.saveSites(sites);

		model.addAttribute("success", "Site " + sites.getName()
				+ " added successfully");
		return "sites/successaddsite";
	}

	/*
	 * This method will delete an employee by it's SSN value.
	 */
	
	@RequestMapping(value = { "/deletesite-{id}" }, method = RequestMethod.GET)
	public String deleteSiteById(@PathVariable String id) {
		service.deleteSitesById(Integer.valueOf(id));
		return "redirect:/sites/list";
	}

}
