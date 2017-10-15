import java.util.*;

public class PlayAround {
	public static void main(String[] args) {
		Map<String, Integer> name = new HashMap<String, Integer>();
		name.put("Hades", 8);
		name.put("Wniap", 16);
		
		for(String n : name.keySet()) {
			System.out.println(name);
			name.put(n, name.get(n)+1);
			System.out.println(name);
		}

		//System.out.println(name.toString());
	}
	
}
