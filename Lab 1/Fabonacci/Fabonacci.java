import java.util.Scanner;

public class Fabonacci {

      public static void main(String[ ] args) {
      	Scanner key=new Scanner(System.in);
      	int base,con=0, contant=1, sum=1,temp=1;
      	System.out.println();
      System.out.println("Type the a number:");
      base=key.nextInt();
      if (base==0) {
        System.out.println("0");
      }
      if (base==1) {
        System.out.println("0");
      }
      if (base==2) {
        System.out.println("0, 1");
      }
      if (base==3) {
        System.out.println("0, 1, 1");
      }
            if (base>3) {
        System.out.print("0, 1, 1");
        con=3;
        while (true) {
            contant=sum+temp;
            sum=temp;
            temp=contant;
            con++;
            System.out.print(", " + contant);
            if (con==base) { break;}

        } 
      }

      }
  }
