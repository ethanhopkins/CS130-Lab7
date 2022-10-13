import java.util.Scanner;

public class Lab7_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year = scan.nextInt();
		
		if (year % 4 == 0 || year % 400 == 0) {
			System.out.println("The year " + year + " is a leap year");
		} else {
			System.out.println("The year " + year + " is not a leap year");
		}
	}

}
