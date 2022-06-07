import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static boolean checkPrime(int x){
		
		while(x % 2 != 0 || x % 4 != 0 || x % 6 != 0){
			return "Your Number is Prime.";
		}
		else{
			return "Your Number is not Prime.";
		}
			
		}
	
	public static void printPrimes(int y){
		
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Input an Integer:");
		int a = sc.nextInt();
		
		printPrimes(a);
		

	}
}
