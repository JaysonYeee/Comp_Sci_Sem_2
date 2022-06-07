import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Name?");
		String a = sc.nextLine();
		System.out.println("Output Number?");
		int b = sc.nextInt();
		
		int c = 1;
		
		while(true){
			System.out.println(a);
			if(c == 0)
			{
				break;
			}
			c = c + 1;
			}
		
	}
}
