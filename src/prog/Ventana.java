package prog;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import prog.Programa;
import javax.swing.JPanel;
import javax.swing.JLabel;
public class Ventana extends JFrame  {
	
	public void Graf() {
		//ventana
		Ventana frame=new Ventana();	
		frame.setTitle("Punto");
		frame.setDefaultCloseOperation(Ventana.EXIT_ON_CLOSE);
		frame.setBounds(500,70,510,600);
		frame.setLayout(new BorderLayout());
		Programa.plano= new Plano();
		//Lineas 
		frame.add(Programa.plano, BorderLayout.CENTER);
		frame.setVisible(true);
	}
	

	
}

