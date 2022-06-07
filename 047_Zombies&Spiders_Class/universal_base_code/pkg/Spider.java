package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spider implements Creature{
	
	String name;
	int health;
	int attack;
	static Random rand = new Random();
	
	public Spider(){
		
		this("Charlotte", rand.nextInt(11) + 5, rand.nextInt(11) + 5);
	}
	
	public Spider(String name, int health, int attack){
        
        this.name = name;
        this.health = health;
        this.attack = attack;
    }
    
    public String getName(){
        
        return this.name;
    }
	
	public void voiceLine(){
    	
    	System.out.println("hhhhhhhsssssssss");
    }
    
    public void attack(Role Spider){
        
        int damage = new Random().nextInt(this.attack) + 1;
        	Spider.setHealth(Spider.getHealth() - damage);
        		System.out.println(Spider.setHealth);
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

