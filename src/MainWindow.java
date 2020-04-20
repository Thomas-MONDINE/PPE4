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

	public JFrame mainFrame;
	public JTable MainTableClient;
	public JTable MainTableArticle;
	public JTable MainTableCommande;
	public JTextField SearchField_1;
	public JTextField SearchField_2;
	public JTextField SearchField_3;
	/**
	 * Initialize the contents of the table.
	 * and constant color
	 */
	public static final Color BGM = new Color(223,231,236);
	public static final Color BR = new Color(83,129,142);
	public static final Color BGS = new Color(117,149,179);
	public static final Color BLK = new Color(0,0,0);
	public Object[][] DATACLIENT = {{"John", "Doe","Rowing", new Integer(3), new Boolean(true)},
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
	public Object[] COLONNECLIENT= {"Prenom","Nom","Sport"};
	public Object[][] DATACOMMANDE = {{0, "Doe",127.5, new Integer(3), new Boolean(true)},
			{1, "Black", 225.70, new Integer(2), new Boolean(false)},
			{2, "White",99.99, new Integer(20), new Boolean(true)},
			{3, "Smith",10, new Integer(5), new Boolean(false)},
			{4, "Doe",127.5, new Integer(3), new Boolean(true)},
			{5, "Black",225.70, new Integer(2), new Boolean(false)},
			{6, "White", 99.99, new Integer(20), new Boolean(true)},
			{7, "Smith", 10, new Integer(5), new Boolean(false)},
			{8, "Doe", 127.5, new Integer(3), new Boolean(true)},
			{9, "Black", 225.70, new Integer(2), new Boolean(false)},
			{10, "White", 99.99, new Integer(20), new Boolean(true)},
			{11, "Smith", 10, new Integer(5), new Boolean(false)},
			{12, "Doe", 127.5, new Integer(3), new Boolean(true)},
			{13, "Black", 225.70, new Integer(2), new Boolean(false)},
			{14, "White", 99.99, new Integer(20), new Boolean(true)},
			{15, "Smith", 10, new Integer(5), new Boolean(false)},
			{16, "Doe", 127.5, new Integer(3), new Boolean(true)},
			{17, "Black", 225.70, new Integer(2), new Boolean(false)},
			{18, "White", 99.99, new Integer(20), new Boolean(true)},
			{19, "Smith", 10, new Integer(5), new Boolean(false)},
			{20, "Doe", 127.5, new Integer(3), new Boolean(true)},
			{21, "Black", 225.70, new Integer(2), new Boolean(false)},
			{22, "White", 99.99, new Integer(20), new Boolean(true)},
			{23, "Smith", 10, new Integer(5), new Boolean(false)},
			{24, "Doe", 127.5, new Integer(3), new Boolean(true)},
			{25, "Black", 225.70, new Integer(2), new Boolean(false)},
			{26, "White", 99.99, new Integer(20), new Boolean(true)},
			{27, "Smith", 10, new Integer(5), new Boolean(false)},
			{28, "Doe", 127.5, new Integer(3), new Boolean(true)},
			{29, "Black", 225.70, new Integer(2), new Boolean(false)},
			{30, "White", 99.99, new Integer(20), new Boolean(true)},
			{31, "Smith", 10, new Integer(5), new Boolean(false)},
			{32, "Doe", 127.5, new Integer(3), new Boolean(true)},
			{33, "Black", 225.70, new Integer(2), new Boolean(false)},
			{34, "White", 99.99, new Integer(20), new Boolean(true)},
			{35, "Smith", 10, new Integer(5), new Boolean(false)},
			{36, "Doe", 127.5, new Integer(3), new Boolean(true)},
			{37, "Black", 225.70, new Integer(2), new Boolean(false)},
			{38, "White", 99.99, new Integer(20), new Boolean(true)},
			{39, "Smith", 10, new Integer(5), new Boolean(false)},
			{40, "Doe", 127.5, new Integer(3), new Boolean(true)},
			{41, "Black", 225.70, new Integer(2), new Boolean(false)},
			{42, "White", 99.99, new Integer(20), new Boolean(true)},
			{43, "Smith", 10, new Integer(5), new Boolean(false)},
			{40, "Doe", 127.5, new Integer(3), new Boolean(true)},
			{45, "Black", 225.70, new Integer(2), new Boolean(false)},
			{46, "White", 99.99, new Integer(20), new Boolean(true)},						    
			{47, "Brown", "Pool", new Integer(10), new Boolean(false)}};	
	public Object[] COLONNECOMMANDE= {"Numero","Client","Montant"};
	public Object[][] DATAARTICLE = {{0, "Ecran",127.5, new Integer(3), new Boolean(true)},
			{1, "Disque Dur SDD", 225.70, new Integer(2), new Boolean(false)},
			{2, "Disque Dur HDD",99.99, new Integer(20), new Boolean(true)},
			{3, "Clé USB",10, new Integer(5), new Boolean(false)},
			{4, "Ecran",127.5, new Integer(3), new Boolean(true)},
			{5, "Disque Dur SDD",225.70, new Integer(2), new Boolean(false)},
			{6, "Disque Dur HDD", 99.99, new Integer(20), new Boolean(true)},
			{7, "Clé USB", 10, new Integer(5), new Boolean(false)},
			{8, "Ecran", 127.5, new Integer(3), new Boolean(true)},
			{9, "Disque Dur SDD", 225.70, new Integer(2), new Boolean(false)},
			{10, "Disque Dur HDD", 99.99, new Integer(20), new Boolean(true)},
			{11, "Clé USB", 10, new Integer(5), new Boolean(false)},
			{12, "Ecran", 127.5, new Integer(3), new Boolean(true)},
			{13, "Disque Dur SDD", 225.70, new Integer(2), new Boolean(false)},
			{14, "Disque Dur HDD", 99.99, new Integer(20), new Boolean(true)},
			{15, "Clé USB", 10, new Integer(5), new Boolean(false)},
			{16, "Ecran", 127.5, new Integer(3), new Boolean(true)},
			{17, "Disque Dur SDD", 225.70, new Integer(2), new Boolean(false)},
			{18, "Disque Dur HDD", 99.99, new Integer(20), new Boolean(true)},
			{19, "Clé USB", 10, new Integer(5), new Boolean(false)},
			{20, "Ecran", 127.5, new Integer(3), new Boolean(true)},
			{21, "Disque Dur SDD", 225.70, new Integer(2), new Boolean(false)},
			{22, "Disque Dur HDD", 99.99, new Integer(20), new Boolean(true)},
			{23, "Clé USB", 10, new Integer(5), new Boolean(false)},
			{24, "Ecran", 127.5, new Integer(3), new Boolean(true)},
			{25, "Disque Dur SDD", 225.70, new Integer(2), new Boolean(false)},
			{26, "Disque Dur HDD", 99.99, new Integer(20), new Boolean(true)},
			{27, "Clé USB", 10, new Integer(5), new Boolean(false)},
			{28, "Ecran", 127.5, new Integer(3), new Boolean(true)},
			{29, "Disque Dur SDD", 225.70, new Integer(2), new Boolean(false)},
			{30, "Disque Dur HDD", 99.99, new Integer(20), new Boolean(true)},
			{31, "Clé USB", 10, new Integer(5), new Boolean(false)},
			{32, "Ecran", 127.5, new Integer(3), new Boolean(true)},
			{33, "Disque Dur SDD", 225.70, new Integer(2), new Boolean(false)},
			{34, "Disque Dur HDD", 99.99, new Integer(20), new Boolean(true)},
			{35, "Clé USB", 10, new Integer(5), new Boolean(false)},
			{36, "Ecran", 127.5, new Integer(3), new Boolean(true)},
			{37, "Disque Dur SDD", 225.70, new Integer(2), new Boolean(false)},
			{38, "Disque Dur HDD", 99.99, new Integer(20), new Boolean(true)},
			{39, "Clé USB", 10, new Integer(5), new Boolean(false)},
			{40, "Ecran", 127.5, new Integer(3), new Boolean(true)},
			{41, "Disque Dur SDD", 225.70, new Integer(2), new Boolean(false)},
			{42, "Disque Dur HDD", 99.99, new Integer(20), new Boolean(true)},
			{43, "Clé USB", 10, new Integer(5), new Boolean(false)},
			{40, "Ecran", 127.5, new Integer(3), new Boolean(true)},
			{45, "Disque Dur SDD", 225.70, new Integer(2), new Boolean(false)},
			{46, "Disque Dur HDD", 99.99, new Integer(20), new Boolean(true)},						    
			{47, "Brown", "Pool", new Integer(10), new Boolean(false)}};	
	public Object[] COLONNEARTICLE= {"Numero","type","prix"};
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
	public void initialize() {
		
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
		JPanel PanelCache = new JPanel();
		PanelCache.setBounds(2, 98, 96, 4);
	// ==================== Panel Commande =======================
		JPanel PanelCommande = new JPanel();
		JLabel LabelCommandePicto = new JLabel(new ImageIcon("C:\\Users\\Axo\\eclipse-workspace\\ppe4\\src\\Resources\\121-paste.png"));
		JLabel LabelCommandePicto2 = new JLabel(new ImageIcon("C:\\Users\\Axo\\eclipse-workspace\\ppe4\\src\\Resources\\121-paste1.png"));
		JLabel LabelCommandeText = new JLabel("Commande");
		JLabel LabelCommandeText2 = new JLabel("Commande");
		PanelCommande.setLayout(null);
		PanelCommande.setBackground(BGS);
		PanelCommande.setBorder(new LineBorder(BR, 2, true));
		PanelCommande.setBounds(10, 22, 100, 100);
		LabelCommandePicto.setBackground(BGS);
		LabelCommandePicto.setBounds(0, 20, 100, 80);
		LabelCommandePicto2.setBackground(BGM);
		LabelCommandePicto2.setBounds(0, 20, 100, 80);
		LabelCommandeText.setForeground(BLK);
		LabelCommandeText.setHorizontalAlignment(SwingConstants.CENTER);
		LabelCommandeText.setFont(new Font("Tahoma", Font.PLAIN, 19));
		LabelCommandeText.setBackground(BGS);
		LabelCommandeText.setBounds(0, 0, 100, 30);
		LabelCommandeText2.setForeground(BGS);
		LabelCommandeText2.setHorizontalAlignment(SwingConstants.CENTER);
		LabelCommandeText2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		LabelCommandeText2.setBackground(BGM);
		LabelCommandeText2.setBounds(0, 0, 100, 30);
		PanelCommande.add(LabelCommandePicto);
		PanelCommande.add(LabelCommandeText);
		MainPanel.add(PanelCommande);
	// =========================================================
	// ====================== Panel Client ==================
		//Panel Client Déclaration
		JPanel PanelClient = new JPanel();
		JLabel LabelClientPicto = new JLabel(new ImageIcon("C:\\Users\\Axo\\eclipse-workspace\\ppe4\\src\\Resources\\028-user-11.png"));
		JLabel LabelClientPicto2 = new JLabel(new ImageIcon("C:\\Users\\Axo\\eclipse-workspace\\ppe4\\src\\Resources\\028-user-1.png"));
		JLabel LabelClientText = new JLabel("Client");
		JLabel LabelClientText2 = new JLabel("Client");
		// Panel Client définition
		PanelClient.setLayout(null);
		PanelClient.setBackground(BGS);
		PanelClient.setBorder(new LineBorder(BR, 2, true));
		PanelClient.setBounds(120, 22, 100, 100);
		LabelClientPicto.setBackground(BGS);
		LabelClientPicto.setBounds(0, 20, 100, 80);
		LabelClientPicto2.setBackground(BGM);
		LabelClientPicto2.setBounds(0, 20, 100, 80);
		LabelClientText.setForeground(BLK);
		LabelClientText.setHorizontalAlignment(SwingConstants.CENTER);
		LabelClientText.setFont(new Font("Tahoma", Font.PLAIN, 19));
		LabelClientText.setBackground(BGS);
		LabelClientText.setBounds(0, 0, 100, 30);
		LabelClientText2.setForeground(BGS);
		LabelClientText2.setHorizontalAlignment(SwingConstants.CENTER);
		LabelClientText2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		LabelClientText2.setBackground(BGM);
		LabelClientText2.setBounds(0, 0, 100, 30);
		// Panel Client Add
		PanelClient.add(LabelClientPicto);
		PanelClient.add(LabelClientText);
		MainPanel.add(PanelClient);
	// =========================================================
	// ====================== Panel Article ==================
		//Panel Article Déclaration
		JPanel PanelArticle = new JPanel();
		JLabel LabelArticlePicto = new JLabel(new ImageIcon("C:\\Users\\Axo\\eclipse-workspace\\ppe4\\src\\Resources\\091-shopping-cart.png"));
		JLabel LabelArticlePicto2 = new JLabel(new ImageIcon("C:\\Users\\Axo\\eclipse-workspace\\ppe4\\src\\Resources\\091-shopping-cart1.png"));
		JLabel LabelArticleText = new JLabel("Article");
		JLabel LabelArticleText2 = new JLabel("Article");
		// Panel Article définition
		PanelArticle.setLayout(null);
		PanelArticle.setBackground(BGS);
		PanelArticle.setBorder(new LineBorder(BR, 2, true));
		PanelArticle.setBounds(230, 22, 100, 100);
		LabelArticlePicto.setBackground(BGS);
		LabelArticlePicto.setBounds(0, 20, 100, 80);
		LabelArticlePicto2.setBackground(BGM);
		LabelArticlePicto2.setBounds(0, 20, 100, 80);
		LabelArticleText.setForeground(BLK);
		LabelArticleText.setHorizontalAlignment(SwingConstants.CENTER);
		LabelArticleText.setFont(new Font("Tahoma", Font.PLAIN, 19));
		LabelArticleText.setBackground(BGS);
		LabelArticleText.setBounds(0, 0, 100, 30);
		LabelArticleText2.setForeground(BGS);
		LabelArticleText2.setHorizontalAlignment(SwingConstants.CENTER);
		LabelArticleText2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		LabelArticleText2.setBackground(BGM);
		LabelArticleText2.setBounds(0, 0, 100, 30);
		// Panel Article Add
		PanelArticle.add(LabelArticlePicto);
		PanelArticle.add(LabelArticleText);
		MainPanel.add(PanelArticle);
	// =========================================================
	// Panels Accesoires Déclaration
		JPanel PanelPrint = new JPanel();
		JLabel LabelPrintPicto = new JLabel(new ImageIcon("C:\\Users\\Axo\\Pictures\\Saved Pictures\\119-printer1GRIS.png"));
		JLabel LabelPrintText = new JLabel("Imprimer");
		JPanel PanelOption = new JPanel();
		JLabel LabelOptionPicto = new JLabel(new ImageIcon("C:\\Users\\Axo\\Pictures\\Saved Pictures\\073-settings1.png"));
		JLabel LabelOptionText = new JLabel("Réglages");
		JPanel PanelQuit = new JPanel();
		JLabel LabelQuitPicto = new JLabel(new ImageIcon("C:\\Users\\Axo\\Pictures\\Saved Pictures\\069-log-in1.png"));
		JLabel LabelQuitText = new JLabel("Deconexion");
	// Panel Accessoires Définition
		PanelPrint.setLayout(null);
		LabelPrintText.setForeground(BGS);
		LabelPrintText.setHorizontalAlignment(SwingConstants.CENTER);
		LabelPrintText.setFont(new Font("Tahoma", Font.PLAIN, 20));
		LabelPrintText.setBounds(0, 0, 100, 30);
		PanelPrint.setBounds(532, 10, 100, 100);
		PanelPrint.setBorder(new LineBorder(BR, 5, true));
		LabelPrintPicto.setBounds(0, 20, 100, 80);
		PanelOption.setLayout(null);
		LabelOptionText.setForeground(BGS);
		LabelOptionText.setHorizontalAlignment(SwingConstants.CENTER);
		LabelOptionText.setFont(new Font("Tahoma", Font.PLAIN, 20));
		LabelOptionText.setBounds(0, 0, 100, 30);
		PanelOption.setBorder(new LineBorder(BR, 5, true));
		PanelOption.setBounds(768, 10, 100, 100);
		LabelOptionPicto.setBounds(0, 20, 100, 80);
		PanelQuit.setLayout(null);
		LabelQuitText.setForeground(BGS);
		LabelQuitText.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQuitText.setFont(new Font("Tahoma", Font.PLAIN, 16));
		LabelQuitText.setBounds(0, 0, 100, 30);
		PanelQuit.setBounds(878, 10, 100, 100);
		PanelQuit.setBorder(new LineBorder(BR, 5, true));
		LabelQuitPicto.setBounds(0, 20, 100, 80);
	//Add Panel Accessoires
		PanelPrint.add(LabelPrintPicto);
		PanelPrint.add(LabelPrintText);
		PanelOption.add(LabelOptionPicto);
		PanelOption.add(LabelOptionText);
		PanelQuit.add(LabelQuitPicto);
		PanelQuit.add(LabelQuitText);
		MainPanel.add(PanelPrint);
		MainPanel.add(PanelQuit);
		MainPanel.add(PanelOption);
// =================================================================			
		JPanel PanelMain = new JPanel();
		PanelMain.setBounds(10, 120, 968, 575);
		MainPanel.add(PanelMain);
		PanelMain.setLayout(null);
		JPanel PanelMainAffichage = new JPanel();
		PanelMainAffichage.setBounds(0, 0, 968, 575);
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
		
	//panel Affichage Client
		JScrollPane MainScrollPaneClient = new JScrollPane();
		MainScrollPaneClient.setBorder(new LineBorder(BR,2,true));
		MainScrollPaneClient.setBounds(145, 56, 813, 290);
		PanelMainAffichage.add(MainScrollPaneClient);			
		MainTableClient = new JTable(DATACLIENT,COLONNECLIENT);
		MainTableClient.setBorder(null);
		MainTableClient.setFont(new Font("Tahoma", Font.PLAIN, 14));
		MainScrollPaneClient.setViewportView(MainTableClient);
	//pannel affichage Commande
		JScrollPane MainScrollPaneCommande = new JScrollPane();
		MainScrollPaneCommande.setBorder(new LineBorder(BR,2,true));
		MainScrollPaneCommande.setBounds(145, 56, 813, 290);
		PanelMainAffichage.add(MainScrollPaneCommande);	
		MainTableCommande = new JTable(DATACOMMANDE,COLONNECOMMANDE);
		MainTableCommande.setBorder(null);
		MainTableCommande.setFont(new Font("Tahoma", Font.PLAIN, 14));
		MainScrollPaneCommande.setViewportView(MainTableCommande);
	//panel affichage Article
		JScrollPane MainScrollPaneArticle = new JScrollPane();
		MainScrollPaneArticle.setBorder(new LineBorder(BR,2,true));
		MainScrollPaneArticle.setBounds(145, 56, 813, 290);
		PanelMainAffichage.add(MainScrollPaneArticle);	
		MainTableArticle = new JTable(DATAARTICLE,COLONNEARTICLE);
		MainTableArticle.setBorder(null);
		MainTableArticle.setFont(new Font("Tahoma", Font.PLAIN, 14));
		MainScrollPaneArticle.setViewportView(MainTableArticle);
		
		JButton CrationButton = new JButton("Ajouter");
		CrationButton.setForeground(BGS);
		CrationButton.setBackground(BGM);
		CrationButton.setBorder(new LineBorder(BR,2,true));
		CrationButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		CrationButton.setVerticalAlignment(SwingConstants.TOP);
		CrationButton.setBounds(10, 136, 125, 93);
		PanelMainAffichage.add(CrationButton);
		
		JTextField SearchField_1 = new JTextField();
		SearchField_1.setBorder(new LineBorder(BR,2,true));
		SearchField_1.setBounds(235, 25, 125, 20);
		PanelMainAffichage.add(SearchField_1);
		SearchField_1.setColumns(10);
		JTextField SearchField_2 = new JTextField();
		SearchField_2.setBorder(new LineBorder(BR,2,true));
		SearchField_2.setBounds(441, 25, 125, 20);
		PanelMainAffichage.add(SearchField_2);
		SearchField_2.setColumns(10);
		JTextField SearchField_3 = new JTextField();
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
		
		JPanel PanelMainAcceuil = new JPanel();
		PanelMainAcceuil.setBackground(BGM);
		PanelMainAcceuil.setBorder(new LineBorder(BR, 2, true));
		PanelMainAcceuil.setBounds(0, 0, 968, 575);
		PanelMainAcceuil.setLayout(null);
		JLabel LabelMainAcceuilPicto = new JLabel(new ImageIcon("C:\\Users\\Axo\\eclipse-workspace\\ppe4\\src\\Resources\\Shopping 05.jpg"));
		LabelMainAcceuilPicto.setBounds(0, 0, 968, 575);
		PanelMainAcceuil.add(LabelMainAcceuilPicto);
		PanelMain.add(PanelMainAffichage);
// =============================================================================================================
// PANEL PRINCIPAUX LISTENERS
		PanelClient.addMouseListener(
			new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					/* Allume button Client
					 * Eteint Commande
					 * Eteint Article
					 * Désaffiche Article/Commande
					 * Affiche Client
					 */
					PanelArticle.setBackground(BGS);
					PanelClient.setBackground(BGM);
					PanelCommande.setBackground(BGS);
					PanelCommande.removeAll();
					PanelClient.removeAll();
					PanelArticle.removeAll();
					PanelCommande.add(LabelCommandePicto);
					PanelCommande.add(LabelCommandeText);
					PanelClient.add(LabelClientPicto2);
					PanelClient.add(LabelClientText2);
					PanelArticle.add(LabelArticleText);
					PanelArticle.add(LabelArticlePicto);
					PanelCommande.repaint();
					PanelArticle.repaint();//Refresh
					PanelClient.repaint();
					/*
					 * Afficher PannelMainAffichage
					 * Cacher MainAcceuil
					 */
				}
			}
		);
		PanelArticle.addMouseListener(
			new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					/* Allume button Article
					 * Eteint CLient
					 * Eteint Commande
					 * Désafiche Commande/Client
					 * Affiche Article 
					 * Désaficher actuel
					 */
					PanelArticle.setBackground(BGM);
					PanelClient.setBackground(BGS);
					PanelCommande.setBackground(BGS);
					PanelCommande.removeAll();
					PanelClient.removeAll();
					PanelArticle.removeAll();
					PanelCommande.add(LabelCommandePicto);
					PanelCommande.add(LabelCommandeText);
					PanelClient.add(LabelClientPicto);
					PanelClient.add(LabelClientText);
					PanelArticle.add(LabelArticleText2);
					PanelArticle.add(LabelArticlePicto2);
					PanelCommande.repaint();
					PanelArticle.repaint();//Refresh
					PanelClient.repaint();
				}
			}
		);
		PanelCommande.addMouseListener(
			new MouseAdapter() {
			@Override
				public void mouseClicked(MouseEvent arg0) {
					/* Allume button Commamde
					 * Eteint CLient
					 * Eteint Article
					 * Désafiche Article/Client
					 * Affiche Commande 
					 */
				PanelArticle.setBackground(BGS);
				PanelClient.setBackground(BGS);
				PanelCommande.setBackground(BGM);
				PanelCommande.removeAll();
				PanelClient.removeAll();
				PanelArticle.removeAll();
				PanelCommande.add(LabelCommandePicto2);
				PanelCommande.add(LabelCommandeText2);
				PanelClient.add(LabelClientPicto);
				PanelClient.add(LabelClientText);
				PanelArticle.add(LabelArticleText);
				PanelArticle.add(LabelArticlePicto);
				PanelCommande.repaint();
				PanelArticle.repaint();//Refresh
				PanelClient.repaint();
				}
			}
		);
		
	}
}
