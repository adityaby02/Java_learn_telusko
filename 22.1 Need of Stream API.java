import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args){   
    	
    	List<Integer> nums= Arrays.asList(4,5,7,3,2,6);
		// Note (Imp)-> The above code declares as well as stores the values in the List, quite useful
		// here asList is a method inside Arrays class
    	
//    	for(int i=0;i<nums.size();i++)
//    	{
//    		System.out.println(nums.get(i));
//    	}
    	
    	
//    	for(int n: nums)
//    	{
//    		System.out.println(n);
//    	}
    	
    	nums.forEach(n -> System.out.println(n));
    	// Note (Imp)--> forEach method-> Even better way to print the elements in 'nums' list, than
		// the code written on line 12 and 18
    	
    	int sum=0;
    	for(int n:nums)
    	{
    		if(n%2==0)
    		{
    			n=n*2;
    			sum=sum+n;
    		}
    	}
    	
//    	System.out.println(nums);
    	System.out.println(sum);
  
    }
}