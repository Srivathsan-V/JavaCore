package capgemini.day8;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mymap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(101, "Srivathsan");
		map.put(102, "Tom");
		map.put(103, "Lewis");
		map.put(104, "Deep");
		map.put(105, "Dorcy");
		map.put(106, "Alec");
		
		//printing the map objects
		System.out.println(map);
		
		System.out.println(map.get(102));
		//System.out.println(map.merge(107, "Sri", null));
		System.out.println(map.replace(102, "Tommy"));
		System.out.println(map.size());
		System.out.println(map.keySet());
		
		//printing using for loop
		Set<Integer> key = map.keySet();
		for(Integer k: key) {
			System.out.println("Key"
								+k+
								"Value"+
								map.get(k));
			
		}

		




	}

}
