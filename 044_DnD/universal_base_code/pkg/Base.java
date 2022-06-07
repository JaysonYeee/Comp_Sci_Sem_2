package pkg;
import java.util.Scanner;
import java.util.Random;


public class Base{

    String name;
    int health;
    int attack;
    
    public Base(){
        
        Random rand = new Random
        
        this.health = rand.nextInt(16) + 1;
        this.attack = rand.nextInt(16) + 1;
        
    }
    
    public Base(){
        
        this("Bob", health, attack)
        
    }
    
    public String Base(String name, int health, int attack){
        
        this.name = name;
        this.health = health;
        this.attack = attack;
        
    }
    
    public void setHealth(int health){
        
        this.health = health;
    }
    
    public int setHealth(){
        
        return this.health;
    }
    
    public String getName(){
        
        return this.name;
    }
    
    public void attack(Warrior war){
        
        int a = new Random().nextInt(this.attack) + 1;
        war.getHealth;
        this.health = (this.health - this.attack)
        
        System.out.println(war.getHealth);
        
    }
    
    public void attack(Wizard wiz){
        
        int b = new Random().nextInt(this.attack) + 1;
        wiz.getHealth;
        this.health = (this.health - this.attack)

        System.out.println(wiz.getHealth);
        
    }
	

}

