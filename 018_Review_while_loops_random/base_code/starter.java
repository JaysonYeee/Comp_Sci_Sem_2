import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int a2 = rand.nextInt(1001);
		
		while(true){
			System.out.print("Guess the Number between 1 - 1,000: ");
			int a1 = sc.nextInt();
			
			if(a1 == a2){
				System.out.println("Correct");
				{
				break;
				}
			}
			else{
				if(a1 > a2) {
					System.out.println("Lower");
				}	
				if(a1 < a2) {
					System.out.println("Higher");
				}
			}
		}	
		
	}
}
