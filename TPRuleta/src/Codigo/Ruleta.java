package Codigo; 
import java.util.Random;

// color rojo 37 , color negro 38 , par 39, impar 40, decena1 41 , decena2 42 , decena3 43  }
public class Ruleta {

	private Numero[] numero;
	private int win;
	private int win_pleno;
	private int win_parImpar;
	private int win_color;
	private int win_decena;
	private int docena;
	private boolean color; // ROJO = true , NEGRO = false 
	private boolean parImpar; // true = par , impar = false
	
	public Ruleta() //CONSTRUSTOR
{
		
		
	numero = new Numero[44];
	color=false;
	for (int i = 0; i < numero.length; i++) 
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
	
	
	public void Apostar(int num, int apuesta)
	{
		
		numero[num].set_Apuesta(apuesta); 
		
	}
	
	
	public void Limpiar_mesa()
	{
		for (int i = 0; i < numero.length; i++) 
		{
		numero[i].set_Apuesta(0);
		}
	}
	
	public int Pagar() // docena *3 , par *2 , color*2 
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
		
		
		return win_pleno+win_parImpar+win_decena+win_color; 
	}
	
	
	public int Spin()
	
	{
		Random  rnd = new Random();
		win = rnd.nextInt(37);
		return win;
	}
	public int get_Bet(int i){
		return numero[i].get_Apuesta();
		
		
	}
}
