import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		Role [] arrayList = {new BloodHound(), new Wizard(), new Warrior()};
		
		System.out.println(arrayList[0].getName());
		System.out.println(arrayList[1].getName());
		System.out.println(arrayList[2].getName());
		
		arrayList[0].voiceLine();
		arrayList[1].printArt();
		arrayList[2].printArt();
		
		
		
	}
}
