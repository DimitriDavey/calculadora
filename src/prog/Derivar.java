package prog;

import java.util.Scanner;
import org.lsmp.djep.djep.DJep;
import org.nfunk.jep.Node;
import org.nfunk.jep.ParseException;


public class Derivar {
	Scanner entrada= new Scanner(System.in);
	int n,r;
	int realz, imaginarioz;//Z
	int realh, imaginariok;// h+ki
	private String funcion=""; //f(z) 
	
	DJep djep;
	Node nodoFuncion;
	Node nodoDerivada;
	public int cont=0;
	public void SetFuncion(String funcion) { //Asignar la funcion
		this.funcion= funcion;
	}
	
	public String GetFuncion() {	//Devulve la funcion derivada
		return this.funcion;
	}
	
	public void DerivaFuncion() {		
		try
		{
			this.djep= new DJep();
			this.djep.addStandardFunctions();
			this.djep.addStandardConstants();
			this.djep.addComplex();//numeros complejos 
			this.djep.setAllowUndeclared(true); //variables no declaradas
			this.djep.setAllowAssignment(true); //variables declaradas
			this.djep.setImplicitMul(true);
			this.djep.addStandardDiffRules(); //Reglas de diferenciacion
			
			this.nodoFuncion= this.djep.parse(this.funcion);
			
			Node diff= this.djep.differentiate(nodoFuncion, "z"); 
			this.nodoDerivada= this.djep.simplify(diff);
			this.funcion= this.djep.toString(this.nodoDerivada);
			
		} 
		catch(ParseException e) 
		{
			System.out.println("Eror."+ e.getErrorInfo());
		}
		
	}
	
	
	public void PedirValores() {
		System.out.print("Introduce el valor de n: ");
		n= entrada.nextInt();
		System.out.print("Introduce el valor real de Z: ");
		realz= entrada.nextInt();
		System.out.print("Introduce el valor imaginario de Z: ");
		imaginarioz= entrada.nextInt();
		System.out.print("Introduce el valor de h: ");
		realh= entrada.nextInt();
		System.out.print("Introduce el valor de ki: ");
		imaginariok= entrada.nextInt();
		System.out.print("Introduce f(z): ");
		funcion= entrada.next();
		funcion.trim();
		System.out.print("Introduce el valor de r: ");
		r= entrada.nextInt();
	}
	
	public boolean Comprobar() {
		int limsuprealh=0,  liminferealh=0, limsupimgk=0, liminfeimgk=0;
		if(this.realh>0)
		{
			limsuprealh= this.realh + this.r;//limite superior
			liminferealh= this.realh - this.r;//limite inferior
			//System.out.println("1. limite s: "+ limsuprealh+ " limite i: "+ liminferealh);

		}
		if(this.imaginariok>0)
		{
			limsupimgk= this.imaginariok + this.r;//limite superior
			liminfeimgk= this.imaginariok - this.r;//limite inferior
			//System.out.println("1.2 limite s: "+ limsupimgk+ " limite i: "+ liminfeimgk);


		}
		if(this.realh<0)
		{
			liminferealh= (this.realh + this.r);//* -1; //limite inferior
			limsuprealh= this.realh - this.r;//limite superior
			//System.out.println("2 limite s: "+ limsuprealh+ " limite i: "+ liminferealh);
		}
		if(this.imaginariok<0)
		{
			int a,b;
			liminfeimgk= (this.imaginariok + this.r);//*-1; //limite inferior
			limsupimgk= this.imaginariok - this.r;//limite superior
			
			if(liminfeimgk > limsupimgk)
			{	
				a=liminfeimgk;
				b=limsupimgk;
				limsupimgk=a;
				liminfeimgk=b;
			}
			//System.out.println("2.1 limite s: "+ limsupimgk+ " limite i: "+ liminfeimgk);
		}
		
		if(this.realz>=liminferealh && this.realz<=limsuprealh)
		{
			
			if(this.imaginarioz>=liminfeimgk && this.imaginarioz<=limsupimgk || (this.imaginarioz==0 && this.imaginarioz==0))
				return true; 
			else
				return false;
		}
		else
			return false;
	
	}
	

}

