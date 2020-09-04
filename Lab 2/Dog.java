import java.util.Scanner;

public class Dog {

	private String bark, name, weight, race, color, height, age;
	private float res;
	public Dog(){
		name="Doggo";
		weight="12 Kg.";
		race="Pitbull";
		color="Brown";
		height="1.1 m";
		age="5 Years";
		bark="\nGuau Guau xd";
	}
	public Dog(String bark,String name,String weight,String race,String color,String height,String age){
		this.bark=bark;
		this.name=name;
		this.weight=weight;
		this.race=race;
		this.color=color;
		this.height=height;
		this.age=age;
	}
	public void Bark(){
		System.out.println(bark);
		try {
		Thread.sleep(3000);
		} catch (InterruptedException ex) {
		// Retiro la excepcion de Thread.sleep
		}
		System.out.println(bark);
		return;
	}
	public void Run(){
		System.out.println("\nBruuuuuuum!");
		try {
		Thread.sleep(3000);
		} catch (InterruptedException ex) {
		//
		}
		System.out.println("Bruuuuuuum!");
		try {
		Thread.sleep(3000);
		} catch (InterruptedException ex) {
		//
		}
		System.out.println("Bruuuuuuum! *Gasp*");
		return;
	}
	public void Eat(){

		System.out.println("\n*Chew*");
		try {
		Thread.sleep(2000);
		} catch (InterruptedException ex) {
		//
		}
		System.out.println("*Chew*");
		try {
		Thread.sleep(2000);
		} catch (InterruptedException ex) {
		//
		}
		System.out.println("*Doggo moves the tail*");
		return;
	}
	public void Fetch(){
		System.out.println("\nBruuuuuuum!");
		try {
		Thread.sleep(4000);
		} catch (InterruptedException ex) {
		//
		}
		System.out.println("*Take the stick*");
		try {
		Thread.sleep(4000);
		} catch (InterruptedException ex) {
		//
		}
		System.out.println("Bruuuuuuum!");
		try {
		Thread.sleep(4000);
		} catch (InterruptedException ex) {
		//
		}
		System.out.println("*Doggo bring the stick*");
		System.out.println("\nGood boy!");	
		return;
	}
	
}


