package interface04;

public class TvClass implements Tv, SmartTv{
	int channel;
	int volume;
	@Override
	public void movieSearch(String movieSearch) {
		System.out.println(movieSearch + "을 검색합니다");
		
	}

	@Override
	public void turnOnTv() {
		System.out.println("TV를 켭니다");
		
	}

	@Override
	public void turnOffTv() {
		System.out.println("TV를 끕니다");
		
	}

	@Override
	public void setchannel(int channel) {
		if(channel > MAX_CHANNEL) 
			this.channel = MAX_CHANNEL;
		else if(channel < MIN_CHANNEL)
			this.channel = MIN_CHANNEL;
		else
			this.channel = channel;
		System.out.println("현재 채널 : " + this.channel);
	}
		
	

	@Override
	public void volume(int volume) {
		System.out.println("볼륨 : " + volume);
	}

}
