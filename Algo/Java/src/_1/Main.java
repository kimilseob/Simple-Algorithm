package _1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Student st1 = new Student("손오공" , "1894");
		Student st2 = new Student("저팔계" , "1694");
		Student st3 = new Student("김일섭" , "1892");
		
		ArrayList <Student>list = new ArrayList<Student>();
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
		
		for(Student stu : list) {
			System.out.println(stu.getName());
			System.out.println(stu.getNo());
		}
		
		Scanner scan = new Scanner(System.in);

		
		
		
		while(true) {
			System.out.println("계속 검색을 하고싶으시면 y , 종료하고싶으시면 n");
			String input = scan.next();
			boolean flag = false;
			
			if(input.equals("y")) {
				System.out.println("검색을 시작합니다.");
				
				
			}
			else if(input.equals("n")) {
				break;
			}
			
		}
		
		System.out.println("프로그램이 종료되었습니다.");
	}
}
