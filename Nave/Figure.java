import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public abstract class Figure {
	protected int x;
	protected int y;
	protected Random e = new Random();
	protected Color col = new Color(e.nextInt(255), e.nextInt(255), e.nextInt(255));
	protected int size;

	public Figure() {
		x = 0;
		y = 0;
		size = 50;
	}

	public Figure(int x, int y) {
		this.x = x;
		this.y = y;
		size = 50;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public abstract void paint(Graphics g);
}
