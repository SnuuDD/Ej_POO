import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyCanvas extends Canvas implements KeyListener, MouseListener {
	private Lista listFiguras;
	private int x, y;

	MyCanvas() {
		super();
		listFiguras = new Lista();
		x = 0;
		y = 0;
		addKeyListener(this);
		addMouseListener(this);
	}

	public void paint(Graphics g) {

		listFiguras.paint(g);

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			System.out.println("New Object");
			listFiguras.figuAleatoria();
		}
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == this) {
			this.x = e.getX();
			this.y = e.getY();
			listFiguras.newFigure(x, y);
			repaint();
		}
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

	