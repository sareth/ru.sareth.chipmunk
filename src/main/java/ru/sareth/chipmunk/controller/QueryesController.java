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

import ru.sareth.chipmunk.model.Queryes;
import ru.sareth.chipmunk.service.QueryesService;




@Controller
@RequestMapping("/queryes")
public class QueryesController {

	@Autowired
	QueryesService service;

	/*
	 * This method will list all existing employees.
	 */
	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	public String listQueryes(ModelMap model) {

		List<Queryes> queryes = service.findAllQueryes();
		model.addAttribute("queryes", queryes);//this is attribute of JSP page
		return "queryes/allqueryes";//this is view
	}

	/*
	 * This method will provide the medium to add a new employee.
	 */
	@RequestMapping(value = { "/new" }, method = RequestMethod.GET)
	public String newQuery(ModelMap model) {
		Queryes query = new Queryes();
		model.addAttribute("query", query);
		return "queryes/addquery";
	}

	/*
	 * This method will be called on form submission, handling POST request for
	 * saving employee in database. It also validates the user input
	 */
	@RequestMapping(value = { "/new" }, method = RequestMethod.POST)
	public String saveQuery(@Valid Queryes queryes, BindingResult result,
			ModelMap model) {

		if (result.hasErrors()) {
			return "queryes/addquery";
		}

		service.saveQuery(queryes);

		model.addAttribute("success", "Query " + queryes.getText()
				+ " registered successfully");
		return "queryes/successaddquery";
	}

	/*
	 * This method will delete an employee by it's SSN value.
	 */
	
	@RequestMapping(value = { "/deletequery-{id}" }, method = RequestMethod.GET)
	public String deleteEmployeeId(@PathVariable String id) {
		service.deleteQueryesById(Integer.valueOf(id));
		return "redirect:/queryes/list";
	}

}
