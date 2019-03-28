import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class class1 {

	public static void main(String[] args) {
		
		String s="helloween";
		
		LinkedHashMap<Character, Integer> d = new LinkedHashMap();
		
		char[] c = s.toCharArray();
		
		for ( int i =0; i<c.length; i++){
			
			if(d.containsKey(c[i])){
				int count = d.get(c[i]);
				
				d.put(c[i], ++count);
				
			}
			
			else
			{
				
				d.put(c[i],1);
			}
			}
		System.out.println(d);
		}
		
		
		
	}



