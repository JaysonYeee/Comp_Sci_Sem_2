package pkg;
import java.util.Scanner;
import java.util.Random;


public class Store extends ProducerPrice{
	
	String shirts;
	String designerShirts;
	String pants;
	String socksColor;
	
	public Store(){
		
		this("T-shirt", "Suit Vest", "Jeans", "Orange Socks");
	}
	
	public Store(String shirts, String designerShirts, String pants, String socksColor){
		
		this.shirts = shirts;
		this.designerShirts = designerShirts;
		this.pants = pants;
		this.socksColor = socksColor;
	}

	public void theDrip(){
		
		System.out.println("The drip is immpecible!");
	}
	
	public String getShirts(){
		
		return this.shirts;
	}
	
	public String getDesignerShirts(){
		
		return this.designerShirts;
	}
	
	public String getPants(){
		
		return this.pants;
	}
	
	public String getSocks(){
		
		return this.socksColor;
	}
	
	
	
}