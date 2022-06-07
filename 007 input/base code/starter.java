import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Name?");
		String text = sc.nextLine();
		System.out.println("Your name is " + text);
		String a = sc.nextLine();
		
		System.out.println("Age?");
		String text1 = sc.nextLine();
		System.out.println("Your Age is " + text1);
		String b = sc.nextLine();
		
		System.out.println("Birthday Month?");
		String text2 = sc.nextLine();
		System.out.println("Your Birthday Month is " + text2);
		String c = sc.nextLine();
		
		System.out.println("Birthday Day?");
		String text3 = sc.nextLine();
		System.out.println("Your Birthday Day is " + text3);
		String d = sc.nextLine();
		
		System.out.println("Birthday Year?");
		String text4 = sc.nextLine();
		System.out.println("Your Birthday Year is " + text4);
		String e = sc.nextLine();
		
		System.out.println("How many pennies are in one dollar");
		String text5 = sc.nextLine();
		System.out.println("There are " + text5 + " pennies in a dollar");
		String f = sc.nextLine();
	}
}
