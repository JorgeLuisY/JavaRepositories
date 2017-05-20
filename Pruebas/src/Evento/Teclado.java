package Evento;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;


public class Teclado {
    
    
    public static void main(String [] arg ){
        Ventana goVentana= new Ventana();
        goVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
        
}

class Ventana extends JFrame {
    public Ventana(){
        setVisible(true);
        setBounds(1000, 100, 500, 500);
        addKeyListener(new EventoTeclado());
    }
}

class EventoTeclado implements KeyListener{

    @Override
    public void keyTyped(KeyEvent ke) {
      
    }

    @Override
    public void keyPressed(KeyEvent ke) {
       int codigo = ke.getKeyCode();
        System.out.println(codigo);
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        char letraPulsada = ke.getKeyChar();
        System.out.println(letraPulsada);
    }
    
}