public class Account{

    private String clabe, nombre;
    private double saldo;
    private String nocuen;

   public Account(){
       clabe="";
       nombre="";
       nocuen="";
       saldo=0;
   }

   public Account(String clabe, String nombre, String nocuen, double saldo){
       this.clabe=clabe;
       this.nombre=nombre;
       this.nocuen=nocuen;
       this.saldo=saldo;
   }

   public void setClabe(String clabe){
       this.clabe=clabe;
   }
   public String getClabe(){
       return clabe;
   }
   public void setNombre(String nombre){
       this.nombre=nombre;
   }
   public String getNombre(){
       return nombre;
   }
   public void setNoCuen(String nocuen){
       this.nocuen=nocuen;
   }
   public String getNoCuen(){
       return nocuen;
   }
   public void setSaldo(double saldo){
    this.saldo=saldo;
   }
    public double getSaldo(){
    return saldo;
   }
    public void Withdraw(double temp){
    if(temp>saldo){System.out.println("Insufficient balance, your current balance is: "+saldo);return;}
    else{saldo=saldo-temp;System.out.println("Your current balance is:"+saldo);}
    }
    public void Deposit(double temp){
        saldo+=temp;
        System.out.println("Your current balance is:"+saldo);
    }
}