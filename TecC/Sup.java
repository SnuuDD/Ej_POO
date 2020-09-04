
public class Sup extends TecP{

	private String dpt;
	
	public Sup() {
		dpt="";
	}
	
	public Sup(int id, String name, int age, String dpt) {
		super(id,name,age);
		this.dpt=dpt;
	}

	public String getDpt() {
		return dpt;
	}

	public void setDpt(String dpt) {
		this.dpt = dpt;
	}
	
	@Override
	public String toString() {
		return "{" +
			" Sup" +
			", id='" + getId() + "'" +
			", name='" + getName() + "'" +
			", age='" + getAge() + "'" + 
			", dpt='" + getDpt() + "'"+
			"}";
	}

public boolean equals(Object object) {
	if(object instanceof Sup) {
		return true;
	}
	return false;
	
	
}
}
