package _12;

public class Main {
	
	public static void main(String[] args) {
		
		int n = 5;
		
		int k = 1;
		
		for(int i = 1; i <= n ;i++) {
			for(int j = 0 ; j < n ; j++) {
				System.out.print("   "+ (i + (j*4)));
			}
			System.out.println();
		}
	}
}
