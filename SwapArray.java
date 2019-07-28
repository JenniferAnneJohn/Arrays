package exercise4;

import java.util.Scanner;

public class SwapArray {
int[] numbers=new int[5];


void get()
{
	Scanner scan=new Scanner(System.in);
	System.out.println("****** SWAPPING VALUES IN AN ARRAY ******");
	System.out.println("Enter numbers: ");
	
	for(int i=0;i<5;i++)
	{
		numbers[i]=scan.nextInt();
	}
}


void display()
{
	System.out.println("The number in the index position of 2 is: ");
	System.out.println(numbers[2]);
	System.out.println("The number in the index position of 4 is: ");
	System.out.println(numbers[4]);
}


void swap()
{
	int x=numbers[2];
	numbers[2]=numbers[4];
	numbers[4]=x;
	System.out.println("Swapped Array : ");
	for(int i=0;i<5;i++)
	{
	System.out.println(numbers[i]);
	}
}
}
