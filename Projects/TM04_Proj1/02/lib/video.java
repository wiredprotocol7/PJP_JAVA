package lib;

public class video {
	 String videoName;
	 boolean checkout=false;
	 int rating=0;
	
	//constructor
	video(String name){
		videoName=name;
	}
	
	String getName() {
		return videoName;
	}
	
	void doCheckout() {
		checkout = true;
	}
	
	void doReturn() {
		checkout = false;
	}
	
	void receiveRating(int rating) {
		this.rating = rating;
	}
	
	int getRating() {
		return rating;
	}
	
	boolean getCheckout() {
		return checkout;
	}


}
