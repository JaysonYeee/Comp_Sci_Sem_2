import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		String v1 = "Strength";
		String w1 = "Dexterity";
		String x1 = "Intelligence";
		String y1 = "Constitution";
		String z1 = "Charsima";
		
		String v2 = "strength";
		String w2 = "dexterity";
		String x2 = "intelligence";
		String y2 = "constitution";
		String z2 = "charisma";
		
		System.out.println("U can be a Wizard, Warrior, or a Rogue, which one is it?");
		String a = sc.nextLine();
		System.out.println("You wanna be a " + a + ", really? O Well!");
		String b = sc.nextLine();
		
		System.out.println("You have 25 points to spend, each ability is ten points:");
		String c = sc.nextLine();
		
		System.out.println("Strength - Buff and able to carry larger items");
		//String d = sc.nextLine();
		System.out.println("Dexeterity - Agile and move quick");
		//String e = sc.nextLine();
		System.out.println("Intelligence - Better at Magic Spells!");
		//String f = sc.nextLine();
		System.out.println("Constitution - How much health");
		//String g = sc.nextLine();
		System.out.println("Charisma - How personable");
		String h = sc.nextLine();
		
		System.out.println("1st pick?");
		String i = sc.nextLine();
		
		if(i.equals(v1) || a.equals(v2)){
			System.out.println("15 points left");
				String s1 = sc.nextLine();
		}
		else if(a.equals(w1) || a.equals(w2)){
			System.out.println("15 points left");
				String s2 = sc.nextLine();
		}
		else if(a.equals(x1) || a.equals(x2)){
			System.out.println("15 points left");
				String s3 = sc.nextLine();
		}
		else if(a.equals(y1) || a.equals(y2)){
			System.out.println("15 points left");
				String s4 = sc.nextLine();
		}
		else if(a.equals(z1) || a.equals(z2)){
			System.out.println("15 points left");
				String s5 = sc.nextLine();
		}
		
		System.out.println("15 points left");
		String ii = sc.nextLine();
		System.out.println("2nd pick?");
		String j = sc.nextLine();
		
		if(i.equals(v1) || a.equals(v2)){
			System.out.println("5 points left");
				String t1 = sc.nextLine();
		}
		else if(a.equals(w1) || a.equals(w2)){
			System.out.println("5 points left");
				String t2 = sc.nextLine();
		}
		else if(a.equals(x1) || a.equals(x2)){
			System.out.println("5 points left");
				String t3 = sc.nextLine();
		}
		else if(a.equals(y1) || a.equals(y2)){
			System.out.println("5 points left");
				String t4 = sc.nextLine();
		}
		else if(a.equals(z1) || a.equals(z2)){
			System.out.println("5 points left");
				String t5 = sc.nextLine();
		}
		
		System.out.println("5 points left");
		//String iii = sc.nextLine();
		String k = sc.nextLine();
		System.out.println("You choose to be a " + a + " and have " + i + " and " + j + "?");
		
	}
}