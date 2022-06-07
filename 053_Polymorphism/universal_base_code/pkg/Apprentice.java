package pkg;
import java.util.Scanner;
import java.util.Random;


public class Apprentice extends Musician{
	
	String school;
	int yearsOfExperience;
	
	public Apprentice(){
		
		this("CVHS", 0);
	}
	
	public Apprentice(String school, int yearsOfExperience){
		
		this.school = school;
		this.yearsOfExperience = yearsOfExperience;
	}
	
	public Apprentice(String instrument, String school, int yearsOfExperience){
		
		super(instrument);
		this.school = school;
		this.yearsOfExperience = yearsOfExperience;
	}
	 
	public Apprentice(String name, int age, String instrument, String school, int yearsOfExperience){
		
		super(name, age, instrument);
		this.school = school;
		this.yearsOfExperience = yearsOfExperience;
	}
	
	public void playInstrument(){
		
		System.out.println("Melody");
	}
	
	public void practice(){
	    
	    System.out.println(super.getName() + " has " + this.yearsOfExperience + " years of practice.");
	}
	
	public void perform(){
	    
	    System.out.println("The Rock and Kevin Heart are performing with " + super.getName());
	}
	
	public void practiceAtUniversity(){
		
		System.out.println(super.getName() + " practices at " + this.school);
	}
	
}

