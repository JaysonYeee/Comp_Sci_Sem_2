package pkg;
import java.util.Scanner;
import java.util.Random;


public class ProducerPrice{
	
	private String StandardPrice;
	private String AlteredPrice;
	
	public ProducerPrice(){
		
		this("You don't want to upgrade :/ - The clothing selection will still be 240 USD.", "You have upgraded ;) - The clothing selection will now be 320 USD.");
	}
	
	public ProducerPrice(String StandardPrice, String AlteredPrice){
		
		this.StandardPrice = StandardPrice;
		this.AlteredPrice = AlteredPrice;
	}
	
	public String getStandardPackagePrice(){
		
		return this.StandardPrice;
	}
	
	public String getAlteredPackagePrice(){
		
		return this.AlteredPrice;
	}
	
}