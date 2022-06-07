import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		Performer p1 = new Performer();
		Performer p2 = new Performer("Shakespeare", 32);
		
		Musician m1 = new Musician();
		Musician m2 = new Musician("Violin");
		
		p1.getName();
		p1.practice();
		
		p2.getName();
		p2.perform();
		
		m1.getName();
		m1.perform();
		m1.playInstrument();
		
		m2.practice();
		System.out.println(m2.getInstrument());
		
	}
}
