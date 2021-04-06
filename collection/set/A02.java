import java.util.HashSet;
import java.util.Iterator;

public class A02 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		
		set.add("A");
		set.add("B");
		set.add("C");
		
		Iterator<String> itr = set.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
	}

}
