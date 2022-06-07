package pkg.*;
import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Game{
		
	public void runGame(){
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		Selection select = new Selection();
		
		ArrayList <String> catList = new ArrayList <String> (Arrays.asList("Wealthy", "MovieStars", "Athletes", "Artist"));
		
		String cat = new String();
		String cat2 = new String();
		
		System.out.println("Celebrity Guessing game.");
			String brek = sc.nextLine();
		
		System.out.println("Would U like to play:");
			String ans = sc.nextLine();
			
		if(ans.equals("no") || ans.equals("n") || ans.equals("No") || ans.equals("N")){
			System.out.println("");
				System.out.println("Aww");
		}
		
		else if(ans.equals("yes") || ans.equals("y") || ans.equals("Yes") || ans.equals("Y")){
			System.out.println("");
				System.out.println("Yaay");
					String brek1 = sc.nextLine();
						System.out.println("Categories:");
							System.out.println(catList);
								String brek2 = sc.nextLine();
									System.out.println("Choose a Category:");
										cat = sc.nextLine();
		}
		
		if(cat.equals("Wealthy") || cat.equals("wealthy")){
			System.out.println("");
				System.out.println("You choose Wealthy.");
		}
		
		else if(cat.equals("MovieStars") || cat.equals("moviestars") || cat.equals("Movie Stars") || cat.equals("movie stars")){
			System.out.println("");
				System.out.println("You choose Movie Stars.");
		}
		
		else if(cat.equals("Athletes") || cat.equals("athletes")){
			System.out.println("");
				System.out.println("You choose Athletes.");
		}
		
		else if(cat.equals("Artist") || cat.equals("artist")){
			System.out.println("");
				System.out.println("You choose Artist.");
		}
		
		else{
			System.out.println("");
				System.out.println("Not an option");
		}
		
		
		String guess;
		String answer;
		int counter = 3;
		
		System.out.println("");
		System.out.println("You have" + counter + "tries left.");
		
		
        //classes
		
		
		if(guess != answer){
			counter--;
				System.out.println("Wrong, you have " + counter + "tries left to guess.");	
			if(counter = 0){
				System.out.println("Out of tries.");
					System.out.println("The Celebrity was: " + answer);
					
			}
		}
		
		else if(guess == answer){
			System.out.println("You won!");
				System.out.println("");
					System.out.println("Now you get to add your own Celebrity, Traits, and Statements.");
						System.out.println(catList);
							System.out.println("Select your Category:");
								cat2 = sc.nextLine();
		}
		
		
		
	}
	
	
	
}