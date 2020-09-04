import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        MiVentana mw= new MiVentana();
        mw.setSize(500,500);
        mw.setVisible(true);
        mw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}