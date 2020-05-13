package AFFICHAGE;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class WindowsMain extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2318367421856503226L;

	public WindowsMain() {
		
		super("Accueil");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setSize(600, 800);
		this.setLocationRelativeTo(null);
		JPanel contentPane= (JPanel) this.getContentPane();
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT));
		contentPane.add(new JButton("push me"));
		contentPane.add(new JButton("push toi"));
		contentPane.add(new JCheckBox("CHECK ME"));
		contentPane.add(new JTextField("edit me"));
		
		
		
	}
	
	
	public static void main(String[] args) throws Exception {
		
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		
		WindowsMain winMain=new WindowsMain();
		winMain.setVisible(true);

	}

}
