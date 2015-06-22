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

import ru.sareth.chipmunk.model.Regions;
import ru.sareth.chipmunk.service.RegionsService;

@Controller
@RequestMapping("/regions")
public class RegionsController {

	@Autowired
	RegionsService service;

	/*
	 * This method will list all existing employees.
	 */
	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	public String listRegions(ModelMap model) {

		List<Regions> regions = service.findAllRegions();
		model.addAttribute("regions", regions);//this is attribute of JSP page
		return "regions/allregions";//this is view
	}

	/*
	 * This method will provide the medium to add a new employee.
	 */
	@RequestMapping(value = { "/new" }, method = RequestMethod.GET)
	public String newRegion(ModelMap model) {
		Regions region = new Regions();
		model.addAttribute("region", region);
		return "regions/addregion";
	}

	/*
	 * This method will be called on form submission, handling POST request for
	 * saving employee in database. It also validates the user input
	 */
	@RequestMapping(value = { "/new" }, method = RequestMethod.POST)
	public String saveRegion(@Valid Regions region, BindingResult result,
			ModelMap model) {

		if (result.hasErrors()) {
			return "regions/addregion";
		}

		service.saveRegion(region);

		model.addAttribute("success", "Region " + region.getName()
				+ " registered successfully");
		return "regions/successaddregion";
	}

	/*
	 * This method will delete an employee by it's SSN value.
	 */
	
	@RequestMapping(value = { "/deleteregion-{id}" }, method = RequestMethod.GET)
	public String deleteRegionId(@PathVariable String id) {
		service.deleteRegionsById(Integer.valueOf(id));
		return "redirect:/regions/list";
	}

}
