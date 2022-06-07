package pkg;
import java.util.Scanner;
import java.util.Random;


public class BatteryCharge{
    
    int startHour;
    int chargeTime;
	
	public int getChargingCost(startHour, chargeTime){
	    
	    int cost;
	    
	       while(true){
	            startHour = (chargeTime - 1);
	        }
	        
	       if(startHour = 0){
	           cost = 50;
	       }
	       else if(startHour = 1 || 3 || 23){
	           cost = 60;
	       }
	       else if(startHour = 4 || 22){
	           cost = 80;
	       }
	       else if(startHour = 8 || 9 || 10 ){
	           cost = 150;
	       }
	       
	       //ect...............
	       
	       return cost;
	                
	}
	
	public int getChargeStartTime(chargeTime){
	    
	    
	}

}

