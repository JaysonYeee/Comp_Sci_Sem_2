import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {

public static int getArrayMin(int [] x){
	
	int c = 0;
	int min = 10000;
	
	while(c < x.length) {

			if(x[c] < min){
				min = x[c];
			}
			c++;
        }
        return min;
}

public static int getArrayMax(int [] y){
	
	int c = 0;
	int max = 0;
		
	while(c < x.length) {

			if(y[c] < max){
				max = x[c];
			}
			c++;
        }
        return max;
}


	public static void main(String args[]) {

		Random y = new Random();

		int [] x = new int[y.nextInt(150) + 51];

		for (int a = 0; a < x.length; a++) {
            x[a] = y.nextInt(100) + 1;
		}

		int c = 0;
		int min = 10000;
		int max = 0;

        while(c < y.length) {

			if(y[c] < min){
				min = y[c];
			}
			c++;
        }

        while(c < y.length) {

			if(y[c] < max){
				max = y[c];
			}
			c++;
        }

        System.out.println(max);
        System.out.println(min);


	}
}
