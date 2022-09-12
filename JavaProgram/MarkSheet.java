package course;

import java.util.Scanner;

public class MarkSheet {

	public static void main(String[] args) {
		System.out.println("MARKSHEET");
		System.out.println("Enter Subject Marks");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("English:-");
		int a = sc.nextInt();
		
		System.out.println("Marathi:-");
		int b = sc.nextInt();
		
		System.out.println("Hindi:-");
		int c = sc.nextInt();
		
		System.out.println("Science:-");
		int d = sc.nextInt();
		
		System.out.println("Maths:-");
		int e = sc.nextInt();
		
		System.out.println("Social Science:-");
		int f = sc.nextInt();
		
		System.out.println("Social Science:-");
		int g = sc.nextInt();
		
		
		float sum = ((a+b+c+d+e+f+g)/600.0f)*100;
		
		System.out.println("Your percentage is:-");
		System.out.println(sum + "%");
	}
}
