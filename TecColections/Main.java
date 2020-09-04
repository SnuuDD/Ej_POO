import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        TecComunity TecPerson=new TecComunity();
        int opc;
        Scanner k=new Scanner(System.in);
        do{
        System.out.println("- - - - T E C  S Y S T E M - - - -"+
			"\n 1. Add Person"+
			"\n 2. Delete  Person"+
			"\n 3. Avg Students"+
			"\n 4. No. of Staff"+
			"\n 5. No. Teachers per course"+
            "\n 6. Exit");
        opc=k.nextInt();
        k.nextLine();
        switch(opc){

            case 1:
            int type;
                System.out.println("Type: 1 = Student / 2 = Profesor / 3 = Support");type=k.nextInt();k.nextLine();
                if(type==1){
                    System.out.println("Type the ID");
                    int id=k.nextInt();k.nextLine();
                    System.out.println("Type the Age");
                    int age=k.nextInt();k.nextLine();
                    System.out.println("Type the Name");
                    String name=k.nextLine();
                    System.out.println("Type the Carrer");
                    String carreer=k.nextLine();
                    System.out.println("Type the Average");
                    double avg=k.nextDouble();
                    //Student tempStudent=new Student(id, age, name, carrer, avg);
                    TecPerson.addTecStudent(id, age, name, carreer, avg);
                }
                if(type==2){
                    System.out.println("Type the ID");
                    int id=k.nextInt();k.nextLine();
                    System.out.println("Type the Age");
                    int age=k.nextInt();k.nextLine();
                    System.out.println("Type the Name");
                    String name=k.nextLine();
                    System.out.println("Type the Course");
                    String course=k.nextLine();
                    System.out.println("Type the Title");
                    String title=k.nextLine();
                    //Profesor tempProfesor=new Profesor(id, age, name, course, title);
                    TecPerson.addTecProf(id, age, name, course, title);
                }
                if(type==3){
                    System.out.println("Type the ID");
                    int id=k.nextInt();k.nextLine();
                    System.out.println("Type the Age");
                    int age=k.nextInt();k.nextLine();
                    System.out.println("Type the Name");
                    String name=k.nextLine();
                    System.out.println("Type the Department");
                    String dpt=k.nextLine();
                   // Support tempSupport = new Support(id, age, name, dpt);
                    TecPerson.addTecSup(id, age, name, dpt);
                }
            break;

            case 2:
            System.out.println("Type the ID to Remove");
            int idremove=k.nextInt();k.nextLine();
            TecPerson.removeTecPerson(idremove);
            break;

            case 3:
            System.out.println("The grades Average is: "+TecPerson.gradesAvg());
            break;
            case 4:
            System.out.println("The Supports Number is: "+TecPerson.supportNumber());
            break;
            case 5:
            System.out.println("Type the Name of the Course: ");
            String coursee=k.nextLine();
            System.out.println("The Course: "+coursee+" has "+TecPerson.TeachXCourse(coursee)+" teachers");
            break;
            case 6:
            break;
            default: System.out.println("Invalid Option");break;

        }

        }while(opc!=6);
    }

}