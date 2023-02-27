package phone;

abstract public class Phone {
	// 공통으로 들어가는 전화받기 걸기
	abstract void bellSound();{ // abstract 세미콜론 반드시 
	}
	abstract void getCall();{ // abstract 세미콜론 반드시 
	}
	abstract void hangCall();{ // abstract 세미콜론 반드시 
	}
	void bell() {
		System.out.println("벨 울림");
	}
	void sendVoice(String msg) {
		System.out.println("나 : " + msg);
	}
	void reciVoice(String msg) {
		System.out.println("상대방 : " + msg);
	}
	void hangUp() {
		System.out.println("전화를 끊습니다");
	}
}