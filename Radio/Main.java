import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner key =new Scanner(System.in);
        int opc,vol;
        double station;
        Radio myRadio=new Radio();
        do{
        System.out.println("Radio 'Asos'\n 1. Turn on Radio\n 2. Set Am/Fm\n 3. Set Station\n 4. Set Volume\n 5. Play Music \n 6. Get Radio Info\n 7. Exit");
        System.out.println("Choose an option: ");
        opc=key.nextInt();
        switch (opc) {

            case 1:
            myRadio.setTurnOn();
            break;
            case 2:
            myRadio.setAmFm();
            break;
            case 3:
            System.out.println("Choose a station (AM 580-1600 / FM 88.1-108.1)");
            station=key.nextDouble(); 
            myRadio.setAmFmStation(station);
            break;
            case 4:
            System.out.println("Choose the Volume (0-50)");
            vol=key.nextInt(); 
            myRadio.setVol(vol);
            break;
            case 5:
            myRadio.printSong();
            break;
            case 6:
            myRadio.printInfo();
            break;
            case 7:
            break;
            default:
            System.out.println("Invalid Option");
            break;
             }
            System.out.println("\n\n\n");
        


        }while(opc!=7);

        
    }
}