import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static void toCombined(String a, String b){
		
		System.out.println(a + " " +b);
		
	}
	
	public static void main(String args[]){
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a word");
		String x = sc.nextLine();
		
		System.out.println("Eneter a second word");
		String y = sc.nextLine();
		
		toCombined(x, y);
			
	}
}