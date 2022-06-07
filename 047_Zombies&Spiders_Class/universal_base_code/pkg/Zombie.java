package pkg;
import java.util.Scanner;
import java.util.Random;


public class Zombie implements Creature{
	
	String name;
	int health;
	int attack;
	static Random rand = new Random();
	
	public Zombie(){
		
		this("Zack", rand.nextInt(11) + 5, rand.nextInt(11) + 5);
	}
	
	public Zombie(String name, int health, int attack){
        
        this.name = name;
        this.health = health;
        this.attack = attack;
    }
    
    public String getName(){
        
        return this.name;
    }
    
    public void voiceLine(){
    	
    	System.out.println("mmmmmhhhhhhh");
    }
    
    public void attack(Role Zombie){
        
        int damage = new Random().nextInt(this.attack) + 1;
        	Zombie.setHealth(Zombie.getHealth() - damage);
        		System.out.println(Zombie.setHealth);
    }
    
    public boolean isDead(){
		
		if(this.health <= 0){
			return this.health;
		}
	}
	
	public boolean takeDamage(int damage){
		
		this.health =- damage;
		
		return this.isDead;
	}
	
}

