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
		
		Musician m3 = new Musician("X Ambassadors", "Electric Guitar");
		Musician m4 = new Musician("Imagine Dragons", 60, "Drums");
		
		m3.getName();
		m3.practice();
		System.out.println(m3.getInstrument());
		
		m4.getName();
		m4.perform();
		m4.playInstrument();
		
		Actor a1 = new Actor();
		
		a1.practice();
		a1.perform();
		a1.monologue();
		
		Apprentice ap1 = new Apprentice();
		Apprentice ap2 = new Apprentice("Cresenta Valley", 3);
		Apprentice ap3 = new Apprentice("Violin", "Cresenta Valley", 6);
		Apprentice ap4 = new Apprentice("John", 15, "Drums", "Cresenta Valley", 10);
		
		ap1.playInstrument();
		ap2.practice();
		ap3.perform();
		ap4.practiceAtUniversity();
		
	}
}
