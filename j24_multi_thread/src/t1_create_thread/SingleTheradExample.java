package t1_create_thread;

import java.awt.Toolkit;

public class SingleTheradExample {
	
	/**
	 * main method
	 * JVM(자바 가상머신)이 프로그램 실행 시 생성한
	 * main thread에서 초출 되는 method
	 * main threa에서 호출된 main가 종료되면 프로세스도 종료
	 * 
	 * main thread 하나로 작업을 처리할 경우
	 * single thread 환경이라고 함.
	 */
	public static void main(String[] args) {
		System.out.println("Main 시작!!!");
		// 포로세스 (process)란 운영체제에서 실행중에 있는 프로그램의 의미
		// 하나의 프로세스 돌립적인 메모리 공간을 사용하며 다른 포로세스와 메모리를 공유하지 않음
		
		// 스레드(Thread) 하나의 포르세스 내부에서 실행되는 작업(단위)
		
		// JAVA에서 Multi Thread 지원을 위해 제공되는 객체 : Thread
		
		// 현재 명령줄이 실행되는 작업 스레드를 반환
		Thread t = Thread.currentThread();
		System.out.println(t);
		// Thread[id, name, priority, group name]
		// id는 java 19 추가됨
		
		// Thread[#1,main,5,main]
		
		for(int i = 0; i < 5; i++) {
			System.out.println("띵!");
			// 현재 작업 중인 스레드를
			// 매개변수로 전달된 mills seconds 만큼 작업 대기
			try {
				Thread.sleep(500); // 0.5초 만큼 대기
			} catch (InterruptedException e) {
				// Interrupted 작업을 방해하다, 가로막다, 중단시키다 등등등
				e.printStackTrace();
			} 
		}
		System.out.println("출력 완료");
		
		// java 프로그램에서 운영체제와 하드웨어를 제어하는 툴킷
		Toolkit tool = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			// 컴퓨터에 비프음을 발생
			tool.beep();
			try {
				// 0.5초에 한번 씩 비프음 발생
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Main 종료!!!");
	}
}
