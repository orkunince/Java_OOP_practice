package kodlamaIo1;

public class Main {

	public static void main(String[] args) {
		
		Course course1=new Course(1,"JAVA + REACT","Engin Demiroð","java.png");
		
		Course course2=new Course();
		course2.id=2;
		course2.name="C# + ANGULAR";
		course2.instructor="Engin Demiroð";
		course2.resimUrl="angular.png";
		
		Course[] courses= {course1,course2};
		
		for (Course course : courses) {
			System.out.println(course.name);
		}
		
		System.out.println("--------------------");
		
		CourseManager courseManager=new CourseManager();
		courseManager.add(course1);
		courseManager.update(course2);
		
		System.out.println("---------------------");
		
		Category category1=new Category(1,"Kurslarým");
		
		Category category2=new Category();
		category2.id=2;
		category2.categoryName="Tüm Kurslar";
		
		Category[] categories= {category1,category2};	
		for (Category category : categories) {
			System.out.println(category.categoryName);
		}
		
		System.out.println("---------------------");
		
		CategoryManager categoryManager=new CategoryManager();
		categoryManager.add(category1);
		categoryManager.update(category2);
		
		
		

	}

}
