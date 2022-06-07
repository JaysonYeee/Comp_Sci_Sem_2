import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		Wizard wiz = new Wizard();
		System.out.println(wiz.printArt);
		
		Warrior war = new Warrior();
		System.out.println(war.printArt);
		
		BloodHound bh = new BloodHound();
		System.out.println(bh.getName);
		System.out.println(bh.voiceLine);
		
	}
}
