import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
    String clabe, nombre,nocuen;   
    double saldo, temp;
    int opc;
    Scanner key=new Scanner(System.in);
    System.out.println("- - - - - - - - - A L K A B A N K - - - - - - - - - -");
    Account myAccount = new Account();
    System.out.println("- - To start, you need to type your CLABE, Full Name, No. Account and your current account balance - -");
    System.out.println("- - Type your CLABE - -");
    clabe=key.nextLine();
    myAccount.setClabe(clabe);
    System.out.println("- - Type your Full Name - -");
    nombre=key.nextLine();
    myAccount.setNombre(nombre);
    System.out.println("- - Type your No. Account - -");
    nocuen=key.nextLine();
    myAccount.setNoCuen(nocuen);
    System.out.println("- - Type your Account Balance - -");
    saldo=key.nextDouble();
    myAccount.setSaldo(saldo);
    System.out.println("\n\n");
    do{
    System.out.println("\n\n ---------- B A N K  A C C O U N T ---------- \n Hello "+myAccount.getNombre()+"\n What you want to do?\n 1. See my Account info.\n 2. Withdraw Cash\n 3. Deposit money\n 4. Exit");
    opc=key.nextInt();
    switch(opc)
    {
        case 1:
        System.out.println("\n - - - - - - A C C O U N T   I N F O - - - - - - -");
        System.out.println(" Full Name: "+myAccount.getNombre());
        System.out.println(" CLABE: "+myAccount.getClabe());
        System.out.println(" No. Account: "+myAccount.getNoCuen());
        System.out.println(" Current Account Balance: "+myAccount.getSaldo());
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - -");
        break;
        case 2:
        System.out.println("How many money you want to withdraw?");
        temp=key.nextDouble();
        myAccount.Withdraw(temp);
        //key.nextLine();
        break;
        case 3:
        System.out.println("How many money you want to deposit?");
        temp=key.nextDouble();
        myAccount.Deposit(temp);
        //key.nextLine();
        break;
        case 4:
        break;
        default:
        System.out.println("Invalid Option");

    }
    }while(opc!=4);
    }
}