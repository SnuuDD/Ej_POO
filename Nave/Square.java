
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Square extends Figure {

	public Square() {
		super();

	}

	public Square(int x, int y) {
		super(x, y);
	}

	@Override
	public void paint(Graphics g) {
		// Dimension height = getSize();

		// Se selecciona la imagen que tenemos en el paquete de la //ruta del programa

		ImageIcon Img = new ImageIcon(getClass().getResource("Nave.jpg"));

		// se dibuja la imagen que tenemos en el paquete Images //dentro de un panel

		g.drawImage(Img.getImage(), x, y, height.width, height.height, null);

		setOpaque(false);
		super.paintComponent(g);
	}

}
