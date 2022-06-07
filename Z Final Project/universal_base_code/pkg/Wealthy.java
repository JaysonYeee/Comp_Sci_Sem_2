package pkg.*;
import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Wealthy implements Selection{
	
	Random rand = new Random();
		
	ArrayList <String> CelebList = new ArrayList <String>("Elon Musk", "Jeff Bezos");
	
	ArrayList <String> QuestionList1 = new ArrayList <String>("is very big on electricty.", "is known for being a space cowboy.");
	ArrayList <String> QuestionList2 = new ArrayList <String>("is very hated and looked upon.", "owns one of the largest delivery company.");
	ArrayList <String> QuestionList3 = new ArrayList <String>("is in the race of space.", "owns the Y721 sail yacht.");
	ArrayList <String> QuestionList4 = new ArrayList <String>("has smoked once with Joe Rogan.", "is bald.");
	
	
	for(int i = 0; i < CelebList.size() i++){
		
		CelebList[i] = (int)(Math.random()*3);
	}
	
	
}