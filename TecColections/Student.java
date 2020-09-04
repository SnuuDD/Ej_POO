public class Student extends TecPerson {

    private String carrer;
    private double avg;

    public Student() {
        super();
        carrer="";
        avg=0;
    }
    public Student(int id, int age, String name, String carrer, double avg){
        super(id, age, name);
        this.carrer = carrer;
        this.avg = avg;
    }

    public String getCarrer() {
        return this.carrer;
    }

    public void setCarrer(String carrer) {
        this.carrer = carrer;
    }

    public double getAvg() {
        return this.avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "[" +
             " id='" + getId() + "'" +
             ", age='" + getAge() + "'" +
             ", name='" + getName() + "'"+
            " carrer='" + getCarrer() + "'" +
            ", avg='" + getAvg() + "'" +
            "]";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Student)) {
            return false;
        }
        Student student = (Student) o;
        return carrer.equals(student.carrer) && avg == student.avg;
    }

}