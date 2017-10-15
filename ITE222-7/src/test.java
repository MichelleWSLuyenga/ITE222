import java.util.*;

public class test {
	
	private static Scanner con;

	public static void main(String[] args) {
		con = new Scanner(System.in);
		System.out.println("Please enter your words to count for word(-1 to exit):  ");
        String para = con.nextLine();
        
        
        List < String > paraList = new ArrayList < String > ();
        paraList = Arrays.asList(para.split(" "));
        //System.out.println(paraList);
        int size = paraList.size(); 

        int i = 0;
        Map < String, Integer > duplicatCountMap = new HashMap < String, Integer > ();
        for (int j = 0; size > j; j++) {
            int count = 0;
            for (i = 0; size > i; i++) {
                if (paraList.get(j).equals(paraList.get(i))) {
                    count++;
                    duplicatCountMap.put(paraList.get(j), count);
                }

            }

        }
        System.out.println(duplicatCountMap);
        
        
        List < Integer > myCountList = new ArrayList < > ();
        Set < String > myValueSet = new HashSet < > ();
        for (Map.Entry < String, Integer > entry: duplicatCountMap.entrySet()) {
            myCountList.add(entry.getValue());
            myValueSet.add(entry.getKey());
        }
        System.out.println(myCountList);
        System.out.println(myValueSet);  
    }
	
}
