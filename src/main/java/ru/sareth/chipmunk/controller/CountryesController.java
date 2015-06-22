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

import ru.sareth.chipmunk.model.Countryes;
import ru.sareth.chipmunk.service.CountryesService;





@Controller
@RequestMapping("/countryes")
public class CountryesController {

	@Autowired
	CountryesService service;

	/*
	 * This method will list all existing employees.
	 */
	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	public String listCountryes(ModelMap model) {

		List<Countryes> countryes = service.findAllCountryes();
		model.addAttribute("countryes", countryes);//this is attribute of JSP page
		return "countryes/allcountryes";//this is view
	}

	/*
	 * This method will provide the medium to add a new employee.
	 */
	@RequestMapping(value = { "/new" }, method = RequestMethod.GET)
	public String newCountry(ModelMap model) {
		Countryes country = new Countryes();
		model.addAttribute("country", country);
		return "countryes/addcountry";
	}

	/*
	 * This method will be called on form submission, handling POST request for
	 * saving employee in database. It also validates the user input
	 */
	@RequestMapping(value = { "/new" }, method = RequestMethod.POST)
	public String saveQuery(@Valid Countryes country, BindingResult result,
			ModelMap model) {

		if (result.hasErrors()) {
			return "countryes/addcountry";
		}

		service.saveCountry(country);

		model.addAttribute("success", "Country " + country.getName()
				+ " registered successfully");
		return "countryes/successaddcountry";
	}

	/*
	 * This method will delete an employee by it's SSN value.
	 */
	
	@RequestMapping(value = { "/deletecountry-{id}" }, method = RequestMethod.GET)
	public String deleteCountryId(@PathVariable String id) {
		service.deleteCountryesById(Integer.valueOf(id));
		return "redirect:/countryes/list";
	}

}
