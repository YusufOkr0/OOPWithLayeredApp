package Businnes;

import java.util.ArrayList;

import Entities.Category;
import Entities.Course;
import Entities.Educator;

public class CourseManager {

	ArrayList<Course> courses;

	public CourseManager() {
		new ArrayList<Course>();
	}
	
	public void add(Course Course) {
		boolean exists = false;
		 for (Course sample : courses) {
			if(Course.getName() == sample.getName() && Course.getPrice() > 0) {
				exists = true;
               break;
			}
		}
		 if(exists == false) {
			 courses.add(Course);
		 }else {
			 System.out.println("This Educator is already exist");
		 }
	}
	
	public void delete(Course Course) {
		
		for(Course sample : courses) {
			if(Course.getName().equals(sample.getName())) {
				courses.remove(Course);
				System.out.println(Course.getName() + " course is removed");
				break;
			}
		}
		
	}
	
}
