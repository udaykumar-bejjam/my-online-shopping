package com.uday.myshoppingbackend.dao;

import java.util.List;

import com.uday.myshoppingbackend.dto.Category;

public interface CategoryDAO {
	List<Category> list();

	Category get(int id);
}
