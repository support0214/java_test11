package phone;

public class SmartPhone extends CellPhone{
	public void kakao(String msg) {
		System.out.println(msg + "을 카톡으로 보냈습니다");
	}
	public void search(String name) {
		System.out.println(name + "을 검색합니다");
	}
	@Override
	void bellSound() {
		System.out.println("SmartPhone 벨소리");
		
		
	}
	@Override
	void getCall() {
		System.out.println("SmartPhone 전화받는소리");
		
	}
	@Override
	void hangCall() {
		System.out.println("SmartPhone 전화끊는소리");
		
	}
}
