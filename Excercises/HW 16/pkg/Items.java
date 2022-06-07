package pkg;
import java.util.Scanner;
import java.util.Random;


public class Items extends Store{
	
	String shirtMaterial;
	String designerShirtBrand;
	int pantWidth;
	int pantLength;
	String sockType;
	boolean packageChoice;
	
	public Items(){
		
		this("Cotton", "Calvin Klein", 36, 32, "Long", false);
	}
	
	public Items(String shirtMaterial, String designerShirtBrand, int pantWidth, int pantLength, String sockType, boolean packageChoice){
		
		this.shirtMaterial = shirtMaterial;
		this.designerShirtBrand = designerShirtBrand;
		this.pantWidth = pantWidth;
		this.pantLength = pantLength;
		this.sockType = sockType;
		this.packageChoice = packageChoice;
	}
	
	public void theDrip(){
		
		System.out.println("The fit is now immaculate!");
	}
	
	public void getShirt(){
		
		System.out.println("The " + super.getShirts() + " has " + this.shirtMaterial + " as it's material.");
	}
	
	public void getDesignerShirt(){
		
		System.out.println("The " + super.getDesignerShirts() + " is made by " + this.designerShirtBrand + ".");
	}
	
	public void getPantSize(){
		
		System.out.println("The " + super.getPants() + " are " + this.pantWidth + " by " + this.pantLength + ".");
	}
	
	public void getPairSocks(){
		
		System.out.println("The " + super.getSocks() + " are " + this.sockType + ".");
	}
	
	public void getPackage(){
		
		if(packageChoice == true){
			System.out.println(super.getAlteredPackagePrice());
		}
		else{
			System.out.println(super.getStandardPackagePrice());
		}
	}
	
}