//Assignment 48:Take size from scanner class n get two exception one for nextInt other for ArrayOutOfBoundException Handled it using try catch
package exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiple_Exceptionhandling {

	public static void main(String[] args) {
		int rollno[]= new int[3];
		Scanner s1= new Scanner(System.in);
		for(int i=0; i<rollno.length; i++)
		{
			rollno[i]=s1.nextInt();
		}
		try {
			rollno[4]=77;
		}
		catch(InputMismatchException a1)
		{
			System.out.println("Handled 1");
		}

		
		catch(ArrayIndexOutOfBoundsException a2)
		{
			System.out.println("Handled 2");
		}
		
	}

}
