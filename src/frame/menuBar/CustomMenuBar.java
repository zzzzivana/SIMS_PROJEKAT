package frame.menuBar;

import javax.swing.JMenuBar;

import frame.menuBar.menu.MenuConvert;
import frame.menuBar.menu.MenuEdit;
import frame.menuBar.menu.MenuProjekat;
import frame.menuBar.menu.MenuRepository;

public class CustomMenuBar extends JMenuBar {

	private static final long serialVersionUID = 1L;

	public CustomMenuBar() {	
		
		add(new MenuProjekat());
		add(new MenuEdit());
		add(new MenuRepository());
		add(new MenuConvert());
	}
	
	
}
