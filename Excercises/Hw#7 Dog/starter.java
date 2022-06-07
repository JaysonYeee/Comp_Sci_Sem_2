import java.util.Scanner;
import java.util.Random;

class dogg{
	
	String name;
	String age;
	String breed;
	
	public dogg(){
		name = "Clifford";
		age = "3";
		breed = "Big Red Dog";
	}
	public dogg(){
		Name Age = 1;
		Name breed = "Dog Dog";
	}
	
	public void setName(){
		x = input;
	}
	public void setAge(){
		
	}
	public void setbreed(){
		
	}
	public void getName(){
		
	}
	public void getAge(){
		
	}
	public void getBreed(){
	}
}

class starter{
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		dogg a = new dogg();
		
		int a = rand.nextInt(3);
		
		if(a == 1){
			System.out.print("Sleeping");
		}
		else if(a == 2){
			System.out.print("Awake, Bark");
		}
		
	}
}
