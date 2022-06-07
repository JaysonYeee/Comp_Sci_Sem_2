import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		//Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		//double b = a.nextDouble();
		//System.out.println(b);
		
		int a1 = rand.nextInt(10);
		System.out.println(a1);
		
		int b1 = rand.nextInt(101) + 1;
		System.out.println(b1);
		
		Double c1 = rand.nextDouble() + 2.5;
		System.out.println(c1);
		
		int d1 = rand.nextInt(590) + 14;
		System.out.println(d1);
	}
}
