package phone;

public class PhoneTest {

	public static void main(String[] args) {
		SmartPhone sp1 = new SmartPhone();
		CellPhone cp1 = new CellPhone();
		sp1.bell();
		sp1.sendVoice("여보세요");
		sp1.reciVoice("네");
		sp1.hangUp();
		sp1.kakao("카카오");
		sp1.msg("문자");
		sp1.play("동영상");
		sp1.search("검색");
		
		cp1.bellSound();
		sp1.bellSound();
		cp1.getCall();
		sp1.getCall();
		cp1.hangCall();
		sp1.hangCall();
		
		phoneSound(new CellPhone());
		phoneSound(new SmartPhone());
	}
	
	static void phoneSound(Phone p) {
		p.bellSound();
		p.getCall();
		p.hangCall();
	} 

}
