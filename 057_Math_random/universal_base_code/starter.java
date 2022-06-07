import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		//EX (int)(Math.random()*5) Returns a double so change it to an integer
		
		Double one = Math.floor(Math.random()*10);
		System.out.println(one);
		
		Double two = (int)(Math.random()*100) + 1.0;
		System.out.println(two);
		
		Double three = (Math.random()) + 2.5;
		System.out.println(three);
		
		Double four = (int)(Math.random()*590) + 14.0;
		System.out.println(four);
		
	}
}
