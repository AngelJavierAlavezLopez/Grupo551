package _6mayormenor;
import menoromayor.tienesmasomenosde18;
import java.util.Scanner;
public class _6MAYOROMENOR {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
      byte numero;
        System.out.println("introduce un numero:");
        numero=entrada.nextByte();
        //contructor 
        tienesmasomenosde18 variabledad=new tienesmasomenosde18();
         variabledad.retornamultiplo(numero);
         System.out.println(variabledad.retornamultiplo(numero));
    }
    
}
