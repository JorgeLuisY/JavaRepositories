
package Evento;

import com.sun.java.accessibility.util.SwingEventMonitor;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.*;

public class Ventanas {
   
    public static void main(String []arg){
       MarcoVentana mimarco = new MarcoVentana();
       mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       MarcoVentana marco2 = new MarcoVentana();
       marco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       mimarco.setTitle("V1");
       marco2.setTitle("V2");
       mimarco.setBounds(500,300,500,200);
       marco2.setBounds(300,200,500,200);
       
    }
}

class MarcoVentana extends JFrame {
    
    public MarcoVentana(){
        
        setVisible(true);
        M_Venta miv = new   M_Venta();
        addWindowListener(miv);
    }
    
}

class M_Venta implements WindowListener{

    
    
    @Override
    public void windowOpened(WindowEvent we) {
     }

    @Override
    public void windowClosing(WindowEvent we) {
       }

    @Override
    public void windowClosed(WindowEvent we) {
     }

    @Override
    public void windowIconified(WindowEvent we) {
        System.out.println("Ventana Clausurada");
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
     }

    @Override
    public void windowActivated(WindowEvent we) {
       }

    @Override
    public void windowDeactivated(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}