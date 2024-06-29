package Businnes;

import java.util.ArrayList;

import Entities.Category;

public class CategoryManager {

	 ArrayList<Category> CategoryNames = new ArrayList<Category>();
	 
	public CategoryManager() {
		
	}

	public CategoryManager(ArrayList<Category> categoryNames) {
		CategoryNames = categoryNames;
	}

	
	public void getAllCategoryNames() {
		for(Category temp :CategoryNames) {
			System.out.println(temp.getId() + " " + temp.getName());
		}
	}


	public void add(Category category) {
		 boolean exists = false;
		 for (Category sample : CategoryNames) {
			if(category.getId() == sample.getId()) {
				exists = true;
                break;
			}
		}
		 if(exists == false) {
			 CategoryNames.add(category);
		 }else {
			 System.out.println("This Category is already exist");
		 }
	 }
	
	public void delete(Category category) {
		
		for(Category sample : CategoryNames) {
			if(category.getId() == sample.getId() && category.getName().equals(sample.getName())) {
				CategoryNames.remove(category);
				System.out.println(category.getName() + " course is removed");
				break;
			}
		}
		
	}
	
}
