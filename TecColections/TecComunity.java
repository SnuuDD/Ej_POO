import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TecComunity{
    
 private  ArrayList <TecPerson> people;

 public TecComunity(){
    people = new ArrayList<TecPerson>();
 }  

 public ArrayList<TecPerson> getTecPerson(){
     return people;
 }

 public void setTecPerson(ArrayList<TecPerson> people){
     this.people=people;
 }

 public void addTecStudent(int id,int age,String name,String carrer,double avg){
    Student tempStudent=new Student(id, age, name, carrer, avg);
     people.add(tempStudent);
 }
 public void addTecProf(int id,int age,String name,String course,String title){
    Profesor tempProfesor=new Profesor(id, age, name, course, title);
     people.add(tempProfesor);
 }
 public void addTecSup(int id,int age,String name,String dpt){
    Support tempSupport = new Support(id, age, name, dpt);
     people.add(tempSupport);
 }

 public boolean removeTecPerson(int id){
    TecPerson tempPeople;
     ListIterator <TecPerson> iterator=people.listIterator();
     while(iterator.hasNext()){
         tempPeople=iterator.next();
         if(tempPeople.getId()==id){
             people.remove(tempPeople);
             return true;
         }
     } return false;
 }

 public double gradesAvg(){
    TecPerson tempPeople;
     double avg=0;
     int index=0;
     ListIterator <TecPerson> iterator=people.listIterator();
    while(iterator.hasNext()){
        tempPeople=iterator.next();
        if(tempPeople instanceof Student){
        avg=+((Student)tempPeople).getAvg();
        index++;
        }
     }
     return avg/index;
 }

 public int supportNumber(){
     int index=0;
     TecPerson tempPeople;
     ListIterator <TecPerson> iterator=people.listIterator();
     while(iterator.hasNext()){
         tempPeople=iterator.next();
         if(tempPeople instanceof Support){
             index++;
         }
     }
     return index;
 }

 public int TeachXCourse(String course){
     int index=0;
     TecPerson tempPeople;
     ListIterator <TecPerson> iterator=people.listIterator();
     while(iterator.hasNext()){
         tempPeople=iterator.next();
         if(tempPeople instanceof Profesor){
             (((Profesor)tempPeople).getCourse()).equals(course);
             index++;
         }
     }
     return index;
 }

 @Override
 public String toString(){
     return "[ People= "+people+" ]";
 }

}