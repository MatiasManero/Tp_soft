package Codigo; 
import java.util.Random;

// color rojo 37 , color negro 38 , par 39, impar 40, decena1 41 , decena2 42 , decena3 43  }
public class Modelo {

	private	View view;
	private Numero[] numero;
	private int win,win_pleno,win_parImpar,win_color,win_decena,docena;
	private boolean color; // ROJO = true , NEGRO = false 
	private boolean parImpar; // true = par , impar = false
	private int ficha,credit,jugado;
	
	
	public Modelo(View view) //CONSTRUSTOR
{
	this.view=view;
	
	ficha=50;
	credit=5000;
	jugado=0;
	
	numero = new Numero[44];
	color=false;
	

	numero[0]= new Numero(0,true,0,0,true);
	
	for (int i = 1; i < numero.length; i++) 
	{
		if(i%2==0)
			parImpar=true;
		else
			parImpar=false;
		
		if(i<=12)
			docena = 1;
		else if(12<i && i<=24)
			docena = 2; 
		else
			docena = 3;
					
		if(i<=10 || (i>=19 && i<=28) )
		{
			color=!color;
			numero[i]= new Numero(i,color,0,docena,parImpar);
		}
		else 
		{
			
			numero[i]= new Numero(i,color,0,docena, parImpar);
			color=!color;
		}
	}
		
}
	
	
	public void Apostar(int num)
	{
		if(credit-ficha<0){
			
			System.out.println("Credito insuficiente");
			//throw new Ilega
		}
		
		else{
		numero[num].set_Apuesta(ficha);
		credit=credit-ficha;
		jugado=jugado+ficha;
		view.refresh_Credit(credit);
		int aux=numero[num].get_Apuesta();
		view.add_ficha(num,aux);
		}
		
	}
	
	
	public void set_ficha(int ficha){
		
		this.ficha=ficha;
		
		switch(ficha){
		
		case 50:view.cambiar_ficha(true, false, false);break;
		case 100:view.cambiar_ficha(false, true, false);break;
		case 500:view.cambiar_ficha(false, false, true);break;
		}
	
	}
	
	public void Limpiar_mesa()
	{
		for (int i = 0; i < numero.length; i++) 
		{
		numero[i].set_Apuesta(0);
		}
		
		view.Clear_table();
		view.refresh_Credit(credit);
		
	}
	
	public void Pagar() // docena *3 , par *2 , color*2 
	{
		if (win == 0) 
		{
			win_pleno = numero[win].get_Apuesta()*36;
			credit=credit+win_pleno;
		}
		else
		{
			win_pleno = numero[win].get_Apuesta()*36;
			
			if(numero[win].esPar())
				win_parImpar = numero[39].get_Apuesta()*2;
			else
				win_parImpar = numero[40].get_Apuesta()*2;
			
			win_decena =  numero[numero[win].get_Decena()+40].get_Apuesta()*3;
			
			if(numero[win].esRojo())
				win_color = numero[37].get_Apuesta()*2;
			else
				win_color = numero[38].get_Apuesta()*2;
			
			credit=credit+win_pleno+win_parImpar+win_decena+win_color;
		}
		
		jugado=0;
		
		Limpiar_mesa();
		
		
	}
	
	
	public void Spin()
	
	{
		Random  rnd = new Random();
		//tiempo
		win = rnd.nextInt(37);
		view.show_Num(win);
		//tiempo
	}
	
	public int get_Bet(int i){
		return numero[i].get_Apuesta();
		
	}
	
	public void return_apuesta(){
		credit=credit+jugado;
		view.Clear_table();
		jugado=0;
		view.refresh_Credit(credit);
	}
	
	public void reiniciar(){
		ficha=50;
		set_ficha(ficha);
		credit=5000;
		jugado=0;
		Limpiar_mesa();
		view.Clear_table();
		view.refresh_Credit(credit);

	}
	
	public Numero get_Numero(int num){
		
		return numero[num];
	}
	
}
