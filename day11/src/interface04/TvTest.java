package interface04;

public class TvTest {

	public static void main(String[] args) {
		TvClass tv = new TvClass();
		
		tv.setchannel(-1);
		
		tv.turnOnTv();
		tv.turnOffTv();
		tv.movieSearch("영화");
		tv.volume(5);
		
	}

}
