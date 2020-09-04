import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import java.awt.*;
import java.awt.event.*;

public class CanvasPrueba extends Canvas implements MouseListener{
    
    Pelota soyPelotaXD;
    private int opc;
    private String msg;

    CanvasPrueba() {
        super();
        soyPelotaXD = new Pelota();
        addMouseListener(this);
    }

    public void opc(int opc) {
        this.opc=opc;
        repaint();
     
      }
    
    public void setMsg(String msg){
        this.msg=msg;
    }

    public void paint(Graphics g) 
	{
		if(opc==1) 
		{
			soyPelotaXD.paint(g);
		}
		if(opc==2) 
		{
			g.drawLine(1500,1500,120,120);
		}
		if(opc==3) 
		{
			g.drawString(msg, 200, 200);
		}
		
		
    }
    public void mouseClicked(MouseEvent e)
	{
		soyPelotaXD.setX(soyPelotaXD.getX()+100);

	    repaint();
		      
	}

	@Override
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {	}

	
	
}
