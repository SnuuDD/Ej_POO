import javax.swing.JFrame;

public class Main {
	public static void main(String args[]){
		MyWindow mw = new MyWindow();
		mw.setVisible(true);
		mw.setSize(700,700);
		mw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
