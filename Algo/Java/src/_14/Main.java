package _14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan  = new Scanner(System.in);
		
		int input = scan.nextInt();
		int arr[] = new int[10];
		
		for(int i=0 ; i< arr.length; i++) {
			if(input%10 == 0) {arr[0]++;}
			else if(input%10 == 1) {arr[1]++;}
			else if(input%10 == 2) {arr[2]++;}
			else if(input%10 == 3) {arr[3]++;}
			else if(input%10 == 4) {arr[4]++;}
			else if(input%10 == 5) {arr[5]++;}
			else if(input%10 == 6) {arr[6]++;}
			else if(input%10 == 7) {arr[7]++;}
			else if(input%10 == 8) {arr[8]++;}
			else {arr[9]++;}
			
			input  = input/10;
		
		}
		
		for(int  i= 0 ; i < arr.length ; i++) {
			System.out.println(i + ":" + arr[i]);
			 
		}
	}
}
