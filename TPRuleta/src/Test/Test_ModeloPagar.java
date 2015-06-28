package Test;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Codigo.Modelo;
import Codigo.View;

public class Test_ModeloPagar {

	Modelo	modelo;
	View	view;
	
	@Before
	public void ante_de(){
		
		view = new View();
		modelo = new Modelo(view);
		
		modelo.Apostar(0);//Primer numero
		modelo.Apostar(4);
		modelo.Apostar(17);
		modelo.set_ficha(500);
		modelo.Apostar(35);
		modelo.set_ficha(50);
		modelo.Apostar(36);//Ultimo numero
		modelo.Apostar(37);// rojo
		modelo.Apostar(39);//par
		modelo.Apostar(41);//Primera docena
		modelo.set_ficha(500);
		modelo.Apostar(42);//Segunda docena
		modelo.set_ficha(50);
		modelo.Apostar(43);//Tercera docena
	}
	
	@Test
	public void test_pagar00(){
		modelo.set_win(0);
		modelo.Pagar();
		assertEquals(50*36, modelo.get_ganado());
		modelo.reiniciar();
		ante_de();
	}
	
	@Test
	public void test_pagar04(){
		modelo.set_win(4);
		modelo.Pagar();
		assertEquals(50*36+50*3+50*2, modelo.get_ganado());	
		modelo.reiniciar();
		ante_de();
	}
	
	@Test
	public void test_pagar17(){
		modelo.set_win(17);
		modelo.Pagar();
		assertEquals(50*36+500*3, modelo.get_ganado());	
		modelo.reiniciar();
		ante_de();
	}
	
	@Test
	public void test_pagar35(){
		modelo.set_win(35);
		modelo.Pagar();
		assertEquals(500*36+50*3, modelo.get_ganado());	
		modelo.reiniciar();
		ante_de();
	}
	
	@Test
	public void test_pagar36(){
		modelo.set_win(36);
		modelo.Pagar();
		assertEquals(50*36+50*3+50*2+50*2, modelo.get_ganado());	
		modelo.reiniciar();
		ante_de();
	}
	
	@Test
	public void test_pagar37(){
		modelo.set_win(37);
		modelo.Pagar();
		assertEquals(0, modelo.get_ganado());
		modelo.reiniciar();
		ante_de();
	}
}
