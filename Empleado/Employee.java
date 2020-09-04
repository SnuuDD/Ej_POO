public class Employee {
	
	//InVA
	private int id;
	private String name;
	//DCons
	public Employee() {
		ID = 0;
		name = "";
	}
	//Const
	public Employee(int id, String name) {
		this.id=id;
		this.name=name;
	}	
	//SetGet
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	//Tostring
	@Override
	public String toString() {
		return "{" +
			" id='" + getId() + "'" +
			", name='" + getName() + "'" +
			"}";
	}
	public boolean equals(Object object){
		if(object instanceof Employee){
			return id==((Employee)object).getId();
		}else{return false;}
	}
}
