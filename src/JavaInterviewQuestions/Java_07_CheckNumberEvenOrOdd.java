package JavaInterviewQuestions;

import java.util.Scanner;

public class Java_07_CheckNumberEvenOrOdd {

	public static void main(String[] args) {
		
		//Question even or odd number
		/*
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		
		int num = reader.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num+ " is even");
		}
		else {
			System.out.println(num+ " is odd");
		}

		 */
		//Muhammet
		Scanner scan = new Scanner(System.in);
		System.out.println("Geben Sie bitte eine Zahl ein, ob sie ungerade oder gerade ist");
		int a=scan.nextInt();
		if (a%2 == 0) {
			System.out.println(a + " ist eine gerade Zahl.");
		} else {
			System.out.println(a + " ist eine ungerade Zahl.");
		}



	}

}
