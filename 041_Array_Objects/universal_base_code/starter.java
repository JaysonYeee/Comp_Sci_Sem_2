import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		Wizard [] Wiz = new Wizard[100];
		Warrior [] War = new Warrior[100];
		
		for(int i = 0; i < 100; i++){
			
			Wiz [i] = new Wizard();
			War [i] = new Warrior();
		}
		
		int c1 = 0;
		int c2 = 0;
		
		while(!Wiz[99].isDead() || !War[99].isDead()){
			
			Wiz[c1].attack(War[c2]);
			if(War[99].isDead()){
                break;
			}
			
			if(War[c2].isDead()){
				c2++;
			}
			
			War[c2].attack(Wiz[c1]);
			if(Wiz[99].isDead()){
                break;
			}
			
			if(Wiz[c1].isDead()){
				c1++;
			}
		}
		
		if(War[99].isDead()){
			System.out.println("Warriors Win, " + (100 - c1) + " Left.");
		}
		
		if(Wiz[99].isDead()){
			System.out.println("Wizards Win, " + (100 - c2) + " Left");
		}
		
	}
}
