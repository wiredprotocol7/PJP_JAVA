package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {

	public static void main(String[] args) {
        Veena ve = new Veena();
        Saxophone sa = new Saxophone();
        ve.play();
        sa.play();

        Playable v = new Veena();
        Playable s= new Saxophone();
        v.play();
        s.play();
	}
