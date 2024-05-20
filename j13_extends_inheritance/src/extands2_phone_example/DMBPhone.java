package extands2_phone_example;

public class DMBPhone extends Phone{

	int channel;		// 공중파 채널
	
	DMBPhone(String model, String color, int channel){
		super(model, color);
		this.channel = channel;
	}
	
	void trunOnDMB() {
		System.out.println("DMB를 켭니다.");
	}
	
	void trunOffDMB() {
		System.out.println("DMB를 끕니다.");
	}
	
	void setChannel(int setChannel) {
		if(setChannel < 1) {
			this.channel = 11;
		}else {
			this.channel = setChannel;
		}
		System.out.println("채널이" +channel+"로 변경됩니다");
	}
}
