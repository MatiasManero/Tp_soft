package Codigo;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Button;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.SwingConstants;


public class View extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtLhbkj;
	private JTextField textField;
	private Control control;
	JButton button_0,button_1,button_2,button_3,button_4,button_5,button_6,button_7 ,button_8,button_9;
	JButton button_10,button_11,button_12,button_13,button_14,button_15,button_16,button_17 ,button_18,button_19;
	JButton button_20,button_21,button_22,button_23,button_24,button_25,button_26,button_27 ,button_28,button_29;
	JButton button_30,button_31,button_32,button_33,button_34,button_35,button_36,button_37 ,button_38,button_39;
	JButton button_40,button_41,button_42,button_43;
	JButton btnNewButton,btnExit;
	JRadioButton radioButton,radioButton_1,rdbtnNewRadioButton;
	ArrayList<JButton> botonera;
//	private String Apuesta="50";

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					View frame = new View();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public View() {
		botonera= new ArrayList<JButton>();
		control= new Control();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 840, 640);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		llenar_botonera();
		
		button_1 = new JButton("");
		button_1.setBackground(Color.WHITE);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_1.setForeground(Color.CYAN);
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(1);
			}
		});
		button_1.setBounds(632, 48, 61, 31);
		button_1.setOpaque(false);
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		contentPane.add(button_1);
		
		
		button_2 = new JButton("");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_2.setForeground(Color.CYAN);
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(2);
			}
		});
		button_2.setBounds(692, 48, 61, 31);
		button_2.setOpaque(false);
		button_2.setContentAreaFilled(false);
		button_2.setBorderPainted(false);
		contentPane.add(button_2);
		
		
		button_3 = new JButton("");
		button_3.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_3.setForeground(Color.CYAN);
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(3);
			}
		});
		button_3.setBounds(753, 48, 61, 31);
		button_3.setOpaque(false);
		button_3.setContentAreaFilled(false);
		button_3.setBorderPainted(false);
		contentPane.add(button_3);
		
		
		button_4 = new JButton("");
		button_4.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_4.setForeground(Color.CYAN);
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(4);
			}
		});
		button_4.setBounds(632, 79, 61, 31);
		button_4.setOpaque(false);
		button_4.setContentAreaFilled(false);
		button_4.setBorderPainted(false);
		contentPane.add(button_4);
		
		button_5 = new JButton("");
		button_5.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_5.setForeground(Color.CYAN);
		button_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(5);
			}
		});
		
		button_5.setOpaque(false);
		button_5.setContentAreaFilled(false);
		button_5.setBorderPainted(false);
		button_5.setBounds(692, 79, 61, 31);
		contentPane.add(button_5);
		
		button_6 = new JButton("");
		button_6.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_6.setForeground(Color.CYAN);
		button_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(6);
			}
		});
		button_6.setOpaque(false);
		button_6.setContentAreaFilled(false);
		button_6.setBorderPainted(false);
		button_6.setBounds(753, 79, 61, 31);
		contentPane.add(button_6);
		
		button_7 = new JButton("");
		button_7.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_7.setForeground(Color.CYAN);
		button_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(7);
			}
		});
		button_7.setOpaque(false);
		button_7.setContentAreaFilled(false);
		button_7.setBorderPainted(false);
		button_7.setBounds(632, 108, 61, 31);
		contentPane.add(button_7);
		
		button_8 = new JButton("");
		button_8.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_8.setForeground(Color.CYAN);
		button_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(8);
			}
		});
		button_8.setOpaque(false);
		button_8.setContentAreaFilled(false);
		button_8.setBorderPainted(false);
		button_8.setBounds(692, 108, 61, 31);
		contentPane.add(button_8);
		
		button_9 = new JButton("");
		button_9.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_9.setForeground(Color.CYAN);
		button_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(9);
			}
		});
		button_9.setOpaque(false);
		button_9.setContentAreaFilled(false);
		button_9.setBorderPainted(false);
		button_9.setBounds(753, 108, 61, 31);
		contentPane.add(button_9);
		
		button_10 = new JButton("");
		button_10.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_10.setForeground(Color.CYAN);
		button_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(10);
			}
		});
		button_10.setOpaque(false);
		button_10.setContentAreaFilled(false);
		button_10.setBorderPainted(false);
		button_10.setBounds(632, 150, 61, 31);
		contentPane.add(button_10);
		
		button_11 = new JButton("");
		button_11.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_11.setForeground(Color.CYAN);
		button_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(11);

			}
		});
		button_11.setOpaque(false);
		button_11.setContentAreaFilled(false);
		button_11.setBorderPainted(false);
		button_11.setBounds(692, 150, 61, 31);
		contentPane.add(button_11);
		
		button_12 = new JButton("");
		button_12.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_12.setForeground(Color.CYAN);
		button_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(12);
			}
		});
		button_12.setOpaque(false);
		button_12.setContentAreaFilled(false);
		button_12.setBorderPainted(false);
		button_12.setBounds(753, 150, 61, 31);
		contentPane.add(button_12);
		
		button_13 = new JButton("");
		button_13.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_13.setForeground(Color.CYAN);
		button_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(13);
			
			}
		});
		button_13.setOpaque(false);
		button_13.setContentAreaFilled(false);
		button_13.setBorderPainted(false);
		button_13.setBounds(632, 181, 61, 31);
		contentPane.add(button_13);
		
		button_14 = new JButton("");
		button_14.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_14.setForeground(Color.CYAN);
		button_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(14);
			}
		});
		button_14.setOpaque(false);
		button_14.setContentAreaFilled(false);
		button_14.setBorderPainted(false);
		button_14.setBounds(692, 181, 61, 31);
		contentPane.add(button_14);
		
		button_15 = new JButton("");
		button_15.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_15.setForeground(Color.CYAN);
		button_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(15);
			}
		});
		button_15.setOpaque(false);
		button_15.setContentAreaFilled(false);
		button_15.setBorderPainted(false);
		button_15.setBounds(753, 181, 61, 31);
		contentPane.add(button_15);
		
		button_16 = new JButton("");
		button_16.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_16.setForeground(Color.CYAN);
		button_16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(16);
			}
		});
		button_16.setOpaque(false);
		button_16.setContentAreaFilled(false);
		button_16.setBorderPainted(false);
		button_16.setBounds(632, 211, 61, 31);
		contentPane.add(button_16);
		
		button_17 = new JButton("");
		button_17.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_17.setForeground(Color.CYAN);
		button_17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(17);
			}
		});
		button_17.setOpaque(false);
		button_17.setContentAreaFilled(false);
		button_17.setBorderPainted(false);
		button_17.setBounds(692, 211, 61, 31);
		contentPane.add(button_17);
		
		button_18 = new JButton("");
		button_18.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_18.setForeground(Color.CYAN);
		button_18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(18);
			}
		});
		button_18.setOpaque(false);
		button_18.setContentAreaFilled(false);
		button_18.setBorderPainted(false);
		button_18.setBounds(753, 242, 61, 31);
		contentPane.add(button_18);
		
		button_19 = new JButton("");
		button_19.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_19.setForeground(Color.CYAN);
		button_19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(19);
			}
		});
		button_19.setOpaque(false);
		button_19.setContentAreaFilled(false);
		button_19.setBorderPainted(false);
		button_19.setBounds(632, 401, 61, 31);
		contentPane.add(button_19);
		
		button_20 = new JButton("");
		button_20.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_20.setForeground(Color.CYAN);
		button_20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(20);
			}
		});
		button_20.setOpaque(false);
		button_20.setContentAreaFilled(false);
		button_20.setBorderPainted(false);
		button_20.setBounds(692, 401, 61, 31);
		contentPane.add(button_20);
		
		button_21 = new JButton("");
		button_21.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_21.setForeground(Color.CYAN);
		button_21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(21);
			}
		});
		button_21.setOpaque(false);
		button_21.setContentAreaFilled(false);
		button_21.setBorderPainted(false);
		button_21.setBounds(753, 211, 61, 31);
		contentPane.add(button_21);
		
		button_22 = new JButton("");
		button_22.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_22.setForeground(Color.CYAN);
		button_22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(22);
			}
		});
		button_22.setOpaque(false);
		button_22.setContentAreaFilled(false);
		button_22.setBorderPainted(false);
		button_22.setBounds(632, 242, 61, 31);
		contentPane.add(button_22);
		
		button_23 = new JButton("");
		button_23.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_23.setForeground(Color.CYAN);
		button_23.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(23);
			}
		});
		button_23.setOpaque(false);
		button_23.setContentAreaFilled(false);
		button_23.setBorderPainted(false);
		button_23.setBounds(692, 242, 61, 31);
		contentPane.add(button_23);
		
		button_24 = new JButton("");
		button_24.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_24.setForeground(Color.CYAN);
		button_24.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(24);
			}
		});
		button_24.setOpaque(false);
		button_24.setContentAreaFilled(false);
		button_24.setBorderPainted(false);
		button_24.setBounds(753, 338, 61, 31);
		contentPane.add(button_24);
		
		button_25 = new JButton("");
		button_25.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_25.setForeground(Color.CYAN);
		button_25.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(25);
				
			}
		});
		button_25.setOpaque(false);
		button_25.setContentAreaFilled(false);
		button_25.setBorderPainted(false);
		button_25.setBounds(621, 276, 61, 31);
		contentPane.add(button_25);
		
		button_26 = new JButton("");
		button_26.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_26.setForeground(Color.CYAN);
		button_26.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(26);
			}
		});
		button_26.setOpaque(false);
		button_26.setContentAreaFilled(false);
		button_26.setBorderPainted(false);
		button_26.setBounds(692, 276, 61, 31);
		contentPane.add(button_26);
		
		button_27 = new JButton("");
		button_27.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_27.setForeground(Color.CYAN);
		button_27.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(27);
			}
		});
		button_27.setOpaque(false);
		button_27.setContentAreaFilled(false);
		button_27.setBorderPainted(false);
		button_27.setBounds(753, 276, 61, 31);
		contentPane.add(button_27);
		
		 button_28 = new JButton("");
		button_28.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_28.setForeground(Color.CYAN);
		button_28.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(28);
			}
		});
		button_28.setOpaque(false);
		button_28.setContentAreaFilled(false);
		button_28.setBorderPainted(false);
		button_28.setBounds(632, 310, 61, 31);
		contentPane.add(button_28);
		
		 button_29 = new JButton("");
		button_29.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_29.setForeground(Color.CYAN);
		button_29.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(29);
			}
		});
		button_29.setOpaque(false);
		button_29.setContentAreaFilled(false);
		button_29.setBorderPainted(false);
		button_29.setBounds(692, 310, 61, 31);
		contentPane.add(button_29);
		
		 button_30 = new JButton("");
		button_30.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_30.setForeground(Color.CYAN);
		button_30.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(30);
			}
		});
		button_30.setOpaque(false);
		button_30.setContentAreaFilled(false);
		button_30.setBorderPainted(false);
		button_30.setBounds(753, 310, 61, 31);
		contentPane.add(button_30);
		
		 button_31 = new JButton("");
		button_31.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_31.setForeground(Color.CYAN);
		button_31.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(31);
			}
		});
		button_31.setOpaque(false);
		button_31.setContentAreaFilled(false);
		button_31.setBorderPainted(false);
		button_31.setBounds(632, 338, 61, 31);
		contentPane.add(button_31);
		
		 button_32 = new JButton("");
		button_32.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_32.setForeground(Color.CYAN);
		button_32.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(32);
			}
		});
		button_32.setOpaque(false);
		button_32.setContentAreaFilled(false);
		button_32.setBorderPainted(false);
		button_32.setBounds(692, 338, 61, 31);
		contentPane.add(button_32);
		
		 button_33 = new JButton("");
		button_33.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_33.setForeground(Color.CYAN);
		button_33.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(33);
			}
		});
		button_33.setOpaque(false);
		button_33.setContentAreaFilled(false);
		button_33.setBorderPainted(false);
		button_33.setBounds(753, 401, 61, 31);
		contentPane.add(button_33);
		
		 button_34 = new JButton("");
		button_34.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_34.setForeground(Color.CYAN);
		button_34.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(34);
			}
		});
		button_34.setOpaque(false);
		button_34.setContentAreaFilled(false);
		button_34.setBorderPainted(false);
		button_34.setBounds(632, 375, 61, 31);
		contentPane.add(button_34);
		
		 button_35 = new JButton("");
		button_35.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_35.setForeground(Color.CYAN);
		button_35.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(35);
			}
		});
		button_35.setOpaque(false);
		button_35.setContentAreaFilled(false);
		button_35.setBorderPainted(false);
		button_35.setBounds(692, 375, 61, 31);
		contentPane.add(button_35);
		
		 button_36 = new JButton("");
		button_36.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_36.setForeground(Color.CYAN);
		button_36.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(36);
			}
		});
		button_36.setOpaque(false);
		button_36.setContentAreaFilled(false);
		button_36.setBorderPainted(false);
		button_36.setBounds(753, 375, 61, 31);
		contentPane.add(button_36);
		
		 button_0 = new JButton("");//ultimo numero
		button_0.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_0.setForeground(Color.CYAN);
		button_0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(0);
			}
		});
		button_0.setOpaque(false);
		button_0.setContentAreaFilled(false);
		button_0.setBorderPainted(false);
		button_0.setBounds(632, 11, 182, 36);
		contentPane.add(button_0);
		
		 button_37 = new JButton("");// rojo
		button_37.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_37.setForeground(Color.CYAN);
		button_37.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(37);
			}
		});
		
		button_37.setOpaque(false);
		button_37.setContentAreaFilled(false);
		button_37.setBorderPainted(false);
		button_37.setBounds(499, 181, 61, 60);
		contentPane.add(button_37);
		
		 button_38 = new JButton("");//negro
		button_38.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_38.setForeground(Color.CYAN);
		button_38.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(38);
			}
		});
		button_38.setOpaque(false);
		button_38.setContentAreaFilled(false);
		button_38.setBorderPainted(false);
		button_38.setBounds(499, 242, 61, 62);
		contentPane.add(button_38);
		
		 button_39 = new JButton("");//par
		button_39.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_39.setForeground(Color.CYAN);
		button_39.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(39);
			}
		});
		button_39.setOpaque(false);
		button_39.setContentAreaFilled(false);
		button_39.setBorderPainted(false);
		button_39.setBounds(499, 48, 61, 129);
		contentPane.add(button_39);
		
		 button_40 = new JButton("");//impar
		button_40.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_40.setForeground(Color.CYAN);
		button_40.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(40);
			}
		});
		button_40.setOpaque(false);
		button_40.setContentAreaFilled(false);
		button_40.setBorderPainted(false);
		button_40.setBounds(499, 310, 61, 122);
		contentPane.add(button_40);
		
		 button_41 = new JButton("");//1de12
		button_41.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_41.setForeground(Color.CYAN);
		button_41.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(41);
			}
		});
		
		button_41.setOpaque(false);
		button_41.setContentAreaFilled(false);
		button_41.setBorderPainted(false);
		button_41.setBounds(561, 48, 61, 129);
		contentPane.add(button_41);
		
		button_42 = new JButton("");//2 de 12
		button_42.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_42.setForeground(Color.CYAN);
		button_42.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(42);
			}
		});
		button_42.setOpaque(false);
		button_42.setContentAreaFilled(false);
		button_42.setBorderPainted(false);
		button_42.setBounds(561, 180, 61, 127);
		contentPane.add(button_42);
		
		button_43 = new JButton("");//3 de 12
		button_43.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_43.setForeground(Color.CYAN);
		button_43.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.add_Bet(43);	
			}
		});
		
		button_43.setOpaque(false);
		button_43.setContentAreaFilled(false);
		button_43.setBorderPainted(false);
		button_43.setBounds(561, 311, 61, 121);
		contentPane.add(button_43);
		
		JButton btnNewButton = new JButton("SPIN");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {				
		    control.Girar();		    
			}
		});
		
		btnNewButton.setBounds(499, 456, 89, 41);
		contentPane.add(btnNewButton);
		
		JButton btnBet = new JButton("CLEAR");
		btnBet.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			control.devolver_Apuesta();				
			}
		});
		btnBet.setBounds(611, 456, 89, 41);
		contentPane.add(btnBet);
		
		JButton btnExit = new JButton("RESTART");
		btnExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
	
			control.restart();
			}
		});
		btnExit.setBounds(725, 456, 89, 41);
		contentPane.add(btnExit);
		
		txtLhbkj = new JTextField();
		txtLhbkj.setFont(new Font("Tahoma", Font.PLAIN, 40));
		txtLhbkj.setBounds(496, 531, 318, 60);
		contentPane.add(txtLhbkj);
		txtLhbkj.setColumns(10);
		
		textField = new JTextField();
		textField.setFont(new Font("Tunga", Font.PLAIN, 40));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(164, 483, 151, 85);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		
		
		radioButton = new JRadioButton("50");
		radioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.set_Ficha(50);
				
				
			}
		});

		radioButton.setOpaque(false);
		radioButton.setContentAreaFilled(false);
		radioButton.setBorderPainted(false);
		radioButton.setBounds(424, 357, 58, 23);
		contentPane.add(radioButton);
		
		
		radioButton_1 = new JRadioButton("100");
		radioButton_1.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent arg0) {
			control.set_Ficha(100);
			
			
		}
	});


		radioButton_1.setOpaque(false);
		radioButton_1.setContentAreaFilled(false);
		radioButton_1.setBorderPainted(false);
		radioButton_1.setBounds(424, 383, 58, 23);
		contentPane.add(radioButton_1);
	
		
		rdbtnNewRadioButton = new JRadioButton("500");
		rdbtnNewRadioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				control.set_Ficha(500);
			}
		});
		
		rdbtnNewRadioButton.setOpaque(false);
		rdbtnNewRadioButton.setContentAreaFilled(false);
		rdbtnNewRadioButton.setBorderPainted(false);
		rdbtnNewRadioButton.setBounds(424, 409, 58, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Matias\\Desktop\\Eclipse\\TPRuleta\\ruletaa.jpg"));
		lblNewLabel.setBounds(0, 0, 834, 640);
		contentPane.add(lblNewLabel);
		
		radioButton.setSelected(true);
		radioButton_1.setSelected(false);
		rdbtnNewRadioButton.setSelected(false);
		
		radioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				control.set_Ficha(50);
			}
		});
		
		radioButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				control.set_Ficha(100);
			}
		});
		
		rdbtnNewRadioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				control.set_Ficha(500);
			}
		});
	}
	
	public void show_Num(int num){
		textField.setText(Integer.toString(num));
	}
	
   public void refresh_Credit(int credit){
	   txtLhbkj.setText(Integer.toString(credit));
   }
   
   public void llenar_botonera(){

	    botonera.add(button_0);
	    botonera.add(button_1);
	    botonera.add(button_2);
	    botonera.add(button_3);
	    botonera.add(button_4);
	    botonera.add(button_5);
	    botonera.add(button_6);
	    botonera.add(button_7);
	    botonera.add(button_8);
	    botonera.add(button_9);
	    botonera.add(button_10);
	    botonera.add(button_11);
	    botonera.add(button_12);
	    botonera.add(button_13);
	    botonera.add(button_14);
	    botonera.add(button_15);
	    botonera.add(button_16);
	    botonera.add(button_17);
	    botonera.add(button_18);
	    botonera.add(button_19);
	    botonera.add(button_20);
	    botonera.add(button_21);
	    botonera.add(button_22);
	    botonera.add(button_23);
	    botonera.add(button_24);
	    botonera.add(button_25);
	    botonera.add(button_26);
	    botonera.add(button_27);
	    botonera.add(button_28);
	    botonera.add(button_29);
	    botonera.add(button_30);
	    botonera.add(button_31);
	    botonera.add(button_32);
	    botonera.add(button_33);
	    botonera.add(button_34);
	    botonera.add(button_35);
	    botonera.add(button_36);
	    botonera.add(button_37);
	    botonera.add(button_38);
	    botonera.add(button_39);
	    botonera.add(button_40);
	    botonera.add(button_41);
	    botonera.add(button_42);
	    botonera.add(button_43);
	    
   }
   
   public void Clear_table(){
	   
	   textField.setText("");
	    for(JButton boton:botonera){
	    	
	    	boton.setText("");
	    }

   }
   
   public void	add_ficha(int boton,int ficha){
	   
	   String apuesta= Integer.toString(ficha);
	   for(JButton buton:botonera){
		buton.setText(apuesta);
	   }
	   
   }
   
   public void cambiar_ficha(boolean ficha1,boolean ficha2,boolean ficha3){
	  
	    radioButton.setSelected(ficha1);
		radioButton_1.setSelected(ficha2);
		rdbtnNewRadioButton.setSelected(ficha3);
	   
   }
   
}