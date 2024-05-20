package extands2_phone_example;

public class PhoneExample {

	public static void main(String[] args) {
		// 기본적인 기능을 하는 1세데 폰
		Phone phone = new Phone("걸리버","GOLD");
		phone.powerOn();
		phone.bell();
		phone.pickUp();
		phone.sendVoice("여보세요~?");
		phone.receiveVoice("이번에 새로 나온 좋은 상품이 있는데...");
		phone.sendVoice("Rjedu");
		phone.hangUp();
		phone.powerOff();
		
		System.out.println("DMBPhone ================");
		DMBPhone dmbphone = new DMBPhone("가로본능","SILVER",8);
		dmbphone.powerOn();
		dmbphone.bell();
		dmbphone.pickUp();
		dmbphone.sendVoice("hi");
		dmbphone.receiveVoice("sorry");
		dmbphone.hangUp();
		dmbphone.trunOnDMB();
		dmbphone.setChannel(11);
		dmbphone.trunOffDMB();
		dmbphone.powerOff();
		
		System.out.println("AndroidSmartPhone =========");
		AndroidSmartPhone smartPhone = new AndroidSmartPhone("옴니아","silver",7,"http://google.com");
		smartPhone.powerOn();	// phone 기능
		smartPhone.trunOnDMB();	// DMBphone 기능
		smartPhone.trunOffDMB();
		smartPhone.trunOnInternet();
		smartPhone.setUrl("상속이란 무엇인가");
		smartPhone.trunOffInternet();
		smartPhone.bell();
		smartPhone.powerOff();
	}
}
