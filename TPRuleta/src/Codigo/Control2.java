package Codigo;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

import javax.swing.ImageIcon;
import javax.swing.JComponent;


public class Control2 extends JComponent {

	private static final long serialVersionUID = 1L;

	@Override
    public Dimension getPreferredSize() {
        return new Dimension(icono.getIconWidth(), icono.getIconHeight());
    }

    private ImageIcon icono = null;


    public Control2(String ficheroImagen) {
        icono = new ImageIcon(this.getClass().getResource(ficheroImagen));
    }

    private double rotacion = 0.0;

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
 
        AffineTransform tx = AffineTransform.getRotateInstance(rotacion, 
                icono.getIconWidth()/2, icono.getIconHeight()/2);
        g2d.drawImage(icono.getImage(), tx, this);
        
    }

    public double getRotacion() {
        return rotacion;
    }

    public void setRotacion(double rotacion) {
        this.rotacion = rotacion;
    }
   
    
    public void rotar(){
    	
    	int i=0;
		boolean flag=true;
		
		while(i<36){
			
			if(flag){
			flag=false;
			rotacion=0.17027027027027027027027027027027;
			rotacion=(-i)*rotacion;
            repaint();
            
            try {
				Thread.sleep(400);
				flag=true;
			} catch (Exception e) {
				// TODO: handle exception
			}
            
			i++;
			}
		}
    }
   
}