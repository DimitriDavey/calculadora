package prog;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Circulo extends JPanel{
	static JButton circulo;
	JLabel titulo;
	static JPanel panel;
	
	public Circulo(){
		//init();
		IniciarComponentes();

	}
	
	/*public void init() {
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	} */
		
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawOval(CoordenadaX(Programa.h*10), CoordenadaY(Programa.k*10), Programa.diametro+10, Programa.diametro+10);

		
	}
	
	private int CoordenadaX(int x) {
		int valorReal= x + this.getWidth()/2;
		return valorReal;
	}
	
	private int CoordenadaY(int y) {
		int valorReal= -y + this.getWidth()/2;
		return valorReal;
	}

	
	public void IniciarComponentes() {
		/*titulo=new JLabel("");
		//titulo.setFont(new Font("punto", Font.PLAIN, 40));
		titulo.setBounds(10, 14, 221, 51);*/
		
		
		circulo= new JButton("Circunferencia.");
		circulo.setBounds(10, 505, 125, 23);
		panel=new JPanel();
		panel.setBounds(10, 505, 125, 23);
		panel.add(circulo);
		panel.setLayout(null);
			
		
	}
	
}
