package zrq.com.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import zrq.com.model.Student;

@Controller
public class StudentController {

	@Autowired
	@Qualifier("studentValidator")
	private Validator validator;

	@InitBinder
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(validator);
	}

	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public ModelAndView student() {
		return new ModelAndView("student", "student", new Student());
	}

	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("student") @Validated Student student, BindingResult bindingResult,
			Model model) {

		if (bindingResult.hasErrors()) {
			return "student";
//			System.out.println("ZRQ Errors");
		}
		
		model.addAttribute("name", student.getName());
		model.addAttribute("age", student.getAge());
		model.addAttribute("id", student.getId());
		model.addAttribute("password", student.getPassword());
		model.addAttribute("address", student.getAddress());
		model.addAttribute("receivePaper", student.isReceivePaper());
		model.addAttribute("favoriteFrameworks", student.getFavoriteFrameworks());
		model.addAttribute("gender", student.getGender());
		model.addAttribute("favoriteNumber", student.getFavoriteNumber());
		model.addAttribute("skills", student.getSkills());
		return "result";
	}

	@RequestMapping(value = "/redirect", method = RequestMethod.GET)
	public String redirect() {
		return "redirect:finalPage";
		// I could also try something like this:
		// return "redirect:/pages/final.htm";
	}

	@RequestMapping(value = "/finalPage", method = RequestMethod.GET)
	public String finalPage() {
		return "final";
	}

	@ModelAttribute("webFrameworkList")
	public List<String> getWebFrameworkList() {
		List<String> webFrameworkList = new ArrayList<String>();
		webFrameworkList.add("Spring MVC");
		webFrameworkList.add("Struts 1");
		webFrameworkList.add("Struts 2");
		webFrameworkList.add("Apache Wicket");
		return webFrameworkList;
	}

	@ModelAttribute("numbersList")
	public List<String> getNumbersList() {
		List<String> numbersList = new ArrayList<String>();
		numbersList.add("1");
		numbersList.add("2");
		numbersList.add("3");
		numbersList.add("4");
		return numbersList;
	}

	@ModelAttribute("countryList")
	public Map<String, String> getCountryList() {
		Map<String, String> countryList = new HashMap<String, String>();
		countryList.put("US", "United States");
		countryList.put("CH", "China");
		countryList.put("SG", "Singapore");
		countryList.put("MY", "Malaysia");
		return countryList;
	}

	@ModelAttribute("skillsList")
	public Map<String, String> getSkillsList() {
		Map<String, String> skillList = new HashMap<String, String>();
		skillList.put("Hibernate", "Hibernate");
		skillList.put("Spring", "Spring");
		skillList.put("Apache Wicket", "Apache Wicket");
		skillList.put("Struts", "Struts");
		return skillList;
	}

}