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

public class Ventana2 extends JFrame  {
	
	public void Graf() {
		//ventana
		Ventana2 frame=new Ventana2();	
		frame.setTitle("Circunferencia.");
		frame.setDefaultCloseOperation(Ventana2.EXIT_ON_CLOSE);
		frame.setBounds(500,70,510,600);
		frame.setLayout(new BorderLayout());
		Programa.plano2= new Plano2();
		//Lineas rojas
		frame.add(Programa.plano2, BorderLayout.CENTER);
		//frame.add(Circulo.circulo);
		frame.setVisible(true);
	}
	

	
}
