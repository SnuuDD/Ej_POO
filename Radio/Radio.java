import java.util.Scanner;

public class Radio {

	private boolean amfm, turnon;
	private int vol;
    private double station;
	public Radio(){
		amfm=false;
		turnon=false;
		vol=0;
		station=540;
	}
	public Radio(boolean a, boolean t, int v, double s){
		this.amfm=a;
		this.turnon=t;
		this.vol=v;
		this.station=s;
	}
    public boolean getTurnOn(){
        return turnon;
    }
	public void setTurnOn(){
		turnon=!turnon;
	}
    
    public boolean getAmFm(){
        return amfm;
    }
	public void setAmFm(){
		amfm=!amfm;
	}
    public int getVol(){
        return vol;
    }
	public void setVol(int vol){
        if(turnon==false){
            System.out.println("\nThe radio is off, please turn on it");
            return;}
        else{
        if(vol<0 || vol>50){System.out.println("Out of range for Volume");}
        else{
		this.vol=vol;
        }
    }
	}
	public void getAmFmStation(){
        if (amfm=false){
            System.out.println("AM "+ station);
        }
        else{
            System.out.println("FM "+ station);
        }
	}
	public void setAmFmStation(double station){
        if(turnon==false){
            System.out.println("\nThe radio is off, please turn on it");
            return;}
        else{
        if(amfm=false){
            if(station<540 || station>1600){System.out.println("Out of range for AM Station");return;}
            else{this.station=station;}
        }
        else{
             if(station<88.1 || station>108.1){System.out.println("Out of range for FM Station");return;}
            else{this.station=station;}
        }
    }
	}
	public void printSong(){
        if(turnon==false){System.out.println("The radio is off, please turn on it");return;}
        else{System.out.println("    Now playing ... Safe From Harm - Massive Atack ♪ \n  Midnight rockers, city slickers\n Gunmen and me yeah\n On a feature on the freak show\n And I cant do nothing bout that, no no\n But if you hurt whats mine\n Ill sure as hell retaliate\n You can free the world, you can free my mind \n Just as long as my babys safe from harm tonight\n You can free the world, you can free my mind\n Just as long as my babys safe from harm tonight\n Terious, terious, terious, infectious and dangerous\n Friends and enemies find us contagerious\n I was lookin back to see if you were lookin back at me\n To see me lookin back at you\n Lucky deepest, crazy chances seems to be moving fast\n What happened to the niceties of my childhood days\n Well I cant do nothing bout that, no no\n But if you hurt whats mine \n Ill sure as hell retaliate\n I was…");}
	}
    public void printInfo(){
        System.out.println("\nStatus: ");
        if(turnon==false){System.out.println("On/Off: Off");}
        else{System.out.println("On/Off: On");}
        if(amfm==false){System.out.println("AM/FM: AM " +station);}
        else{System.out.println("AM/FM: FM "+station);}
        System.out.println("Volume: "+vol);

    }
	
}


