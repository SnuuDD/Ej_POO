import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Pelota {
	protected int x;
    protected int y;
    protected int dir;
	protected int size;
	protected Color col;
	public Pelota() {
		x = 0;
		y = 0;
        size = 20;
        dir=2;
	}

	public Pelota(int x, int y) {
		this.x = x;
        this.y = y;
        dir=2;
		size = 20;
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
    public int getDir() {
		return dir;
	}

	public void setDir(int dir) {
		this.dir = dir;
    }
    public void setColor(Color c){
        this.col=c;
    }

	public void paint(Graphics g){
        g.setColor(col);
		g.fillOval(x, y, size, size);
	}
	
}
