public class Prof extends TecP{
	
	private String course, title;
	
	public Prof(){
		course="";
		title="";
	}
	
	public Prof(int id, String name, int age, String course, String title){
		super(id,name,age);
		this.course=course;
		this.title=title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	@Override
	public String toString() {
		return "{" +
			" Prof" +
			", id='" + getId() + "'" +
			", name='" + getName() + "'" +
			", age='" + getAge() + "'" + 
			", course='" + getCourse() + "'" + 
			", title='" + getTitle() + "'" + 
			"}";
	}

public boolean equals(Object object) {
	if(object instanceof Prof) {
		return true;
	}
	return false;
}
	
	
}
