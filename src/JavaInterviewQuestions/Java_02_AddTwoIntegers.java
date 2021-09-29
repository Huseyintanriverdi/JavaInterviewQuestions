package JavaInterviewQuestions;

import java.util.Scanner;

public class Java_02_AddTwoIntegers {

	public static void main(String[] args) {
		
		//Question: Add two integer
		/*
		//huseyin tarafindan cozuldu
		int a = 10;
		int b = 20;
		int sum = a+b;
		System.out.println("a ile b nin toplami: "+ sum);
		*/

		//Muhammet
		Scanner scan=new Scanner(System.in);
		System.out.println("Geben Sie bitte zwei Zahlen ein, um sie zu summieren");
		int zahl1=scan.nextInt();
		int zahl2=scan.nextInt();
		System.out.println("Die Summe ist : " + (zahl1+zahl2));




	}

}
