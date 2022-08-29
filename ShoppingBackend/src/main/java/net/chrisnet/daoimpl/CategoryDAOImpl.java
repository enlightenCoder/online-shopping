package net.chrisnet.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.chrisnet.dao.CategoryDAO;
import net.chrisnet.dto.Category;


@Repository("categoryDao")
public class CategoryDAOImpl implements CategoryDAO {
	
	private static List<Category> categories = new ArrayList<>(); 
	
	static {
		
		Category cat1 = new Category();
		Category cat2 = new Category();
		Category cat3 = new Category();
		cat1.setId(1);cat1.setName("Television");cat1.setDescription("Description for TV");cat1.setImageURL("CAT_1.png");
		cat2.setId(2);cat2.setName("Mobile");cat2.setDescription("Description for Mobile");cat2.setImageURL("CAT_2.png");
		cat3.setId(3);cat3.setName("Laptop");cat3.setDescription("Description for Laptop");cat3.setImageURL("CAT_3.png");
		categories.addAll(List.of(cat1,cat2,cat3));
	}
	
	
	public List<Category> list() {
		
		return categories;
	}


	@Override
	public Category get(int id) {
		Category category = categories.stream().filter(c->c.getId()==id).findAny().orElseThrow(() -> new RuntimeException("No Category for this id ::" + id));
		return category;
	}

}
