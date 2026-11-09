package prog;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Plano2 extends JPanel{
	static JButton punto, circulo;
	JLabel titulo;
	static JPanel panel, panel2;
	public Plano2(){
		init();
		//IniciarComponentes();

	}
	
	public void init() {
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}
		
	public void paintComponent(Graphics g1) {
		super.paintComponent(g1);
		g1.setColor(Color.RED);
		//linea horizontal
		g1.drawLine(0, this.getHeight()/2, this.getWidth(), this.getHeight()/2);
		//linea vertical
		g1.drawLine(this.getWidth()/2, 0, this.getWidth()/2, this.getHeight());
		
		g1.drawOval(CoordenadaX(Programa.h), CoordenadaY(Programa.k*10), Programa.diametro+100, Programa.diametro+100);
	}

	
	private int CoordenadaX(int x) {
		int valorReal= x + this.getWidth()/2;
		return valorReal;
	}
	
	private int CoordenadaY(int y) {
		int valorReal= -y + this.getWidth()/2;
		return valorReal;
	}

	
}

