public class Book extends CatalogItem{
    //InVa
    private String author="";
    private int nopag;
    //Cons
    public Book(String title, String code, int year, boolean available, String author, int nopag) {
        super(title,code,year,available);
        this.author = author;
        this.nopag = nopag;
    }
    //DCons
    public Book(){
        super();
        author="";
        nopag=0;
    }
    //SetGet
    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNopag() {
        return this.nopag;
    }

    public void setNopag(int nopag) {
        this.nopag = nopag;
    }
    //ToString
    @Override
    public String toString() {
        return "{ code='"+getCod()+"', title='"+ getTitle()+"', year='"+getYear()+"', available='"+getAvailable()+"'"+"author='"+getAuthor()+", No. Pages='"+getNopag()+"'}";
    }
    
}