public class TecPerson {

    protected int id;
    protected int age;
    protected String name;


    public TecPerson(){
        id=0;
        age=0;
        name="";
    }
    public TecPerson(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "[" +
            " id='" + getId() + "'" +
            ", age='" + getAge() + "'" +
            ", name='" + getName() + "'" +
            "]";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof TecPerson)) {
            return false;
        }
        TecPerson tecPerson = (TecPerson) o;
        return id == tecPerson.id && age == tecPerson.age && this.name.equals(tecPerson.name);
    }

}