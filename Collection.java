package phase1;

import java.util.*;
public class Collection {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		list.add("Ram");
		list.add("Ravi");
		list.add("Sri");
		list.add("Peter");
		Iterator<String>itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
