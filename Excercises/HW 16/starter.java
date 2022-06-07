import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		Store sevenElleven = new Store(); 
		
		sevenElleven.theDrip();
		
		Items drip = new Items();
		
		drip.getShirt();
		drip.getDesignerShirt();
		drip.getPantSize();
		drip.getPairSocks();
		
		drip.theDrip();
		
		drip.getPackage();
		
	}
}
