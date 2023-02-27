package interface02;

public interface InterfaceA {
	
		public static final int MAX = 100;
		int MIN = 0;	// public static final이 컴파일시 자동으로 붙여 컴파일함(생략가능)
		
		public void methodA();
		public void methodA1();
	}

//	public void methodA();
	
	// 구현되어 있는 메서드가 있으면 안됨	
//	public static void methodAA();
//}
