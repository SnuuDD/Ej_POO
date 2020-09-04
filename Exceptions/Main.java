import java.util.Stack;
import java.util.EmptyStackException;
import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        Scanner xd=new Scanner(System.in);
        Stack<Integer> pila = new Stack<Integer>();
        int opc, cont=0,i;
        do{
        System.out.println("\n --- Exceptions ---");
        System.out.println("¿Que deseas hacer? ");
        System.out.println("1. Llenar el arreglo hasta la posicion 99 con numeros aleatorios");
        System.out.println("2. Llenar una pocision del arreglo con un numero");
        System.out.println("3. Vaciar el arreglo por completo");
        System.out.println("4. Quitar el ultimo valor del arreglo");
        System.err.println("5. Imprimir el arreglo");
        System.out.println("6. Salir");
        opc=xd.nextInt();
        xd.nextLine();
        
        switch(opc){
            case 1:
            cont=0;
            for(i=0;i<=98;i++){
                pila.push((int) (Math.random() * 10) + 1);
                cont++;
            }
            break;
            case 2:
            if(cont<100) {
                pila.push(xd.nextInt());
            } else {
                System.out.println("La pila esta llena, no puedes agregar datos");
            }
            break;
            case 3:
            while(!pila.isEmpty()){
                pila.pop();
                }
            break;   
            case 4:
            try{
            pila.pop();
            } catch (EmptyStackException e) {
                System.out.println("La pila esta Vacia, no puedes quitar datos");
            }
            break;
            case 5:
            System.out.println(pila.toString());
            break;
            default:
            System.out.println("No es una opcion valida");
            break;      
        }

        }while(opc!=6);

    }

}