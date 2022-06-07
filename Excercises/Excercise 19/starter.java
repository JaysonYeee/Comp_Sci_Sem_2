import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static String mult(int a, int b){
		
		int x = a;
		int y = b;
		int sum = x * y;
		
		System.out.println(sum);
		
		if(sum % 3 == 0){
			return "Your Number is divsible by 3.";
		}
		else{
			return "Your Number is not divisible by 3.";
		}
	}
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Input a value:");
		int num1 = sc.nextInt();
		
		System.out.println("Input a Second value:");
		int num2 = sc.nextInt();
		
		System.out.println(mult(num1, num2));
		
	}
}