import java.util.Scanner;

public class UseBMIClass 
{
	public static void main(String[] args) 
	{
		//Create Scanner
		Scanner input = new Scanner(System.in);
		
		//Enter name
		System.out.print("Name: ");
		String name = input.next().toString();
		
		//Enter age
		System.out.print("Age: ");
		int age = input.nextInt();
		
		//Enter weight
		System.out.print("Weight: ");
		double weight = input.nextDouble();
		
		//Enter height
		System.out.print("Height: ");
		double height = input.nextDouble();
		
		
		//create(find) new BMI
		BMI bmi = new BMI(name, age, weight, height);
		
		
		//Display results
		System.out.println("" + name + ", you have a BMI of: " + bmi.getBMI() + ". You are " + bmi.getStatus() + ".");
		
		
				
	}
	
}
