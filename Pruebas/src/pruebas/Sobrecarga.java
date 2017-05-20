/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

/**
 *
 * @author pc
 */
public class Sobrecarga {
    
    int x;
    int y;
    
    public Sobrecarga(int x , int y){
        this.x = x ;
        this.y = y;
    }

    Sobrecarga() {
        
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")" ;
    }
    
  
    
    
}
