package static_test;

public class StaticTest {

	public static void main(String[] args) {
		
		
		Student.school = "부산IT교육센터";
		
		Student choi = new Student();
		choi.name = "최수빈";
		choi.age = 27;
		choi.grade = "3";
		System.out.println(choi.name);
		System.out.println(choi.school);
		
		Student lee = new Student();
		lee.name = "이유리";
		lee.age = 21;
		lee.grade = "2";
		System.out.println(lee.name);
		System.out.println(lee.school);
	
		choi.school = "부산IT아카데미";
		
		System.out.println(Student.school);
		
		Student.study("프로그래밍");
		
		// Student.studentInfo();
		String choiInfo  = choi.studentInfo();
		System.out.println(choiInfo);
		
		String leeInfo = lee.studentInfo();
		System.out.println(leeInfo);
	}
}
