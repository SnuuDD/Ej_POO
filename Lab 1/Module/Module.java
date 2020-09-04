import java.util.Scanner;

public class Module {

	 public static void main(String[] args) {
	 	Scanner key = new Scanner(System.in);

	 	int x, y, cont=1;

	 	System.out.println("Type the x value:");
	 	x=key.nextInt();
		System.out.println("Type the y value:");
	 	y=key.nextInt();

	 	if (y==0)
	 	{
	 		System.out.println("You cannot divide by zero");
	 	}
	 	else if (x==0)
	 	{
	 		System.out.println("The result is: 0");
	 	}
	 	else
	 	{
	 	 while ( x>= 0 ) 
	 	{
          x=x-y;
          if (y>x || x<=0) { break;}
          cont++;
      	}
        System.out.println("The result is: " + x);
     	}
	}
}
