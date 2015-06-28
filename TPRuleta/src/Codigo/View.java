package Codigo;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextField;
import javax.swing.JRadioButton;

import java.awt.Font;

import javax.swing.SwingConstants;

import java.awt.Insets;
import java.awt.Window.Type;
import java.awt.Toolkit;


public class View extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtLhbkj,textField;
	private Control control;
	private Control2 control2;
	private int num_ganador;
	private double ruleta_rot;
	JButton button_0,button_1,button_2,button_3,button_4,button_5,button_6,button_7 ,button_8,button_9;
	JButton button_10,button_11,button_12,button_13,button_14,button_15,button_16,button_17 ,button_18,button_19;
	JButton button_20,button_21,button_22,button_23,button_24,button_25,button_26,button_27 ,button_28,button_29;
	JButton button_30,button_31,button_32,button_33,button_34,button_35,button_36,button_37 ,button_38,button_39;
	JButton button_40,button_41,button_42,button_43;
	JButton btnNewButton,btnExit;
	JRadioButton radioButton,radioButton_1,rdbtnNewRadioButton;
	/**
	 * Launch the application.
	 */
	private static View view;
	private static int  i=0;

	/**
	 * Create the frame.
	 */
	public static View instance(){
		
		i++;
		if(i==1){
			
			EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View view = new View();
					view.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		}
		
		
		return view;	
	}
	
	

	
	
	public View() {

		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Matias\\Desktop\\TrabajoSoft\\iconoruleta.jpg"));
		setFont(new Font("Dialog", Font.BOLD, 12));
		setTitle("RULETA");
		
		control= new Control(this);
		control2 = new Control2("11645283_10206993693990158_1622502394_n.gif");
		contentPane = new JPanel();
		radioButton = new JRadioButton("50");
		radioButton_1 = new JRadioButton("100");
		rdbtnNewRadioButton = new JRadioButton("500");
		button_0 = new JButton("");
		button_0.setMargin(new Insets(2, 4, 2, 4));
		button_1 = new JButton("");
		button_1.setMargin(new Insets(2, 4, 2, 4));
		button_2 = new JButton("");
		button_2.setMargin(new Insets(2, 4, 2, 4));
		button_3 = new JButton("");
		button_3.setMargin(new Insets(2, 4, 2, 4));
		button_4 = new JButton("");
		button_4.setMargin(new Insets(2, 4, 2, 4));
		button_5 = new JButton("");
		button_5.setMargin(new Insets(2, 4, 2, 4));
		button_6 = new JButton("");
		button_6.setMargin(new Insets(2, 4, 2, 4));
		button_7 = new JButton("");
		button_7.setMargin(new Insets(2, 4, 2, 4));
		button_8 = new JButton("");
		button_8.setMargin(new Insets(2, 4, 2, 4));
		button_9 = new JButton("");
		button_9.setMargin(new Insets(2, 4, 2, 4));
		button_10 = new JButton("");
		button_10.setMargin(new Insets(2, 4, 2, 4));
		button_11 = new JButton("");
		button_11.setMargin(new Insets(2, 4, 2, 4));
		button_12 = new JButton("");
		button_12.setMargin(new Insets(2, 4, 2, 4));
		button_13 = new JButton("");
		button_13.setMargin(new Insets(2, 4, 2, 4));
		button_14 = new JButton("");
		button_14.setMargin(new Insets(2, 4, 2, 4));
		button_15 = new JButton("");
		button_15.setMargin(new Insets(2, 4, 2, 4));
		button_16 = new JButton("");
		button_16.setMargin(new Insets(2, 4, 2, 4));
		button_17 = new JButton("");
		button_17.setMargin(new Insets(2, 4, 2, 4));
		button_18 = new JButton("");
		button_18.setMargin(new Insets(2, 4, 2, 4));
		button_19 = new JButton("");
		button_19.setMargin(new Insets(2, 4, 2, 4));
		button_20 = new JButton("");
		button_20.setMargin(new Insets(2, 4, 2, 4));
		button_21 = new JButton("");
		button_21.setMargin(new Insets(2, 4, 2, 4));
		button_22 = new JButton("");
		button_22.setMargin(new Insets(2, 4, 2, 4));
		button_23 = new JButton("");
		button_23.setMargin(new Insets(2, 4, 2, 4));
		button_24 = new JButton("");
		button_24.setMargin(new Insets(2, 4, 2, 4));
		button_25 = new JButton("");
		button_25.setMargin(new Insets(2, 4, 2, 4));
		button_26 = new JButton("");
		button_26.setMargin(new Insets(2, 4, 2, 4));
		button_27 = new JButton("");
		button_27.setMargin(new Insets(2, 4, 2, 4));
		button_28 = new JButton("");
		button_28.setMargin(new Insets(2, 4, 2, 4));
		button_29 = new JButton("");
		button_29.setMargin(new Insets(2, 4, 2, 4));
		button_30 = new JButton("");
		button_30.setMargin(new Insets(2, 4, 2, 4));
		button_31 = new JButton("");
		button_31.setMargin(new Insets(2, 4, 2, 4));
		button_32 = new JButton("");
		button_32.setMargin(new Insets(2, 4, 2, 4));
		button_33 = new JButton("");
		button_33.setMargin(new Insets(2, 4, 2, 4));
		button_34 = new JButton("");
		button_34.setMargin(new Insets(2, 4, 2, 4));
		button_35 = new JButton("");
		button_35.setMargin(new Insets(2, 4, 2, 4));
		button_36 = new JButton("");
		button_36.setMargin(new Insets(2, 4, 2, 4));
		button_37 = new JButton("");
		button_37.setMargin(new Insets(2, 4, 2, 4));
		button_38 = new JButton("");
		button_38.setMargin(new Insets(2, 4, 2, 4));
		button_39 = new JButton("");
		button_39.setMargin(new Insets(2, 4, 2, 4));
		button_40 = new JButton("");
		button_40.setMargin(new Insets(2, 4, 2, 4));
		button_41 = new JButton("");
		button_41.setMargin(new Insets(2, 4, 2, 4));
		button_42 = new JButton("");
		button_42.setMargin(new Insets(2, 4, 2, 4));
		button_43 = new JButton("");
		button_43.setMargin(new Insets(2, 4, 2, 4));
		JButton btnNewButton = new JButton("SPIN");
		
		JButton btnBet = new JButton("CLEAR");
		JButton btnExit = new JButton("RESTART");
		JLabel lblNewLabel = new JLabel("");
		textField = new JTextField();
		textField.setForeground(Color.WHITE);
		textField.setBackground(Color.DARK_GRAY);
		txtLhbkj = new JTextField();
		txtLhbkj.setForeground(Color.BLACK);
		txtLhbkj.setBackground(Color.LIGHT_GRAY);
		txtLhbkj.setHorizontalAlignment(SwingConstants.CENTER);

		configuracion();

		
//---------------------Boton para cambiar la ficha a 50----------------------------------		
		
		radioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.set_Ficha(50);
			}
		});
				
				
//---------------------Boton para cambiar la ficha a 100----------------------------------
		
		radioButton_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					control.set_Ficha(100);	
				}
		});

//--------------------Boton para cambiar la ficha a 100-----------------------------------
							
		
		rdbtnNewRadioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.set_Ficha(500);
			}
		});
		
//---------------------Numero 0----------------------------------------------------
		
		button_0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(0);
			}
		});

//-----------------------Numero 1----------------------------------------------------
		
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(1);
				}
		});

//---------------------Numero 2----------------------------------------------------       

		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(2);
			}
		});
		

//---------------------Numero 3----------------------------------------------------		

		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(3);
			}
		});
		
//---------------------Numero 4-----------------------------------------------------			

		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(4);
			}
		});

//---------------------Numero 5----------------------------------------------------	
		
		button_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(5);
			}
		});
		
//---------------------Numero 6----------------------------------------------------	
		
		button_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(6);
			}
		});
//---------------------Numero 7----------------------------------------------------	

		button_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(7);
			}
		});

//---------------------Numero 8----------------------------------------------------	

		button_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(8);
			}
		});

//---------------------Numero 9----------------------------------------------------	
		
		button_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(9);
			}
		});
		
//---------------------Numero 10----------------------------------------------------	
		
		button_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(10);
			}
		});

//---------------------Numero 11----------------------------------------------------	
		
		button_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(11);

			}
		});

//---------------------Numero 12----------------------------------------------------	

		button_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(12);
			}
		});
		
//---------------------Numero 13----------------------------------------------------	
		

		button_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(13);
			
			}
		});
		
//---------------------Numero 14----------------------------------------------------	
		
		button_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(14);
			}
		});
		
//---------------------Numero 15----------------------------------------------------	
		
		button_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(15);
			}
		});
		
//---------------------Numero 16----------------------------------------------------	
		
		button_16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(16);
			}
		});
		
//---------------------Numero 17----------------------------------------------------	
		
		button_17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(17);
			}
		});
		
//---------------------Numero 18----------------------------------------------------	
		
		button_18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(18);
			}
		});
		
//---------------------Numero 19----------------------------------------------------			
		
		button_19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(19);
			}
		});

//---------------------Numero 20----------------------------------------------------
		
		button_20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(20);
			}
		});
		
//---------------------Numero 21----------------------------------------------------
		
		button_21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(21);
			}
		});
		
//---------------------Numero 22----------------------------------------------------	
		
		button_22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(22);
			}
		});
		
//---------------------Numero 23----------------------------------------------------	
		
		button_23.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(23);
			}
		});
		
//---------------------Numero 24----------------------------------------------------	
		
		button_24.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(24);
			}
		});
		
//---------------------Numero 25----------------------------------------------------	
		
		button_25.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(25);
				
			}
		});
		
//---------------------Numero 26----------------------------------------------------
		
		button_26.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(26);
			}
		});
		
//---------------------Numero 27----------------------------------------------------
		
		button_27.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(27);
			}
		});
		
//---------------------Numero 28----------------------------------------------------
		
		button_28.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(28);
			}
		});
		
//---------------------Numero 29----------------------------------------------------
		
		button_29.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(29);
			}
		});

//---------------------Numero 30----------------------------------------------------	
		
		button_30.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(30);
			}
		});

//---------------------Numero 31----------------------------------------------------	
		
		button_31.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(31);
			}
		});
		
//---------------------Numero 32----------------------------------------------------	
		
		button_32.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(32);
			}
		});
		
//---------------------Numero 33----------------------------------------------------	
		
		button_33.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(33);
			}
		});
		
//---------------------Numero 34----------------------------------------------------	
		
		button_34.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(34);
			}
		});

//---------------------Numero 35----------------------------------------------------
		
		button_35.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(35);
			}
		});
		
//---------------------Numero 36----------------------------------------------------	
		
		button_36.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(36);
			}
		});
		
//---------------------Numero 37----------------------------------------------------		
		
		button_37.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(37);
			}
		});
		
//---------------------Numero 38----------------------------------------------------
		
		button_38.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(38);
			}
		});

//---------------------Numero 39----------------------------------------------------		
		
		button_39.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(39);
			}
		});

//---------------------Numero 40----------------------------------------------------	
		
		button_40.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(40);
			}
		});

//---------------------Numero 41----------------------------------------------------
		
		button_41.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(41);
			}
		});
		
//---------------------Numero 42----------------------------------------------------
		
		button_42.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(42);
			}
		});
		
//---------------------Numero 43----------------------------------------------------
		
		button_43.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(43);	
			}
		});
		
		
//-----------------------------Hacer girar la ruleta---------------------------
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {	
				
	          /*  try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	*/

				ruleta_rot=0;			
				control.Girar();
				control.Transmitir();
				
				rotar();
				control2.setRotacion(ruleta_rot);
	            control2.repaint();
			}
		});
		
		

//----------------------Devolver la apuesta del jugador--------------------------------
		
		btnBet.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			control.devolver_Apuesta();				
			}
		});
		

//--------------------Reiniciar el juego--------------------------------------------
		
		btnExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			control.restart();
			ruleta_rot=0;			
			control2.setRotacion(ruleta_rot);
            control2.repaint();
            textField.setText("");
			}
		});
		
		
//---------------------------------CONFIGURACION---------------------------------------------
		btnNewButton.setBackground(Color.yellow);
		btnBet.setBackground(Color.yellow);
		btnExit.setBackground(Color.yellow);
		
		btnExit.setBounds(725, 456, 89, 41);
		contentPane.add(btnExit);
		
		txtLhbkj.setFont(new Font("Tahoma", Font.BOLD, 40));
		txtLhbkj.setBounds(496, 531, 318, 60);
		contentPane.add(txtLhbkj);
		txtLhbkj.setColumns(10);
		txtLhbkj.setText("$ 5000");
		
		textField.setFont(new Font("Arial", Font.BOLD, 73));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(164, 483, 151, 85);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		btnNewButton.setBounds(499, 456, 89, 41);
		contentPane.add(btnNewButton);

		btnBet.setBounds(611, 456, 89, 41);
		contentPane.add(btnBet);
		lblNewLabel.setIcon(new ImageIcon(View.class.getResource("/Codigo/ruletaa.jpg")));
		lblNewLabel.setBounds(0, 0, 834, 640);
		contentPane.add(lblNewLabel);
		
	}
	
	//-------------------MUESTRA EL NUMERO GANADOR-------------------------------------
	public void show_Num(int num){
		num_ganador= num;
		textField.setText(Integer.toString(num));
	}
	
	//-------------------ACTUALIZA EL VALOR DEL CREDITO EN PANTALLA--------------------
   public void refresh_Credit(int credit){
	   txtLhbkj.setText("$" + Integer.toString(credit));
   }
   
   //-----------------------LIMPIAR LAS APUESTAS--------------------------------------
   public void Clear_table(){
		   
		   button_0.setText("");
		   button_1.setText("");
		   button_2.setText("");
		   button_3.setText("");
		   button_4.setText("");
		   button_5.setText("");
		   button_6.setText("");
		   button_7.setText("");
		   button_8.setText("");
		   button_9.setText("");
		   button_10.setText("");
		   button_11.setText("");
		   button_12.setText("");
		   button_13.setText("");
		   button_14.setText("");
		   button_15.setText("");
		   button_16.setText("");
		   button_17.setText("");
		   button_18.setText("");
		   button_19.setText("");
		   button_20.setText("");
		   button_21.setText("");
		   button_22.setText("");
		   button_23.setText("");
		   button_24.setText("");
		   button_25.setText("");
		   button_26.setText("");
		   button_27.setText("");
		   button_28.setText("");
		   button_29.setText("");
		   button_30.setText("");
		   button_31.setText("");
		   button_32.setText("");
		   button_33.setText("");
		   button_34.setText("");
		   button_35.setText("");
		   button_36.setText("");
		   button_37.setText("");
		   button_38.setText("");
		   button_39.setText("");
		   button_40.setText("");
		   button_41.setText("");
		   button_42.setText("");
		   button_43.setText("");
	   }

   
   //-----------------AGREGA LA APUESTA A LA FICHA----------------------------------
   public void	add_ficha(int boton,int ficha){
	   
	   String apuesta= Integer.toString(ficha);
	   
	   switch(boton){
	   
	   case 0:button_0.setText(apuesta);break;
	   case 1:button_1.setText(apuesta);break;
	   case 2:button_2.setText(apuesta);break;
	   case 3:button_3.setText(apuesta);break;
	   case 4:button_4.setText(apuesta);break;
	   case 5:button_5.setText(apuesta);break;
	   case 6:button_6.setText(apuesta);break;
	   case 7:button_7.setText(apuesta);break;
	   case 8:button_8.setText(apuesta);break;
	   case 9:button_9.setText(apuesta);break;
	   case 10:button_10.setText(apuesta);break;
	   case 11:button_11.setText(apuesta);break;
	   case 12:button_12.setText(apuesta);break;
	   case 13:button_13.setText(apuesta);break;
	   case 14:button_14.setText(apuesta);break;
	   case 15:button_15.setText(apuesta);break;
	   case 16:button_16.setText(apuesta);break;
	   case 17:button_17.setText(apuesta);break;
	   case 18:button_18.setText(apuesta);break;
	   case 19:button_19.setText(apuesta);break;
	   case 20:button_20.setText(apuesta);break;
	   case 21:button_21.setText(apuesta);break;
	   case 22:button_22.setText(apuesta);break;
	   case 23:button_23.setText(apuesta);break;
	   case 24:button_24.setText(apuesta);break;
	   case 25:button_25.setText(apuesta);break;
	   case 26:button_26.setText(apuesta);break;
	   case 27:button_27.setText(apuesta);break;
	   case 28:button_28.setText(apuesta);break;
	   case 29:button_29.setText(apuesta);break;
	   case 30:button_30.setText(apuesta);break;
	   case 31:button_31.setText(apuesta);break;
	   case 32:button_32.setText(apuesta);break;
	   case 33:button_33.setText(apuesta);break;
	   case 34:button_34.setText(apuesta);break;
	   case 35:button_35.setText(apuesta);break;
	   case 36:button_36.setText(apuesta);break;
	   case 37:button_37.setText(apuesta);break;
	   case 38:button_38.setText(apuesta);break;
	   case 39:button_39.setText(apuesta);break;
	   case 40:button_40.setText(apuesta);break;
	   case 41:button_41.setText(apuesta);break;
	   case 42:button_42.setText(apuesta);break;
	   case 43:button_43.setText(apuesta);break;
	   
	   }
	   
	   
   }
   
   //---------------------UBICA A LA RULETA EN EL NUMERO GANADOR------------------------------
   public void rotar(){
	   
	   switch(num_ganador){
		case 0:ruleta_rot=0;break;
		case 1:ruleta_rot=-23*0.17027027027027027027027027027027;break;
		case 2:ruleta_rot=-6*0.17027027027027027027027027027027;break;
		case 3:ruleta_rot=-35*0.17027027027027027027027027027027;break;
		case 4:ruleta_rot=-4*0.17027027027027027027027027027027;break;
		case 5:ruleta_rot=-19*0.17027027027027027027027027027027;break;
		case 6:ruleta_rot=-10*0.17027027027027027027027027027027;break;
		case 7:ruleta_rot=-31*0.17027027027027027027027027027027;break;
		case 8:ruleta_rot=-16*0.17027027027027027027027027027027;break;
		case 9:ruleta_rot=-27*0.17027027027027027027027027027027;break;
		case 10:ruleta_rot=-18*0.17027027027027027027027027027027;break;
		case 11:ruleta_rot=-14*0.17027027027027027027027027027027;break;
		case 12:ruleta_rot=-33*0.17027027027027027027027027027027;break;
		case 13:ruleta_rot=-12*0.17027027027027027027027027027027;break;
		case 14:ruleta_rot=-25*0.17027027027027027027027027027027;break;
		case 15:ruleta_rot=-2*0.17027027027027027027027027027027;break;
		case 16:ruleta_rot=-21*0.17027027027027027027027027027027;break;
		case 17:ruleta_rot=-8*0.17027027027027027027027027027027;break;
		case 18:ruleta_rot=-29*0.17027027027027027027027027027027;break;
		case 19:ruleta_rot=-3*0.17027027027027027027027027027027;break;
		case 20:ruleta_rot=-24*0.17027027027027027027027027027027;break;
		case 21:ruleta_rot=-5*0.17027027027027027027027027027027;break;
		case 22:ruleta_rot=-28*0.17027027027027027027027027027027;break;
		case 23:ruleta_rot=-17*0.17027027027027027027027027027027;break;
		case 24:ruleta_rot=-20*0.17027027027027027027027027027027;break;
		case 25:ruleta_rot=-7*0.17027027027027027027027027027027;break;
		case 26:ruleta_rot=-36*0.17027027027027027027027027027027;break;
		case 27:ruleta_rot=-11*0.17027027027027027027027027027027;break;
		case 28:ruleta_rot=-32*0.17027027027027027027027027027027;break;
		case 29:ruleta_rot=-30*0.17027027027027027027027027027027;break;
		case 30:ruleta_rot=-15*0.17027027027027027027027027027027;break;
		case 31:ruleta_rot=-26*0.17027027027027027027027027027027;break;
		case 32:ruleta_rot=-1*0.17027027027027027027027027027027;break;
		case 33:ruleta_rot=-22*0.17027027027027027027027027027027;break;
		case 34:ruleta_rot=-9*0.17027027027027027027027027027027;break;
		case 35:ruleta_rot=-34*0.17027027027027027027027027027027;break;
		case 36:ruleta_rot=-13*0.17027027027027027027027027027027;break;
		
		}
	}
   
   public void cambiar_ficha(boolean ficha1,boolean ficha2,boolean ficha3){
	  
	    radioButton.setSelected(ficha1);
		radioButton_1.setSelected(ficha2);
		rdbtnNewRadioButton.setSelected(ficha3);
	   }
   
  public void configuracion(){
	  	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 840, 640);
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		control2.setBounds(38, 19, 402, 402);
		contentPane.add(control2);
	  
	  	rdbtnNewRadioButton.setOpaque(false);
		rdbtnNewRadioButton.setContentAreaFilled(false);
		rdbtnNewRadioButton.setBorderPainted(false);
		rdbtnNewRadioButton.setBounds(424, 409, 58, 23);
		contentPane.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setSelected(false);
		
		radioButton_1.setOpaque(false);
		radioButton_1.setContentAreaFilled(false);
		radioButton_1.setBorderPainted(false);
		radioButton_1.setBounds(424, 383, 58, 23);
		contentPane.add(radioButton_1);
		radioButton_1.setSelected(false);
		
		radioButton.setOpaque(false);
		radioButton.setContentAreaFilled(false);
		radioButton.setBorderPainted(false);
		radioButton.setBounds(424, 357, 58, 23);
		contentPane.add(radioButton);
		radioButton.setSelected(true);
		
		
		button_0.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_0.setForeground(Color.black);
		button_0.setOpaque(false);
		button_0.setContentAreaFilled(false);
		button_0.setBorderPainted(false);
		button_0.setBounds(632, 11, 182, 36);
		contentPane.add(button_0);
		
		button_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_1.setForeground(Color.black);
		button_1.setBounds(629, 48, 61, 31);
		button_1.setOpaque(false);
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		contentPane.add(button_1);
		
		button_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_2.setForeground(Color.red);
		button_2.setBounds(692, 48, 61, 31);
		button_2.setOpaque(false);
		button_2.setContentAreaFilled(false);
		button_2.setBorderPainted(false);
		contentPane.add(button_2);
		
		button_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_3.setForeground(Color.black);
		button_3.setBounds(753, 48, 61, 31);
		button_3.setOpaque(false);
		button_3.setContentAreaFilled(false);
		button_3.setBorderPainted(false);
		contentPane.add(button_3);
		
		button_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_4.setForeground(Color.red);
		button_4.setBounds(632, 79, 61, 31);
		button_4.setOpaque(false);
		button_4.setContentAreaFilled(false);
		button_4.setBorderPainted(false);
		contentPane.add(button_4);

		button_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_5.setForeground(Color.black);
		button_5.setOpaque(false);
		button_5.setContentAreaFilled(false);
		button_5.setBorderPainted(false);
		button_5.setBounds(692, 79, 61, 31);
		contentPane.add(button_5);
		
		button_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_6.setForeground(Color.red);
		button_6.setOpaque(false);
		button_6.setContentAreaFilled(false);
		button_6.setBorderPainted(false);
		button_6.setBounds(753, 79, 61, 31);
		contentPane.add(button_6);
		
		button_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_7.setForeground(Color.black);
		button_7.setOpaque(false);
		button_7.setContentAreaFilled(false);
		button_7.setBorderPainted(false);
		button_7.setBounds(632, 108, 61, 31);
		contentPane.add(button_7);
		
		button_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_8.setForeground(Color.red);
		button_8.setOpaque(false);
		button_8.setContentAreaFilled(false);
		button_8.setBorderPainted(false);
		button_8.setBounds(692, 108, 61, 31);
		contentPane.add(button_8);


		button_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_9.setForeground(Color.black);
		button_9.setOpaque(false);
		button_9.setContentAreaFilled(false);
		button_9.setBorderPainted(false);
		button_9.setBounds(753, 108, 61, 31);
		contentPane.add(button_9);

		button_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_10.setForeground(Color.red);
		button_10.setOpaque(false);
		button_10.setContentAreaFilled(false);
		button_10.setBorderPainted(false);
		button_10.setBounds(632, 150, 61, 31);
		contentPane.add(button_10);
		
		button_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_11.setForeground(Color.red);
		button_11.setOpaque(false);
		button_11.setContentAreaFilled(false);
		button_11.setBorderPainted(false);
		button_11.setBounds(692, 150, 61, 31);
		contentPane.add(button_11);
		
		button_12.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_12.setForeground(Color.black);
		button_12.setOpaque(false);
		button_12.setContentAreaFilled(false);
		button_12.setBorderPainted(false);
		button_12.setBounds(753, 150, 61, 31);
		contentPane.add(button_12);
		
		button_13.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_13.setForeground(Color.red);
		button_13.setOpaque(false);
		button_13.setContentAreaFilled(false);
		button_13.setBorderPainted(false);
		button_13.setBounds(632, 181, 61, 31);
		contentPane.add(button_13);

		button_14.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_14.setForeground(Color.black);
		button_14.setOpaque(false);
		button_14.setContentAreaFilled(false);
		button_14.setBorderPainted(false);
		button_14.setBounds(692, 181, 61, 31);
		contentPane.add(button_14);
		
		button_15.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_15.setForeground(Color.red);
		button_15.setOpaque(false);
		button_15.setContentAreaFilled(false);
		button_15.setBorderPainted(false);
		button_15.setBounds(753, 181, 61, 31);
		contentPane.add(button_15);

		button_16.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_16.setForeground(Color.black);
		button_16.setOpaque(false);
		button_16.setContentAreaFilled(false);
		button_16.setBorderPainted(false);
		button_16.setBounds(632, 211, 61, 31);
		contentPane.add(button_16);

		button_17.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_17.setForeground(Color.red);
		button_17.setOpaque(false);
		button_17.setContentAreaFilled(false);
		button_17.setBorderPainted(false);
		button_17.setBounds(692, 211, 61, 31);
		contentPane.add(button_17);

		button_18.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_18.setForeground(Color.black);
		button_18.setOpaque(false);
		button_18.setContentAreaFilled(false);
		button_18.setBorderPainted(false);
		button_18.setBounds(753, 211, 61, 31);
		contentPane.add(button_18);		

		button_19.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_19.setForeground(Color.black);
		button_19.setOpaque(false);
		button_19.setContentAreaFilled(false);
		button_19.setBorderPainted(false);
		button_19.setBounds(632, 242, 61, 31);
		contentPane.add(button_19);


		button_20.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_20.setForeground(Color.red);
		button_20.setOpaque(false);
		button_20.setContentAreaFilled(false);
		button_20.setBorderPainted(false);
		button_20.setBounds(692, 242, 61, 31);
		contentPane.add(button_20);
		
		button_21.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_21.setForeground(Color.black);
		button_21.setOpaque(false);
		button_21.setContentAreaFilled(false);
		button_21.setBorderPainted(false);
		button_21.setBounds(753, 242, 61, 31);
		contentPane.add(button_21);		

		button_22.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_22.setForeground(Color.red);
		button_22.setOpaque(false);
		button_22.setContentAreaFilled(false);
		button_22.setBorderPainted(false);
		button_22.setBounds(632, 273, 61, 31);
		contentPane.add(button_22);

		button_23.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_23.setForeground(Color.black);
		button_23.setOpaque(false);
		button_23.setContentAreaFilled(false);
		button_23.setBorderPainted(false);
		button_23.setBounds(692, 273, 61, 31);
		contentPane.add(button_23);		

		button_24.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_24.setForeground(Color.red);
		button_24.setOpaque(false);
		button_24.setContentAreaFilled(false);
		button_24.setBorderPainted(false);
		button_24.setBounds(753, 273, 61, 31);
		contentPane.add(button_24);

		button_25.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_25.setForeground(Color.black);
		button_25.setOpaque(false);
		button_25.setContentAreaFilled(false);
		button_25.setBorderPainted(false);
		button_25.setBounds(632, 310, 61, 31);
		contentPane.add(button_25);

		button_26.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_26.setForeground(Color.red);
		button_26.setOpaque(false);
		button_26.setContentAreaFilled(false);
		button_26.setBorderPainted(false);
		button_26.setBounds(692, 310, 61, 31);
		contentPane.add(button_26);

		button_27.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_27.setForeground(Color.black);
		button_27.setOpaque(false);
		button_27.setContentAreaFilled(false);
		button_27.setBorderPainted(false);
		button_27.setBounds(753, 310, 61, 31);
		contentPane.add(button_27);

		button_28.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_28.setForeground(Color.red);
		button_28.setOpaque(false);
		button_28.setContentAreaFilled(false);
		button_28.setBorderPainted(false);
		button_28.setBounds(632, 339, 61, 31);
		contentPane.add(button_28);

		button_29.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_29.setForeground(Color.red);
		button_29.setOpaque(false);
		button_29.setContentAreaFilled(false);
		button_29.setBorderPainted(false);
		button_29.setBounds(692, 339, 61, 31);
		contentPane.add(button_29);

		button_30.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_30.setForeground(Color.black);
		button_30.setOpaque(false);
		button_30.setContentAreaFilled(false);
		button_30.setBorderPainted(false);
		button_30.setBounds(753, 339, 61, 31);
		contentPane.add(button_30);

		button_31.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_31.setForeground(Color.red);
		button_31.setOpaque(false);
		button_31.setContentAreaFilled(false);
		button_31.setBorderPainted(false);
		button_31.setBounds(632, 371, 61, 31);
		contentPane.add(button_31);

		button_32.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_32.setForeground(Color.black);
		button_32.setOpaque(false);
		button_32.setContentAreaFilled(false);
		button_32.setBorderPainted(false);
		button_32.setBounds(692, 371, 61, 31);
		contentPane.add(button_32);

		button_33.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_33.setForeground(Color.red);
		button_33.setOpaque(false);
		button_33.setContentAreaFilled(false);
		button_33.setBorderPainted(false);
		button_33.setBounds(753, 371, 61, 31);
		contentPane.add(button_33);

		button_34.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_34.setForeground(Color.black);
		button_34.setOpaque(false);
		button_34.setContentAreaFilled(false);
		button_34.setBorderPainted(false);
		button_34.setBounds(632, 401, 61, 31);
		contentPane.add(button_34);

		button_35.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_35.setForeground(Color.red);
		button_35.setOpaque(false);
		button_35.setContentAreaFilled(false);
		button_35.setBorderPainted(false);
		button_35.setBounds(692, 401, 61, 31);
		contentPane.add(button_35);

		button_36.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_36.setForeground(Color.black);
		button_36.setOpaque(false);
		button_36.setContentAreaFilled(false);
		button_36.setBorderPainted(false);
		button_36.setBounds(753, 401, 61, 31);
		contentPane.add(button_36);
		
		button_37.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_37.setForeground(Color.black);
		button_37.setOpaque(false);
		button_37.setContentAreaFilled(false);
		button_37.setBorderPainted(false);
		button_37.setBounds(499, 181, 61, 60);
		contentPane.add(button_37);
		
		button_38.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_38.setForeground(Color.red);
		button_38.setOpaque(false);
		button_38.setContentAreaFilled(false);
		button_38.setBorderPainted(false);
		button_38.setBounds(499, 242, 61, 62);
		contentPane.add(button_38);
		
		button_39.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_39.setForeground(Color.black);
		button_39.setOpaque(false);
		button_39.setContentAreaFilled(false);
		button_39.setBorderPainted(false);
		button_39.setBounds(499, 48, 61, 129);
		contentPane.add(button_39);
		
		button_40.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_40.setForeground(Color.black);
		button_40.setOpaque(false);
		button_40.setContentAreaFilled(false);
		button_40.setBorderPainted(false);
		button_40.setBounds(499, 310, 61, 122);
		contentPane.add(button_40);
		
		button_41.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_41.setForeground(Color.black);
		button_41.setOpaque(false);
		button_41.setContentAreaFilled(false);
		button_41.setBorderPainted(false);
		button_41.setBounds(561, 48, 61, 129);
		contentPane.add(button_41);
		
		button_42.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_42.setForeground(Color.black);
		button_42.setOpaque(false);
		button_42.setContentAreaFilled(false);
		button_42.setBorderPainted(false);
		button_42.setBounds(561, 180, 61, 127);
		contentPane.add(button_42);
		
		button_43.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_43.setForeground(Color.black);
		button_43.setOpaque(false);
		button_43.setContentAreaFilled(false);
		button_43.setBorderPainted(false);
		button_43.setBounds(561, 311, 61, 121);
		contentPane.add(button_43);
		

		
		

	
	  
  }
  
 
}