package Evento;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;


public class Raton {
    
    public static void main(String [] arg ){
        Ventana2 goVentana= new Ventana2();
        goVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
        
}

class Ventana2 extends JFrame {
    public Ventana2(){
        setVisible(true);
        setBounds(1000, 100, 500, 500);
        addMouseMotionListener(new EventoMouse());
    }
}

    class EventoMouse implements MouseMotionListener{

    @Override
    public void mouseDragged(MouseEvent me) {
        System.out.println("Estas arrastrando el mouse");
    }

    @Override
    public void mouseMoved(MouseEvent me) {
        System.out.println("Estas moviendo el mouse");
    }

    
    
}