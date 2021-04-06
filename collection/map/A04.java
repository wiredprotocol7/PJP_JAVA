/*		for(Map.Entry<String,String> entry : M1.entrySet())
		{
			M2.put(entry.getValue(), entry.getKey());
	
		}
		*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

class ContactList {
	HashMap<String, Integer> contacts = new HashMap<>();
	
	public void addContact(String name, Integer num) {
		contacts.put(name, num);
	}
	
	public void removeContact(String name) {
		contacts.remove(name);
	}


	
	public boolean nameexist(String name) {
		Set<Entry<String, Integer>> set = contacts.entrySet();
		Iterator<Entry<String, Integer>> itr = set.iterator();
		
		while (itr.hasNext()) {
			Entry<String, Integer> i = itr.next();
			
			if (i.getKey().equals(name)) {
				return true;
			}
		}
		
		return false;
	}
	
	public boolean numberExist(Integer number) {
		Set<Entry<String, Integer>> set = contacts.entrySet();
		Iterator<Entry<String, Integer>> it = set.iterator();
		
		while (it.hasNext()) {
			Entry<String, Integer> e = it.next();
			if (e.getValue().intValue() == number) {
				return true;
			}
		}
		
		return false;
	}

	}


public class A04 {

	public static void main(String[] args) {
		
		ContactList contactsList = new ContactList();
		
		contactsList.addContact("A", 4214214);
		contactsList.addContact("B", 214214);
		contactsList.addContact("C", 462352);
				
		System.out.println("Does A exist:" + contactsList.nameexist("A"));
		System.out.println("Does 12345 exists: " + contactsList.numberExist(12345));
	
	}

}
