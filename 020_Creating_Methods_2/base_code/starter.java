import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static int pow(int a, int b){
		
		//int a = base;
		//int b = exponent;
		
		int count = 1;
		int r = 1;
		
		while(b > 0){
			r = r * a;
				System.out.println(r);
		if(count == b){
			break;
			}
		count = count + 1;	
		}
		return r;
	
	}
	
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Base of a power");
		int base = sc.nextInt();
		
		System.out.println("Enter an Exponent value");
		int exp = sc.nextInt();
		//String j = sc.nextLine();
		
		pow(base, exp);
		
	}
}
