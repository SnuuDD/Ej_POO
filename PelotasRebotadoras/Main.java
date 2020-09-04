import javax.swing.JFrame;

public class Main {
	public static void main(String args[]){
		MyWindow mw = new MyWindow();
		mw.setVisible(true);
		mw.setSize(500,500);
		mw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
