package JavaInterviewQuestions;

import java.util.Scanner;

public class Java_03_MultiplyTwoFloatingNumbers {

	public static void main(String[] args) {
		
		//Question: Multiply two floating numbers
		/*
		//huseyin tarafindan cozuldu
		float a=1.2354f;
		float b=2.3232f;
		float product=a*b;
		System.out.println("a ile b nin carpimi: "+product);
		*/

		//Muhammet
		Scanner scan=new Scanner(System.in);
		System.out.println("Geben Sie bitte zwei Zahlen(float) ein, um sie zu multiplizieren");
		float zahl1 = scan.nextFloat();
		float zahl2 = scan.nextFloat();
		System.out.println("Die Multiplikation ist : " + (zahl1*zahl2));

	}

}
