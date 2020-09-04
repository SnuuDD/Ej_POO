import java.awt.Graphics;

public class Circle extends Figure {

	public Circle() {
		super();
	}

	public Circle(int x, int y) {
		super(x, y);

	}

	@Override
	public void paint(Graphics g) {
		g.setColor(col);
		g.fillOval(x, y, size, size);
	}

}
