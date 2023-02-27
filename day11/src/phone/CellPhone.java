package phone;

public class CellPhone extends Phone {

	
	void msg(String msg) {
		System.out.println("문자 " + msg + "을 보냅니다");
	}
	void play(String name) {
		System.out.println("동영상 " + name + "을 재생합니다");
	}
	@Override
	void bellSound() {
		System.out.println("CellPhone 벨소리");
		
	}
	@Override
	void getCall() {
		System.out.println("CellPhone 전화받는소리");
		
	}
	@Override
	void hangCall() {
		System.out.println("CellPhone 전화끊는소리");
		
	}
}
