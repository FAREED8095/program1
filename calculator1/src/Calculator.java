import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) 
	{
		char operator;
		double a,b,Result;
		Scanner scan = new Scanner(System.in);
		System.out.println("chose a charector + , - , * , / ");
		operator = scan.next().charAt(0);
		System.out.println("------------------------------------");
		System.out.println("enter the value 1st ");
		a = scan.nextInt();
		
		System.out.println("enter the value 2nd ");
		b = scan.nextInt();
		
		switch(operator)
		{
		case '+':
			Result = a + b; 
			System.out.println("addition value is :"+ a+" + " +b+ " =  "+ Result);
			break;
			
		case '*':
			Result = a * b; 
			System.out.println("multiplication value is :"+ a+" * " +b+ " =  "+ Result);
			break;
			
		case '/':
			Result = a / b; 
			System.out.println("division value is :"+ a+" / " +b+ " =  "+ Result);
			break;
			
		case '-':
			Result = a - b; 
			System.out.println("subtraction value is :"+ a+" - " +b+ " =  "+ Result);
			break;
			
		default: 
			System.out.println("invalid");
			break;
		
		}
		}
}
		