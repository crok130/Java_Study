package t2_priority_name;

public class CalcThread extends Thread{

	public CalcThread(String name) {
		// Thread class의 생성자를 통해 Thread 이름 초기화
		super(name);
	}
	@Override
	public void run() {
		for(int i = 0; i < 2100000000; i++) {
			
		} // end for
		String name = getName();		// 작업 스레드 이름
		int priorty = getPriority();	// 작업 우선 순위
		System.out.println(name+":"+priorty);
	}
}
