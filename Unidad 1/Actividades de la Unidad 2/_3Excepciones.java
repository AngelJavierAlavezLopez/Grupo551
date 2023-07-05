
package excepciones;

public class _3Excepciones {
    public static void main(String[] args) {
        
        
        try {
            float equis=5/0;
            System.out.println(" equis = " +equis);
        } catch (ArithmeticException e) {
            System.out.println("Erro: división entre cero");
            
        }finally{ //si se genera un error despues de ejecutar el codigo del bloque catch ejecuta el codigo de bloque finally
            System.out.println("A pesar de todo, se ejecuta el bloque finally");
        }
        
    }
}
