package Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import Codigo.Control;
import Codigo.Modelo;
import Codigo.Numero;
import Codigo.View;

public class Test_Numeros {

	Modelo	modelo;
	View	view;
	ArrayList<Numero> numeritos;
	private Control	control;
	
	@Before
	public void antesTest(){
		
		modelo=new Modelo();
		control= new Control(modelo);
		numeritos = new ArrayList<Numero>();
		numeritos.add(modelo.get_Numero(0));
		numeritos.add(modelo.get_Numero(1));
		numeritos.add(modelo.get_Numero(6));
		numeritos.add(modelo.get_Numero(11));
		numeritos.add(modelo.get_Numero(12));
		numeritos.add(modelo.get_Numero(13));
		numeritos.add(modelo.get_Numero(16));
		numeritos.add(modelo.get_Numero(19));
		numeritos.add(modelo.get_Numero(24));
		numeritos.add(modelo.get_Numero(25));
		numeritos.add(modelo.get_Numero(29));
		numeritos.add(modelo.get_Numero(36));
	}

	@Test
	public void test_Numero00() {
		assertEquals(0, numeritos.get(0).get_Numero()); //Verifica Numero
		assertEquals(0, numeritos.get(0).get_Decena()); // Verifica Docena
	}
	
	@Test
	public void test_Numero01() {
		assertEquals(1, numeritos.get(1).get_Numero()); //Verifica Numero
		assertEquals(true, numeritos.get(1).esRojo()); // Verifica Color
		assertEquals(1, numeritos.get(1).get_Decena()); // Verifica Docena
		assertEquals(false, numeritos.get(1).esPar()); // Verifica si es Par
	}
	
	@Test
	public void test_Numero06() {
		assertEquals(6, numeritos.get(2).get_Numero()); //Verifica Numero
		assertEquals(false, numeritos.get(2).esRojo()); // Verifica Color
		assertEquals(1, numeritos.get(2).get_Decena()); // Verifica Docena
		assertEquals(true, numeritos.get(2).esPar()); // Verifica si es Par
	}
	
	@Test
	public void test_Numero11() {
		assertEquals(11, numeritos.get(3).get_Numero()); //Verifica Numero
		assertEquals(false, numeritos.get(3).esRojo()); // Verifica Color
		assertEquals(1, numeritos.get(3).get_Decena()); // Verifica Docena
		assertEquals(false, numeritos.get(3).esPar()); // Verifica si es Par
	}
	
	@Test
	public void test_Numero12() {
		assertEquals(12, numeritos.get(4).get_Numero()); //Verifica Numero
		assertEquals(true, numeritos.get(4).esRojo()); // Verifica Color
		assertEquals(1, numeritos.get(4).get_Decena()); // Verifica Docena
		assertEquals(true, numeritos.get(4).esPar()); // Verifica si es Par
	}
	
	@Test
	public void test_Numero13() {
		assertEquals(13, numeritos.get(5).get_Numero()); //Verifica Numero
		assertEquals(false, numeritos.get(5).esRojo()); // Verifica Color
		assertEquals(2, numeritos.get(5).get_Decena()); // Verifica Docena
		assertEquals(false, numeritos.get(5).esPar()); // Verifica si es Par
	}
	
	@Test
	public void test_Numero16() {
		assertEquals(16, numeritos.get(6).get_Numero()); //Verifica Numero
		assertEquals(true, numeritos.get(6).esRojo()); // Verifica Color
		assertEquals(2, numeritos.get(6).get_Decena()); // Verifica Docena
		assertEquals(true, numeritos.get(6).esPar()); // Verifica si es Par
	}
	
	@Test
	public void test_Numero19() {
		assertEquals(19, numeritos.get(7).get_Numero()); //Verifica Numero
		assertEquals(true, numeritos.get(7).esRojo()); // Verifica Color
		assertEquals(2, numeritos.get(7).get_Decena()); // Verifica Docena
		assertEquals(false, numeritos.get(7).esPar()); // Verifica si es Par
	}
	
	@Test
	public void test_Numero24() {
		assertEquals(24, numeritos.get(8).get_Numero()); //Verifica Numero
		assertEquals(false, numeritos.get(8).esRojo()); // Verifica Color
		assertEquals(2, numeritos.get(8).get_Decena()); // Verifica Docena
		assertEquals(true, numeritos.get(8).esPar()); // Verifica si es Par
	}
	
	@Test
	public void test_Numero25() {
		assertEquals(25, numeritos.get(9).get_Numero()); //Verifica Numero
		assertEquals(true, numeritos.get(9).esRojo()); // Verifica Color
		assertEquals(3, numeritos.get(9).get_Decena()); // Verifica Docena
		assertEquals(false, numeritos.get(9).esPar()); // Verifica si es Par
	}
	
	@Test
	public void test_Numero29() {
		assertEquals(29, numeritos.get(10).get_Numero()); //Verifica Numero
		assertEquals(false, numeritos.get(10).esRojo()); // Verifica Color
		assertEquals(3, numeritos.get(10).get_Decena()); // Verifica Docena
		assertEquals(false, numeritos.get(10).esPar()); // Verifica si es Par
	}
	
	@Test
	public void test_Numero36() {
		assertEquals(36, numeritos.get(11).get_Numero()); //Verifica Numero
		assertEquals(true, numeritos.get(11).esRojo()); // Verifica Color
		assertEquals(3, numeritos.get(11).get_Decena()); // Verifica Docena
		assertEquals(true, numeritos.get(11).esPar()); // Verifica si es Par
	}
}