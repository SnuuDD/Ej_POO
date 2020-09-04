import java.util.Objects;

public class Support extends TecPerson{

    private String dpt;

    public Support(){
        super();
        dpt="";
    }

    public Support(int id, int age, String name, String dpt){
        super(id, age, name);
        this.dpt=dpt;
    }

    public void setDpt(String dpt){
        this.dpt=dpt;
    }

    public String getDpt(){
        return dpt;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }
        if(!(obj instanceof Support)){
            return false;
        }
        Support support=(Support)obj;
        return dpt.equals(support.getDpt());
    }


}