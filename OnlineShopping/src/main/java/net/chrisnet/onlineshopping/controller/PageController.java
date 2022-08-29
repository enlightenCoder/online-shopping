package net.chrisnet.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.chrisnet.dao.CategoryDAO;
import net.chrisnet.dto.Category;

@Controller
public class PageController {

	@Autowired
	private CategoryDAO categoryDao;

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		mv.addObject("userClickHome", true);
		// Passing the list of categories
		mv.addObject("categories", categoryDao.list());
		return mv;
	}

	@RequestMapping(value = "/about")
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About Us");
		mv.addObject("userClickAbout", true);
		return mv;
	}

	@RequestMapping(value = "/contact")
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact Us");
		mv.addObject("userClickContact", true);
		return mv;
	}

	/**
	 * Method to load all the products
	 * 
	 * @return
	 */
	@RequestMapping(value = "show/all/products")
	public ModelAndView showAllProducts() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "All Products");
		
		//Passing the list of products
		mv.addObject("categories", categoryDao.list());
		
		mv.addObject("userClickAllProducts", true);
		return mv;
	}

	@RequestMapping(value = "show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable(name = "id") int id) {
		ModelAndView mv = new ModelAndView("page");
		// CategoryDao to fetch single category
		Category category = categoryDao.get(id);
		
		mv.addObject("title", category.getName());

		// passing the list of categories
		mv.addObject("categories", categoryDao.list());

		// passing the single category object
		mv.addObject("category", category);

		mv.addObject("userClickCategoryProducts", true);
		return mv;
	}

}