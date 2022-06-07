import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		Scanner scc = new Scanner(System.in);
		
		System.out.println("Input an x value:");
			int xV = sc.nextInt();
		
		System.out.println("Input an y value:");
			int yV = sc.nextInt();
			
		System.out.println("Input a character:");
			String c = scc.nextLine();
			
			String [][] array = new String[yV][xV];
			
			for(int x = 0; x < array.length; x++){
				for(int y = 0; y < array[0].length; y++){
					array[x][y] = c;
					System.out.print(c + " ");
				}
			System.out.println("");
			}
			
	}
}
