import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MiVentana extends JFrame implements ActionListener{
    JButton boton1, boton2;
    JPanel panel;
    JTextField texto;
    CanvasPrueba canvas;

    public MiVentana(){
        super();
        this.setLayout(new BorderLayout());
        //Boton1
        boton1 = new JButton("Boton 1");
        boton1.addActionListener(this);
        //Boton2
        boton2 = new JButton("Boton 2");
        boton2.addActionListener(this);

        texto = new JTextField();
        texto.addActionListener(this);
        getContentPane().add(texto);

        panel = new JPanel();
        panel.add(boton1); 
        panel.add(boton2);
        canvas = new CanvasPrueba();
        this.add(texto, BorderLayout.NORTH);
        this.add(panel, BorderLayout.SOUTH);
        this.add(canvas, BorderLayout.CENTER);
    }
    @Override
    public void actionPerformed(ActionEvent event){

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

        }

    }
    
}