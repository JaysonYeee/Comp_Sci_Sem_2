package pkg;
import java.util.Scanner;
import java.util.Random;

public class myCharacter{
	
	String role;
	int strength;
	int dexterity;
	int intelligence;
	int constitution;
	int charisma;
	
	public myCharacter(){
		
		role = "No Role";
		strength = 0;
		dexterity = 0;
		intelligence = 0;
		constitution = 0;
		charisma = 0;
	}
	
	public String role(String x){
		role = x;
		
		if(x.equals("Wizard") || x.equals("wizard")){
			System.out.println("Epic");
				return "You Choose Wizard, Kool.";
		}
		else if(x.equals("Warrior") || x.equals("warrior")){
			System.out.println("Epic");
				return "You choose Warrior, Epic.";
		}
		else if(x.equals("Rogue") || x.equals("rogue")){
			System.out.println("Epic");
				return "You choose Rogue, Awsome.";
		}
		else{
			return role;
		}
	}
	
	public void myToString(){
		System.out.println("Your role is " + role);
		System.out.println("Your strength trait is " + strength);
		System.out.println("Your dexterity trait is " + dexterity);
		System.out.println("Your intelligence trait is " + intelligence);
		System.out.println("Your constitution trait is " + constitution);
		System.out.println("Your charisma trait is " + charisma);
	}
}

class starter {
	public static void main(String args[]) {

		
		
	}
}
