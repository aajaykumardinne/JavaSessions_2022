package CodingAssignments;

import java.util.ArrayList;
import java.util.Iterator;

public class BrowserTest {

	public static void main(String[] args) {
		
		ArrayList<String>  pluginslist = new ArrayList<String>();
		pluginslist.add("Adobe");
		pluginslist.add("flash plugin");
		
		Browser   br = new Browser("Chrome", "Google", 100.00);
		
		System.out.println(br.getBrowserInfo());
		
		// using the for loop
		for(int i=0 ; i<pluginslist.size() ; i++) {
			System.out.println(pluginslist.get(i));
		}

		System.out.println("&&&");
		// for each loop
		for(String ele : pluginslist) {
			System.out.println(ele);
		}
		
		System.out.println("&&&");
		// using the iterator
		Iterator<String> it = pluginslist.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
