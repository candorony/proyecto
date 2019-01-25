/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modificar;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Rony
 */
public class Modificar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
         Scanner sc=new Scanner (System.in);
         
        String nombreArchivo;
        System.out.println("Ingrese nombre del archivo a modificar : ");
        nombreArchivo=sc.next();
         PrintStream console = System.out;
    File file = new File("C:\\Users\\Rony\\Documents\\archivosdatos\\"+nombreArchivo+".txt");
 if (file.exists()) {
     System.out.println("ingrese tectox");
     String s=sc.next();
      FileOutputStream fos = new FileOutputStream(file);

    PrintStream ps = new PrintStream(fos);
    System.setOut(ps);
     
    System.out.println(s);

   
                }else {
                    JOptionPane.showMessageDialog(null, "NOMBRE DEL USUARIO NO ES CORRECTO ");
                }

   
    }
    
}
