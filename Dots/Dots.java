import java.util.Scanner;
import java.lang.Math;

public class Dots {

	private int x,y;
	private float res;
	public Dots(){
		x=0;
		y=0;
	}
	public Dots(int x,int y){
		this.x=x;
		this.y=y;
	}
	public void setX(int x){
		this.x=x;
	}
	public void setY(int y){
		this.y=y;
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	public void move(int x, int y){
		this.x=x;
		this.y=y;
	}
	public float distance(Dots myDot){
		float res;
		res=(float)Math.sqrt(Math.pow(this.x-myDot.getX(),2)+Math.pow(this.y-myDot.getY(),2));
		return res;
	}

	public String toString(){
		return "x = "+x+" y = "+y;
	}
}


