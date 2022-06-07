package pkg;
import java.util.Scanner;
import java.util.Random;


public class HorseBarn{
		
		String name;
		int weight;
		int numSpaces;
	
	public horseBarn(){
		
		this("Bob", 356, 10);
	}
	
	public horseBarn(String name, int weight, int numSpaces){
		
		this.name = name;
		this.weight = weight;
		this.numSpaces = numSpaces;
	}
	
	public String setName(String name){
		
		this.name = name;
	}
	
	public int setWeight(int weight){
		
		this.weight = weight;
	}
	
	public void getName(){
		
		return this.name;
	}
	
	public void getWeight(){
		
		return this.weight
	}

}
