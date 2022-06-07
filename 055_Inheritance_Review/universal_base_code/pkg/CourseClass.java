package pkg;
import java.util.Scanner;
import java.util.Random;


public class CourseClass{
	
	String teacher;
	int grade;
	int credit;
	
	public int calcCredit(){
	    
	    if(grade >= 90){
	        credit = 4;
	    }
	    else if(grade >= 80){
	        credit = 3;
	    }
	    else if(grade >= 70){
	        credit = 2;
	    }
	    else if(grade >= 60){
	        credit = 1;
	    }
	    else if(grade < 60){
	        credit = 0;
	    }
	    
	    return credit;
	}
	
}

