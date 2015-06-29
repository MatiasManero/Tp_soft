package Codigo; 
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;

import BeatModel.BPMObserver;
import BeatModel.BeatModelInterface;
import BeatModel.BeatObserver;

// color rojo 37 , color negro 38 , par 39, impar 40, decena1 41 , decena2 42 , decena3 43  }
public class Modelo implements	BeatModelInterface {

	private File a;
	private Clip sonido;
	private	View view;
	private Numero[] numero;
	private int win,win_pleno,win_parImpar,win_color,win_docena,docena;
	private boolean color; // ROJO = true , NEGRO = false 
	private boolean parImpar; // true = par , impar = false
	private int ficha,credit,jugado, ganado;
	private ArrayList beatObservers = new ArrayList();
	private ArrayList bpmObservers = new ArrayList();
	
	
	

	public Modelo() {
		
	ficha=50;
	credit=5000;
	jugado=0;
	numero = new Numero[44];
	color=false;
	Load();
	
	}
	
	//----------------------SE CREAN LOS NUMEROS------------------------//
	public void Load(){
		
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
			JOptionPane.showMessageDialog(null,"                      Credito Insuficiente", "WARNING", JOptionPane.PLAIN_MESSAGE);

			//throw new Ilega
		}
		
		else{
		numero[num].set_Apuesta(ficha);
		credit=credit-ficha;
		jugado=jugado+ficha;
		((View) beatObservers.get(1)).refresh_Credit(credit);
		int aux=numero[num].get_Apuesta();
		((View) beatObservers.get(1)).add_ficha(num,aux);
		}
		
	}
	
	
	public void set_ficha(int ficha){
		
		this.ficha=ficha;
		
		switch(ficha){
		
		case 50:((View) beatObservers.get(1)).cambiar_ficha(true, false, false);break;
		case 100:((View) beatObservers.get(1)).cambiar_ficha(false, true, false);break;
		case 500:((View) beatObservers.get(1)).cambiar_ficha(false, false, true);break;
		}
	
	}
	
	public void Limpiar_mesa()
	{
		for (int i = 0; i < numero.length; i++) 
		{
		numero[i].set_Apuesta(0);
		}
		
		((View) beatObservers.get(1)).Clear_table();
		((View) beatObservers.get(1)).refresh_Credit(credit);
		
	}
	

	
	public void Pagar() // docena *3 , par *2 , color*2 
	{
		if (win == 0) 
		{
			win_pleno = numero[win].get_Apuesta()*36;
			ganado=win_pleno;
			credit=credit+ganado;
		}
		else
		{
			if(win>0 && win<=36) // Agrego Lavezzi
			win_pleno = numero[win].get_Apuesta()*36;
			
			if(numero[win].esPar())
				win_parImpar = numero[39].get_Apuesta()*2;
			else
				win_parImpar = numero[40].get_Apuesta()*2;
			
			if(win>1 && win<=36)// Agrego Lavezzi
			win_docena =  numero[numero[win].get_Decena()+40].get_Apuesta()*3;
			
			if(numero[win].esRojo())
				win_color = numero[37].get_Apuesta()*2;
			else
				win_color = numero[38].get_Apuesta()*2;
			
			ganado=win_pleno+win_parImpar+win_docena+win_color;
			credit=credit+ganado;
		}
		
		jugado=0;
		
		Limpiar_mesa();
		
	}
	
	
	public void Spin()
	
	{
		Random  rnd = new Random();
		
		win = this.set_win(rnd.nextInt(37));
		((View) beatObservers.get(1)).show_Num(win);
		
	}
	
	
	public int get_Bet(int i){
		return numero[i].get_Apuesta();	
	}
	
	public void return_apuesta(){
		credit=credit+jugado;
		((View) beatObservers.get(1)).Clear_table();
		jugado=0;
		Limpiar_mesa();
		((View) beatObservers.get(1)).refresh_Credit(credit);
	}
	
	public void reiniciar(){
		ficha=50;
		set_ficha(ficha);
		credit=5000;
		jugado=0;
		Limpiar_mesa();
		((View) beatObservers.get(1)).Clear_table();
		((View) beatObservers.get(1)).refresh_Credit(credit);
	}
	
	public Numero get_Numero(int num){
		return numero[num];
	}


	public int set_win(int win) {
		this.win = win;
		return win;
	}


	public int get_ganado() {
		return ganado;
	}
	
	public void initialize(){

		try {  
			sonido = AudioSystem.getClip();   
			a = new File("src/Codigo/roulette_wheel.wav");
			sonido.open(AudioSystem.getAudioInputStream(a));
			}
			catch (Exception tipoerror) {
			System.out.println("" + tipoerror);
			}
	}
	
	  
    public void setBPM(int bpm){
    	
    }
  
	public int getBPM(){
		return 0;
	}
	
	public void registerObserver(BeatObserver o) {
		beatObservers.add(o);
	}

	public void notifyBeatObservers() {
		for(int i = 0; i < beatObservers.size(); i++) {
			BeatObserver observer = (BeatObserver)beatObservers.get(i);
			observer.updateBeat();
		}
	}

	public void registerObserver(BPMObserver o) {
		bpmObservers.add(o);
	}

	public void notifyBPMObservers() {

	}


	public void removeObserver(BeatObserver o) {
		int i = beatObservers.indexOf(o);
		if (i >= 0) {
			beatObservers.remove(i);
		}
	}



	public void removeObserver(BPMObserver o) {
		int i = bpmObservers.indexOf(o);
		if (i >= 0) {
			bpmObservers.remove(i);
		}
	}

	@Override
	public void on() {
		sonido.start();
	}
	
	@Override
	public void off() {
		sonido.close();
	}

}