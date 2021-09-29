package JavaInterviewQuestions;

import java.util.Locale;
import java.util.Scanner;

public class Java_08_AlphabetVowelOrConsonant {

	public static void main(String[] args) {
		
      //Question: Check whether an alphabet is Vowel or Consonant
		/*
		// a e i o u
		char ch = 'c';
		
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println(ch + " is vowel");
		}
		else {
			System.out.println(ch + " is consonant");
		}

		//Second way
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(ch + " is vowel");
			break;

		default:
			System.out.println(ch + " is consonant");
			break;
		}

		 */

		//Muhammet
		Scanner scan=new Scanner(System.in);
		System.out.println("Geben Sie einen Buchstaben ein, ob er Vokal oder Konsonant ist");
		char a=scan.next().toLowerCase().charAt(0);

		if (a =='a' || a =='e' || a =='i' || a =='o' || a =='ö' || a =='u' || a =='ü' || a =='ä' ||a =='y') {
			System.out.println("Der eingegebene Buchstabe " + a + " ist ein Vokal");
		} else {
			System.out.println("Der eingegebene Buchstabe " + a + " ist ein Konsonant");
		}

	}

}
