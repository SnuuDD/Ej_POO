import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner key=new Scanner(System.in);
		float res;
		Dots default1=new Dots();
		Dots myDot=new Dots(0,0);
		myDot.move(15,10);
		res=myDot.distance(default1);
		System.out.println("The result is: " + res);

		
	}
}