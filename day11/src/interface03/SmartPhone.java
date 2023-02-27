package interface03;

public class SmartPhone implements Phone, Searchable{
	int volume; //인스턴스 변수값 설정 꼭
	@Override
	public void search(String msg) {
		System.out.println(msg + "검색을 합니다");
		
	}

	@Override
	public void turnOn() {
		System.out.println("전화를 받습니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("전화를 끊습니다");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME) 
			this.volume = MAX_VOLUME;
		else if(this.volume > MIN_VOLUME)
			this.volume = MIN_VOLUME;
		else 
			this.volume = volume;
		System.out.println("현재 볼륨 : " + this.volume);
		
	}
	@Override
	public void internet(String ur1) {
		System.out.println(ur1 + "을 엽니다");
	}

}
