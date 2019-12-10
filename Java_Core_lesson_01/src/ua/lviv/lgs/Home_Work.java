package ua.lviv.lgs;

public class Home_Work {
	public static void main(String[] args) {
		byte a1;
		short a2;
		int a3;
		long a4;
		
		double b1;
		float b2;
		
		char c;
		
		boolean d;
		
		System.out.println("min byte = " + Byte.MIN_VALUE);
		System.out.println("max byte = " + Byte.MAX_VALUE);
		
		System.out.println("min short = " + Short.MIN_VALUE);
		System.out.println("max short = " + Short.MAX_VALUE);
		
		System.out.println("min int = " + Integer.MIN_VALUE);
		System.out.println("max int = " + Integer.MAX_VALUE);
		
		System.out.println("min long = " + Long.MIN_VALUE);
		System.out.println("max long = " + Long.MAX_VALUE);
		
		System.out.println("min double = " + Double.MIN_VALUE);
		System.out.println("max double = " + Double.MAX_VALUE);
		
		System.out.println("min float = " + Float.MIN_VALUE);
		System.out.println("max float = " + Float.MAX_VALUE);
		
		System.out.println("min char = " + Character.MIN_VALUE);
		System.out.println("max char = " + Character.MAX_VALUE);
		
		int [] q = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		int max = q[0];
		int min = q[0];
		for (int i = 0; i < q.length; i++)
		if (max<q[i]){
			max = q[i];
		}
		for (int i = 0; i < q.length; i++) 
		if (min > q[i]) {
			min = q[i];
		}
		System.out.println("max value = " + max);
		System.out.println("min value = " + min);
		
	}
}
