package pkg;
import java.util.Scanner;
import java.util.Random;


public interface Role{
	
	public void setHealth(int health);
	
	public int getHealth();
	
	public String getName();
	
	public void voiceLine();
	
	public void printArt();
	
	public boolean attack(Creature creature);
	

}

