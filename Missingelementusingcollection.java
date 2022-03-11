package week3.day2;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Missingelementusingcollection {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,7,6,8};
	    List<Integer>text=new ArrayList<Integer>();
	    for(int i:numbers) {
			   text.add(i);
	    }
	    System.out.println(text);
	     for(int j=1; j<numbers.length; j++){
	        if(!text.contains(j))
	              System.out.println("Number Not in List : "+j);
	    }
	    
		
		
	}

}
