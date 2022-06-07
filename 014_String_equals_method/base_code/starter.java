import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		String a2 = "Wizard";
		String b2 = "Warrior";
		String c2 = "Rogue";
		
		String a3 = "wizard";
		String b3 = "warrior";
		String c3 = "rogue";
		
		System.out.println("Wanna be a Wizard, Warrior, or a Rogue?");
		String a = sc.nextLine();
		System.out.println("You wanna be a " + a + ", really?");
		String b = sc.nextLine();
		
		if(a.equals(a2) || a.equals(a3)){
			System.out.println("Right Answer");
				String a1 = sc.nextLine();
					System.out.println("You did not pick: " +b2 + " or " + c2 + "?");
		}
		else if(a.equals(b2) || a.equals(b3)){
			System.out.println("Right Answer");
				String b1 = sc.nextLine();
					System.out.println("You did not pick: " + a2 + " or " + c2 + "?");
		}
		else if(a.equals(c2) || a.equals(c3)){
			System.out.println("Right Answer");
				String c1 = sc.nextLine();
					System.out.println("You did not pick: " + a2 + " or " + b2 + "?");
		}
		
	}
}
