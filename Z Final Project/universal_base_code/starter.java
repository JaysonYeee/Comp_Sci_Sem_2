import pkg.*;
import java.util.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]){
		
		Game game = new Game();
		
		game.runGame();
		
		System.out.println("Would you like to play again");
			String ans2 = sc.nextLine();
							
		if(ans2.equals("yes") || ans2.equals("y") || ans2.equals("Yes") || ans2.equals("Y")){
			System.out.println("Great");
				game.runGame();
				
		else if(ans2.equals("no") || ans2.equals("n") || ans2.equals("No") || ans2.equals("N")){
			System.out.println("Goodbye");
			
			
			}
		}
		
		
	}
}


