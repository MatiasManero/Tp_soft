package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Codigo.Modelo;
import Codigo.View;

public class Test_ModeloApuesta {

	private Modelo test;
	private View   view_tst;
	
	@Before
	public void apostar(){
		view_tst=new View();
		test=new Modelo(view_tst);		
		
		test.Apostar(0);//Primer numero
		test.Apostar(4);
		test.Apostar(36);//Ultimo numero
		
		test.set_ficha(100);
		test.Apostar(18);
		test.Apostar(37);// rojo
		
		test.set_ficha(500);// cambiar la ficha= 500 
		test.Apostar(19);
		test.Apostar(38);//negro
		test.Apostar(39);//par
		test.Apostar(40);//impar
		
		test.set_ficha(50);
		test.Apostar(20);
		test.Apostar(41);//Primera docena
		test.Apostar(42);//Segunda docena
		test.Apostar(43);//Tercera docena
		
	}
	
	@Test
	public void	test_apuesta0(){
		assertEquals(50, test.get_Bet(0));
	}
	
	@Test
	public void	test_apuesta4(){
		assertEquals(50, test.get_Bet(4));
	}	
	
	@Test
	public void	test_apuesta36(){
		assertEquals(50, test.get_Bet(36));
	}
	
	@Test
	public void	test_setFicha100(){
		assertEquals(100, test.get_Bet(18));
	}
	
	@Test
	public void test_rojo(){
		
		assertEquals(100, test.get_Bet(37));
		
	}
	
	@Test
	public void	test_setFicha500(){
		assertEquals(500, test.get_Bet(19));
	}
	
	@Test
	public void test_negro(){
		
		assertEquals(500, test.get_Bet(19));
		
	}
	
	@Test
	public void test_par(){
		
		assertEquals(500, test.get_Bet(39));
	}
	
	@Test
	public void test_impar(){
		
		assertEquals(500, test.get_Bet(40));
	}
	
	@Test
	public void	test_setFicha50(){
		assertEquals(50, test.get_Bet(20));
	}
	
	@Test
	public void test_1Docena(){
		
		assertEquals(50, test.get_Bet(41));
		
	}
	
	@Test
	public void test_2Docena(){
		
		assertEquals(50, test.get_Bet(42));
		
	}
	
	@Test
	public void test_3Docena(){
		
		assertEquals(50, test.get_Bet(43));
		
	}
	

}
