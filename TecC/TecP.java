import java.util.ListIterator;

public class TecP {
private int id, age;	
private String name;

TecP(int id, String name, int age){
	this.id=id;
	this.name=name;
	this.age=age;
}

TecP(){
	id=0;
	name="";
	age=0;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

@Override
	public String toString() {
		return "{" +
			" TecP" +
			", id='" + getId() + "'" +
			", name='" + getName() + "'" +
			", age='" + getAge() + "'" +
			"}";
	}

public boolean equals(Object object) {
	if(object instanceof TecP) {
		return true;
	}
	return false;
}


}
