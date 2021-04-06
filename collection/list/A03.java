import java.util.ArrayList;
import java.util.Iterator;

public class A03 {

	public static void main(String[] args) {

		ArrayList<String> stringlist = new ArrayList<>();
		stringlist.add("A");
		stringlist.add("B");
		stringlist.add("C");
	
		
		printAll(stringlist);
	}

	static void printAll(ArrayList<String> stringlist) {
		Iterator<String> itr = stringlist.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
