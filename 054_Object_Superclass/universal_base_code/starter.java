import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		Performer [] arrayList = {
		new Performer("MGK", 32),
		new Musician("Luke Bryan", 52, "Guitar"),
		new Apprentice("Ryan Renolds", 40, "Violin", "GCC", 4),
		new Actor("John Cena", "Art")};
		
		arrayList[0].practice();
		arrayList[0].perform();
		
		((Performer)arrayList[1]).practice();
		//does not have a practice method, call performer practice method
		arrayList[1].perform();
		
		((Apprentice)arrayList[2]).practiceAtUniversity();
		//must put apprentice since performer does not have practiceAtUniversity
		((Musician)arrayList[2]).playInstrument();
		//will not work, still runs playInstrument as apprentice
		
		((Actor)arrayList[3]).monologue();
		((Performer)arrayList[3]).perform();
		
		System.out.println(arrayList[0].equals(arrayList[1]));
		
	}
}
