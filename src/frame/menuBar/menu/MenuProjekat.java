package frame.menuBar.menu;

import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu.Separator;
import javax.swing.KeyStroke;

import listeners.menu.MenuFileActionListener;

public class MenuProjekat extends JMenu {

	private static final long serialVersionUID = 1L;
	
	JMenuItem menuItemNewProject = null;
	JMenuItem menuItemNewDiagram = null;
	JMenuItem menuItemOpenProject = null;
	JMenuItem menuItemExportProject = null;
	JMenuItem menuItemSaveProject = null;
	JMenuItem menuItemSaveAsProject = null;
	JMenuItem menuItemPrintProject = null;
	JMenuItem menuItemLinkProject = null;

	
	public MenuProjekat() {
		setText("Projekat");
		setMnemonic(KeyEvent.VK_F);
		
		MenuFileActionListener menuFileActionListener = new MenuFileActionListener();
		
		JMenu menuItemNew = new JMenu("Novi");
		add(menuItemNew);
		
		menuItemNewProject = new JMenuItem("Projekat");
		menuItemNewProject.setIcon(new ImageIcon("Ikonice/Actions-project-open-icon.png"));
		menuItemNewProject.setActionCommand("newProjekat");
		menuItemNewProject.addActionListener(menuFileActionListener);
		menuItemNew.add(menuItemNewProject);
		
		menuItemNewDiagram = new JMenuItem("Dijagram");
		menuItemNewDiagram.setIcon(new ImageIcon("Ikonice/sitemap.png"));
		menuItemNewDiagram.setActionCommand("newDiagram");
		menuItemNewDiagram.addActionListener(menuFileActionListener);
		menuItemNew.add(menuItemNewDiagram);
		
		menuItemOpenProject = new JMenuItem("Otvori projekat...");
		menuItemOpenProject.setIcon(new ImageIcon(""));
		menuItemOpenProject.setActionCommand("open");
		menuItemOpenProject.addActionListener(menuFileActionListener);
		add(menuItemOpenProject);
		
		addSeparator();
		
		menuItemExportProject = new JMenuItem("Izvezi projekat");
		menuItemExportProject.setIcon(new ImageIcon("Ikonice/document-export.png"));
		menuItemExportProject.setActionCommand("export");
		menuItemExportProject.addActionListener(menuFileActionListener);
		add(menuItemExportProject);
		
		menuItemSaveProject = new JMenuItem("Sačuvaj projekat");
		menuItemSaveProject.setIcon(new ImageIcon("Ikonice/Save-icon.png"));
		menuItemSaveProject.setMnemonic(KeyEvent.VK_S);
		menuItemSaveProject.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,KeyEvent.CTRL_MASK));
		menuItemSaveProject.setActionCommand("save");
		menuItemSaveProject.addActionListener(menuFileActionListener);
		add(menuItemSaveProject);
		
		menuItemSaveAsProject = new JMenuItem("Sačuvaj projekat kao...   ");
		menuItemSaveAsProject.setIcon(new ImageIcon("Ikonice/Save-as-icon.png"));
		menuItemSaveAsProject.setActionCommand("saveAs");
		menuItemSaveAsProject.addActionListener(menuFileActionListener);
		add(menuItemSaveAsProject);
		
		addSeparator();
		
		menuItemPrintProject = new JMenuItem("Štampanje");
		menuItemPrintProject.setIcon(new ImageIcon("Ikonice/print-icon.png"));
		menuItemPrintProject.setMnemonic(KeyEvent.VK_P);
		menuItemPrintProject.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,KeyEvent.CTRL_MASK));
		menuItemPrintProject.setActionCommand("print");
		menuItemPrintProject.addActionListener(menuFileActionListener);
		add(menuItemPrintProject);
		
		menuItemLinkProject = new JMenuItem("Povezivanje");
		menuItemLinkProject.setIcon(new ImageIcon("Ikonice/link-icon.png"));
		menuItemLinkProject.setActionCommand("link");
		menuItemLinkProject.addActionListener(menuFileActionListener);
		add(menuItemLinkProject);
		
		
	}
	
	

}
