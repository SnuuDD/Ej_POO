
public class Stuf extends TecP {
private String career;
private float avg;

public Stuf() {
	career="";
	avg=0;
}

public Stuf(int id, String name, int age, String career, Float avg) {
super(id,name,age);
this.career=career;
this.avg=avg;
}

public String getCareer() {
	return career;
}

public void setCareer(String career) {
	this.career = career;
}

public float getAvg() {
	return avg;
}

public void setAvg(double avarege) {
	this.avg = avg;
}

@Override
	public String toString() {
		return "{" +
			" Stuf" +
			", id='" + getId() + "'" +
			", name='" + getName() + "'" +
			", age='" + getAge() + "'" + 
			", avg='" + getAvg() + "'" + 
			", carreer='" + getCareer() + "'" + 
			"}";
	}

public boolean equals(Object object) {
	if(object instanceof Stuf) {
		return true;
	}
	return false;


}
}