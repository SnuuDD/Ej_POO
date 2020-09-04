import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        //Va
        int opc;
        //Method
        Catalog catalogo=new Catalog(15);
        CatalogItem s1=new Music("Song1", "MusicA", 2018, true, "NoOne", "mp3");catalogo.addItem(s1); 
        CatalogItem s2=new Music("Song2", "MusicB", 2007, false, "NoOne", "mp3");catalogo.addItem(s2); 
        CatalogItem s3=new Music("Song3", "MusicC", 2000, false, "1234J", "mp3");catalogo.addItem(s3); 
        CatalogItem s4=new Music("Song4", "MusicD", 2010, true, "Hmm", "mp3");catalogo.addItem(s4); 
        CatalogItem s5=new Music("Song5", "MusicE", 2015, true, "NoOne", "mp3");catalogo.addItem(s5); 
        CatalogItem s7= new Book("Godfather", "BookA", 1990, true, "Vito Corleone", 265);catalogo.addItem(s7); 
        CatalogItem s8= new Book("Book2", "BookB", 1990, true, "Hmm", 100);catalogo.addItem(s8); 
        CatalogItem s9= new Book("This Is Not a Book", "BookC", 2018, true, "Yo", 34);catalogo.addItem(s9); 

            
        do{
            System.out.println("- - B O O K  &  M U S I C  S T O R E - -");
            System.out.println("What you want to do?");
            System.out.println(" 1. Add a Catalog Item");
            System.out.println(" 2. Delete a Catalog Item (specific code)");
            System.out.println(" 3. Check all the books written by a specific author");
            System.out.println(" 4. Check if there is a specific song (title) in the Catalog");
            System.out.println(" 5. Display all the books in the Catalog");  
            System.out.println(" 6. Display all the Songs in the Catalog");
            System.out.println(" 7.Exit");
            System.out.print("Type your option: ");
            opc=key.nextInt();
            key.nextLine();
            switch(opc){
                case 1:
                    String tempT,tempC, tempOpc,tempAuthor,tempF;
                    int tempY,tempPage;
                    boolean YN;
                    System.out.print("Add the title: ");
                    tempT=key.nextLine();
                    System.out.print("Add the Code: ");
                    tempC=key.nextLine();
                    System.out.print("Add the Year: ");
                    tempY=key.nextInt();
                    key.nextLine();
                    key.nextLine();
                    System.out.print("Is Available (Y/N): ");
                    tempOpc=key.nextLine();
                    if(tempOpc.equals("Y") || tempOpc.equals("y")){
                        YN=true;                        
                    }
                    else if(tempOpc.equals("N") || tempOpc.equals("n")){
                        YN=false;
                    }
                    else{System.out.println("Invalid Option");break;}
                    //
                    System.out.print("Add the Author: ");
                    tempAuthor=key.nextLine();
                    System.out.print("Type ('M' = Music / 'B' = Book)");
                    tempOpc=key.nextLine();
                    if(tempOpc.equals("m") || tempOpc.equals("M")){
                        System.out.print("Add the Format: ");
                        tempF=key.nextLine();
                        key.nextLine();
                        Music newM=new Music(tempT,tempC,tempY,YN,tempAuthor,tempF);
                        catalogo.addItem(newM);
                                               
                    }
                    else if(tempOpc.equals("B") || tempOpc.equals("b")){
                        System.out.print("Add the No. Pages: ");
                        tempPage=key.nextInt();
                        key.nextLine();
                        Book newB=new Book(tempT,tempC,tempY,YN,tempAuthor,tempPage);
                        catalogo.addItem(newB);
                    }
                    else{System.out.println("Invalid Option");break;}
                break;

                case 2:
                    String tempCode;
                    System.out.print("\n Code to delete:");
                    tempCode=key.nextLine();
                    catalogo.delItem(tempCode);
                    System.out.println("\nDone\n");
                break;

                case 3:
                    String tempName;
                    System.out.println("Type the Name: ");
                    tempName=key.nextLine();
                    System.out.println(catalogo.bookxAuthor(tempName));
                break;

                case 4:
                    String tempNam2e;
                    System.out.println("Type the Name Song: ");
                    tempNam2e=key.nextLine();
                    System.out.println(catalogo.songExist(tempNam2e));
                break;

                case 5:
                    System.out.println("All Book Information: \n"+catalogo.allBook());
                break;

                case 6:
                    System.out.println("All Music Information: \n"+catalogo.allMusic());    
                break;

                case 7:
                break;
                default:
                System.out.println("Invalid Option");
                break;

            }
        }while(opc!=7);
        

    }
}