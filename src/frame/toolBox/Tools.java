package frame.toolBox;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import listeners.CustomToolBarListener;
import listeners.CustomToolBoxListener;

public class Tools extends JPanel{

	private static final long serialVersionUID = 1L;

	JButton buttonHomePage = null;
	JButton buttonSubPage = null;
	JButton buttonGroupPages = null;
	JButton buttonComment = null;
	JButton buttonChangeColor = null;
	JButton buttonConnect = null;
	JButton buttonIntersection = null;
	JButton buttonAddAtachment = null;
	JButton buttonAddImage = null;
	JButton buttonAddAudio = null;
	JButton buttonAddVideo = null;
	JButton buttonFuturePgae = null;
	JButton buttonLockPage = null;
	
	public Tools()
	{
		FlowLayout raspored = new FlowLayout(4);
		setLayout(raspored);

		CustomToolBoxListener customToolBoxListeer = new CustomToolBoxListener();
		
		buttonHomePage = new JButton();
		buttonHomePage.setIcon(new ImageIcon("Ikonice/24x24.png"));
		buttonHomePage.setPreferredSize(new Dimension(30,30));
		buttonHomePage.setToolTipText("Home stranica");
		buttonHomePage.setActionCommand("homePage");
		buttonHomePage.setOpaque(false);             
		buttonHomePage.setContentAreaFilled(false);  
		buttonHomePage.setBorderPainted(false);
		buttonHomePage.addActionListener(customToolBoxListeer);
		add(buttonHomePage);
		
		buttonSubPage = new JButton();
		buttonSubPage.setIcon(new ImageIcon("Ikonice/rectangle-icon (1).png"));
		buttonSubPage.setPreferredSize(new Dimension(30,30));
		buttonSubPage.setToolTipText("Stranica");
		buttonSubPage.setActionCommand("subPage");
		buttonSubPage.setOpaque(false);             
		buttonSubPage.setContentAreaFilled(false);  
		buttonSubPage.setBorderPainted(false);
		buttonSubPage.addActionListener(customToolBoxListeer);
		add(buttonSubPage);
		
		buttonGroupPages = new JButton();
		buttonGroupPages.setIcon(new ImageIcon("Ikonice/grupa-stranica.png"));
		buttonGroupPages.setPreferredSize(new Dimension(30,30));
		buttonGroupPages.setToolTipText("Grupa stranica");
		buttonGroupPages.setActionCommand("gropuPages");
		buttonGroupPages.setOpaque(false);             
		buttonGroupPages.setContentAreaFilled(false);  
		buttonGroupPages.setBorderPainted(false);
		buttonGroupPages.addActionListener(customToolBoxListeer);
		add(buttonGroupPages);
		
		buttonFuturePgae = new JButton();
		buttonFuturePgae.setIcon(new ImageIcon("Ikonice/shape-24x24.png"));
		buttonFuturePgae.setPreferredSize(new Dimension(30,30));
		buttonFuturePgae.setToolTipText("Buduća stranica");
		buttonFuturePgae.setActionCommand("futurePage");
		buttonFuturePgae.setOpaque(false);             
		buttonFuturePgae.setContentAreaFilled(false);  
		buttonFuturePgae.setBorderPainted(false);
		buttonFuturePgae.addActionListener(customToolBoxListeer);
		add(buttonFuturePgae);
		
		buttonConnect = new JButton();
		buttonConnect.setIcon(new ImageIcon("Ikonice/24x24link.png"));
		buttonConnect.setPreferredSize(new Dimension(30,30));
		buttonConnect.setToolTipText("Povezivanje");
		buttonConnect.setActionCommand("connect");
		buttonConnect.setOpaque(false);             
		buttonConnect.setContentAreaFilled(false);  
		buttonConnect.setBorderPainted(false);
		buttonConnect.addActionListener(customToolBoxListeer);
		add(buttonConnect);
		
		buttonIntersection = new JButton();
		buttonIntersection.setIcon(new ImageIcon("Ikonice/Grey-Ball-icon.png"));
		buttonIntersection.setPreferredSize(new Dimension(30,30));
		buttonIntersection.setToolTipText("Čvor");
		buttonIntersection.setActionCommand("intersection");
		buttonIntersection.setOpaque(false);             
		buttonIntersection.setContentAreaFilled(false);  
		buttonIntersection.setBorderPainted(false);
		buttonIntersection.addActionListener(customToolBoxListeer);
		add(buttonIntersection);
		
		buttonLockPage = new JButton();
		buttonLockPage.setIcon(new ImageIcon("Ikonice/lock-disabled-icon.png"));
		buttonLockPage.setPreferredSize(new Dimension(30,30));
		buttonLockPage.setToolTipText("Zaštićen pristup");
		buttonLockPage.setActionCommand("lockPage");
		buttonLockPage.setOpaque(false);             
		buttonLockPage.setContentAreaFilled(false);  
		buttonLockPage.setBorderPainted(false);
		buttonLockPage.addActionListener(customToolBoxListeer);
		add(buttonLockPage);
		
		buttonComment = new JButton();
		buttonComment.setIcon(new ImageIcon("Ikonice/komentar.png"));
		buttonComment.setPreferredSize(new Dimension(30,30));
		buttonComment.setToolTipText("Komentar");
		buttonComment.setActionCommand("comment");
		buttonComment.setOpaque(false);             
		buttonComment.setContentAreaFilled(false);  
		buttonComment.setBorderPainted(false);
		buttonComment.addActionListener(customToolBoxListeer);
		add(buttonComment);
		
		buttonAddAtachment = new JButton();
		buttonAddAtachment.setIcon(new ImageIcon("Ikonice/attachment-icon.png"));
		buttonAddAtachment.setPreferredSize(new Dimension(30,30));
		buttonAddAtachment.setToolTipText("Zakači dodatak");
		buttonAddAtachment.setActionCommand("attachment");
		buttonAddAtachment.setOpaque(false);             
		buttonAddAtachment.setContentAreaFilled(false);  
		buttonAddAtachment.setBorderPainted(false);
		buttonAddAtachment.addActionListener(customToolBoxListeer);
		add(buttonAddAtachment);
		
		buttonAddImage = new JButton();
		buttonAddImage.setIcon(new ImageIcon("Ikonice/Image-icon.png"));
		buttonAddImage.setPreferredSize(new Dimension(30,30));
		buttonAddImage.setToolTipText("Dodaj sliku");
		buttonAddImage.setActionCommand("image");
		buttonAddImage.setOpaque(false);             
		buttonAddImage.setContentAreaFilled(false);  
		buttonAddImage.setBorderPainted(false);
		buttonAddImage.addActionListener(customToolBoxListeer);
		add(buttonAddImage);
		
		buttonAddAudio = new JButton();
		buttonAddAudio.setIcon(new ImageIcon("Ikonice/Volume-Disabled-icon.png"));
		buttonAddAudio.setPreferredSize(new Dimension(30,30));
		buttonAddAudio.setToolTipText("Dodaj audio fajl");
		buttonAddAudio.setActionCommand("audio");
		buttonAddAudio.setOpaque(false);             
		buttonAddAudio.setContentAreaFilled(false);  
		buttonAddAudio.setBorderPainted(false);
		buttonAddAudio.addActionListener(customToolBoxListeer);
		add(buttonAddAudio);
		
		buttonAddVideo = new JButton();
		buttonAddVideo.setIcon(new ImageIcon("Ikonice/Movies-icon.png"));
		buttonAddVideo.setPreferredSize(new Dimension(30,30));
		buttonAddVideo.setToolTipText("Dodaj video fajl");
		buttonAddVideo.setActionCommand("video");
		buttonAddVideo.setOpaque(false);             
		buttonAddVideo.setContentAreaFilled(false);  
		buttonAddVideo.setBorderPainted(false);
		buttonAddVideo.addActionListener(customToolBoxListeer);
		add(buttonAddVideo);
		
	}
}
