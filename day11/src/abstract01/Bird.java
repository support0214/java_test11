package abstract01;

public class Bird extends Animal{
	Bird(){
		kind = "조류";
	}

	@Override
	void sound() {
		System.out.println("짹짹");
		
	}
	
	

}
