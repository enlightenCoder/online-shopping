package net.chrisnet.dao;

import java.util.List;

import net.chrisnet.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	Category get(int id);

}
