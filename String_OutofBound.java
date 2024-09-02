package exception_handling;

public class String_OutofBound extends StringOutOfBoundException{

	public static void main(String[] args) 
	{
		String s1= new String("Najnin");
		try{
			char c1= s1.charAt(20);
		}
		catch(StringOutOfBoundException a1)
		{
			System.out.println("Handled");
		}

	}

}
