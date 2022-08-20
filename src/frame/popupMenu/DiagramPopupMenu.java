package frame.popupMenu;

import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

import listeners.menu.MenuEditActionListener;

public class DiagramPopupMenu extends JPopupMenu {

	private static final long serialVersionUID = 1L;
	
	JMenuItem menuItemCloseProject = null;

	public DiagramPopupMenu() {
		
		MenuEditActionListener menuEditActionListener = new MenuEditActionListener();
		
		menuItemCloseProject = new JMenuItem("Zatvori dijagram");
		menuItemCloseProject.setIcon(new ImageIcon("Ikonice/document-delete-icon.png"));
		menuItemCloseProject.setActionCommand("closeAll");
		menuItemCloseProject.addActionListener(menuEditActionListener);
		add(menuItemCloseProject);
		
		menuItemCloseProject = new JMenuItem("Zatvori sve osim ovog");
		menuItemCloseProject.setIcon(new ImageIcon("Ikonice/document-delete-icon.png"));
		menuItemCloseProject.setActionCommand("closeAll");
		menuItemCloseProject.addActionListener(menuEditActionListener);
		add(menuItemCloseProject);
		
		menuItemCloseProject = new JMenuItem("Zatvori sve dijagrame");
		menuItemCloseProject.setIcon(new ImageIcon("Ikonice/document-delete-icon.png"));
		menuItemCloseProject.setActionCommand("closeAll");
		menuItemCloseProject.addActionListener(menuEditActionListener);
		add(menuItemCloseProject);
	}
}
