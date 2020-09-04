public class CatalogItem{

    //InVa    
    private String code="";
    private String title="";
    private int year;
    protected boolean available;
    //Cons
    public CatalogItem(String title, String code, int year, boolean available) {
        this.title = title;
        this.code = code;
        this.year = year;
        this.available = available;
    }
    //Dcons
    public CatalogItem() {
        title = "";
        code = "";
        year = 0;
        available = false;
    }
    //SetGet
    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCod() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean getAvailable() {
        return this.available;
    }

    public void isAvailable(boolean available) {
        this.available = available;
    }
    //Equals
    public boolean equals(Object object){
        if(object instanceof CatalogItem){
            return code==((CatalogItem)object).getCod();
        }
        else{
            return false;
        }
    }
    //ToString
    @Override
    public String toString() {
        return "{ code='"+getCod()+"', title='"+ getTitle()+"', year='"+getYear()+"', available='"+getAvailable()+"'}";
    }   

}