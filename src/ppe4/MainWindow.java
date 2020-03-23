package ppe4;
import javax.swing.*;
import java.awt.*;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class MainWindow {

	private JFrame mainFrame;
	private JTable MainTable;
	private JTextField SearchField_1;
	private JTextField SearchField_2;
	private JTextField SearchField_3;
	/**
	 * Initialize the contents of the table.
	 * and constant color
	 */
	private Color BGM = new Color(223,231,236);
	private Color BR = new Color(83,129,142);
	private Color BGS = new Color(117,149,179);
	private Object[][] DATA = {{"John", "Doe","Rowing", new Integer(3), new Boolean(true)},
		{"Sue", "Black", "Knitting", new Integer(2), new Boolean(false)},
		{"Jane", "White","Speed reading", new Integer(20), new Boolean(true)},
		{"Kathy", "Smith","Snowboarding", new Integer(5), new Boolean(false)},
		{"John", "Doe","Rowing", new Integer(3), new Boolean(true)},
		{"Sue", "Black","Knitting", new Integer(2), new Boolean(false)},
		{"Jane", "White", "Speed reading", new Integer(20), new Boolean(true)},
		{"Kathy", "Smith", "Snowboarding", new Integer(5), new Boolean(false)},
		{"John", "Doe", "Rowing", new Integer(3), new Boolean(true)},
		{"Sue", "Black", "Knitting", new Integer(2), new Boolean(false)},
		{"Jane", "White", "Speed reading", new Integer(20), new Boolean(true)},
		{"Kathy", "Smith", "Snowboarding", new Integer(5), new Boolean(false)},
		{"John", "Doe", "Rowing", new Integer(3), new Boolean(true)},
		{"Sue", "Black", "Knitting", new Integer(2), new Boolean(false)},
		{"Jane", "White", "Speed reading", new Integer(20), new Boolean(true)},
		{"Kathy", "Smith", "Snowboarding", new Integer(5), new Boolean(false)},
		{"John", "Doe", "Rowing", new Integer(3), new Boolean(true)},
		{"Sue", "Black", "Knitting", new Integer(2), new Boolean(false)},
		{"Jane", "White", "Speed reading", new Integer(20), new Boolean(true)},
		{"Kathy", "Smith", "Snowboarding", new Integer(5), new Boolean(false)},
		{"John", "Doe", "Rowing", new Integer(3), new Boolean(true)},
		{"Sue", "Black", "Knitting", new Integer(2), new Boolean(false)},
		{"Jane", "White", "Speed reading", new Integer(20), new Boolean(true)},
		{"Kathy", "Smith", "Snowboarding", new Integer(5), new Boolean(false)},
		{"John", "Doe", "Rowing", new Integer(3), new Boolean(true)},
		{"Sue", "Black", "Knitting", new Integer(2), new Boolean(false)},
		{"Jane", "White", "Speed reading", new Integer(20), new Boolean(true)},
		{"Kathy", "Smith", "Snowboarding", new Integer(5), new Boolean(false)},
		{"John", "Doe", "Rowing", new Integer(3), new Boolean(true)},
		{"Sue", "Black", "Knitting", new Integer(2), new Boolean(false)},
		{"Jane", "White", "Speed reading", new Integer(20), new Boolean(true)},
		{"Kathy", "Smith", "Snowboarding", new Integer(5), new Boolean(false)},
		{"John", "Doe", "Rowing", new Integer(3), new Boolean(true)},
		{"Sue", "Black", "Knitting", new Integer(2), new Boolean(false)},
		{"Jane", "White", "Speed reading", new Integer(20), new Boolean(true)},
		{"Kathy", "Smith", "Snowboarding", new Integer(5), new Boolean(false)},
		{"John", "Doe", "Rowing", new Integer(3), new Boolean(true)},
		{"Sue", "Black", "Knitting", new Integer(2), new Boolean(false)},
		{"Jane", "White", "Speed reading", new Integer(20), new Boolean(true)},
		{"Kathy", "Smith", "Snowboarding", new Integer(5), new Boolean(false)},
		{"John", "Doe", "Rowing", new Integer(3), new Boolean(true)},
		{"Sue", "Black", "Knitting", new Integer(2), new Boolean(false)},
		{"Jane", "White", "Speed reading", new Integer(20), new Boolean(true)},
		{"Kathy", "Smith", "Snowboarding", new Integer(5), new Boolean(false)},
		{"John", "Doe", "Rowing", new Integer(3), new Boolean(true)},
		{"Sue", "Black", "Knitting", new Integer(2), new Boolean(false)},
		{"Jane", "White", "Speed reading", new Integer(20), new Boolean(true)},						    
		{"Joe", "Brown", "Pool", new Integer(10), new Boolean(false)}};
	
	private Object[] COLONNE= {"First Name","Last Name","Sport"};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.mainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
				initialize();
	}



	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		 
		
		
		mainFrame = new JFrame();
		mainFrame.getContentPane().setBackground(new Color(192,192,192));
		mainFrame.setBounds(100, 100, 1024, 768);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.getContentPane().setLayout(null);
		
		JPanel MainPanel = new JPanel();
		MainPanel.setBackground(BGM);
		MainPanel.setBounds(10, 10, 988, 707);
		mainFrame.getContentPane().add(MainPanel);
		MainPanel.setLayout(null);
		
		JPanel PanelCommande = new JPanel();
		PanelCommande.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				PanelCommande.repaint();//Refresh
			}
		});
		PanelCommande.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				/* Allume button Commamde
				 * Eteint CLient
				 * Eteint Article
				 * Désafiche Article/Client
				 * Affiche Commande 
				 */

				
			
			
			}
		});
		PanelCommande.setLayout(null);
		PanelCommande.setBackground(BGM);
		PanelCommande.setBorder(new LineBorder(BR, 2, true));
		PanelCommande.setBounds(10, 22, 100, 100);
		MainPanel.add(PanelCommande);
		
		JLabel CommandeButtonPicto = new JLabel(new ImageIcon("C:\\Users\\Axo\\Pictures\\121-paste1.png"));
		CommandeButtonPicto.setBackground(BGM);
		CommandeButtonPicto.setBounds(0, 20, 100, 80);
		PanelCommande.add(CommandeButtonPicto);
		
		JLabel CommandeLabelText = new JLabel("Commande");
		CommandeLabelText.setForeground(BGS);
		CommandeLabelText.setHorizontalAlignment(SwingConstants.CENTER);
		CommandeLabelText.setFont(new Font("Tahoma", Font.PLAIN, 19));
		CommandeLabelText.setBackground(BGM);
		CommandeLabelText.setBounds(0, 0, 100, 30);
		PanelCommande.add(CommandeLabelText);
		
		JPanel panelcache1 = new JPanel();
		panelcache1.setBounds(2, 98, 96, 4);
		PanelCommande.add(panelcache1);
		
		JPanel PanelClient = new JPanel();
		PanelClient.setBackground(BGS);
		PanelClient.setLayout(null);
		PanelClient.setBorder(new LineBorder(BR, 2, true));
		PanelClient.setBounds(230, 22, 100, 100);
		
		MainPanel.add(PanelClient);
		
		JLabel LabelClientPicto = new JLabel(new ImageIcon("C:\\Users\\Axo\\eclipse-workspace\\ppe4\\src\\Resources\\user.png"));
		LabelClientPicto.setFocusable(false);
		LabelClientPicto.setFocusTraversalKeysEnabled(false);
		LabelClientPicto.setBackground(BGM);
		LabelClientPicto.setBounds(0, 20, 100, 80);
		PanelClient.add(LabelClientPicto);
		
		JLabel LabelClientText = new JLabel("Client");
		LabelClientText.setFocusTraversalKeysEnabled(false);
		LabelClientText.setFocusable(false);
		LabelClientText.setForeground(BGM);
		LabelClientText.setHorizontalAlignment(SwingConstants.CENTER);
		LabelClientText.setFont(new Font("Tahoma", Font.PLAIN, 19));
		LabelClientText.setBackground(BGM);
		LabelClientText.setBounds(0, 0, 100, 30);
		PanelClient.add(LabelClientText);
		PanelClient.addMouseListener(
				new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						/* Allume button Client
						 * Eteint Commande
						 * Eteint Article
						 * Désaffiche Article/Commande
						 * Affiche Client
						 */
						PanelClient.setBackground(BGM);
						JLabel LabelClientPicto2 = new JLabel(new ImageIcon("C:\\Users\\Axo\\eclipse-workspace\\ppe4\\src\\Resources\\028-user-11.png"));
						LabelClientPicto2.setBackground(BGM);
						LabelClientPicto2.setBounds(0, 20, 100, 80);
						LabelClientText.setForeground(BGS);
						PanelClient.add(LabelClientPicto2);
						PanelClient.remove(LabelClientPicto);
						PanelClient.repaint();//Refresh
					}
				}
		);
		
		
		JPanel PanelArticle = new JPanel();
		PanelArticle.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/* Allume button Article
				 * Eteint CLient
				 * Eteint Commande
				 * Désafiche Commande/Client
				 * Affiche Article 
				 */
			}
		});
		PanelArticle.setBackground(BGS);
		PanelArticle.setLayout(null);
		PanelArticle.setBorder(new LineBorder(BR, 2, true));
		PanelArticle.setBounds(120, 22, 100, 100);
		MainPanel.add(PanelArticle);
		
		JLabel LabelArticlePicto = new JLabel(new ImageIcon("C:\\Users\\Axo\\eclipse-workspace\\ppe4\\src\\Resources\\091-shopping-cart.png"));
		LabelArticlePicto.setBackground(BGM);
		LabelArticlePicto.setBounds(0, 20, 100, 80);
		PanelArticle.add(LabelArticlePicto);
		
		JLabel LabelArticletText = new JLabel("Article");
		LabelArticletText.setForeground(new Color(0, 0, 0));
		LabelArticletText.setHorizontalAlignment(SwingConstants.CENTER);
		LabelArticletText.setFont(new Font("Tahoma", Font.PLAIN, 19));
		LabelArticletText.setBackground(BGM);
		LabelArticletText.setBounds(0, 0, 100, 30);
		PanelArticle.add(LabelArticletText);
		
		JPanel PanelPrint = new JPanel();
		PanelPrint.setBounds(532, 10, 100, 100);
		PanelPrint.setBorder(new LineBorder(BR, 5, true));
		MainPanel.add(PanelPrint);
		PanelPrint.setLayout(null);
		
		JLabel PrintLabelPicto = new JLabel(new ImageIcon("C:\\Users\\Axo\\Pictures\\Saved Pictures\\119-printer1GRIS.png"));
		PrintLabelPicto.setBounds(0, 20, 100, 80);
		PanelPrint.add(PrintLabelPicto);
		
		JLabel PrintLabelText = new JLabel("Imprimer");
		PrintLabelText.setForeground(BGS);
		PrintLabelText.setHorizontalAlignment(SwingConstants.CENTER);
		PrintLabelText.setFont(new Font("Tahoma", Font.PLAIN, 20));
		PrintLabelText.setBounds(0, 0, 100, 30);
		PanelPrint.add(PrintLabelText);
		
		JPanel PannelOption = new JPanel();
		PannelOption.setLayout(null);
		PannelOption.setBorder(new LineBorder(BR, 5, true));
		PannelOption.setBounds(768, 10, 100, 100);		
		MainPanel.add(PannelOption);
		
		JPanel PanelQuit = new JPanel();
		PanelQuit.setLayout(null);
		PanelQuit.setBorder(new LineBorder(BR, 5, true));
		PanelQuit.setBounds(878, 10, 100, 100);
		MainPanel.add(PanelQuit);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 120, 968, 575);
		MainPanel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel PanelMainAffichage = new JPanel();
		PanelMainAffichage.setBounds(0, 0, 968, 575);
		panel_1.add(PanelMainAffichage);
		PanelMainAffichage.setBorder(new LineBorder(BR, 2, true));
		PanelMainAffichage.setBackground(BGM);
		PanelMainAffichage.setLayout(null);
		
		JPanel SecondaryPanel = new JPanel();
		SecondaryPanel.setBorder(new LineBorder(BR, 2, true));
		SecondaryPanel.setBounds(10, 357, 948, 207);
		SecondaryPanel.setBackground(BGM);
		PanelMainAffichage.add(SecondaryPanel);
		SecondaryPanel.setLayout(null);
		
		
		JButton ModifyButton = new JButton("Modifier");
		ModifyButton.setBackground(BGM);
		ModifyButton.setForeground(BGS);
		ModifyButton.setBorder(new LineBorder(BR,2,true));
		ModifyButton.setVerticalAlignment(SwingConstants.TOP);
		ModifyButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		ModifyButton.setBounds(830, 20, 100, 75);
		SecondaryPanel.add(ModifyButton);
		
		JButton DeleteButton = new JButton("Supprimer");
		DeleteButton.setBackground(BGM);
		DeleteButton.setForeground(BGS);
		DeleteButton.setBorder(new LineBorder(BR,2,true));
		DeleteButton.setVerticalAlignment(SwingConstants.TOP);
		DeleteButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		DeleteButton.setBounds(830, 115, 100, 75);
		SecondaryPanel.add(DeleteButton);
		
		JPanel PanelSecondaryAffichage = new JPanel();
		PanelSecondaryAffichage.setBackground(BGM);
		PanelSecondaryAffichage.setBounds(10, 11, 813, 185);
		SecondaryPanel.add(PanelSecondaryAffichage);
		PanelSecondaryAffichage.setLayout(null);
		
		JScrollPane MainScrollPane = new JScrollPane();
		MainScrollPane.setBorder(new LineBorder(BR,2,true));
		MainScrollPane.setBounds(145, 56, 813, 290);
		PanelMainAffichage.add(MainScrollPane);
				
		MainTable = new JTable(DATA,COLONNE);
		MainTable.setBorder(null);
		MainTable.setFont(new Font("Tahoma", Font.PLAIN, 14));
		MainScrollPane.setViewportView(MainTable);
		
		JButton CrationButton = new JButton("Ajouter");
		CrationButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PanelCommande.setBackground(BGS);
			}
		});
		CrationButton.setForeground(BGS);
		CrationButton.setBackground(BGM);
		CrationButton.setBorder(new LineBorder(BR,2,true));
		CrationButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		CrationButton.setVerticalAlignment(SwingConstants.TOP);
		CrationButton.setBounds(10, 136, 125, 93);
		PanelMainAffichage.add(CrationButton);
		
		SearchField_1 = new JTextField();
		SearchField_1.setBorder(new LineBorder(BR,2,true));
		SearchField_1.setBounds(235, 25, 125, 20);
		PanelMainAffichage.add(SearchField_1);
		SearchField_1.setColumns(10);
		
		SearchField_2 = new JTextField();
		SearchField_2.setBorder(new LineBorder(BR,2,true));
		SearchField_2.setBounds(441, 25, 125, 20);
		PanelMainAffichage.add(SearchField_2);
		SearchField_2.setColumns(10);
		
		SearchField_3 = new JTextField();
		SearchField_3.setBorder(new LineBorder(BR,2,true));
		SearchField_3.setBounds(666, 25, 125, 20);
		PanelMainAffichage.add(SearchField_3);
		SearchField_3.setColumns(10);
		
		JLabel SearchLabel_1 = new JLabel("SearchLabel");
		SearchLabel_1.setBounds(170, 25, 70, 15);
		PanelMainAffichage.add(SearchLabel_1);
		
		JLabel SearchLabel_2 = new JLabel("SearchLabel");
		SearchLabel_2.setBounds(370, 25, 75, 15);
		PanelMainAffichage.add(SearchLabel_2);
		
		JLabel SearchLabel_3 = new JLabel("SearchLabel");
		SearchLabel_3.setBounds(580, 25, 75, 15);
		PanelMainAffichage.add(SearchLabel_3);
		
		JButton FilterButton = new JButton("Rechercher");
		FilterButton.setForeground(BGS);
		FilterButton.setBackground(BGM);
		FilterButton.setBorder(new LineBorder(BR,2,true));
		FilterButton.setVerticalAlignment(SwingConstants.TOP);
		FilterButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		FilterButton.setBounds(806, 11, 139, 34);
		PanelMainAffichage.add(FilterButton);
		
		JPanel PannelMainAcceuil = new JPanel();
		PannelMainAcceuil.setBackground(BGM);
		PannelMainAcceuil.setBorder(new LineBorder(BR, 2, true));
		PannelMainAcceuil.setBounds(0, 0, 968, 575);
		panel_1.add(PannelMainAcceuil);
		PannelMainAcceuil.setLayout(null);
		
	}
}
