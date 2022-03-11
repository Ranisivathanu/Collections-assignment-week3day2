package week3.day2;



import java.util.LinkedHashSet;

import java.util.Set;

public class RemoveDupsusingcollection {

	public static void main(String[] args) {
		String S = "We learn java basics as part of java sessions in java week1";
		Set<String>text=new LinkedHashSet<String>();
	   String[] arr=S.split(" "); // need to split the string
	
	   for(String S1 :arr) { //placed the split array in another variable
		   text.add(S1);
		   }
	System.out.println(text);
	String output="";  //to replace "," into " ";
	for(String S1 :text) {
		output += " " + S1;
	}	
		System.out.println(output);
		
	
			
	
	}}
	
	
	
		