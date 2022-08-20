package frame.popupMenu;

import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.KeyStroke;

import listeners.menu.MenuEditActionListener;

public class WorkspacePopUpMenu extends JPopupMenu{


	private static final long serialVersionUID = 1L;
	
	JMenuItem menuItemCopy = null;
	JMenuItem menuItemCut = null;
	JMenuItem menuItemPaste = null;
	JMenuItem menuItemDelete = null;
	
	public WorkspacePopUpMenu() {
		
		MenuEditActionListener menuEditActionListener = new MenuEditActionListener();
		
		menuItemCut = new JMenuItem("Isjeci          ");
		menuItemCut.setIcon(new ImageIcon("Ikonice/Extras-CUt-icon.png"));
		menuItemCut.setMnemonic(KeyEvent.VK_X);
		menuItemCut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,KeyEvent.CTRL_MASK));
		menuItemCut.setActionCommand("cut");
		menuItemCut.addActionListener(menuEditActionListener);
		add(menuItemCut);
		
		menuItemCopy = new JMenuItem("Kopiraj");
		menuItemCopy.setIcon(new ImageIcon("Ikonice/page-copy-icon.png"));
		menuItemCopy.setMnemonic(KeyEvent.VK_C);
		menuItemCopy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,KeyEvent.CTRL_MASK));
		menuItemCopy.setActionCommand("copy");
		menuItemCopy.addActionListener(menuEditActionListener);
		add(menuItemCopy);
		
		menuItemPaste = new JMenuItem("Zalijepi");
		menuItemPaste.setIcon(new ImageIcon("Ikonice/page-paste-icon.png"));
		menuItemPaste.setMnemonic(KeyEvent.VK_V);
		menuItemPaste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,KeyEvent.CTRL_MASK));
		menuItemPaste.setActionCommand("redo");
		menuItemPaste.addActionListener(menuEditActionListener);
		add(menuItemPaste);
		
		addSeparator();
		
		menuItemDelete = new JMenuItem("Izbriši");
		menuItemDelete.setIcon(new ImageIcon("Ikonice/Actions-edit-delete-icon.png"));
		menuItemDelete.setMnemonic(KeyEvent.VK_DELETE);
		menuItemDelete.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE,0));
		menuItemDelete.setActionCommand("delete");
		menuItemDelete.addActionListener(menuEditActionListener);
		add(menuItemDelete);
		
	}

}
