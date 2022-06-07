package pkg;
import java.util.Scanner;
import java.util.Random;

public class MagicSquare{
	
	public double SpecialSquare(double input){
			
		double product = Math.sqrt(input);
			
		//Lab 57
			
		if((product - Math.floor(product)) == 0){
			System.out.println(input + " is a perfect square.");
			
			for(double c = 0; c < 1000; c++){
				
				double add = -1;
				
				c = c + 1;
				
				add = add + c;
				
				double sum = add + c;
				
				System.out.println(c);
				
				if(sum == input){
					System.out.println("Special square integers.");
						break;
				}
				else if(sum > input){
					break;
				}
			}
		}
		else{
			System.out.println(input + " is not a perfect square.");
		}
		return input;
	}
}
