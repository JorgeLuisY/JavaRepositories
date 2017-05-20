
package Evento;

import com.sun.java.accessibility.util.SwingEventMonitor;
import java.awt.event.WindowAdapter;
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
       marco2.addWindowListener(new M_Venta());
    }
}

class MarcoVentana extends JFrame {
    
    public MarcoVentana(){
        
        setVisible(true);
    }
    
}

class M_Venta extends WindowAdapter{

   
    @Override
    public void windowIconified(WindowEvent we) {
        System.out.println("Ventana Clausurada");
    }

}