import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.Consumer;

public class Demo {
    public static void main(String[] args){   
    	
    	List<Integer> nums= Arrays.asList(4,5,7,3,2,6);
    	
//    	Consumer<Integer> con=new Consumer<Integer>() {
//    		
//    		public void accept(Integer n)
//    		{
//    			System.out.println(n);
//    		}
//    	};

 //   	nums.forEach(con); // You can also use this form of .forEach funcn, but first u have
 // 	to write the Consumer anonymous inner object in line 11
    	
    	Consumer<Integer> con= n -> System.out.println(n); // Lambda expression for line 11
 
    	nums.forEach(n -> System.out.println(n)); //Earlier example, (if u observe it is basically the short
		//                                          of line 19 & 22, u just omit con and just right the RHS
		//											of line 22)
   
 //  	nums.forEach(null);

    	
    	
    	//nums.forEach(n -> System.out.println(n));
    	
    }
}
