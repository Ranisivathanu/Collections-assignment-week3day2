package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Printduplicateusingcollection {

	public static void main(String[] args) {
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		List <Integer> set1 = new ArrayList <Integer>();
		 for(int i:arr) {
			   set1.add(i);
			    }
	   System.out.println(set1);
	  Set<Integer> text = new HashSet <Integer>();
	  for(int num : set1) {
		  if(text.add(num)!=true)
			  System.out.println(num +" is duplicate number");

	
		}
		
	}
	}


