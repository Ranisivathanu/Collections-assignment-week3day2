package week3.day2;



import java.util.HashSet;


public class Findinsertionusingcollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data={3,2,11,4,6,7};
		int[] data1={1,2,8,4,9,7};
		HashSet <Integer> set1 = new HashSet <Integer>();
	    HashSet <Integer> set2 = new HashSet <Integer>();
	    for(int i:data) {
			   set1.add(i);
			    }
	   System.out.println(set1);
	   for(int j:data1) {
		   set2.add(j);
	   }
        System.out.println(set2);
        set1.retainAll(set2);
        System.out.println("Intersection = "+ set1);
	}}