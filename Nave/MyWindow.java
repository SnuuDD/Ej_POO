import java.awt.BorderLayout;
import javax.swing.JFrame;

public class MyWindow extends JFrame {
	private MyCanvas canvas;

	public MyWindow() {
		super();
		setLayout(new BorderLayout());

		canvas = new MyCanvas();
		add(canvas, BorderLayout.CENTER);
	}
}
