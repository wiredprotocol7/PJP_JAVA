package lib;
import java.util.*;
public class VideoStore {
	
	 ArrayList<video> store = new ArrayList<>();
	 
	 public void addVideo(String name) {
		 video v= new video(name);
		 store.add(v);
	 }
	 
	public void doCheckout(String name) {
		
			if(!store.stream().anyMatch(o->o.getName().equals(name))) {
				System.out.println("NOT AVAILABLE");
				return;
			}
			for(video v :store) {
				if(v.getName().equals(name)) {
					v.doCheckout();
				}
			}
		}
	 
	 
	 
	public void doReturn(String name) {
		
		if(!store.stream().anyMatch(o->o.getName().equals(name))) {
			System.out.println("NOT AVAILABLE");
			return;
		}
		for(video v :store) {
			if(v.getName().equals(name)) {
				v.doReturn();
			}
		}
	}
  
	
	public void recieveRating(String name,int rating) {
		
		if(!store.stream().anyMatch(o->o.getName().equals(name))) {
			System.out.println("NOT AVAILABLE");
			return;
		}
		for(video v :store) {
			if(v.getName().equals(name)) {
				v.receiveRating(rating);;
			}
		}
	}
	
	public void listInventory() {
		if (store == null || store.isEmpty()) {
			System.out.println("Store is empty");
			return;
		}
		for (video v : store) {
			System.out.print("---------------------------------------------------------------------------");
			System.out.printf("\n\t%-20s\t|\t%-10s\t|\t%-15s\n", "Video Name","Checkout Status","Rating");
			System.out.printf("\n\t%-20s\t|\t%-10s\t|\t%-15s\n", v.getName(), v.getCheckout(),v.getRating());
			System.out.println("---------------------------------------------------------------------------");
		}
	}
	

}
