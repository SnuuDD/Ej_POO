import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
    Time myTime = new Time();
    Scanner key=new Scanner(System.in);
    int hr,min,opc;
    do{
    System.out.println("\n\n ---------- T I M E ---------- \n What you want to do?\n 1. Set Hour and Min.\n 2. Start time from 00:00:00\n 3. Exit");
    opc=key.nextInt();
    switch(opc)
    {
        case 1:
        System.out.print("Type the hour (00 Hr-23 Hr): ");
        hr=key.nextInt();
        if(hr<0 && hr<23)
        {
            System.out.println("Hour out of range");
            break;
        }
        System.out.print("Type the Min (00 Min-59 Min): ");
        min=key.nextInt();
        if(hr<00 && hr<59)
        {
            System.out.println("Min out of range");
            break;
        }
        myTime.work(hr,min);
        break;
        case 2:
        myTime.work(0,0);
        case 3:
        break;
        default:
        System.out.println("Invalid Option");

    }
    }while(opc!=3);
    }
}