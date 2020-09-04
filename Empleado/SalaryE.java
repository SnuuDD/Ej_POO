public class SalaryE extends Employee {
    //InVa
	private double salary;    
    //DCons
    public SalaryE(){
		super();
		salary=0;
	}
	//Cons
	public SalaryE(int id, String name, double salary) {
		super(id,name);
		this.salary=salary;
	}
	//SetGet
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	//Method
	public double monthlyPayment() {
		if(getSalary()>10000){return getSalary()*0.7;}
		else{return getSalary()*0.8;}
    }
	public boolean equals(Object object) {
		if(object instanceof SalaryE) {
			return ((Salary) object).getSalary() == salary;
		}return false;
		
	}
    //ToSting
    @Override
    public String toString() {
        return "{" +" id='" + getId() + "'" +", name='" + getName() + "'"+" salary='" + getSalary() + "'"+"}";
    }
	
	
}
