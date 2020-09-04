public class Catalog{

    //InVa
    CatalogItem catalogo[];
    int reg=0;
  
    //Cons
    public Catalog(int x){
        catalogo = new CatalogItem[x];
    }

    //Method
    public void addItem(CatalogItem item){
        catalogo[reg]=item;
        reg++;
    }
    public void delItem(String code){
        int i=0;
        int temp=0;
        //System.out.println(reg);
        for(i=0;i==reg;i++){
                CatalogItem tempO = catalogo[i];
                if(tempO.getCod().equals(code)){
                temp=i;
                System.out.println("/n/n/n ENTRO"+i);
                catalogo[i]=null;
                break;
            }
        }
        for(i=temp;i==reg;i++){
            catalogo[i]=catalogo[i+1];
            if(i==reg){
                catalogo[i]=null;
            }
        }
    }
    public String bookxAuthor(String author){
        String BxA="";
        int i;
        for(i=0;i<reg;i++){
            if(catalogo[i] instanceof Book){
                Book tempBook = (Book)(catalogo[i]);
                if(tempBook.getAuthor().equals(author)){
                    BxA+=" "+tempBook.toString();
                }
            }
        }return BxA;

    }
    public boolean songExist(String title){
        int i;
        for(i=0;i<reg;i++){
            if(catalogo[i] instanceof Music){
                CatalogItem tempMusic = catalogo[i];
                if(tempMusic.getTitle().equals(title)){
                    return true;
                }
                else{
                    return false;
                }
            }
        }return false;
    }

    public String allMusic(){
        String AllMusic="";
        int i=0;
            for(i=0;i<reg;i++){
            if(catalogo[i] instanceof Music){
                Music tempMusic = (Music)(catalogo[i]);
                AllMusic+= " \n "+tempMusic.toString();
            }
            
        }
        return AllMusic;

    }
    public String allBook(){
        String AllBook="";
        int i=0;
        for(i=0;i<reg;i++){
            if(catalogo[i] instanceof Book){
                Book tempBook = (Book)(catalogo[i]);
                AllBook += " \n "+tempBook.toString();
            }
        }return AllBook;
    }



}