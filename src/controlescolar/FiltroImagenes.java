/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlescolar;
import javax.swing.filechooser.FileFilter;
import java.io.File;
/**
 *
 * @author USER
 */
public class FiltroImagenes extends FileFilter{
     public boolean accept(File f)
   {
      if( f.isDirectory() )      
         return true;
       
      String nombreArchivo = f.getName().toLowerCase();
      if( nombreArchivo != null )
         if( nombreArchivo.endsWith(".jpeg") ||
            nombreArchivo.endsWith(".jpg")  ||
            nombreArchivo.endsWith(".png")  ||
            nombreArchivo.endsWith(".gif")
           )
            return true;
       
      return false;    
   }
    
   //Descripcion del filtro (se mostrara en la ventana abrir)
   public String getDescription()
   {
      return "Archivos de imagenes ( *.jpg ,  *.png ,  *.gif )";
   }
}
