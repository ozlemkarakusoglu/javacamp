package homework2;

public class CourseManager
{
	//work class'�
	String defaultName = "Yaz�l�m Geli�tirici Yeti�tirme Kamp� ";
	
	//class ad� + eleman1 = new class ad�
	
	Courses course1 = new Courses(defaultName+"(C# + ANGULAR)",6,0);
	Courses course2 = new Courses(defaultName+"(JAVA + REACT)",38,0);
	Courses course3 = new Courses("Programlamaya Giri� i�in Temel Kurs",0,0);
	
	Courses[] courseList = {course1, course2, course3};
	
	public void showCourse() {
		
		for (Courses course : courseList) {
			System.out.println(course.courseName);
			if(course.courseProgress > 0) {
				System.out.println(course.courseProgress);
				}
			else if(course.courseProgress == 0) {
				if(course.coursePrice == 0) {
					System.out.println("�CRETS�Z");
					//E�er kurs ilerlemesi 0'sa ve e�er kurs fiyat� s�f�rsa "�cretsiz" yazd�r.
				}
			}
		}
		
	}
	
	
	
}
