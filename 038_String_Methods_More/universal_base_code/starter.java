import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("First and Last Name:");
		String x = sc.nextLine();
		
		for(int a = 0; a < x.length(); a++){
			if(x.substring(a = a + 1) .compareTo("") == 0){
				System.out.println(x.substring(a + 1, x.length()));
			}
		}
		
		
	}
}
