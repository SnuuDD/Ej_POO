public class HourlyE extends Employee {
    //InVa
	private int wHours;
	private double hFee;

    
    //DCons
    public HourlyE(){
		super();
		hours = 0;
		fee = 0;
	}
	//Cons
	public HourlyE(int id, String name, int wHours, double hFee) {
		super(id,name);
		this.wHours=wHours;
		this.hFee=hFee;
	}
	//SetGet
	public int getWHours() {
		return wHours;
	}
	public void setWHours(int wHours) {
		this.wHours=wHhours;
	}
	public double getHFee() {
		return hFee;
	}
	public void setHFee(double hFee) {
		this.hFee = hFee;
	}
	
	//Method
	public double monthlyPayment() {
		return (getWHours()*getHFee())*0.9;
    }
    public boolean equals(Object object) {
		if(object instanceof HourlyE) {
			return ((HourlyE) object).getHours() == wHours;
		}else{return false;}
		
	}
    //ToSting
    @Override
    public String toString() {
        return "{" +" id='" + getId() + "'" +", name='" + getName() + "'"+" wHours='" + getWHours() + "'" +", hFee='" + getHFee() + "'" +"}";
    }
	
	
}
