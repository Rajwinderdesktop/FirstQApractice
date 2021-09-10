package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;



public class Synchronizedarryalist {

	public static void main(String[] args) {
		//1. way to create synchronized arraylist
		List<String> ls  = Collections.synchronizedList(new ArrayList<String>());
		ls.add("raj");
		ls.add("win");
		ls.add("sin");
		ls.add("singh");
		//explicit synchronization
		
		synchronized(ls) {
			Iterator<String> it =ls.iterator();
			
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			
			//2. copyonwritearraylist
			
			CopyOnWriteArrayList<String> emp =new CopyOnWriteArrayList<String>();
			
			
		}
		
	}

}
