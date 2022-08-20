package frame.menuBar.menu;

import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import listeners.menu.MenuEditActionListener;

public class MenuEdit extends JMenu {
	
	private static final long serialVersionUID = 1L;

	JMenuItem menuItemUndo = null;
	JMenuItem menuItemRedo = null;
	JMenuItem menuItemCut = null;
	JMenuItem menuItemCopy = null;
	JMenuItem menuItemPaste = null;
	JMenuItem menuItemDelete = null;
	JMenuItem menuItemSelectAll = null;
	JMenuItem menuItemRename = null;
	JMenuItem menuItemEditElement = null;
	
	public MenuEdit() {
		setText("Uređivanje");
		setMnemonic(KeyEvent.VK_E);
		
		MenuEditActionListener menuEditActionListener = new MenuEditActionListener();
		
		menuItemUndo = new JMenuItem("Povratak u nazad       ");
		menuItemUndo.setIcon(new ImageIcon("Ikonice/Undo-icon.png"));
		menuItemUndo.setMnemonic(KeyEvent.VK_Z);
		menuItemUndo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z,KeyEvent.CTRL_MASK));
		menuItemUndo.setActionCommand("undo");
		menuItemUndo.addActionListener(menuEditActionListener);
		add(menuItemUndo);
		
		menuItemRedo = new JMenuItem("Ponovo uraditi");
		menuItemRedo.setIcon(new ImageIcon("Ikonice/Redo-icon.png"));
		menuItemRedo.setMnemonic(KeyEvent.VK_Y);
		menuItemRedo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y,KeyEvent.CTRL_MASK));
		menuItemRedo.setActionCommand("redo");
		menuItemRedo.addActionListener(menuEditActionListener);
		add(menuItemRedo);
		
		addSeparator();
		
		menuItemCut = new JMenuItem("Isjeci");
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
		
		menuItemSelectAll = new JMenuItem("Izaberi sve");
		menuItemSelectAll.setIcon(new ImageIcon(""));
		menuItemSelectAll.setMnemonic(KeyEvent.VK_A);
		menuItemSelectAll.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,KeyEvent.CTRL_MASK));
		menuItemSelectAll.setActionCommand("selectAll");
		menuItemSelectAll.addActionListener(menuEditActionListener);
		add(menuItemSelectAll);
		
		menuItemRename = new JMenuItem("Preimenuj");
		menuItemRename.setIcon(new ImageIcon("Ikonice/textfield-rename-icon.png"));
		menuItemRename.setMnemonic(KeyEvent.VK_F2);
		menuItemRename.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F2,KeyEvent.CTRL_MASK));
		menuItemRename.setActionCommand("rename");
		menuItemRename.addActionListener(menuEditActionListener);
		add(menuItemRename);
		
		addSeparator();
		
		menuItemEditElement = new JMenuItem("Uredi element");
		menuItemEditElement.setIcon(new ImageIcon("Ikonice/graphic-tools-icon.png"));
		menuItemEditElement.setActionCommand("editElement");
		menuItemEditElement.addActionListener(menuEditActionListener);
		add(menuItemEditElement);
		
		
	}
}
