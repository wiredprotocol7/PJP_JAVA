import java.util.*;


public class A02 {

	public static void main(String[] args) 
  {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
		
		map.put("Indo", "Jakarta");
		map.put("Japan", "Tokyo");
		map.put("Bhutan", "Thimpu");
		
		Set<Entry<String, String>> set = map.entrySet();
		Iterator<Entry<String, String>> itr = set.iterator();
		
		while (itr.hasNext()) 
    {
			Map.Entry<String, String> me = itr.next();
			
			if (me.getKey().equals("Japan")) 
      {
				System.out.println(" Japan exists");
				break;
			}
		}
		

		Iterator<Entry<String, String>> itr2 = set.iterator();
		
		while (itr2.hasNext()) {
			Map.Entry<String, String> mo = itr2.next();
			
			if (mo.getValue().equals("Bhutan")) {
				System.out.println("Value Delhi exists");
				break;
			}
		}
		

	}

}
