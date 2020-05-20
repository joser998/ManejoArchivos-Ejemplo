package utileria;
import java.io.*;
public class Archivo {
    
    /* Metodo para crear un archivo */
    public static void crearArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter (archivo); //--Se abre flujo para escribir en el archivo
            salida.close(); //--Se cierra flujo para escribir en el archivo
            System.out.println("El Archivo se ha creado correctamente..."); //--Notificacion de que se ha creado un archivo exitosamente.
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out); //--Para que nos muestre el compilador los errores en caso de que no se pueda escribir en el archivo
        }
    }
    
    /* Una vez que ya tenemos nuestro archivo abierto es cuando ya podemos agregar informacion en este */
    
    /* Este metodo va a agregar contenido 'String contenido' 
        Posteriormente se guardar la informacion en el archivo: salida.println(contenido);
        Y se agrega tambien la cadena de fin de escritura: salida.println("Fin de Escritura...");
        
    */
    public static void escribirArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter (archivo);
            String contenido = "Contenido a Escribir en el Archivo...";
            salida.println(contenido);
            salida.println(); //--Agregamos un salto de linea
            salida.println("Fin de Escritura...");
            salida.close();
            System.out.println("Se ha escrito correctamente el Archivo...");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    /* Este metodo lee lo que ya se halla escrito en el archivo */
    public static void leerArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo)); //--Este objeto BufferedReader nos permite leer lineas completas del archivo
            String lectura = entrada.readLine(); //--Esto es para leer solamente una linea del archivo
            
            while(lectura!=null){ //--Mientras que la linea leida sea diferente de null que presente por consola el contenido del archivo
                System.out.println(lectura);
                lectura = entrada.readLine(); //--Se vuelve a leer informacion del archivo, se lee toda la informacion del archivo, mientras sea diferente de null
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    
    public static void anexarArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter (new FileWriter (archivo, true));
            String contenido = "Anexando informacion al Archivo";
            salida.println(contenido);
            salida.println("Fin de Anexar");
            salida.close();
            System.out.println("Se ha anexado la informacion al Archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}