package _5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String input  = "helloWorlD";
		char []arr;
		arr = input.toCharArray();
		System.out.println(arr);
		for(int i=0; i < arr.length; i++) {
			
			if(arr[i]>='a' && arr[i] <='z'){
				arr[i] = (char)(arr[i] -('a'-'A'));
			}
			else if(arr[i]>= 'A' && arr[i]<='Z') {
				arr[i] = (char)(arr[i] + ('a'-'A'));
			}
			
		}
		
		System.out.println(arr);
	}
}
