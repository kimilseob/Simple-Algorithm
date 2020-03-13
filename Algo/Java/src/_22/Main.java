package _22;

public class Main {
	public static void main(String[] args) {
	
		String n = "1221";
		int len = n.length();
		
		boolean flag = true;
		for(int i =0; i < len/2;i++ ) {
			if(n.charAt(i)!= n.charAt(len-1-i)) {
				flag = false;
			}
		}
		
		if(flag) {
			System.out.println("펠린드롭입니다.");
		}
		
		
		
	}
}
