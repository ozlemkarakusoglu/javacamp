package homework2;

public class CourseManager
{
	//work class'ý
	String defaultName = "Yazýlým Geliþtirici Yetiþtirme Kampý ";
	
	//class adý + eleman1 = new class adý
	
	Courses course1 = new Courses(defaultName+"(C# + ANGULAR)",6,0);
	Courses course2 = new Courses(defaultName+"(JAVA + REACT)",38,0);
	Courses course3 = new Courses("Programlamaya Giriþ için Temel Kurs",0,0);
	
	Courses[] courseList = {course1, course2, course3};
	
	public void showCourse() {
		
		for (Courses course : courseList) {
			System.out.println(course.courseName);
			if(course.courseProgress > 0) {
				System.out.println(course.courseProgress);
				}
			else if(course.courseProgress == 0) {
				if(course.coursePrice == 0) {
					System.out.println("ÜCRETSÝZ");
					//Eðer kurs ilerlemesi 0'sa ve eðer kurs fiyatý sýfýrsa "Ücretsiz" yazdýr.
				}
			}
		}
		
	}
	
	
	
}
