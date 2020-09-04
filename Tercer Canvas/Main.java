import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        MiVentana mw= new MiVentana();
        mw.setSize(1000,1000);
        mw.setVisible(true);
        mw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}