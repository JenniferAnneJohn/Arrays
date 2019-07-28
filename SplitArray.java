package exercise4;

import java.util.Scanner;

public class SplitArray {
int[] numbers=new int[10];
int[] array1=new int[5];
int[] array2=new int[5];
int i,j;
public void get()
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter 10 numbers: ");
	for(int i=0;i<10;i++)
	{
		numbers[i]=scan.nextInt();
	}
}

public void split()
{
	System.out.println("The splitted array");
	int s=numbers.length/2;
	for(i=0;i<s;i++)
	{
		array1[i]=numbers[i];
	}	
	
	for(j=0;j<5;j++)
	{
		array2[j]=numbers[j+s];
	}
	
}
public void display()
{
	System.out.println("Array1 :");
	for(i=0;i<5;i++)
	{
	System.out.println(array1[i]);
	}
	System.out.println(" ");
	System.out.println("Array2 :");
	for(j=0;j<5;j++)
	{
	System.out.println(array2[j]);
	}
}


}
