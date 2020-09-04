import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MiVentana extends JFrame implements ActionListener{
    JButton boton1, boton2;
    JPanel panel;
    CanvasPrueba canvas;

    public MiVentana(){
        super();
        this.setLayout(new BorderLayout());

        boton1 = new JButton("Boton 1");
        boton1.addActionListener(this);
        boton2 = new JButton("Boton 2");
        boton2.addActionListener(this);

        panel = new JPanel();
        panel.add(boton1); 
        panel.add(boton2);
        canvas = new CanvasPrueba();
        this.add(panel, BorderLayout.SOUTH);
        this.add(canvas, BorderLayout.CENTER);
    }
    @Override
    public void actionPerformed(ActionEvent event){
        if(event.getSource()==boton1){
            System.out.println("Boton 1 Presionado");
            canvas.changeBackgroud();
        }
        if(event.getSource()==boton2){
            System.out.println("Boton 2 Presionado");
            canvas.backBlue();
        }

    }
}