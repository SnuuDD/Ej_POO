import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		TecC TecP=new TecC();
		int opc,id;
		String c;
		Scanner key= new Scanner (System.in);
		do {
			System.out.println("- - - - T E C  S Y S T E M - - - -"+
			"\n 1. Add Person"+
			"\n 2. Delete  Person"+
			"\n 3. Avg Students"+
			"\n 4. No. of Staff"+
			"\n 5. No. Teachers per course"+
			"\n 6. Exit");
		opc=key.nextInt();
		key.nextLine();
		switch(opc) {
		case 1:
				TecP.addTecP(TecP);
			break;
		case 2:
			System.out.println("ID to Delate");
			id=key.nextInt();
			key.nextLine();
			TecP.delP(id);
				System.out.println(TecP.toString());
			break;
		case 3:
			System.out.println("Total Avg " +TecP.totAvg());
			break;
		case 4:
			System.out.println("No. of Staff "+TecP.SupN());
			break;
		case 5:
			System.out.println("Course Name");
			c=key.nextLine();
			System.out.println("Teachers w same Course "+TecP.tCourses(c));
			break;
		}
		}while (opc!=6);
	}

}
