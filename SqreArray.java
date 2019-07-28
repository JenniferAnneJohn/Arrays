package exercise4;

import java.util.Scanner;

public class SqreArray {
	int[] numbers=new int[5];
	int[] square=new int[5];
	int[] cube=new int[5];
	
	
	void getInput()
	{
		System.out.println("***** SQUARE AND CUBE VALUES *****");
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter 5 numbers: ");
	for(int i=0;i<5;i++)
	{
		numbers[i]=scan.nextInt();
	}
	}
	
	void square()
	{
		for(int i=0;i<5;i++)
		{
		square[i]=numbers[i]*numbers[i];
		}
	}
	
	void cube()
	{
		for(int i=0;i<5;i++)
		{
		cube[i]=numbers[i]*numbers[i]*numbers[i];
		}
	}
	
		void display()
		{
			System.out.println("The output is :");
			System.out.println("Input Array"+" "+"Square Array"+" "+"Cube Array");
			for(int i=0;i<5;i++)
			{
			System.out.println(numbers[i] + "\t " + square[i] + "\t " + cube[i]);
		    }
	    }
}
