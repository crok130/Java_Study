package h_practice;

import java.util.Scanner;

public class StudentManagement {
	
	public static void main(String[] args) {
		/*
		Student s1 = new Student();
		s1.number = 1;
		s1.name = "최기근";
		s1.score = 100;
		
		System.out.println(s1.getInfo());
		
		Student s2 = new Student(2, "이다한", 98);
		String info = s2.getInfo();
		System.out.println(info);
		*/
		
		Scanner sc = new Scanner(System.in);
		
		// 학생 정보를 저장할 배열
		Student[] students = null;
		
		
		while(true){
			System.out.println("=====================================");
			System.out.println("1.학생수|2.정보 입력|3.정보확인|4.분석|5.종료");
			System.out.println("=====================================");
			System.out.println("메뉴 번호를 입력해 주세요(1~5)");
			int selctNo = sc.nextInt();
			
			/*
			  	1. 학생수를 입력받아 Student 객체가 저장될 students 배열 생성
			  	   - 입력받은 학생 수만큼의 크기를 가짐.
			  	2. 생성된 studens 배열의 항목 수만큼(배열의 크기만큼) 핵생의 정보를 입력받아 Student 객체를 생성하여 저장하고 배열항목에 저장
			  	   - int(number), String(name), int(score)
			  	3. students 배열에 저장된 학생들의 정보를 출력(field 정보 출력)
			  	4. 1. students 배열에 저장된 학생들의 점수를 전체합계, 평균을 구해서 출력
			  	   2. students 배열에 저장된 학생들의 점수를 연산하여 최고득점자 이름, 최저득점자들의 이름을 출력
			  	5. 종료
			  	    
			 */
			
			switch(selctNo) {
				case 1 :
                    System.out.print("학생 수를 입력하세요: ");
                    int studentCount = sc.nextInt();
                    students = new Student[studentCount];
					break;
				case 2 :
                    for (int i = 0; i < students.length; i++) {
                        System.out.println("학생 " + (i + 1) + "의 정보를 입력하세요:");
                        System.out.print("학번: ");
                        int number = sc.nextInt();
                        System.out.print("이름: ");
                        String name = sc.next();
                        System.out.print("점수: ");
                        int score = sc.nextInt();

                        // 입력된 정보로 Student 객체 생성하여 배열에 저장
                        students[i] = new Student(number, name, score);
                    }
                    break;
				case 3 :
					for(Student k : students) {
						 System.out.println(k.getInfo());
					}
				case 4:
					
					
			}
		}
	}

}
