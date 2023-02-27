package abstract01;

public class AnimalTest {

	public static void main(String[] args) {
		// 추상 클래스는 객체 생성이 안됨 메서드가 구현되어 있지 않기때문
		// Animal a = new Animal(); 객체 생성이 안됨 
		// 형변환은 가능
		
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		Bird bird = new Bird();
		
		dog.sound();
		cat.sound();
		bird.sound();
		System.out.println("------------------------");
		
		Animal ani = dog; // 오버라이딩된 것은 무조건 자식것이 호출됨 
		ani.sound();
		
		ani = cat;
		ani.sound();
		
		ani = bird;
		ani.sound();
		System.out.println("------------------------");
		
		aniSound(new Cat());
		aniSound(new Dog());
		aniSound(new Bird());
	}
	
	static void aniSound(Animal ani) { // 메서드를 생성해 호출 이용 
		ani.sound(); 
	}
}
