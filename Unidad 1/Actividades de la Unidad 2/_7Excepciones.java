
package excepciones;

import java.io.*;


public class _7Excepciones  {
    
    public static long numeroLineas(String fichero) throws IOException {

        long lNumeroLineas = 0;

        try{
            FileReader file = new FileReader(fichero);
            BufferedReader bf = new BufferedReader(file);
            
            while ((bf.readLine())!=null) {
                lNumeroLineas++;
            }
            
            bf.close();
        }
        catch(IOException ioe){
            throw new IOException("Error en la lectura del fichero",ioe);
        }        

        return lNumeroLineas;
    }

    public static void main(String[] args) {

        String fichero = "datos.txt";
        try {
            numeroLineas(fichero);
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
            ioe.printStackTrace();
        }


    }
}
