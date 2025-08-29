package com.Array;
import java.util.Arrays;

public class MultiDiamentionalArray {

	public static void main(String[] args) {
		int [] [] numbers = {{10,20,30},{40,50,60}} ;
		System.out.println(Arrays.deepToString(numbers));
//		for(int [] num : numbers) {
//			for (int num2 :num) {
//				System.out.println(num2);
//			}
//	}
		int [] [] number1 = new int [2] [3];
		number1[0][0] = 10;
		number1[0][1] = 20;
		number1[0][2] = 30;
		number1[1][0] = 40;
		number1[1][1] = 50;
		number1[1][2] = 60;
//	System.out.println(Arrays.deepToString(number1));
//	for(int [] num : number1) {
//		for (int num2 :num) {
//			System.out.println(num2);
//		}
//	}
	
//	System.out.println(number1.length);
//	System.out.println(number1[1].length);
	
//	for (int [] num1 : numbers) {
//		Arrays.sort(num1);
//		System.out.println(Arrays.toString(num1));
//	}

//    System.out.println(Arrays.deepEquals(numbers, number1));
		
//	int [] [] number3 = Arrays.copyOf(number1, 7) ;
//	System.out.println(Arrays.deepToString(number3));
//		for (int[] num4 :number1) {
//			int[] number3 = Arrays.copyOf(num4, 7);
//			System.out.print(Arrays.toString(number3));
//			
//		}
		
		int [][] number4 = Arrays.copyOfRange(number1, 0, 2);
		System.out.println(Arrays.deepToString(number4));
		
		int [] number5 = Arrays.copyOfRange(number1[0], 0, 2);
		System.out.println(Arrays.toString(number5));

//		
	}

}
