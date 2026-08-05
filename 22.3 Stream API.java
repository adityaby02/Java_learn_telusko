import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.Consumer;

public class Demo {
    public static void main(String[] args){   
    	
    	List<Integer> nums=Arrays.asList(4,5,7,3,2,6);

//  	Note-> 'Stream' is an interface 
    	
//    	Stream<Integer> s1=nums.stream();  // nums.stream() just return the integers of nums to 'Stream'
//    	s1.forEach(n-> System.out.println(n)); ->This will also work, instead of nums.forEach(n->System.out.println(n))

//  	Note (Imp)-> We can use Stream only once, means s1 can't be used again for any purposes, it will give runtime error


//    	Stream<Integer> s2= s1.filter(n ->n%2==0); // filter() funcn returns a stream of values satifying the specified condition, (also s1 is used)
// 										-> here n->n%2==0 is a lambda expression



//    	Stream<Integer> s3= s2.map(n->n*2); // map() funcn returns the stream of values doubled, in this case (s2 is used)


//    	int result=s3.reduce(0,(c,e)->c+e);  // reduce() doesn't give u stream of values, but only a datatype (int in this case)
//    	
//    	s2.forEach(n -> System.out.println(n));


//    	s3.forEach(n -> System.out.println(n));
//    	
 
    	
    	int result=nums.stream()
    					.filter(n-> n%2==0)
    					.map(n->n*2)
    					.reduce(0, (c,e)-> c+e);


//  	Note-> We have combined everything in the code in line 36
    	System.out.println(result);
    	
    	
    }
}

