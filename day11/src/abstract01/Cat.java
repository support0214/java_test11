package abstract01;

public class Cat extends Animal{
	Cat(){
		kind = "포유류";
	}

	@Override
	void sound() { // 부모의 메서드 찾음
		System.out.println("야옹");
	}

}
