package com.uday.myonlineshopping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uday.myshoppingbackend.dao.CategoryDAO;
import com.uday.myshoppingbackend.dto.Category;

@Controller
public class PageController {

	@Autowired
	private CategoryDAO categoryDao;
	
	@RequestMapping(value = { "/", "/index", "/home" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		mv.addObject("categories",categoryDao.list());
		mv.addObject("userClickHome", true);
		return mv;
	}

	@RequestMapping(value = { "/contact" })
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact");
		mv.addObject("userClickContact", true);
		return mv;
	}

	@RequestMapping(value = { "/about" })
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About");
		mv.addObject("userClickAbout", true);
		return mv;
	}

	@RequestMapping(value = { "/show/all/products" })
	public ModelAndView showAllProducts() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "All Products");
		mv.addObject("categories",categoryDao.list());
		mv.addObject("userClickAllProducts", true);
		return mv;
	}
	
	@RequestMapping(value = { "/show/category/{id}/products" })
	public ModelAndView showProducts(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("page");
		Category c = categoryDao.get(id);
		mv.addObject("title", c.getName());
		mv.addObject("categories",categoryDao.list());
		mv.addObject("category",c);
		mv.addObject("userClickCategoryProducts", true);
		return mv;
	}
}
