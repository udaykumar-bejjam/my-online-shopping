package com.uday.myshoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uday.myshoppingbackend.dao.CategoryDAO;
import com.uday.myshoppingbackend.dto.Category;

@Repository("categoryDao")
public class CategoryDAOImpl implements CategoryDAO {
	
	private static List<Category> categories = new ArrayList<>();
	
	static {
		Category category = new Category();
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is a Television");
		category.setImageURL("CAT_1.png");
		category.setActive(true);
		categories.add(category);
		
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is a Mobile");
		category.setImageURL("CAT_2.png");
		category.setActive(true);
		categories.add(category);
		
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is a Laptop");
		category.setImageURL("CAT_3.png");
		category.setActive(true);
		categories.add(category);
	}
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}
	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		for(Category c:categories)
			if(c.getId() == id)
				return c;
		return null;
	}

}
