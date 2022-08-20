package frame.menuBar.menu;

import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import listeners.menu.MenuConvertActionListener;

public class MenuConvert extends JMenu{

	private static final long serialVersionUID = 1L;

	JMenuItem menuItemXml = null;
	JMenuItem menuItemHtml = null;
	
	public MenuConvert() {
		
		setText("Konvertuj");
		MenuConvertActionListener menuConverterActionListener = new MenuConvertActionListener();
		
		menuItemXml = new JMenuItem("Konvertuj u XML mapu");
		menuItemXml.setIcon(new ImageIcon("Ikonice/xml-icon.png"));
		menuItemXml.setActionCommand("xml");
		menuItemXml.addActionListener(menuConverterActionListener);
		add(menuItemXml);
		
		menuItemHtml = new JMenuItem("Konvertuj u HTML mapu");
		menuItemHtml.setIcon(new ImageIcon("Ikonice/html-icon.png"));
		menuItemHtml.setActionCommand("html");
		menuItemHtml.addActionListener(menuConverterActionListener);
		add(menuItemHtml);
	}
}
