import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

public class Lista {
	private LinkedList<Pelota> pelotas;

	public Lista() {
		pelotas = new LinkedList<Pelota>();
	}

	public void newFigure(int x, int y) {
		
		
		
		
		Pelota newPelota = new Pelota(x, y);
		Random e = new Random();
		Color col = new Color(e.nextInt(255), e.nextInt(255), e.nextInt(255));
		newPelota.setColor(col);
		pelotas.add(newPelota);
		
			System.out.println("Pelota Creado");

	}
	public void mover(int x,int y){
		ListIterator<Pelota> iter = pelotas.listIterator();
		int xtemp,ytemp;
		while (iter.hasNext()) {
			Pelota atemp = iter.next();
			if (atemp instanceof Pelota) {
				Pelota a = (Pelota) atemp;
				if (a.getDir() == 1){
					xtemp=a.getX();	xtemp=xtemp-10;a.setX(xtemp);
					ytemp=a.getY();	ytemp=ytemp-10;a.setY(ytemp);
					if (a.getX() <= 0)
						a.setDir(2);
					if (a.getY() <= 0)
						a.setDir(4);
				}
				if (a.getDir() == 2){
					xtemp=a.getX();	xtemp=xtemp+10;a.setX(xtemp);
					ytemp=a.getY();	ytemp=ytemp-10;a.setY(ytemp);
					if (a.getX() >= (x - 10))
						a.setDir(1);
					if (a.getY() == 0)
						a.setDir(3);
				}
				if (a.getDir() == 3){
					xtemp=a.getX();	xtemp=xtemp+10;a.setX(xtemp);
					ytemp=a.getY();	ytemp=ytemp+10;a.setY(ytemp);
					if (a.getX() >= (x - 10))
						a.setDir(4);
					if (a.getY() >= (y - 10))
						a.setDir(2);
				}
				if (a.getDir() == 4){
					xtemp=a.getX();	xtemp=xtemp-10;a.setX(xtemp);
					ytemp=a.getY();	ytemp=ytemp+10;a.setY(ytemp);	
					if (a.getX() <= 0)
						a.setDir(3);
					if (a.getY() >= (y -10))
						a.setDir(1);				
				}
				//a.paint(g);
				}
				
			}
	}
	public int tolalPelo() {
		int i=0;
		ListIterator<Pelota> iter = pelotas.listIterator();
		while (iter.hasNext()) {
			i++;
			}
		return i;

	}
	public boolean delFigure(){
		//ListIterator<Pelota> iter = pelotas.listIterator();
		pelotas.removeLast();
			//repaint();
			return true;
	}

	public void paint(Graphics g) {
		ListIterator<Pelota> iter = pelotas.listIterator();
		while (iter.hasNext()) {
			Pelota a = iter.next();
			if (a instanceof Pelota) {
				Pelota temp = (Pelota) a;
				temp.paint(g);
			}
		}
	}

}
