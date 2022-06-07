import java.util.*;


class starter {
	
	public static void printArray(int value, ArrayList <String> array){
		
		int c = 0;
		
		for(int i = 0; i < array.size(); i++){
			array.add(i, "cookie");
				System.out.println(array.get(i) + " ");
					if(c == value){
						break;
					}
				c++;
			}
		
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input an integer value:");
			int v = sc.nextInt();
			
		ArrayList<String>arr = new ArrayList<String>();
		
		printArray(v, arr);
			
	}
}
