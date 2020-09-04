import java.util.Scanner;

public class Compare {

	 public static void main(String[] args) {
	 	Scanner key = new Scanner(System.in);

	 	String cadena1, cadena2;
	 	int x;

	 	System.out.println("Type the String 1:");
	 	cadena1=key.nextLine();
	 	/*key.nextLine(); This line is not necesary compiling in CMD or Windows PowerShell*/ 
		System.out.println("Type the Srting 2:");
	 	cadena2=key.nextLine();
	 	/*key.nextLine(); This line is not necesary compiling in CMD or Windows PowerShell*/ 
	 	x=cadena1.compareTo(cadena2);
	 	if (x==0)
	 	{
	 		System.out.println("The String " + cadena1 + " and " + cadena2 + " are the same");
	 	}
	 	else 
	 		if (x>0)
	 	{
	 		System.out.println("The String " + cadena2 + " is bigger than " + cadena1);
	 	}
	 	else
	 		if (x<0)
	 	{
	 		System.out.println("The String " + cadena1 + " is bigger than " + cadena2);
	 	}
     	}
	}
