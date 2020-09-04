
import java.awt.Graphics;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

public class Lista {
	private LinkedList<Figure> figuras;

	public Lista() {
		figuras = new LinkedList<Figure>();

	}

	public void figuAleatoria() {

		Random r = new Random();
		int n = r.nextInt(3);
		int rX = r.nextInt(999);
		int rY = r.nextInt(999);

		if (n == 0) {
			Figure newC = new Circle(rX, rY);
			figuras.add(newC);
			System.out.println("Circulo Creado");
		} else if (n == 1) {
			Figure newSq = new Square(rX, rY);
			figuras.add(newSq);
			System.out.println("Cuadrado Creado");
		} else if (n == 2) {
			Figure newTri = new Triangle(rX, rY);
			figuras.add(newTri);
			System.out.println("Triangulo Creado");
		}
	}

	public void newFigure(int x, int y) {
		Random r = new Random();
		int n = r.nextInt(3);

		if (n == 0) {
			Figure newC = new Circle(x, y);
			figuras.add(newC);
			System.out.println("Circulo Creado");
		} else if (n == 1) {
			Figure newSq = new Square();
			figuras.add(newSq);
			System.out.println("Cuadrado Creado");
		} else if (n == 2) {
			Figure newTri = new Triangle(x, y);
			figuras.add(newTri);
			System.out.println("Triangulo Creado");
		}

	}

	public void paint(Graphics g) {
		ListIterator<Figure> iter = figuras.listIterator();
		while (iter.hasNext()) {
			Figure a = iter.next();
			if (a instanceof Square) {
				Square otherA = (Square) a;
				otherA.paint(g);
			} else if (a instanceof Circle) {
				Circle otherA = (Circle) a;
				otherA.paint(g);
			} else {
				a.paint(g);
			}
		}
	}

}
