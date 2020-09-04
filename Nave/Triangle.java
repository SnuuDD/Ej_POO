import java.awt.Color;
import java.awt.Graphics;

public class Triangle extends Figure {
	private int x2, x3, y2, y3;

	public Triangle() {
		super();

		x2 = x + 50;
		y2 = y;

		x3 = x + 25;
		y3 = y - 50;
	}

	public Triangle(int x, int y) {
		super(x, y);
		this.x2 = x + 50;
		this.y2 = y;

		this.x3 = x + 25;
		this.y3 = y - 50;
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(col);
		g.fillPolygon(new int[] { x, x2, x3 }, new int[] { y, y2, y3 }, 3);

	}

}
