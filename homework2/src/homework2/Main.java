package homework2;

public class Main {

	public static void main(String[] args) {
		
		CourseManager courseManager = new CourseManager();
		//bina, kap�
		courseManager.showCourse();
		//kap�, nokta=anahtar, attribute
		
		
		
		Instructor instructor1 = new Instructor("Engin","Demiro�");
		System.out.println(instructor1.firstName + " " + instructor1.lastName);
	}

}
