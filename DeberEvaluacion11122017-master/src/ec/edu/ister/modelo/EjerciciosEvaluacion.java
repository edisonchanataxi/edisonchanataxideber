
package ec.edu.ister.modelo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author edison chanataxi
 */
public class EjerciciosEvaluacion {
     public static void llenararreglo() {
    
    //Llenar un arreglo de 10 elementos con numeros pandemicos.
    int array[]=new int[10];
    for (int i=0; i<array.length; i++){
        array[i]=(int)(Math.random()*10);
       JOptionPane.showMessageDialog(null, array[i]);    
    }
    
}
     public static void Imprimir(){
         //Imprime el arreglo arrayTemperaturas almacenandolos previamente en el String
        String[] arrayTemperaturas={"Arreglo","De","Temperaturas"};
        String acu="";
        for (int i=0; i>arrayTemperaturas.length; i++){
             acu+=arrayTemperaturas[i]+" ";  
         }
         JOptionPane.showMessageDialog(null, acu);
             
     }
     public static void ordenar(){
         //ordenar el arreglo en orden ascendente utilizando una clase del JDK de java
         int array[]=new int[10];
    for (int i=0; i<array.length; i++){
        array[i]=(int)(Math.random()*10);
        Arrays.sort(array);
       JOptionPane.showMessageDialog(null, array[i]);    
     }
     }
     public static void maximo(){
         //retornar el maximo de un arreglo previamente convertido en un arraylist
              int array[]=new int[10];
    for (int i=0; i<array.length; i++){
        array[i]=(int)(Math.random()*10);
         List<Integer>arr=new ArrayList();
        
         arr=Arrays.asList(array[i]);
         Integer max=Collections.max(arr);
         JOptionPane.showMessageDialog(null, max);}
         
     }
public static void menu(){
    
    int op;
    
    do {   
        
       op=Integer.parseInt( JOptionPane.showInputDialog("Ingrese una opcion \n\n"
               + "Menu\n\n"
               + "1) Llenar el arreglo\n"
               + "2) Imprimir el arreglo String\n"
               + "3) Ordenar el arreglo\n"
               + "4) Hallar el maximo del arreglo\n"
               + "5) Salir\n\n"));
       
        
       switch(op){
           
           case 1:
               llenararreglo();
               break;
           case 2:
               Imprimir();
               break;
           case 3:
               ordenar();
               break;
           case 4:
               maximo();
               break;
                
       }
    } while (op!=5);
}
}
