package JavaInterviewQuestions;

public class Java_06_SwapTwoNumbers {

	public static void main(String[] args) {
		//		//Swap numbers with temporary variable

		//	elif
		int a=5, b=10, temp=0;
		temp=a;
		a=b;
		b=temp;

		// gecici degisken olmadan
		a=a+b;
		b=a-b;
		a=a-b;

		System.out.println(a);
		System.out.println(b);




//
//		int a = 10;
//		int b = 20;
//
//		System.out.println("before swapping: ");
//		System.out.println("Value of a: "+ a);
//		System.out.println("Value of b: "+ b);
//
//		System.out.println("After swapping: ");
//
//		int temp;
//		temp  = a;
//		a = b;
//		b = temp;
//
//		System.out.println("Value of a: "+ a);
//		System.out.println("Value of b: "+ b);
//
//		//swap two numbers without using a temporary
//
//		System.out.println("before swapping: ");
//		System.out.println("Value of a: "+ a);
//		System.out.println("Value of b: "+ b);
//
//		System.out.println("After swapping: ");
//
//		a = a-b;
//		b = a+b;
//		a= b-a;
//
//		System.out.println("Value of a: "+ a);
//		System.out.println("Value of b: "+ b);
		
		

	}

}
