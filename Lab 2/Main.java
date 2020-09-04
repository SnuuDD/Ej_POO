import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner key=new Scanner(System.in);
		int x;
		Dog myDog=new Dog();
		System.out.println("       \n\nWhat want to do? // This program have time delays");
		System.out.println("1. Bark");
		System.out.println("2. Run");
		System.out.println("3. Eat");
		System.out.println("4.Fetch");
		x=key.nextInt();
		switch (x) {

        case 1:
        myDog.Bark();
        break;
        case 2:
        myDog.Run();
        break;
        case 3:
        myDog.Eat();
        break;
        case 4:
        myDog.Fetch();
        break;
        default:
        System.out.println("Invalid Option :c");
        break;
 		}
		
	}
}