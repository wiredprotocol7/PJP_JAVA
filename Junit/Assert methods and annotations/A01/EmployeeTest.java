package mypack;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;

public class EmployeeTest {
	ArrayList<String> list = new ArrayList<>();
	{
		list.add("Lain");
		list.add("Eren");
		list.add("Sasaki");
	}
	
	@Test
	public void testFindName() {
		System.out.println(list);
		assertEquals("FOUND", e.findName(list, "Lain"));
		System.out.println("tested");
	}

}
