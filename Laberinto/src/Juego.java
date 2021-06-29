


import static java.awt.AWTEventMulticaster.add;
import static java.awt.AWTEventMulticaster.add;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Juego extends JPanel {
    
    Laberinto laberinto = new Laberinto();
    Personaje personaje = new Personaje();
    

    public Juego() {
        addMouseMotionListener(new MouseMotionListener(){
            public void mouseDragged(MouseEvent e, Graphics grafico) {
                personaje.clicPrecionado(e, grafico);

            }

            @Override
            public void mouseMoved(MouseEvent e) {
                

            }

            @Override
            public void mouseDragged(MouseEvent e) {
            }
        });
        setFocusable(true);
    }

  
    
    
    
      @Override
    public void paint(Graphics grafico){
        laberinto.paint(grafico);
        personaje.paint(grafico);
        personaje.dibujar(grafico);
    }
    
    
    
    
    
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Laberinto");
        Juego game = new Juego();
        ventana.add(game);
        ventana.setSize(920, 540);
        ventana.setLocation(300, 200);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

    

    
        
    
    
}
