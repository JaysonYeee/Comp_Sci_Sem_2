class starter {
	public static void main(String args[]) {
		
		int a;
		int b;
		int c;
		int d;
		
		a = 4;
		b = 3;
		c = a * b;
		d = a + b;
		
		int Ans1;
		int Ans2;
		int Ans3;
		int Ans4;
		
		Ans1 = c * d % a + b;
		System.out.println(Ans1);
		//3
		
		Ans2 = ((-a)+d)%c;
		System.out.println(Ans2);
		//3
		
		Ans3 = ((a/b)*c) - d;
		System.out.println(Ans3);
		//5
		
		Ans4 = ((-a) - (-b)) * (c % d) + a;
		System.out.println(Ans4);
		//-1
	}
}
