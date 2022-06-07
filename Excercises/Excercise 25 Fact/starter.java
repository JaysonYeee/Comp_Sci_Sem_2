import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = 25;
		
		while(true){
			System.out.println(a);
		if(a == 5){
			break;
		}
		a = a - 1;
		}
		
		int y = sc.nextInt();
		int x = y - 1;
		
		while(true){
			System.out.println(y);
				y = y * x;
		if(x == 1){
			break;
		}
		x = x -1;
		}
		
	}
}
