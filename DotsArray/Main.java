import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
		Scanner key=new Scanner(System.in);
		int k;
		System.out.println("\n How many Dots want to create?");
		k=key.nextInt();
        Dots Linea[]=new Dots[k];
 
		
		for (int i=0;i<Linea.length;i++){
            Linea[i]=new Dots(i,i);
        }
                
        for (int i=0;i<Linea.length;i++){
			System.out.print("Position from Dot "+i+": ");
            System.out.println(Linea[i].toString());
        }
    }
 
}