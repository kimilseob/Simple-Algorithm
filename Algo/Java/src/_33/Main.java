package _33;

public class Main {
	static final int SIZE = 5;
	static final int COLOR = 2;
	
	static int [][] map = 
		{
				{0,0,0,0,0},
				{0,0,1,1,0},
				{0,0,0,0,1},
				{0,0,0,0,0},
				{0,0,1,0,0}
				
		};
	
	public static void color(int x, int y) {
		if(map[x][y] !=1)
			map[x][y] = COLOR;
		
		
	}
	
	public static void main(String[] args) {
		
		for(int i=0;i<SIZE;i++) {
			for(int j= 0 ;j<SIZE;j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		color(0,0);
		
		for(int i=0;i<SIZE;i++) {
			for(int j= 0 ;j<SIZE;j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
