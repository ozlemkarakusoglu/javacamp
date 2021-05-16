package homework2;

public class Main {

	public static void main(String[] args) {
		
		CourseManager courseManager = new CourseManager();
		//bina, kapý
		courseManager.showCourse();
		//kapý, nokta=anahtar, attribute
		
		
		
		Instructor instructor1 = new Instructor("Engin","Demiroð");
		System.out.println(instructor1.firstName + " " + instructor1.lastName);
	}

}
