package interface04;

public interface Tv {
	int MAX_CHANNEL = 99;
	int MIN_CHANNEL = -0;
	
	void turnOnTv();
	void turnOffTv();
	void setchannel(int channel);
	void volume(int volume);
	void movieSearch(String movieSearch);
}
	
	
