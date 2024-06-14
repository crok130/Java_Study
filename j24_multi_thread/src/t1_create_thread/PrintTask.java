package t1_create_thread;

public class PrintTask implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("PrintTask 띵!");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Print Task 종료");
	}

}
