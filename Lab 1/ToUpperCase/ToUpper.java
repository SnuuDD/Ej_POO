import java.util.Scanner;

public class ToUpper {

	 public static void main(String[] args) {
	 	Scanner key = new Scanner(System.in);

	 	String cadena1;
	 	System.out.println("Type the String you want to Uppercase:");
	 	cadena1=key.nextLine();
	 	System.out.println(); 
	 	/*key.nextLine(); This line is not necesary compiling in CMD or Windows PowerShell*/ 
	 	System.out.println(cadena1.toUpperCase());
	 	}
  	}

