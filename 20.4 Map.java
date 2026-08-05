import java.util.HashMap;
import java.util.Map;
import java.util.Hashtable;

public class Demo {
    public static void main(String[] args){   
    	
//    	Map<String, Integer> students=new HashMap<>();
    	Map<String, Integer> students=new Hashtable<>();


		// HashTable is synchronized whereas HashMap is not (Go to the threads topic for more
		// synchronized and un-synchronized)

		
    	
    	students.put("Navin",56);
    	students.put("Harsh",23);
    	students.put("Sushil",67);
    	students.put("Kiran",92);
    	students.put("Harsh",45);
    	
    	System.out.println(students.keySet()); // Prints all thr keys of the Map
    	
    	for(String key : students.keySet())
    	{
    		System.out.println(key + ":" + students.get(key));
    	}
    	
    }
}