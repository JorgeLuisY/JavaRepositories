package Evento;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
        addMouseListener(new EventoMouse());
    }
}

class EventoMouse implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent me) {
        System.out.println("Haz hecho click"); 
    }

    @Override
    public void mousePressed(MouseEvent me) {
        System.out.println("Has pulsado el maouse");
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        System.out.println("Haz levantado el dedo");
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        System.out.println("Hacas de entrar");
    }

    @Override
    public void mouseExited(MouseEvent me) {
        System.out.println("Acabas de salir");
    }
    
}