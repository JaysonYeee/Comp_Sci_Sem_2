package pkg;
import java.util.Scanner;
import java.util.Random;


public class BloodHound{

    String name;
    int health;
    int attack;
    
    public BloodHound(){
        
        Random rand = new Random
        
        health = rand.nextInt(101) + 1;
        attack = rand.nextInt(51) + 1;
        
    }
    
    public BloodHound(){
        
        this("Blood Hound", health, attack)
        
    }
    
    public BloodHound(String name, int health, int attack){
        
        this.name = name;
        this.health = health;
        this.attack = attack;
        
    }
    
    public void setHealth(int health){
        
        this.health = health;
    }
    
    public int getHealth(){
        
        return this.health;
    }
    
    public String getName(){
        
        return this.name;
    }
	
	public void voiceLine(){
	    
	    System.out.println("        Glory is not that hard to achieve,         ");
	    System.out.println("All You need to do is become the Predator, not the Prey");
	    
	}

}

