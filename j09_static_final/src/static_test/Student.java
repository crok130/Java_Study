package static_test;

public class Student {

	// 정적 멤버
	static String school;
	
	// 인스턴스 멤버
	String name;
	int age;
	String grade;
	
	String studentInfo() {
		return this.school+" 학교의"+name+"학생은 나이가 " +this.age+"입니다.";
	}
	
	static void study(String subject) {
		System.out.println(subject+" 과목을 공부합니다.");
	}
}
