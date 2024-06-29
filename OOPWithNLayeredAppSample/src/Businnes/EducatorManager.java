package Businnes;

import java.util.ArrayList;

import Entities.Category;
import Entities.Educator;

public class EducatorManager {

	ArrayList<Educator> educatorNames;
	
	public EducatorManager() {
		new ArrayList<Educator>();
	}
	public void add(Educator educator) {
		boolean exists = false;
		 for (Educator sample : educatorNames) {
			if(educator.getName() == sample.getName()) {
				exists = true;
               break;
			}
		}
		 if(exists == false) {
			 educatorNames.add(educator);
		 }else {
			 System.out.println("This Educator is already exist");
		 }
	}
	
	public void delete(Educator educator) {
		
		for(Educator sample : educatorNames) {
			if(educator.getName().equals(sample.getName())) {
				educatorNames.remove(educator);
				System.out.println(educator.getName() + " is removed");
				break;
			}
		}	
	}
}
