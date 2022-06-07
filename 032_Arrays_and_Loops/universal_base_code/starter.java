import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		Random x = new Random();
		
		int[] y = new int[1000];
		
        for(int a = 0; a < 1000; a++) {
            y[a] = x.nextInt(100) + 1;
        }
        
        for(int b = 0; b < 1000; b++) {
            System.out.println(y[b]);
        }
	}
}
