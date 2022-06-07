import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		Random x1 = new Random();
		
		int [] int y = new int[20];
		
		System.out.println("Nums:");
		
        for(int a = 0; a < 20; a++){
            y[a] = x1.nextInt(10) + 1;
            	System.out.print(y[a]);
            
        }
        
        int c = 0;
        
        Random x2 = new x1.nextInt(10) + 1;
        
        for (int d = 0; d < 20; d++) {
            if (d == y[d]) {
            	
                c++;
                System.out.println("Dupes" + d);
		
	}
}
