import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class A03 {

	public static void main(String[] args) {

		Properties properties = new Properties();
		
		properties.setProperty("Tripura", "Agartala");
		properties.setProperty("Mizoram", "Aizwal");
		properties.setProperty("Sikkim", "Gangtok");

		Set<Entry<Object, Object>> set = properties.entrySet();
		Iterator<Entry<Object, Object>> itr = set.iterator();
		
		while (itr.hasNext()) 
    {
			Entry<Object, Object> i = itr.next();
			System.out.println(i);
		}
	}

}
