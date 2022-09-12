package course;

import java.util.Scanner;

public class Kilotomile {

	public static void main(String[] args) {
		
		System.out.println("Enter the Distance in Kilometer:-");
		Scanner sc = new Scanner(System.in);
		float km = sc.nextFloat();
				float miles = (float)(0.621371*km);
				System.out.println("Distance in miles will be:-" +miles);
		// TODO Auto-generated method stub

	}

}
