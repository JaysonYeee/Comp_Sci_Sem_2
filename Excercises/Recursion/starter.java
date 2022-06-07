import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		//Recursion
		
		public static addOfSums(int x, int y){
			
			if(x == 1){
				return x + y;
			}
			
			int answer = addOfSums(x - 1, y) + x;
				return x;
		}
		
		//palmdrome
		
		public int function(String string){
			
			if(string.length == 1){
				System.out.println(string);
					return;
			}
			
				System.out.print(string.substring(0, 1)));
				funtion(string.substring(1));
				System.out.print(string.substring(0, 1)));
		}
		
	}