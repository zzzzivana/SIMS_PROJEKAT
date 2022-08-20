package frame.menuBar.menu;

import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import listeners.menu.MenuRepositoryActionListener;

public class MenuRepository extends JMenu{

	private static final long serialVersionUID = 1L;

	JMenuItem menuItemRegister = null;
	JMenuItem menuItemLogin = null;
	JMenuItem menuItemDownload = null;
	JMenuItem menuItemAdd = null;
	
	public MenuRepository() {
	
		setText("Repozitorijum");
		setMnemonic(KeyEvent.VK_R);
		
		MenuRepositoryActionListener menuRepositoryActionListener = new MenuRepositoryActionListener();
		
		menuItemRegister = new JMenuItem("Registracija");
		menuItemRegister.setIcon(new ImageIcon("Ikonice/Users-male-icon.png"));
		menuItemRegister.setActionCommand("register");
		menuItemRegister.addActionListener(menuRepositoryActionListener);
		add(menuItemRegister);
		
		menuItemLogin = new JMenuItem("Prijava");
		menuItemLogin.setIcon(new ImageIcon("Ikonice/login icon icon.png"));
		menuItemLogin.setActionCommand("login");
		menuItemLogin.addActionListener(menuRepositoryActionListener);
		add(menuItemLogin);
		
		addSeparator();
		
		menuItemDownload = new JMenuItem("Preuzmi šablon");
		menuItemDownload.setIcon(new ImageIcon("Ikonice/drive-download-icon.png"));
		menuItemDownload.setActionCommand("download");
		menuItemDownload.addActionListener(menuRepositoryActionListener);
		add(menuItemDownload);
		
		menuItemAdd = new JMenuItem("Dodaj šablon");
		menuItemAdd.setIcon(new ImageIcon("Ikonice/Sign-Add-icon.png"));
		menuItemAdd.setActionCommand("add");
		menuItemAdd.addActionListener(menuRepositoryActionListener);
		add(menuItemAdd);
		
		
	}
}
