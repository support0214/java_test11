package abstract01; // 추상

abstract public class Animal { 
	String kind;
	
	void breathe() {
		System.out.println("숨을 쉽니다");
	}
	abstract void sound(); // abstract 세미콜론 반드시 
}
