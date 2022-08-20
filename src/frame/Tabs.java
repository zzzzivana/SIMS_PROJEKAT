package frame;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseListener;
import java.io.Console;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JEditorPane;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JEditorPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SpringLayout;

import frame.popupMenu.DiagramPopupMenu;
import frame.popupMenu.WorkspacePopUpMenu;
import listeners.CustomMouseListener;;

public class Tabs extends JTabbedPane {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Dimension dimenzija = Toolkit.getDefaultToolkit().getScreenSize();
	
	public static JTabbedPane jtb = new JTabbedPane();
	

	
	public Tabs()
	{
		
		setLayout(new BorderLayout());
		setBorder(BorderFactory.createEmptyBorder(0, 0,5, 5));
		setPreferredSize(new Dimension(dimenzija.width*3/4, dimenzija.height));
		setTabPlacement(jtb.TOP);
		String imgsrc="Slike/dijagram1.png";
		JEditorPane jtp1 = new JEditorPane("text/html", "<html><img src=file:" + imgsrc
	            + " width=1000height=900></img>");
		imgsrc="Slike/dijagram2.png";
		JEditorPane jtp2 = new JEditorPane("text/html", "<html><img src=file:" + imgsrc
	            + " width=1000height=900></img>");
		//JEditorPane jtp2 = new JEditorPane();
		imgsrc="Slike/dijagram3.png";
		JEditorPane jtp3 = new JEditorPane("text/html", "<html><img src=file:" + imgsrc
	            + " width=100height=100></img>");
		
		
		jtp1.setEditable(false);
		jtp1.setComponentPopupMenu(new WorkspacePopUpMenu());
		jtp2.setEditable(false);
		jtp2.setComponentPopupMenu(new WorkspacePopUpMenu());		
		jtp3.setEditable(false);
		jtp3.setComponentPopupMenu(new WorkspacePopUpMenu());
		
		jtb.addTab("Dijagram1",jtp1);
		jtb.addTab("Dijagram2",jtp2);
		jtb.addTab("Dijagram3",jtp3);
		
		jtb.getComponentAt(0).setName("Dijagram1");
		jtb.getComponentAt(1).setName("Dijagram2");
		jtb.getComponentAt(2).setName("Dijagram3");
		
		JScrollPane jsp = new JScrollPane(jtb);
		jsp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		jsp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		add(jsp,BorderLayout.CENTER);
		setVisible(true);
		
		MouseListener l = new CustomMouseListener();
		jtb.addMouseListener(l);
		jtb.setComponentPopupMenu(new DiagramPopupMenu());
		
		
	}
	


}
