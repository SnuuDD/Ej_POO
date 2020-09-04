public class Profesor extends TecPerson{

    private String course;
    private String title;

    public Profesor(){
        super();
        course="";
        title="";
    }

    public Profesor(int id, int age, String name, String course, String title) {
        super(id, age, name);
        this.course = course;
        this.title = title;
    }


    public String getCourse() {
        return this.course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Profesor)) {
            return false;
        }
        Profesor profesor = (Profesor) o;
        return course.equals(profesor.course) && title.equals(profesor.title);
    }
    
    @Override
    public String toString() {
        return "[" +
            " id='" + getId() + "'" +
            ", age='" + getAge() + "'" +
            ", name='" + getName() + "'"+
            " course='" + getCourse() + "'" +
            ", title='" + getTitle() + "'" +
            "}";
    }

}