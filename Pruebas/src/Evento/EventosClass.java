
package Evento;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;

public class EventosClass extends JFrame{
    
    public static void main(String arg []){
        
    }
}

class LaminaBotones extends JPanel {
    JButton botonAzul = new JButton("Azul");
    JButton botonAmarillo = new JButton("Amarillo");
    JButton botonRojo = new JButton("Rojo");
    
    public LaminaBotones(){
        add(botonAzul);
        add(botonAmarillo);
        add(botonRojo);
        
        ColorFondo amarillo = new ColorFondo(Color.yellow);
        ColorFondo azul = new ColorFondo(Color.blue);
        ColorFondo rojo = new ColorFondo(Color.red);
        
        botonAzul.addActionListener(azul);
        botonAmarillo.addActionListener(amarillo);
        botonRojo.addActionListener(rojo);
                
    }
    
    class ColorFondo implements ActionListener{
    public ColorFondo(Color c){
        colorDeFondo = c;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        setBackground(colorDeFondo);
    }
    
 private Color colorDeFondo;
}      
            
}

