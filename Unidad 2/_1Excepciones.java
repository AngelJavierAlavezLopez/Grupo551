
package excepciones;
import javax.swing.*;
public class _1Excepciones {

    public static void main(String[] args) {
        
        int x,y;
        
        
        try {
              x= Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese numero 1:","solicita datos",3));
              //eror solo con la variable, para arreglarlo le metenemos un try catch para mandar a imprimir que no es un dato de tipo numero.
        } catch (NumberFormatException n) {
            System.out.println( n.getMessage() + " No es un Numero Entero.");
        }
  
    }
    
}
