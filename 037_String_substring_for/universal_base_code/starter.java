import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Word");
		String x = sc.nextLine();
		
		System.out.println("Letter Output");
		
		int y = 0;
		
		while(y < x.length())
		{
			System.out.println(x.substring(y, y + 1));
			y++;
		}
		
	}
}
