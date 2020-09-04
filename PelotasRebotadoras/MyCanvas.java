import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;

public class MyCanvas extends Canvas implements KeyListener, MouseListener, ActionListener{
	private Lista listPelotas;
	private int x, y;
	Timer timer;
	private int opc;
	MyCanvas() {
		super();
		//im=new BufferedImage(500,500,BufferedImage.TYPE_INT_RGB);
		listPelotas = new Lista();
		x = 0;
		y = 0;
		//rect = this.getBounds();
		timer = new Timer(20, this);
		timer.start();
		addKeyListener(this);
		addMouseListener(this);
	}

	public void paint(Graphics g) {
		setBackground(Color.PINK);
		listPelotas.mover(this.getWidth(),this.getHeight());
		listPelotas.paint(g);
		if(opc==1) 
		{
			listPelotas.delFigure();
			repaint();
			opc=0;
		}

	}
	public void opc(int opc) {
        this.opc=opc;
        repaint();
     
      }

	@Override
	public void keyPressed(KeyEvent e) {}

	@Override
	public void keyReleased(KeyEvent e) {}

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getButton() == MouseEvent.BUTTON1) {
			this.x = e.getX();
			this.y = e.getY();
			for(int i=0;i<=10;i++){
			listPelotas.newFigure(x, y);}
			listPelotas.mover(this.getWidth(),this.getHeight());
			repaint();
		}
		if (e.getButton() == MouseEvent.BUTTON3) {
			listPelotas.delFigure();
			repaint();
		}
	}
	public void actionPerformed(ActionEvent e) {	
		repaint();

	}   

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}

}

	