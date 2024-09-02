//Assignment 47:WAP with an Array of size 4, enter five values in it and handle the Exception?
package exception_handling;


public class Array_exception {

	public static void main(String[] args)
	{
		int rollno[]= new int[4];
		rollno[0]=22;
		rollno[1]=33;
		rollno[2]=44;
		rollno[3]=55;

		
		try {
			rollno[4]=66;
		}
		catch(ArrayIndexOutOfBoundsException a1)
		{
			System.out.println("Handled");
		}
	}

}
