package studio3;

import java.util.Arrays;
import java.util.Scanner;


public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("What integer would you like to find prime numbers up to?: ");
		int n = in.nextInt();
		
		//int [] array = new int [n-1];
		
		/*
		for (int i = 0 ; i < array.length; i ++) {
			array[i] = i+2; 
		}
		
		for (int j = 2; j < array.length; j++) {
			array[j] = 0; 
			j++;
		}
		
		for (int m = 1; m < array.length; m++) {
			array[m] =0;
			m = m+2; 
		}
		
		for (int o = 3; o < array.length; o ++) {
			array [o] = 0; 
			o = o+5; 
		}
		
		for (int p )
		
		
		String s = Arrays.toString(array);
		System.out.println(s);
		*/
		
		Boolean [] array = new Boolean [n+1] ;
		
		for (int j = 0; j < array.length; j++) {
			array[j] = true; 
		}
		
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (array[i] == true) {
				
				for (int j = (int) Math.pow(i,2); j < n+1; j+=i ) {
					array[j] = false; 
					
				}
			}
		}
		
		for (int p = 2; p < array.length; p++) {
			if (array[p] == true) {
				System.out.println(p);
			}
		}
		

	}

}
