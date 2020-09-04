public class Music extends CatalogItem{
    //InVa
    private String author;
    private String format;
    //Cons
    public Music(String title, String code, int year, boolean available, String author, String format) {
        super(title,code,year,available);
        this.author = author;
        this.format = format;
    }
    //DCons
    public Music(){
        super();
        author="";
        format="";
    }
    //SetGet
    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getFormat() {
        return this.format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
    //ToString
    @Override
    public String toString() {
        return "{ code='"+getCod()+"', title='"+ getTitle()+"', year='"+getYear()+"', available='"+getAvailable()+"'"+"author='"+getAuthor()+", format='"+getFormat()+"'}";
    }
    
}