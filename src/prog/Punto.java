package prog;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Punto extends JPanel{
	static JButton punto;
	JLabel titulo;
	static JPanel panel2;
	
	public Punto(){
		//init();
		IniciarComponentes();

	}
	
	/*public void init() {
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	} */
		
	public void paintComponent(Graphics g) {
		super.paint(g);
		g.fillOval(CoordenadaX(Programa.zr*10), CoordenadaY(Programa.zi*10), 5, 5);		
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
		titulo.setBounds(10, 14, 221, 51); */
		
		punto= new JButton("Punto.");
		punto.setBounds(135, 505, 89, 23);
		
		panel2=new JPanel();
		panel2.setBounds(135, 505, 89, 23);
		panel2.setLayout(null);
			
		
	}
	
}
