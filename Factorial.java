package ArrayExercise2;
import java.util.ArrayList;
import java.util.Scanner;

public class Factorial {
	
		int[] number=new int[5];
		int[] factorial=new int[5];
		
		public void getInput()
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("********** FACTORIAL VALUES **********");
			
			
			for(int i=0;i<number.length;i++)
			{
				System.out.println("Enter a number: ");
				number[i]=scan.nextInt();
				
			}
		}
		public void factorial()
		{
			
			for(int i=0;i<number.length;i++)
			{
				int fact=1;
				for(int j=1;j<=number[i];j++)
				{
				fact=fact*j;
				
				}
				factorial[i]=fact;
				//System.out.println("FACTORIAL:"+factorial[i]);
				
			}
						
			System.out.println("The values in factorial arraylist: ");
			for(int i=0;i<factorial.length;i++)
			{
				System.out.println(factorial[i]);
			}

		}
}
