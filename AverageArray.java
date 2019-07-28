package exercise4;

import java.util.Scanner;

public class AverageArray {

	private int[] numbers=new int[5];
	private int i,sum,avg;
	
public void getInput()
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("****** SUM AND AVERAGE OF NUMBERS ******");
	System.out.println("Enter 5 numbers: ");
	for(i=0;i<5;i++)
	{
		numbers[i]=scan.nextInt();
	}
	}
	
	public void sum()
	{
		sum=0;
		for(i=0;i<5;i++)
		{
		sum=sum+numbers[i];
		}
	}
	public void avg()
	{
		avg=sum/5;
	
	}
	
	public void display()
	{
		System.out.println("OUTPUT:");
		System.out.println("The sum is :"+sum);
		System.out.println("The average is :"+avg);
		
	}
}
