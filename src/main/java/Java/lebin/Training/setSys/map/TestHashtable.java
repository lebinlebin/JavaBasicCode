package Java.lebin.Training.setSys.map;

import java.util.Hashtable;

public class TestHashtable {

	
	public static void main(String[] args) {
		
		Hashtable table = new Hashtable();
		
		table.put("john", 1);
		table.put("jac", null);
		table.put(null, 2);
		table.put("john", 1);
		
		
		System.out.println(table);
		
	}
}
