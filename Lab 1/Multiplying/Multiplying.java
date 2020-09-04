import java.util.Scanner;

public class Multiplying {

	 public static void main(String[] args) {
	 	Scanner key = new Scanner(System.in);

	 	int x, y, cont=1, x2;

	 	System.out.println("Type the x value:");
	 	x=key.nextInt();
	 	x2=x;
		System.out.println("Type the y value:");
	 	y=key.nextInt();

	 	if (y==0)
	 	{
	 		System.out.println("The result is: 0");
	 	}
	 	else
	 	{
	 	 while ( cont != y ) 
	 	{
          x2=x2+x;
          cont++;
      	}
        System.out.println("The result is: " + x2);
     	}
	}
}