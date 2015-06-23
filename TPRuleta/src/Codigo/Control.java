package Codigo;

import java.util.EmptyStackException;

public class Control implements InterfaceControl {
	private Ruleta ruleta;
	private Tablero tablero;
	private int win;
	private int ficha;
	private int credit;
	private int jugado;
	
	
	public Control(Tablero tablero){
	
		this.tablero=tablero;
		ruleta = new Ruleta();
		ficha=50;
		credit=5000;
		jugado=0;
		
		
	}
	
	public void Girar(){
		win=ruleta.Spin();
		//ruleta.Limpiar_mesa();
		tablero.show_Num(win);
				
	}
	
	public void add_Bet(int num){
		if(credit-ficha>=0)
			{
		jugado=jugado+ficha;
		ruleta.Apostar(num,ficha);
		credit = credit - ficha;
		tablero.refresh_Credit(credit);
			}
		
	}
	
	public void set_Ficha(int ficha){
		this.ficha=ficha; 
	}
	
	public void cobrar(){
		credit=credit+ruleta.Pagar();
		tablero.refresh_Credit(credit);
		//ruleta.Limpiar_mesa();
		
	}
	
	public void restart(){
		ruleta.Limpiar_mesa();
		this.set_Ficha(50);
		credit=5000;
		tablero.refresh_Credit(credit);
		
	}
	
	public int get_Ficha(){
		return ficha;
	}
		
	public int get_Apuesta(int i){
		i=ruleta.get_Bet(i);
		if(i>0)
		return i;
		else{
			throw new EmptyStackException(); // VER ESTO
		}
		
	}
	public void clear_mesa(){
		ruleta.Limpiar_mesa();
		jugado=0;
	}
	public void devolver_Apuesta(){
		credit=credit+jugado;
		tablero.refresh_Credit(credit);
	}
}
