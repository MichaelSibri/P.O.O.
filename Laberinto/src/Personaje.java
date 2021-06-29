
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

public class Personaje {
    private int x = 40;
    private int y = 40;
    private final int ancho = 40;
    private final int alto = 40;
    private final int movimiento = 40;
    private int x1 = 840;
    private int y1 = 440;
    
    
    public void paint(Graphics grafico){
        grafico.setColor(Color.red);
        grafico.fillOval(x, y, ancho, alto);
        grafico.setColor(Color.black);
        grafico.drawOval(x, y, ancho, alto);
        
    }
    public void dibujar(Graphics grafico1){
        grafico1.setColor(Color.red);
        grafico1.fillOval(x1, y1, ancho, alto);
        grafico1.setColor(Color.black);
        grafico1.drawOval(x1, y1, ancho, alto);
    }
    
    public void clicPrecionado(MouseEvent e, Graphics grafico){
        if (e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK) {
            grafico.setColor(Color.red);
            grafico.fillOval(80, 80, ancho, alto);
            grafico.setColor(Color.black);
            grafico.drawOval(80, 80, ancho, alto);
           
        }
    }
    
}
