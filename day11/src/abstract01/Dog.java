package abstract01;

public class Dog extends Animal {
	Dog(){
		kind = "포유류";
	}
	// 반드시 구현 쓸게 없더라고 
	@Override
	void sound() {
		System.out.println("멍멍");
	}

}
