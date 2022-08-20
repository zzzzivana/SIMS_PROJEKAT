package frame.popupMenu;

import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

import listeners.menu.MenuFileActionListener;

public class NewProjectPopupMenu extends JPopupMenu {

	private static final long serialVersionUID = 1L;

	JMenuItem menuItemNewProject = null;
	JMenuItem menuItemNewDiagram = null;
	
	public NewProjectPopupMenu() {
		
		MenuFileActionListener menuFileActionListener = new MenuFileActionListener();
		//setLocation(50,50);
		
		menuItemNewProject = new JMenuItem("Projekat");
		menuItemNewProject.setIcon(new ImageIcon("Ikonice/Actions-project-open-icon.png"));
		menuItemNewProject.setActionCommand("newProjekat");
		menuItemNewProject.addActionListener(menuFileActionListener);
		add(menuItemNewProject);
		
		menuItemNewDiagram = new JMenuItem("Dijagram");
		menuItemNewDiagram.setIcon(new ImageIcon("Ikonice/sitemap.png"));
		menuItemNewDiagram.setActionCommand("newDiagram");
		menuItemNewDiagram.addActionListener(menuFileActionListener);
		add(menuItemNewDiagram);
		
	}
}
