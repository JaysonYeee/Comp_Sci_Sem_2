import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int num = rand.nextInt(1001);
		//System.out.print(num);
		//String num2 = nextLine();
		
		System.out.println("Guess a number between 1 - 1,000");
		int guess = sc.nextInt();
		
		if (guess == num){
			System.out.print("Correct");
		}
		else{
			System.out.print("Wrong");
		}
			
		
	}
}
