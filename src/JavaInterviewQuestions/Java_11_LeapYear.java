package JavaInterviewQuestions;

public class Java_11_LeapYear {

	public static void main(String[] args) {
		
		//Find Leap Year

		System.out.println(isLeapYear(2000));

	}

	public static boolean isLeapYear(int year) {

		if(year%4==0){
			return true;
		}else{
			return false;
		}

	}

}
