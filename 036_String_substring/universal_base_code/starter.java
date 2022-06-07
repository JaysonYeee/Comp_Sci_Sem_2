import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Word");
		String x = sc.nextLine();
		
		System.out.println("Letter Output");
		
		for(int y = 0; y < x.length(); y++){
			System.out.print(x.substring(y, y + 1));
		}
		
		
	}
}
