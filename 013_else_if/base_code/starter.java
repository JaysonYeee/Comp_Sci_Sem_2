import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int num = rand.nextInt(1001);
		//System.out.print(num);
		
		System.out.println("Guess a number between 1 - 1,000");
		int guess = sc.nextInt();
		
		if (guess == num){
			System.out.print("Correct");
		}
		else if(guess >= num){
				System.out.println("A little High");
			}
		else if(guess <= num){
				System.out.println("A little low");
			}
	}
}
