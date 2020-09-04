import java.util.Scanner;
 
public class Main {
    public static void main(String args[])
    {   int opc;
        Scanner input = new Scanner(System.in);
        Streetlight sem1 = new Streetlight();
        Streetlight sem2 = new Streetlight();
 
        do {
            System.out.print("\n\n\nMENU\n1. On/Off Streetlight 1\n2. Push button Streetlight 1\n3. On/Off Streetlight 2\n4. Push button Streetlight 2\n5. Count the number of Streelights\n6. Exit\nOption: ");
            
            opc = input.nextInt();
 
            switch (opc)
            {
                case 1:
                 sem1.setOnOff();
                   if(sem1.getOnOff()==true)
                        System.out.println("Streetlight 1 On");
                    else
                        System.out.println("Streetlight 1 Off");
                    break;
 
                case 2:
                    if(sem1.getOnOff()==true)
                    {
                        sem1.work();
                    }else{
                        System.out.println("Streetlight 1 Off, Please turn on");
                    }
                    break;
 
                case 3:
                    sem2.setOnOff();
                    if(sem2.getOnOff()==true)
                        System.out.println("Streetlight 2 On");
                    else
                        System.out.println("Streetlight 2 Off");
                    break;
 
                case 4:
                    if(sem2.getOnOff()==true)
                    {
                        sem2.work();
                    }else{
                        System.out.println("Streetlight 2 Off, Please turn on");
                    }
                    break;
                case 5:
                   System.out.println("The number of streetlights are: " + Streetlight.getContador());
 
 
            }
            
        }while(opc!=6);
 
        input.close();
    }
}