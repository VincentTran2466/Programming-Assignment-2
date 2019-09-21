import java.util.Scanner;

public class BMI_Calculator {

	public static void main(String[] args) {
		System.out.print("Press 1 to enter your weight in Pounds and height in Inches\n");
		System.out.print("or press 2 to enter your weight in Kilograms and height in Meters.\n");
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		
		//displays the BMI information from pounds and inches.
		if(c == 1)
		{
			System.out.println("Enter your weight in pounds: ");
			Scanner sc2 = new Scanner(System.in);
			double pounds = sc2.nextDouble();
			
			System.out.println("Enter your height in inches: ");
			double height = sc2.nextDouble();
			
			pounds = 703 * pounds;
			height = height * height;
			
			double bmi = (pounds / height);
			
			System.out.printf("Your BMI is: %.1f\n" , bmi);
			System.out.println("BMI Categories:\r\n" + 
					"Underweight = <18.5\r\n" + 
					"Normal weight = 18.5–24.9\r\n" + 
					"Overweight = 25–29.9\r\n" + 
					"Obesity = BMI of 30 or greater");
			sc2.close();
		}
		
		//displays the BMI information from kilograms and meters.
		if(c == 2)
		{
			System.out.println("Enter your weight in kilograms: ");
			Scanner sc3 = new Scanner(System.in);
			double kilos = sc3.nextDouble();
			
			System.out.println("Enter your height in meters: ");
			double meters = sc3.nextDouble();
			
			meters = meters * meters;
			
			double bmi = (kilos / meters);
			
			System.out.printf("Your BMI is: %.1f\n" , bmi);
			System.out.println("BMI Categories:\r\n" + 
					"Underweight = <18.5\r\n" + 
					"Normal weight = 18.5–24.9\r\n" + 
					"Overweight = 25–29.9\r\n" + 
					"Obesity = BMI of 30 or greater");
			sc3.close();
		}
		sc.close();
	}

}
