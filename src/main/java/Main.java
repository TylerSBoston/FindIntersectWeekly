import java.util.Arrays;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object a = new Object();
		Object b = new Object();
		Object c = new Object();
		Object d = new Object();
		Object e = new Object();
		Object f = new Object();
		Object g = new Object();
		Object h = new Object();
		Object i = new Object();
		Object j = new Object();
		Object k = new Object();
		
		LinkedList<Object> test1 = new LinkedList<Object>();
		test1.add(a);
		test1.add(b);
		test1.add(c);
		test1.add(d);
		test1.add(e);
		test1.add(f);
		
		LinkedList<Object> test2 = new LinkedList<Object>();
		test2.add(k);
		test2.add(j);
		test2.add(i);
		test2.add(h);
		test2.add(c);
		test2.add(g);
		
		
		
		LinkedList<Object> test3 = new LinkedList<Object>();
		test3.add(a);
		test3.add(b);
		test3.add(c);
		test3.add(d);
		test3.add(b);
		test3.add(f);
		
		
		try {
			int [] output = IntersectFinder.findIntersect(test1,test2);
			System.out.println("intersect found on index: "+ output[0] + " of list 1 and " + output[1] + " of list 2" );
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		int [] output = IntersectFinder.findLoop(test3);
		System.out.println("Repeate of index: " + output[0] + " found on index " + output[1]);

	}

}
