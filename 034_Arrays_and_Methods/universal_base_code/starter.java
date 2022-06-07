import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	
	public static void toStringArray(int [] x){
		 
		for(int c = 0; c < x.length; c++) {
            System.out.println(x[c]);
		}
	}
	
	public static int getArrayAverage(int [] x){
		
		int y = 0;
		
		for(int c = 0; c < x.length; c++){
			y = y + x[c];
			
		}
		return y / x.length;
	}
	
	public static int getArrayMax(int [] x){
	
	int c = 0;
	int max = 0;
		
	while(c < x.length) {

			if(x[c] < max){
				max = x[c];
			}
			c++;
        }
        return max;
	}
	
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
	
	public static void main(String args[]) {
		
		Random y = new Random();

		int [] x = new int[100];

		for (int c = 0; c < x.length; c++) {
            x[c] = y.nextInt(100) + 1;
		}
        
        toStringArray(x);
        
        getArrayAverage(x);
        
        getArrayMax(x);
        
        getArrayMin(x);
        
        
	}
}
