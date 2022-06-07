import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Pick a Character Role: Wizard, Warrior or Rougue.");
		String a = sc.nextLine();
		
		myCharacter z = new myCharacter();
		
		z.setRole(a);
		
		z.setStrength(b);
		z.setDexterity(b);
		z.setIntelligence(b);
		z.setConstitution(b);
		z.setCharisma(b);
		
		
	}
}
