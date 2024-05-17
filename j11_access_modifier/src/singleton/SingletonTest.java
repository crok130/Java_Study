package singleton;

/**
 * cod design pattern
 * 소프트웨어를 설계할 때 특정 맥락에서 자주 발생하는
 * 고질적인 문제들이 또 발생했을 때 재 사용할 수 있는 해결책
 * 
 * Singleton Pattern
 * 객체의 인스터스가 여러개 일 필요가 없을 떼
 * 하나의 인스턴스를 공류하여 메로리를  절약하도록
 * 강제하는 코드 기법
 */
public class SingletonTest {

	public static void main(String[] args) {
		/*
		Printer printer = new Printer();
		printer.print("대충 엄무가 많다는 글...");
		
		Printer printterChoi = new Printer();
		printterChoi.print("대충 일잘한다는 글...");
		*/
		Printer printerA = Printer.getInstance();
		System.out.println(printerA);
		Printer printerB = Printer.getInstance();
		System.out.println(printerB);
		
		printerA.print("대충 배고프다는 얘기");
		printerB.print("잠온다는 얘기.....");
	}
}
