import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MiVentana extends JFrame implements ActionListener{
    CanvasPrueba canvas;
    JPanel panel;

    public MiVentana(){
        super();
        this.setLayout(new BorderLayout());
        

        panel = new JPanel();
        canvas = new CanvasPrueba();
        this.add(canvas, BorderLayout.CENTER);
    }
    @Override
    public void actionPerformed(ActionEvent event){
/*
        if(event.getSource()==boton1){
            System.out.println("Boton 1 Presionado");
            canvas.opc(1);
        }
        else if(event.getSource()==boton2){
            System.out.println("Boton 2 Presionado");
            canvas.opc(2);
        }
        else{
            canvas.setMsg(texto.getText());
            canvas.opc(3);

        }*/

    }
    
}