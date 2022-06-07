import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	
	public static void main(String args[]){
	
		Dwarf [] Warf = new Dwarf[100];
	
		for(int x = 0; x < 100; x++){
			
			Warf [x] = new Dwarf();
        
        Random rand = new Random();
        
        int name = rand.nextInt(7) + 1;
        int age = rand.nextInt(100) + 1;
    
		if(name == 1){
			Warf[x].setName("Sleepy");
		}
		
		else if(name == 2){
			Warf[x].setName("Sneezy");
		}
		
		else if(name == 3){
			Warf[x].setName("Bashful");
		}
		
		else if(name == 4){
			Warf[x].setName("Happy");
		}
		
		else if(name == 5){
			Warf[x].setName("Doc");
		}
		
		else if(name == 6){
			Warf[x].setName("Dopey");
		}
		
		else if(name == 7){
			Warf[x].setName("Grumpy");
		}
		
		Warf[x].setAge(age);
		
	}
	
		int c = 0;
		
        for(int a = 0; a < 100; a++) {
        	if(Warf[c].isSameName(Warf[a].getName())){
        		System.out.println(Warf[c].getName());
                	c++;
            }
        }
	
			//System.out.println();
	
	}
}