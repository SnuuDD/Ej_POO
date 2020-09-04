import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.Scanner;


public class TecC {
	Scanner key = new Scanner(System.in);
private ArrayList <TecP> TecPe;

public TecC() {
	TecPe=new ArrayList <TecP>();
}

public ArrayList<TecP> getTecP() {
	return TecPe;
}

public void setTecP(ArrayList<TecP> Person) {
	TecPe = Person;
}

public void addTecP(Object TecP) {
	System.out.println("P = Professor -/- S = Student -/- X = Support");
	int age,id;
	String opc, name,career,course,dpt,title;
	Float avg;	
	opc=key.nextLine();
	key.nextLine();
	switch(opc)
	{
	case "P":
	case "p":
		System.out.println("Type the ID");
		id=key.nextInt();
		key.nextLine();
		System.out.println("Type the Name");
		name=key.nextLine();
		System.out.println("Type the Age");
		age=key.nextInt();
		key.nextLine();
		System.out.println("Type the Career");
		career=key.nextLine();
		System.out.println("Type the Average");
		avg=key.nextFloat();	
		Stuf tempS=new Stuf(id,name,age,career,avg);
		TecPe.add(tempS);
		break;
	case "s":
	case "S":
		System.out.println("Type the ID");
		id=key.nextInt();
		key.nextLine();
		System.out.println("Type the Name");
		name=key.nextLine();
		System.out.println("Type the Age");
		age=key.nextInt();
		key.nextLine();
		System.out.println("Type the Course");
		course=key.nextLine();
		System.out.println("Type the Title");
		title=key.nextLine();
		Prof tempP= new Prof(id,name,age,course,title);
		TecPe.add(tempP);
		break;
	case "x":
	case "X":
		System.out.println("Type the ID");
		id=key.nextInt();
		key.nextLine();
		System.out.println("Type the Name");
		name=key.nextLine();
		System.out.println("Type the Age");
		age=key.nextInt();
		key.nextLine();
		System.out.println("Type the Department");
		dpt=key.nextLine();
		key.nextLine();
		Sup tempX = new Sup(id,name,age,dpt);
		TecPe.add(tempX);
		break;
	default:
	System.out.println("Invalid Option");
		break;
	}
}

public void delP(int id) {
	TecP temP;
	ListIterator <TecP> iterator=TecPe.listIterator();
	while(iterator.hasNext()) {
		temP=iterator.next();
		if(temP.getId()==id) {
			TecPe.remove(temP);
			System.out.println("Done");
		}
		else {System.out.println("No available");}
	}
}

public Float totAvg(){
	TecP temP;
	int i=0;
	Float tempA=((float)0.0), tempS=((float)0.0);
	ListIterator <TecP>iterator=TecPe.listIterator();
	while(iterator.hasNext()) {
		temP=iterator.next();
		if(temP instanceof Stuf) {
			tempA+=((Stuf)temP).getAvg();i++;
		}
	}
	tempA=tempA/i;
	if(i>1) {
		return ((float)0.0);
	}else
	return tempA;
}

public int SupN() {
	int i=0;
	TecP tempP;
	ListIterator <TecP> iterator=TecPe.listIterator();
	while(iterator.hasNext()) {
		tempP=iterator.next();
		if(tempP instanceof Sup) {
			i++;
		}
	}
	return i;
}

public int tCourses(String course) {
	int i=0;
	TecP tempP;
	ListIterator <TecP>iterator=TecPe.listIterator();
	while(iterator.hasNext()) {
		tempP=iterator.next();
		if(tempP instanceof Prof) {
			if(((Prof)tempP).getCourse().equals(course)) {
				i++;
			}
		}
	}
	return i;
}
@Override
public String toString() {
	return "{" +
		" TecC='" + TecPe + "'" +
		"}";
}

}
