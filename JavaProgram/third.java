package course;

import java.util.Scanner;

public class third {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter Integer valus:-");
		int x = sc.nextInt();
		System.out.println("Integer value is :-" +x);
		
		System.out.println("Enter Double Value:-");
		double y = sc.nextDouble();
		System.out.println("Double value is:-" + y);
		
		System.out.println("Enter Float Value:-");
		float z = sc.nextFloat();
		System.out.println("Float value is:-" +z);

	}

}
