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
	
	public void myToString(){
		System.out.println("Your role is " + role);
		System.out.println("Your strength trait is " + strength);
		System.out.println("Your dexterity trait is " + dexterity);
		System.out.println("Your intelligence trait is " + intelligence);
		System.out.println("Your constitution trait is " + constitution);
		System.out.println("Your charisma trait is " + charisma);
	}
	
	public String setRole(String x){
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
	
	public int setStrength(int a){
		strength = 0;
			return strength;
	}
	
	public int setDexterity(int b){
		dexterity = 0;
			return dexterity;
	}
	
	public int setIntelligence(int c){
		intelligence = 0;
			return intelligence;
	}
	
	public int setConstitution(int d){
		constitution = 0;
			return constitution;
	}
	
	public int setCharisma(int e){
		charisma = 0;
			return charisma;
	}
	
	public boolean setAll(String s, int j, int k, int l, int m, int n){
		
		role = s;
		strength = j;
		dexterity = k;
		intelligence = l;
		constitution = m;
		charisma = n;
		
		
		if(s.equals("Wizard") || s.equals("wizard")){
			role = s;
				return true;
		}
		else if(s.equals("Warrior") || s.equals("warrior")){
			role= s;
				return true;
		}
		else if(s.equals("Rogue") || s.equals("rogue")){
			role = s;
				return true;
		}
		else{
			System.out.println("Not an option.");
			return false;
		}
		
	}
	
}

class starter {
	public static void main(String args[]) {

		
		
	}
}
