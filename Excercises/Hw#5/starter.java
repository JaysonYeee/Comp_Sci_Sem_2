import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int slot1, slot2, slot3;
		int times2 = 2;
		int times3 = 3;
		int minus100 = 100;
		
		String a1 = "Yes";
		String a2 = "yes";
		String a3 = "Y";
		String a4 = "y";
		
		String b1 = "No";
		String b2 = "no";
		String b3 = "N";
		String b4 = "n";
		
		int a10 = rand.nextInt(10) + 1;
		int b10 = rand.nextInt(10) + 1;
		int c10 = rand.nextInt(10) + 1;
	
		System.out.println("Wanna play slots?");
		String x = sc.nextLine();
		
		if(x.equals(b1) || x.equals(b2) || x.equals(b3) || x.equals(b4)){
			System.out.println("No, ok?");
		{
			break;
		}
		
		else if(x.equals(a1) || x.equals(a2) || x.equals(a3) || x.equals(a4)){
			System.out.println("You have $100. How much do you want to bet?");
				int amount = sc.nextInt();
					String one1 = sc.nextLine();
						System.out.println("Your numbers are:");
							String two2 = sc.nextLine();
								System.out.println(a10 + "|" + b10 + "|" + c10);
		}
		
		if(slot1 == slot2 || slot2 == slot3 || slot1 == slot3){
			System.out.println("You now have $" + amount * times2);
		}
		else if(slot1 == slot2 && slot2 == slot3 && slot1 == slot3){
			System.out.println("You now have $" + amount * times3);
		}
		else if{
			System.out.print("You now have $" + amount - minus100);
		}
		else if(amount == 0)
		{
			break;
		}
	}
}
