package pkg;
import java.util.Scanner;
import java.util.Random;


public class Performer{
	
	String name;
	int age;
	
	public Performer(){
		
		this("Doja Cat", 26);
	}
	
	public Performer(String name, int age){
		
		this.name = name;
		this.age = age;
	}
	
	public Performer(String name){
		
		this.name = name;
		this.age = 26;
	}
	
	public String getName(){
		
		return this.name;
	}
	
	public void practice(){
		
		System.out.println(this.name + " is practicing.");
	}
	
	public void perform(){
		
		System.out.println(this.name + " is performing");
	}
	
	public Performer(String name){
		
		this.name = name;
		this.age = 26;
	}
	
}

