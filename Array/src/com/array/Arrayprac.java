package com.array;

import java.util.Scanner;

public class Arrayprac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] Array;
		Array = new int [5];
		
		for(int a=0; a<5; a++){
			
			Scanner cum = new Scanner(System.in);
			System.out.println("Enter");
			
			int c = cum.nextInt();
			Array[a] = c;
			
		}
		
		for(int b=0; b<5; b++){
			System.out.println(Array[b]);
		}
		
	}

}
