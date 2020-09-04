import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
		Scanner key=new Scanner(System.in);
        int hr, min, sec, acum=0, opc=0;
        int nose=0;
        int cinc, tempS,tempM,tempH,tempS2,tempM2,tempH2,temp3;
        do{
        System.out.println("    - - - - - T R A I N I N G - - - - -");
        System.out.println("Hello");
        System.out.println(" Number of workouts saved: "+acum);
        System.out.println(" What you want to do?\n 1. Add a new workout sesion  \n 2. Review all workouts saved  \n 3. Show the max time in a workout sesion\n 4. Show the min time in a workout sesion\n 5. Show the Average time in a workout sesion\n 6. Compare 2 workout sesion \n 7. Exit");
        Time Worksesion[][]=new Time[99][99];
        opc=key.nextInt();
        switch(opc){
        case 1:
        temp3=nose+1;
        int j=0;
        int i=0;
        for (int x=nose;x<temp3;x++){
            for(int y=0;y<=4;y++){
                System.out.println("Add your Hour "+(y+1));
                hr=key.nextInt();
                System.out.println("Add your Min "+(y+1));
                min=key.nextInt();
                System.out.println("Add your Sec "+(y+1));
                sec=key.nextInt();
                Worksesion[x][y]=new Time(sec,min,hr);
            }
            nose++;
        }
        break;
        case 2:
        if(nose==0){System.out.println("You dont have wokout saved");break;}
        for (i=0;i<Worksesion.length;i++){
            System.out.println("Time"+(i+1));
            for (j=0;j<Worksesion[i].length;j++){
                System.out.println(Worksesion[i][j]/*.toString()*/);
            }
            System.out.println("\n");
        }        
        break;
        case 3:
        {
            tempH=0;tempM=0;tempS=0;
            System.out.println("Type the day of the workout");
            cinc=key.nextInt()-1;
            if(cinc>nose){System.out.println("You dont have wokout saved this day");break;}
            else{
            for (j=0;j<Worksesion[cinc].length;j++){
                    sec=Worksesion[cinc][j].getSec();
                    min=Worksesion[cinc][j].getMin();
                    hr=Worksesion[cinc][j].getHr();
                    if((hr>=tempH)&&(min>=tempM)&&(sec>tempS))
                    {
                        tempH=hr;
                        tempM=min;
                        tempS=sec;
                    }
                    
                }
                System.out.println("Your worst time is: "+tempH+":"+tempM+":"+tempS);
            }
        }
        break;
        case 4:
        {
            tempH=99;tempM=99;tempS=99;
            System.out.println("Type the day of the workout");
            cinc=key.nextInt()-1;
            if(cinc>nose){System.out.println("You dont have wokout saved this day");break;}
            else{
            for (j=0;j<Worksesion[cinc].length;j++){
                    sec=Worksesion[cinc][j].getSec();
                    min=Worksesion[cinc][j].getMin();
                    hr=Worksesion[cinc][j].getHr();
                    if((hr<=tempH)&&(min<=tempM)&&(sec<tempS))
                    {
                        tempH=hr;
                        tempM=min;
                        tempS=sec;
                    }
                    
                }
                System.out.println("Your best time is: "+tempH+":"+tempM+":"+tempS);
            }
        }
        break;
        case 5:
        {
         tempH=0;tempM=0;tempS=0;
        System.out.println("Type the day of the workout");
        cinc=key.nextInt()-1;
        if(cinc>nose){System.out.println("You dont have wokout saved this day");break;}
        else
        {
        for (j=0;j<Worksesion[cinc].length;j++){
            sec=Worksesion[cinc][j].getSec();
            min=Worksesion[cinc][j].getMin();
            hr=Worksesion[cinc][j].getHr();
            tempH=+hr;
            tempM=+min;
            tempS=+sec;
                       
        }
        hr=tempH/5;
        min=tempM/5;
        sec=tempH/5;
        System.out.println("Your Average time is: "+hr+":"+min+":"+sec);
        }
        } 
        break;

        case 6:
            
            tempH=99;tempM=99;tempS=99;
            System.out.println("Type the day 1 of the workout");
            cinc=key.nextInt()-1;
            if(cinc>nose){System.out.println("You dont have wokout saved this day");break;}
            else{
            for (j=0;j<Worksesion[cinc].length;j++){
                    sec=Worksesion[cinc][j].getSec();
                    min=Worksesion[cinc][j].getMin();
                    hr=Worksesion[cinc][j].getHr();
                    if((hr<=tempH)&&(min<=tempM)&&(sec<tempS))
                    {
                        tempH=hr;
                        tempM=min;
                        tempS=sec;
                    }
                    
                }
            }
            tempH2=99;tempM2=99;tempS2=99;
            System.out.println("Type the day 2 of the workout");
            cinc=key.nextInt()-1;
            if(cinc>nose){System.out.println("You dont have wokout saved this day");break;}
            else{
            for (j=0;j<Worksesion[cinc].length;j++){
                    sec=Worksesion[cinc][j].getSec();
                    min=Worksesion[cinc][j].getMin();
                    hr=Worksesion[cinc][j].getHr();
                    if((hr<=tempH)&&(min<=tempM)&&(sec<tempS))
                    {
                        tempH2=hr;
                        tempM2=min;
                        tempS2=sec;
                    }
                    
                }
            }
            if((tempH2<=tempH)&&(tempM2<=tempM)&&(tempS2<tempS)){
            System.out.println("Your best day was 2\n Your best time is: "+tempH2+":"+tempM2+":"+tempS2);}
            else{System.out.println("Your best day was 1\n Your best time is: "+tempH+":"+tempM+":"+tempS);}
            break;
            
            case 7:
            break;
            default:
            System.out.println("Invalid option");
            break;
        }
    }while(opc!=7);
}
}