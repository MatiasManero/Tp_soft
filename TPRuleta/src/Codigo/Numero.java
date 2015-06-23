package Codigo;

public class Numero {
	
	private int numero;
	private boolean color;
	private int docena;
	private int apostado;
	private	boolean esPar;
	
	public Numero(int num,boolean esRojo,int apostado, int pertenece,boolean paridad){
		
		numero=num;
		color=esRojo;
		docena=pertenece;
		esPar=paridad;
		this.apostado= apostado;
	}	
	
	public int get_Numero(){
		
		return numero;
	}
	public boolean esRojo(){
		return color;
	}
	
	public int get_Decena(){
		return docena;
	}
	public int get_Apuesta(){
		return apostado;
	}
	public void set_Apuesta(int apuesta){
		if(apuesta>0)
		apostado=apostado+apuesta;
		else
		apostado=0;	
	}
	
	public boolean esPar(){
		return esPar;
	}
	
	
}
