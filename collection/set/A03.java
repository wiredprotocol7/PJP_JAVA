import java.util.Iterator;
import java.util.TreeSet;

public class A03 {

	public static void main(String[] args) {

		TreeSet<String> set = new TreeSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
    set.add("D");
    set.add("E");
        
    System.out.println("Input set:" + set);  
    Iterator itr1 = set.descendingIterator();
    System.out.println("Iteration in Reverse Order:");
    while (itr1.hasNext()) 
    {
      System.out.println(itr1.next());
     }
		
		Iterator<String> itr2 = set.iterator();
		String key = "D";
		boolean found = false;
		
		while (itr2.hasNext()) {
			if (itr2.next().equals(key)) {
				found = true;
				break;
			}
		}
		
	 System.out.println(found);
	}

}
