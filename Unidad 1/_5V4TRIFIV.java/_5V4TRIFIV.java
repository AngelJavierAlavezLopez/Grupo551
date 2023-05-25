package _5v4trifiv;
import funcionesgenerales.*;
import java.util.Scanner;

public class _5V4TRIFIV {

    public static void main(String[] args) {
      Scanner entrada=new Scanner(System.in);
      int numero;
        System.out.println("introduce un numero:");
        numero=entrada.nextInt();
        //contructor 
        ConversionesMultiplo variablenumero=new ConversionesMultiplo();
         variablenumero.retornamultiplo(numero);
         System.out.println(variablenumero.retornamultiplo(numero));
    }
    
}
