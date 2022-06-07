import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		String [] x = new String[11];
		
		x[0] = "        _____";
		x[1] = "        (  * )>";
		x[2] = "        |   |";
		x[3] = "        |   )";
		x[4] = "        )   (";
		x[5] = "       )     (   ";
		x[6] = "      )       (";
		x[7] = "      (       )";
		x[8] = "       (     )";
		x[9] = "       -------";
		x[10] = "       |_  |_";
		
		int c = 0;
		
		while(true){
			if(x.length == c){
				break;
			}
				System.out.println(x[c]);
				c++;
		}
	}
}
