import java.util.Scanner;
import java.text.NumberFormat;

public class Lab7_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your current amount of gas: ");
		float amount = scan.nextFloat();
		System.out.println("Enter the total capacity for your tank: ");
		float capacity = scan.nextFloat();
		
		float level = amount / capacity;
		
		NumberFormat f1 = NumberFormat.getPercentInstance();
		
		System.out.println("The current level is: " + f1.format(level));
		if (level < .25) {
			System.out.println("You are running low on gas, it is below 25%");
		} else if (level < .5) {
			System.out.println("Your gas is starting to get a little low, it is below 50%");
		} else if (level < .75) {
			System.out.println("Your gas is fine for now, you are below 75%");
		} else {
			System.out.println("Gas is perfectly fine! It's between 75 and 100%");
		}
	}

}
