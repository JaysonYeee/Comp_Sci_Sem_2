package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;		// What's the actors name!
	int age;			// How many times should it be printed
	String villain;		// Who's the arch nemesis of this Spiderman
	
	public Spiderman() {			// Default constructor!
		this("Toby Maguire", 46, "Green Goblin")
	}
	
	public Spiddy(String actor){
		this(actor, 46, "Green Goblin")
	}
	
	public Spiddy(int age){
		this("Toby Maguire", age, "Green Goblin")
	}
	
	public Spiddy(String actor, int age){
		this(actor, age, "Green Goblin")
	}
	
	public actorSpiderman(String actor, int age, String villian){
		this.actor = actor;
		this.age = age;
		this.villian = villian;
		printArt();
	}
	
	public String setActor(String a){
		actor = a;
	}
	
	public String getActor(){
		return actor;
	}
	
	public int setAge(int b){
		age = b;
	}
	
	public int getAge(){
		return age;
	}

	
	
	
	// Create constructors for each combination of actor/age/villain. Use the defaults above if not an input parameter.
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)

	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}

	

}
