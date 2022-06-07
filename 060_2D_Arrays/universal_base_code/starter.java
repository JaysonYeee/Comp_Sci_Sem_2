import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	
	public static void getRowAverage(int row, int [][] one){
		
		Scanner sc = new Scanner(System.in);
		
		int r = row;
		
		int counter = 0;
			
			for(int i = 0; i < one[r].length; i++){
					counter = counter + one[r][i];
		}
			
			int rowAverage = counter / one[r].length;
			
			System.out.println("Row number: " + row);
			System.out.println("Row average: " + rowAverage);
			
			String space = sc.nextLine();
		
	}
	
	public static void getAverage(int [][] two){
		
		Scanner sc = new Scanner(System.in);
		
		int counter = 0;
			
			for(int i = 0; i < two.length; i++){
				for(int j = 0; j < two[0].length; j++){
					counter = counter + two[i][j];
			}	
		}
			
			int average = counter / two.length;
			
			System.out.println("Array average: " + average);
			
			String space = sc.nextLine();
		
	}
	
	public static void print(int [][] three){
		
		for(int i = 0; i < three.length; i++){
			for(int j = 0; j < three[0].length; j++){
				System.out.print(three[i][j] + " ");
			}
		System.out.println("");
		}
	}
	
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Input an x value:");
			int xV = sc.nextInt();
		
		System.out.println("Input an y value:");
			int yV = sc.nextInt();
			
		System.out.println("Input an row value from array:");
			int rV = sc.nextInt();
			
			int [][] array = new int[yV][xV];
		
			for(int x = 0; x < array.length; x++){
				for(int y = 0; y < array[0].length; y++){
					int r = rand.nextInt(11);
						array[x][y] = r;
			}
		}
			
			getRowAverage(rV, array);
			getAverage(array);
			print(array);
			
	}
}
