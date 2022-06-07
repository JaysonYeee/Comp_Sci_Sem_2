package pkg;
import java.util.Scanner;
import java.util.Random;

public class character{
	
	String role;
	
	public character(){
		role = "No Role";
	}
	
	public String role(String x){
		role = "No Role";
		
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
}

class starter {
	public static void main(String args[]) {
		
	}
}
