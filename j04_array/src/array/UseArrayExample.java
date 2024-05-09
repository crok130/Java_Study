package array;

/**
 * 자료구조(Data Structure)
 * 데이터를 효율적으로 저장하고 조작하기 위한 방법을 정의한 것. <br/>
 * 즉. 데이터를 저장하는 방법과 이를 조작하는 방법을 제공 <br/>
 * 삽입, 삭제, 검색 등의 연산이 가능해야하며 , <br/>
 * 효율적인 메모리 사용과 처리속도를 보장해야함. <br/>
 * 구현이 쉽고 이해하기 쉬운 인터페이스를 제공해야함. <br/>
 * <hr/>
 * 배열(Array)은 데이터를 저장하는 자료구조의 일종 <br/>
 * 동일한 자료형의 데이터를 연속된 공간에 순차적으로 나열한것 <br/>
 * 배열은 메모리상에서 연속된 공간에 데이터를 저장하며 각데이터는 <br/>
 * 인덱스(index)라는 숫자로 구분 <br/>
 * 배열은 메모리에 저장될때 크기가 결정되며 이 크기는 변경할 수 없다. <br/>
 */
public class UseArrayExample {

	public static void main(String[] args) {
		
		/*
		 	배열 생성 방법
		 	1. 배열에 저장할 값이 있을 시 
		 */
		// 나열되어 있는 값으로 크기가 결정되므로 크기를 지정할 필요가 없음.
		int[] array = new int[] {10, 20, 30, 40, 50};
		
		// 2. 선언과 동시에 값을 지정할때는 new 연산자를 생략 가능함
		int array2[] = {80,40,70,60};
		
		// 3. 선언 이후에 배열 항목을 초기화 할때는 new 연산자를 생략할 수 없음. 
		int[] array3;
		// array3 = {100, 200, 300};
		array3 = new int[]{100,200,300};
		
		/*
		 	4. 배열 생성시에 값이 정해져 있지 않을 경우
		 	   저장할 공간만 생성 가능하며
		 	   생성된 각 항목의 공간에는 기본값으로 초기화가 이루어진다.
		 	   정수 - 실수 :0, 0.0 | boolean : false, 참조타입 - null
		 */
		int a = 10;
		int b = 20;
		
		int[] array4 = new int[5];
		// [0][0][0][0][0]
		//  0  1  2  3  4
		System.out.println(array4);
		System.out.println(array4[2]);
		array4[2] = 10;
		int num = array4[2];
		System.out.println(num);
		
		// 아직 배열에 저장될 항목의 크기가 결정되지 않았을때는
		// null 자료형으로 초기화 가능
		// 아직 참조하는 주소가 없다는 걸 의미하는 자료형
		int array5[] = null;
		int[] array6;
		
		System.out.println(array5);
		// System.out.println(array6);
		if(array5 == null) {
			array5 = new int[3];
		}
		
		// 초기화 되지 않은 변수는 연산 불가
		// if(array6 == null) {}
		// 배열에 지정된 타입이 아닌 데이터는 사용 불가
		// array5[0] = 3.14;
		// 배열의 길이는 3이나 배열의 인덱스 번호를 벗어나서 접근하면 오류 발생
		// array5[10] = 100;
		
		// 생성된 배열의 전체 항목의 개수(크기,길이)
		int length = array5.length;
		// 배열의 크기는 생성될때 결정되고 변경할수 없으므로
		// 배열의 길이를 알려주는 length 도 변경할 수 없음
		// array5.length = 10;
		System.out.println("array5의 길이는 : "+length);

		for(int i = 0; i < array5.length; i++) {
			// 0에서 부터 array5.length 보다 작을때 까지 
			// 1씩증가하는 값을 저장하는변수 i 를 이용하여 
			// 배열 인덱스로 항목에 순차 접근
			System.out.println(array5[i]);
		}
		
	}// end main

} // end class













