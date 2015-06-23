package Codigo;

public interface InterfaceControl {
	
	public void Girar();
	public void add_Bet(int num);
	public void set_Ficha(int ficha);
	public void cobrar();
	public void restart();
	public int get_Ficha();
	public int get_Apuesta(int i);
	public void clear_mesa();
	public void devolver_Apuesta();
}
