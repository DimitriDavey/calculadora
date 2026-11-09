package prog;
import javax.swing.JButton;
import javax.swing.*;
import java.awt.*;

//ya funciona la n derivada, hacer grafica

public class Programa {
	public static int diametro=9, h=3, k=8, zr=3, zi=9;
	
	public static Plano plano;
	public static Plano2 plano2;

	public static void main(String[] args) {
		Derivar der= new Derivar();
		der.PedirValores();
		
		String funcion="";
		String res= "2pi*i/n^";
		String val="", let="+";
		diametro= der.r*2;
		h=der.realh;
		k=der.imaginariok;
		zr=der.realz;
		zi=der.imaginarioz;
		if(der.imaginarioz<0)
			let="-";
		
		if(der.Comprobar()) 
		{
			System.out.println("Es derivable dentro y sobre la curva r.");
			//funcion=der.GetFuncion();
			//der.SetFuncion(funcion);
			val=der.GetFuncion();
			if(val.startsWith("ln(z)") || val.startsWith("senh(z)") || val.startsWith("e^z"))
			{
				
				if(val.startsWith("ln(z)") )//== "ln(z)")
					System.out.println("Resultado: 2pi*i/"+ (der.n-1) +"!*-6/"+(der.n-1)+"!*("+ der.realz+ let+der.imaginarioz+"i)^4");
				if(val.startsWith("senh(z)"))
					System.out.println("Resultado: 2pi*i/"+(der.n-1) +"!*cosh("+ der.realz+ let+der.imaginarioz+"i)");
				if(val.startsWith("e^z"))
					System.out.println("Resultado: 2pi*i/"+(der.n-1) +"!*e^("+ der.realz+ let+der.imaginarioz+"i)");
			}
			else 
			{	
				for(int i=0; i<der.n-1; i++)
				{
					der.SetFuncion(funcion=der.GetFuncion());
					der.DerivaFuncion();
					System.out.println("Derivada "+ (i+1) +": "+ der.GetFuncion());
					
				}
				System.out.println("2pi*i/n^"+der.n+"*"+ der.GetFuncion()+Concatena(der) );
				//System.out.println("Resultado: 2pi*i/n^"+der.n +"* " + der.GetFuncion());
			}
		}
		else
			System.out.println("No es derivable dentro y sobre la curva r.");		
		Ventana frame=new Ventana();
		frame.Graf();	
}	
	
	public static String Concatena(Derivar der) {
		String funcion=der.GetFuncion()+" ", fun2="";
		
		int indx= funcion.indexOf("z")+1,i;
		for(i=0; i<indx; i++)
		{
			fun2+=funcion.charAt(indx);
		}
		fun2+= "("+der.realz;
		if(der.imaginarioz >=0)
			fun2+="+"; 
		fun2+=der.imaginarioz + "i)";
		return fun2;
	}
	
	
}
