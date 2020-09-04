import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class CanvasPrueba extends Canvas{
    
    String msg="Este mensaje se imprimio";

    CanvasPrueba() {
        super();
    }

    public void changeBackgroud(){
        Random random = new Random();
        Color atras=new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255));
        this.setBackground(atras);
        repaint();
    }
    public void backBlue(){
        Color atras=new Color(66,173,244);
        this.setBackground(atras);
        repaint();
    }

    public void paint(Graphics g){
        repaint();
        g.drawString(msg,200,255);
    }
}