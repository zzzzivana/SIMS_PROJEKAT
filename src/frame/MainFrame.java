package frame;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;

import javax.swing.JFrame;

import frame.menuBar.CustomMenuBar;
import frame.toolbar.customToolBar;
import listeners.CustomWindowListener;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	public static Container framePosition = null;

	public MainFrame()
	{
		framePosition = this;
		//Osnovna podesavanja
		setTitle("SiMa");
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		 
		//podesavanja dimenzija i lokacije
		Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize = new Dimension(800,600);
		setSize(frameSize);	
		
		Point locatin = new Point((screenSize.width-frameSize.width)/2,(screenSize.height-frameSize.height)/2);
		setLocation(locatin);
		
		setMinimumSize(frameSize);
		
		// Podesavanje ikonice
		Image icon = java.awt.Toolkit.getDefaultToolkit().getImage("Ikonice/ikonica4.png").getScaledInstance(500,500,Image.SCALE_SMOOTH);
		setIconImage(icon);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		contentPane.add(new customToolBar(),BorderLayout.NORTH);
		contentPane.add(new MainPanel(), BorderLayout.CENTER);
		setJMenuBar(new CustomMenuBar());
		
		addWindowListener(new CustomWindowListener());
		
		
		setVisible(true);
	}
}
