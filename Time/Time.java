public class Time{

     private int sec, min, hr;

    public Time(){
        sec=0;
        min=0;
        hr=0;
    }

    public Time(int sec, int min, int hr){
        this.sec=sec;
        this.min=min;
        this.hr=hr;
    }

    public void setSec(int sec){
        this.sec=sec;
    }
    public int getSec(){
        return sec;
    }
    public void setMin(int min){
        this.min=min;
    }
    public int getMin(){
        return min;
    }
    public void setHr(int hr){
        this.hr=hr;
    }
    public int getHr(){
        return hr;
    }
    public String toString(){
        return hr+":"+min+":"+sec;
    }
}