package Java_Practice;

import java.util.HashSet;
import java.util.Set;

public class Remove_ArrayDublicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,2,3,4,3,2,1};
		
		Set<Integer> nondup= new HashSet<Integer>();
		
		for(int i=0; i<arr.length; i++) {
			nondup.add(arr[i]);
		}
		System.out.println(nondup);
		
		String str= "RefrigeratorzjizjI";
		String str1=str.toLowerCase();
		
		char[] chr=str1.toCharArray();
		
		Set<Character> nondupstr= new HashSet<Character>();
		
		for(int i=0; i<chr.length; i++) {
			nondupstr.add(chr[i]);
		}
		System.out.println(nondupstr);
		

	}

}
