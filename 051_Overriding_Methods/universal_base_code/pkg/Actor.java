package pkg;
import java.util.Scanner;
import java.util.Random;


public class Actor extends Performer{
	
	String type;
	
	public Actor(){
	    
	    this("theater");
	}
	
	public Actor(String type){
		
	    this.type = type;
	}
	
	public Actor(String name, String type){
		
		super(name); 
		this.type = type;
	}
	
	public void practice(){
	    
	    System.out.println("The Rock and " + super.getName() + " are practicing");
	}
	
	public void perform(){
	    
	    System.out.println("The Rock and " + super.getName() + " are performing");
	}
	
	public void monologue(){
	    
	    System.out.println("For those who fight, for those who fall,");
	    System.out.println("   For we who fight, for we who fall,");
	}
	
}

