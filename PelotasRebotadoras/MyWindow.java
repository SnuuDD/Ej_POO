import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class MyWindow extends JFrame implements ActionListener{
	private MyCanvas canvas;
	JButton boton1;
    JPanel panel;

	public MyWindow() {
		super();
		setLayout(new BorderLayout());

		canvas = new MyCanvas();
		boton1 = new JButton("Boton 1");
		boton1.addActionListener(this);
		panel = new JPanel();
        panel.add(boton1); 
		add(canvas, BorderLayout.CENTER);
		this.add(panel, BorderLayout.SOUTH);
	}
	//@Override
    public void actionPerformed(ActionEvent event){

        if(event.getSource()==boton1){
            System.out.println("Boton 1 Presionado");
            canvas.opc(1);
    }
	}
}
