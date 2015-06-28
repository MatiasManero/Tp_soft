package Codigo;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import BeatModel.BPMObserver;
import BeatModel.BeatObserver;

//import java.util.EmptyStackException;

public class Control {
	

	private Modelo modelo;
	@SuppressWarnings("unused")
	private View view1;
	
	public Control(View view){
	
		this.view1=view;	
		modelo = new Modelo(view);
	}
	
	public void Girar(){
		modelo.Spin();
		//Tiempo
		cobrar();
				
	}
	
	public void add_Bet(int num){
		modelo.Apostar(num);
	}		
	
	public void set_Ficha(int ficha){
		modelo.set_ficha(ficha); 
	}
	
	public void cobrar(){
		modelo.Pagar();
	}
	
	public void restart(){
		modelo.reiniciar();	
	}
	
	public void devolver_Apuesta(){
		modelo.return_apuesta();
	}
	
	public void initializar(){
 
	}
	  
	public void Prender(){
	
		
	}
  
	public void Apagar(){
		
	}
  
	public void Transmitir(){
		modelo.initialize_wav();
	}


}
