import java.util.Scanner;
import java.util.Random;

class kat{
	
	String name;
	
	public kat(){
		name = "Garfield";
	}
	public kat(String x){
		name = x;
	}
	public void meow(){
		System.out.println(name + " meow");
		return;
	}
}

class starter{
	public static void main(String args[]) {
		
		kat a = new kat();
		kat b = new kat("Tripod");
		
		a.meow();
		b.meow();
		
	}
}
