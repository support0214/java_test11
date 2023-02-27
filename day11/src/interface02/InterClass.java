package interface02;

public class InterClass implements Interface{
	@Override
	public void methodA() {
		System.out.println("interfaceA-methodA() 실행");
	}

	@Override
	public void methodA1() {
		System.out.println("interfaceA-methodA1() 실행");
		
	}
	@Override
	public void methodB() {
		System.out.println("interfaceB-methodB() 실행");
		
	}

	@Override
	public void methodB1() {
		System.out.println("interfaceB1-methodB1() 실행");
		
	}

	@Override
	public void method() {
		System.out.println("interface-method() 실행");
		
	}


}
