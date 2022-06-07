import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Pick 3 random numbers from 1 - 100  " + "Number 1?");
		int num1 = sc.nextInt();
		System.out.println("Number 2?");
		int num2 = sc.nextInt();
		System.out.println("Number 3?");
		int num3 = sc.nextInt();
		String d = sc.nextLine();
		
		int a = num1;
		int b = num2;
		int c = num3;
		
		if(a >= b) {
			if (a >= c)
				System.out.println(num1 + " is the largest");
		}
		else {
				System.out.println(num2 + " is the largest");
		}
		
		String e = sc.nextLine();
		
		if(a <= b) {
			if (a <= c)
				System.out.println(num1 + " is the smallest");
		}
		else {
			System.out.println(num2 + " is the smallest");
		}
	}
}
