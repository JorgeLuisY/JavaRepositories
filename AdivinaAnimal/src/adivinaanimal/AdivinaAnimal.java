package adivinaanimal;

import arbol.Arbol;
import java.util.Scanner;

public class AdivinaAnimal {

    
    public static void main(String[] args) {
       if (si("Estas penando en un animal?")){
           System.out.println("Que animal es :");
       }
      
    }
    
    public static boolean si(String pregunta){
        Scanner respuesta = new Scanner(System.in);
        System.out.println(pregunta);
        respuesta.nextLine();
        return true;
        } 

}
