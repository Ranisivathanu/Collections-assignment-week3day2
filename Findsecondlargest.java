package week3.day2;
import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class Findsecondlargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		List<Integer> list = new ArrayList<Integer>();
		for(int i:data) {
		   list.add(i);
		    }
		
		Collections.sort(list);
		System.out.println("Second largest:" +list.get(+list.size()-2));
	}}