package com.objis.cameroun.proxibanque.presentation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;

public class EspaceAdministrateur extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	/*public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		
		UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EspaceAdministrateur frame = new EspaceAdministrateur();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public EspaceAdministrateur() {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\BrandolKuete\\Pictures\\logo1.png"));
		setBackground(new Color(0, 255, 0));
		setTitle("Espace de l'administrateur");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1200, 750);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		contentPane.add(menuBaniere(),BorderLayout.NORTH);
		contentPane.add(positionnerBoutons(), BorderLayout.CENTER);
		contentPane.add(positionnerPied(), BorderLayout.SOUTH);
	}
	
	private static JPanel positionner() {
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setPreferredSize(new Dimension(1131,139));
		//panel.setBounds(100, 100, 1131, 139);
		panel.setLayout(new BorderLayout());
		
		JLabel lblSystmeDeGestion = new JLabel("Proxibanque SI");
		lblSystmeDeGestion.setForeground(Color.WHITE);
		lblSystmeDeGestion.setHorizontalAlignment(SwingConstants.CENTER);
		lblSystmeDeGestion.setFont(new Font("Verdana", Font.BOLD, 45));
		panel.add(lblSystmeDeGestion, BorderLayout.CENTER);
		
		return panel;
		
	}
	
	private static JMenuBar positionnerLeMenuBar() {
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(Color.BLACK);
		menuBar.setFont(new Font("Times New Roman", Font.BOLD, 12));
		menuBar.setBackground(Color.WHITE);
		
		JMenu mnFichier = new JMenu("Fichier");
		mnFichier.setFont(new Font("Times New Roman", Font.BOLD, 13));
		mnFichier.setForeground(new Color(0, 0, 0));
		menuBar.add(mnFichier);
		
		JMenu mnEdition = new JMenu("Edition");
		mnEdition.setForeground(new Color(0, 0, 0));
		mnEdition.setFont(new Font("Times New Roman", Font.BOLD, 13));
		menuBar.add(mnEdition);
		
		JMenu mnAffichage = new JMenu("Affichage");
		mnAffichage.setFont(new Font("Times New Roman", Font.BOLD, 13));
		mnAffichage.setForeground(new Color(0, 0, 0));
		menuBar.add(mnAffichage);
		
		JMenu mnOutils = new JMenu("Outils");
		mnOutils.setFont(new Font("Times New Roman", Font.BOLD, 13));
		mnOutils.setForeground(new Color(0, 0, 0));
		menuBar.add(mnOutils);
		
		JMenu mnAide = new JMenu("Aide");
		mnAide.setForeground(new Color(0, 0, 0));
		mnAide.setFont(new Font("Times New Roman", Font.BOLD, 13));
		menuBar.add(mnAide);
		
		return menuBar;
	}
	
	private static JPanel positionnerBoutons() {
		
		JPanel panel=new JPanel();
		panel.setLayout(new GridLayout(3, 2));
		
		JButton buton0=new JButton("Cr�er un utilisateur");
		buton0.setFont(new Font("Verdana", Font.BOLD, 14));
		buton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EnregistrerUser frame = new EnregistrerUser();
				frame.setVisible(true);
			}
		});
		panel.add(buton0);
		
		JButton buton1=new JButton("Ajouter une carte bancaire");
		buton1.setFont(new Font("Verdana", Font.BOLD, 14));
		buton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		panel.add(buton1);
		
		JButton buton2= new JButton("Ajouter une agence");
		buton2.setFont(new Font("Verdana", Font.BOLD, 14));
		buton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			}
		});
		panel.add(buton2);
		
		JButton buton3= new JButton("Ajouter un role");
		buton3.setFont(new Font("Verdana", Font.BOLD, 14));
		buton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AjouterRole frame = new AjouterRole();
				frame.setVisible(true);
			}
		});
		panel.add(buton3);
		
		JButton buton4=new JButton("Modifier un role");
		buton4.setFont(new Font("Verdana", Font.BOLD, 14));
		buton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ModifierRoleUser frame = new ModifierRoleUser();
				frame.setVisible(true);
			}
		});
		panel.add(buton4);
		
		JButton buton5=new JButton("Modifier un utilisateur");
		buton5.setFont(new Font("Verdana", Font.BOLD, 14));
		buton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
	
			}
		});
		panel.add(buton5);
		
		return panel;	
	}
	
	private static JPanel menuBaniere() {
		
		JPanel panel= new JPanel();
		panel.setLayout(new BorderLayout());
		
		panel.add(positionnerLeMenuBar(), BorderLayout.NORTH);
		panel.add(positionner(), BorderLayout.SOUTH);
		
		return panel;
		
	}
	
	private static JPanel positionnerPied(){
		
		JPanel panel= new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setLayout(new FlowLayout());
		
		JLabel lbl1= new JLabel("Copyright 2019");
		panel.add(lbl1);
		
		JLabel lbl2= new JLabel("Tous droits reserv�s");
		panel.add(lbl2);
		
		return panel;
		
	}
	
}
