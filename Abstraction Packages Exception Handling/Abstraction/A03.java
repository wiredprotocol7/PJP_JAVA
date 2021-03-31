import java.util.Random;

abstract class Instrument {
	abstract void play();
}

class Piano extends Instrument {

	void play() {
		
		System.out.println("Piano is playing tan tan tan tan ");
	}
	
}

class Flute extends Instrument {


	void play() {
	
		System.out.println("Flute is playing toot toot toot toot ");	
	}
	
}

class Guitar extends Instrument {


	void play() {
	
		System.out.println("Piano is playing tin tin tin ");
	}
	
}

public class A03 {

	public static void main(String[] args) {

Instrument[] instruments = new Instrument[10];
		
		Random random = new Random();
	    
	    	for (int i = 0; i < 10; i++) {
	    		int ran = 1+random.nextInt(3);
	    	
	    		if (ran == 1)
	    			instruments[i] = new Piano();
	    		else if (ran == 2)
	    			instruments[i] = new Flute();
	    		else if (ran== 3)
	    			instruments[i] = new Guitar();
	    	}
		
	    	for (int i = 0; i < 10; i++) {
            		if(instruments[i] instanceof Piano)
                		System.out.print(i+ "is instance of Piano. ");
            		if(instruments[i] instanceof Flute)
                		System.out.print(i + " is  instance of Flute.");
            		if(instruments[i] instanceof Guitar)
                		System.out.print( i + " is  instance of Guitar.");
            		instruments[i].play();
            	}
	}

}
