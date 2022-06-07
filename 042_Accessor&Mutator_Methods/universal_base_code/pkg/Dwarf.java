package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dwarf{
	
	int age;
	String name;
    
    public Dwarf(){
    	
    	this.age = 0;
        this.name = "";
    }
    
    public Dwarf(String name, int age){
    	
        this.name = name;
        this.age = age;
    }
    
    public void setName(String name){
    	
        this.name = name;
    }
    
    public String getName(){
    	
        return name;
    }
    
    public void setAge(int age){
    	
        this.age = age;
    }
    
    public int getAge(){
    	
        return age;
    }
}