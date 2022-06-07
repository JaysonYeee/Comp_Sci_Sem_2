import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Input an x value:");
			int xV = sc.nextInt();
		
		System.out.println("Input an y value:");
			int yV = sc.nextInt();
			
		System.out.println("Output:");
			
			int [][] array = new int[yV][xV];
			
			for(int x = 0; x < array.length; x++){
				for(int y = 0; y < array[0].length; y++){
					int r = rand.nextInt(11);
						array[x][y] = r;
							System.out.print(r + " ");
				}
			System.out.println("");
			}
			
			int counter = 0;
			
			for(int i = 0; i < array.length; i++){
				for(int j = 0; j < array[0].length; j++){
					counter = counter + array[i][j];
				}
			}
			
			int getAverage = counter / array.length;
			
			System.out.println("Average:");
			System.out.println(getAverage);
			
	}
}
