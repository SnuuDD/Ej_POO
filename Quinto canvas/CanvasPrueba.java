import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import java.awt.*;
import java.awt.event.*;
import java.lang.Thread;
import javax.swing.Timer;


public class CanvasPrueba extends Canvas implements MouseListener,KeyListener,ActionListener {
    Timer timer;
	Nave player1;
	Bloque b;
	Bala bala;
    private int opc;
	private String msg;
	private int r,y,x, direction;

    CanvasPrueba() {
		super();
		player1 = new Nave();
		r=player1.getR();
		y=player1.getY()+r/2;
		x=player1.getX();
		b=new Bloque();
		bala=new Bala(x,y);
		timer = new Timer(20, this);
		timer.start();
		direction=1;
		addMouseListener(this);
		addKeyListener(this);
    }

    public void opc(int opc) {
        this.opc=opc;
        repaint();
     
      }

	  
    public void setMsg(String msg){
        this.msg=msg;
    }

    public void paint(Graphics g) 
	{	Color r=new Color(0, 0, 0);
		this.setBackground(r);
		
		
		if(b!=null && bala!=null){
			bala.paint(g);
			b.paint(g);
		}player1.paint(g);
		/*if(opc==1) 
		{
			bala.paint(g);
			System.out.println("Se mueve"); 	
		}*/
	}

//Mover nave
@Override
    public void keyPressed(KeyEvent e) {

		//System.out.println("Key Pressed");
		int checaxi,checax,checaya,checay;
		if(e.getKeyCode()==37) 
        { 
			
			player1.setX(player1.getX()-5);
			checaxi=player1.getX();
			if(checaxi<=0){player1.setX(0);}
			
			repaint(); 
        } 
        else if(e.getKeyCode()==38) 
        { 
			player1.setY(player1.getY()-5);
			checaya=player1.getY()-r/2;
			if(checaya<=0){player1.setY(0+r/2);}
			repaint();

        } 
        else if(e.getKeyCode()==39) 
        { 
			player1.setX(player1.getX()+5);
			checax=player1.getX()+2*r;
			if(checax>=this.getWidth()){player1.setX(500-x-65);}
			repaint(); 
        } 
        else if(e.getKeyCode()==40) //Tecla Espacio
        { 
			player1.setY(player1.getY()+5);
			checay=player1.getY()+r*2+10;
			if(checay>=500){player1.setY(500-y-r+10);}
			repaint();
		}
		else if(e.getKeyCode()==32) 
        {
		if(b!=null && bala!=null){
		Color n=new Color(255,255,255);
		bala.setCol(n);	
		int xbala,size;
		//System.out.println(this.getWidth());
		xbala=bala.getX();
		size=bala.getR();
		if (direction==1) {
			//for(int i=bala.getX();i<=550;i+=10){
			bala.setX(bala.getX()+20);
			xbala=bala.getX()+bala.getR();
			repaint();
			if (xbala>=b.getX()){
				b = null;
				bala=null;
				repaint();
			}
			
			}
	}
} 
	}
    public void actionPerformed(ActionEvent d) {
		//d=false;
	}   
    
    public void mouseClicked(MouseEvent e)	{}

	@Override
	public void keyReleased(KeyEvent e) {}
	public void keyTyped(KeyEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {	}

	
	
}
