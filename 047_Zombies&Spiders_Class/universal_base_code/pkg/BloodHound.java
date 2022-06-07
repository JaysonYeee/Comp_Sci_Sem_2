package pkg;
import java.util.Scanner;
import java.util.Random;


public class BloodHound implements Role{

    String name;
    int health;
    int attack;
    static Random rand = new Random();
    
    public BloodHound(){
        
        this("Blood Hound", rand.nextInt(101) + 1, rand.nextInt(51) + 1);
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
	
	public void printArt(){
	
	    System.out.println("");
	}
	    
	public void attack(Role Bh){
        
        int damage = new Random().nextInt(this.attack) + 1;
            Bh.setHealth(Bh.getHealth() - damage);
                System.out.println(Bh.setHealth);
    }
    
    public boolean attack(Creature zs){
        
        int strike = new Random().nextInt(this.attack) + 1;
            return zs.takeDamage(strike);
        
    }
    
}

