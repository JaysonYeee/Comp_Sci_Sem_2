package pkg;
import java.util.Scanner;
import java.util.Random;


public class combinedTable{
	
	int seats;
	int t1 = table1;
	int t2 = table2;
	int t3 = table3;
	
	public combinedTable(SingleTable table1, SingleTable table2){
		
	}
	
	public boolean canSeat(int seats){
		
		if(seats <= table1 + table2 - 2){
			return true;
		}
		else{
			return false;
		}
		
	}
	
	public double getDesirability(){
		
		
	}
	
	public void setViewQuality(){
		
		
	}

}

