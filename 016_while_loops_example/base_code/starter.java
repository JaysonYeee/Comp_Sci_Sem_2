import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Name?");
		String a = sc.nextLine();
		System.out.println("Output Number?");
		String b = sc.nextLine();
		
		int c = 0;
		while(true)
		{
			System.out.println(c);
			if(c == 10)
			{
				break;
			}
			c = c + 1;
			}
	}
}
