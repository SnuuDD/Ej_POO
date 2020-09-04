public class Streetlight {
    static int contador = 0;
    private boolean onoff;
    private int color;
    private int time;
 
 
 
    public Streetlight(){
        onoff=false;
        color=0;
        time=0;
        contador++;
    }
 
    public Streetlight(boolean onoff, int color,int time){
        this.onoff=onoff;
        this.color=color;
        this.time=time;
    }
 
    public boolean getOnOff(){
        return onoff;
    }
 
    public void setOnOff(){
        onoff=!onoff;
    }
    public int getColor(){
        return color;
    }
    public void setColor(int color){
        this.color=color;
    }
    public int getTime(){
        return time;
    }
    public void setTime(int time){
        this.time=time;
    }
    public static int getContador() {
        return contador;
    }
 
    public void work() {
        do {
            if (color==0) {System.out.println("\nGreen");time=3000;}
            if (color==1) {System.out.println("Yellow");time=1000;}
            if (color==2) {System.out.println("Red");time=3000;}
            if(color==3){System.out.println("Time to cross...\n");time=5000;}
            try {
                Thread.sleep(time);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            if (color <= 3) {color++;}
            //else {color=0;}
 
        }while(color<=3);
        color=0;
 
    
    }}
