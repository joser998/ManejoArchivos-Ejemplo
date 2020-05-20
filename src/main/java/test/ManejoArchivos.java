package test;
import static utileria.Archivo.*;
public class ManejoArchivos {
    public static void main(String[] args) {
        /* Le indicamos al compilador que se creara un archivo mediante el metodo de la clase Archivo, llamando el metodo 
            crearArchivo de esa misma clase y pasandole como parametro la variable que contiene la direccion de donde se
            creara este nuevo archivo...
        
            Nosotros unicamente creamos la carpeta tal cual la direccion de la variable nombreArchivo y el Java se encarga
                de crear el archivo en este caso el txt de nombre: archivoPruebaJava
        */
        String nombreArchivo = "c:\\pruebaJava\\archivoPruebaJava.txt";
        //Creamos un Archivo
    //    crearArchivo(nombreArchivo);
        
        //Escribimos en el archivo
   //     escribirArchivo(nombreArchivo);
        
        //Leer informacion de un Archivo
    //    leerArchivo(nombreArchivo);
    
    
        //Anexar informacion al Archivo
        anexarArchivo(nombreArchivo);
        
        //leer del archivo
        leerArchivo(nombreArchivo);
    }
}
