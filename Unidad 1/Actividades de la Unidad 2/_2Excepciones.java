
package excepciones;
import javax.swing.*;
public class _2Excepciones {
     public static void main(String[] args) {
         
         int x,y;
         try {
             
             x= Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese numero 1:","solicita datos",3)); 
             y= Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese numero 2:","solicita datos",3));
             JOptionPane.showMessageDialog(null, "La divicion de" +x+ "/" +y+ "es:" +(x/y),"Mostrando resultado",1);
         } catch (NumberFormatException n) {
              System.out.println( n.getMessage() + " No es un Numero Entero.");
             
         }catch(ArithmeticException a){
             System.out.println(a.getMessage() + " No se puede dividir entre 0.");
         }
         
         
         
         
         
         
         
         
         
         
     }
    
}
