import java.util.Scanner;

public class ToPower {

      public static void main(String[ ] args) {
      	Scanner key=new Scanner(System.in);
      	int base,pow,con=1,base2;
      	System.out.println();
      System.out.println("Type the number base");
      base=key.nextInt();
      base2=base;
      System.out.println("Type the number base");
      pow=key.nextInt();
      while (true) {
            base=base*base2;
            con++;
            if (con==pow) { break;}

        } 
       System.out.println("The result is: " + base);

      }
  }