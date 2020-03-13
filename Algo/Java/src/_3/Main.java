package _3;

import java.util.Scanner;

//최빈수

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int[] inputNum = new int[10];

		for (int i = 0; i < 10; i++) {
			inputNum[i] = scan.nextInt();
		}

		// 사용자 input

		// 1 2 2 3 1 4 2 2 4 3

		int[] mode = new int[10];
		// index => 출현한 수
		// index 값 --> index(출현한수)가 몇번 나왔는지 저장하는 용도

		// mode[3] = 5, => 3번숫자가 , 5번 출현했다

		for (int i = 0; i < 10; i++) {
			mode[inputNum[i]]++;
		}
		
		//mode[1] == 2
		//mode[2] == 4
		//mode[3] == 2
		//mode[4] == 2
		
		int modeNum = 0;
		int modeCnt = 0;
		
		for(int i=0 ; i<10 ; i++) {
			
		}
		

	}

}
