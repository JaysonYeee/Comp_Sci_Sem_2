import java.util.Scanner;
import java.util.Random;

class Character{
	
	String role = new String("Warrior");
	
		String a1 = "strength";
		String a2 = "dexterity";
		String a3 = "intelligence";
		String a4 = "constitution";
		String a5 = "charisma";
		
}

class starter {
	public static void main(String args[]) {
		
		Character myChar = new Character();
		
		System.out.println(myChar.a1);
		System.out.println(myChar.a2);
		System.out.println(myChar.a3);
		System.out.println(myChar.a4);
		System.out.println(myChar.a5);
		
	}
}
