package _22;

public class Main {
	public static void main(String[] args) {
		
		int num = 12321;
		int arr[] = new int[10];
		int i = 0;
		int j = 0;
		int len = arr.length;
		while (num>0) {
			arr[i] = num%10;
			num = num/10;
			i++;
		}
		
		while( j < arr.length) {
			if(arr[j] == arr[len]) {
				j++;
				len--;
			}
			
		}
		
		if(j == len) {
			System.out.println("펠린드롬입니다.");
			
		}
	}
}