package i_string_equals;

import java.util.Scanner;

public class StringEqualsExample {
	
	public static void main(String[] args) {
		String s1 = "최수빈";
		String s2 = "최수빈";
		System.out.println(s1 == s2); 
		
		String s3 = "배고프다. 쉬었다 할까?";
		System.out.println(s1 == s3);
		
		String s4 = new String("최수빈");
		System.out.println(s1 == s4);
		System.out.println(s1);
		System.out.println(s4);
		boolean result = s1.equals(s4);
		System.out.println("s1 equals s4 : " + result);
		System.out.println("====================================================");
		
		String id = "id001";
		String pass = "pw001";
		
		// 임의로 지정한 id와 비밀번호가 사용자가 입력한 값과 일치하는지 확인
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력해주세요. ");
		String inputid = sc.next();
		System.out.println("비밀번호를 입력해주세여. ");
		String inputpass = sc.next();
		
		if(inputid == id && inputpass == pass) {
			System.out.println("아이디랑 비밀번호가 일치합니다");
		}else {
			System.out.println("아이디와 비밀번호가 일치하지 않습니다.");
		}
		
		// 문자열.equls(비교할 문자열)ㅣ
		// String 객체가 저장하고 있는 문자열과
		// 매개변수로 전달된 String 객체의 문자열이 일치하는지 비교하는 method
		// 일치하면  true 일치하지않으면 false
		System.out.println("eqals로 String 객체에 저장된 문자열 비교");
		if(id.equals(inputid) && pass.equals(inputpass)) {
			System.out.println("id와pass에 저장된 문자열이 입력받은 값과 일치함");
		}else {
			System.out.println("일치하지 않음");
		}
	}

}
