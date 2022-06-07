import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Pick two Numbers, Number 1:");
		int a = sc.nextInt();
		System.out.println("Number 2:");
		int b = sc.nextInt();
		
		if(a % 2 == 0){
			System.out.println("Your First Number is even.");
		}
		else{
			System.out.println("Your First Number is odd.");
		}
		
		String c = sc.nextLine();
		
		if(b % 2 == 0){
			System.out.println("Your Second Number is even.");
		}
		else{
			System.out.println("Your Second Number is odd.");
		}
		
		String d = sc.nextLine();
		
		if(a % 3 == 0){
			System.out.println("Your First Number is divsible by 3.");
		}
		else{
			System.out.println("Your First Number is not divisible by 3.");
		}
		
		if(a % 4 == 0){
			System.out.println("Your First Number is divsible by 4.");
		}
		else{
			System.out.println("Your First Number is not divisible by 4.");
		}
		
		if(a % 5 == 0){
			System.out.println("Your First Number is divsible by 5.");
		}
		else{
			System.out.println("Your First Number is not divisible by 5.");
		}
		
		String e = sc.nextLine();
		
		if(b % 3 == 0){
			System.out.println("Your Second Number is divsible by 3.");
		}
		else{
			System.out.println("Your Second Number is not divisible by 3.");
		}
		
		if(b % 4 == 0){
			System.out.println("Your Second Number is divsible by 4.");
		}
		else{
			System.out.println("Your Second Number is not divisible by 4.");
		}
		
		if(b % 5 == 0){
			System.out.println("Your Second Number is divsible by 5.");
		}
		else{
			System.out.println("Your Second Number is not divisible by 5.");
		}
	}
}
