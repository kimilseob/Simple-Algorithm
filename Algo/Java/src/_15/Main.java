package _15;

public class Main {
	public static void main(String[] args) {
		
		int start = 2; 
		int end = 5; 
		
		for(int i = start ; i<=end ; i++) {
			for(int j =1; j<10;j++) {
				
				System.out.println(i + "*" + j + "=" + i*j);
			}
			System.out.println();
		}
	}
}
