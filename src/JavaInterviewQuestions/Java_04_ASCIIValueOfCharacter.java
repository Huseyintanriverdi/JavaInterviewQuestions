package JavaInterviewQuestions;

import java.util.Scanner;

public class Java_04_ASCIIValueOfCharacter {

	public static void main(String[] args) {
		
		//Question: Value of ASCII of characters
		/*
		//huseyin tarafindan degistirildi
		char c = 'a'; //97
		//first way
		int ascii = c;
		//second way
		int asciiNumber = (int)c;
		System.out.println(ascii);
		System.out.println(asciiNumber);
		*/

		//Muhammet
		Scanner scan=new Scanner(System.in);
		System.out.println("Geben Sie bitte ein Zeichen ein, um den ASCII-Wert zu finden");
		String a=scan.next();
		int ch='a';
		System.out.println("Der ASCII-Wert des eingegebenen Zeichens ist : " + ch);

	}

}
