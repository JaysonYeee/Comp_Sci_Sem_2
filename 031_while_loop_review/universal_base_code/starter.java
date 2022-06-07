import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		int a = 0;
		
        Random b = new Random();
        
        while (a < 100) {
            System.out.println(b.nextInt(100) + 1);
            a++;
        }
	}
}
