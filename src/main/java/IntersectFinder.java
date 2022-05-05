import java.util.HashMap;
import java.util.LinkedList;

public class IntersectFinder {
	
	
	// return int[] contains index's of intersect
	public static int[] findIntersect(LinkedList<Object> list1, LinkedList<Object> list2) throws Exception
	{
		HashMap<Integer,int[]> values = new HashMap<Integer,int[]>();
		
		for(int i = 0; i< list1.size(); i++)
		{
			int ref = System.identityHashCode(list1.get(i));
			if(!values.containsKey(ref))
			{
				values.put(ref,new int[] {i,0});
			}
			else
			{
				throw new Exception("first list had duplicate objects");
			}
		}
		for(int i = 0; i< list2.size(); i++)
		{
			int ref = System.identityHashCode(list2.get(i));
			if(!values.containsKey(ref))
			{
				values.put(ref,new int[] {0,i});
			}
			else if(values.get(ref)[0] != 0)
			{
				values.put(ref, new int[] {values.get(ref)[0],i});
				//returns single value per requirements, could be upgraded to return full list of intersects.
				return values.get(ref);
			}
			else
			{
				throw new Exception("second list had duplicate objects");
			}
		}
		
		// returns null if no intersect
		return null;
	}
	
	// return int[] contains original and copied node.
	public static int[] findLoop(LinkedList<Object> list)
	{
		HashMap<Integer,int[]> values = new HashMap<Integer,int[]>();
		
		for(int i = 0; i< list.size(); i++)
		{
			int ref = System.identityHashCode(list.get(i));
			if(!values.containsKey(ref))
			{
				values.put(ref,new int[] {i,0});
			}
			else
			{
				values.put(ref, new int[] {values.get(ref)[0],i});
				return values.get(ref);
			}
		}
		
		return null;
	}

}
