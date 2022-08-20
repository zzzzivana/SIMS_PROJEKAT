package frame.toolbar;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JToolBar;

import frame.menuBar.menu.MenuEdit;
import frame.menuBar.menu.MenuProjekat;
import frame.popupMenu.NewProjectPopupMenu;
import listeners.CustomToolBarListener;

public class customToolBar extends JToolBar {

	private static final long serialVersionUID = 1L;
	
	JButton buttonNew = null;
	JButton buttonNewMore = null;
	JButton buttonSave = null;
	JButton buttonSaveAs = null;
	JButton buttonCut = null;
	JButton buttonCopy = null;
	JButton buttonPate = null;
	JButton buttonUndo = null;
	JButton buttonRedo = null;
	JButton buttonSelect = null;
	JButton buttonMove = null;
	JButton buttonRotate = null;
	JButton buttonDelete = null;
	JButton buttonChangeColor = null;
	JComboBox<?> cmbChangeSize = null;
	
	
	public customToolBar() {
		
		CustomToolBarListener customToolBarListener = new CustomToolBarListener();
		
		buttonNew = new JButton();
		buttonNew.setIcon(new ImageIcon("Ikonice/Actions-project-open-icon.png"));
		buttonNew.setToolTipText("Dodaj novi projekat");
		buttonNew.setActionCommand("newProjekat");
		buttonNew.addActionListener(customToolBarListener);
		add(buttonNew);
		
		buttonNewMore = new JButton();
		buttonNewMore.setIcon(new ImageIcon("Ikonice/more+icon-1320183327641553014_16.png"));
		buttonNewMore.setActionCommand("more");
		buttonNewMore.addActionListener(customToolBarListener);
		buttonNewMore.setComponentPopupMenu(new NewProjectPopupMenu());
		add(buttonNewMore);
		
		
		buttonSave = new JButton();
		buttonSave.setIcon(new ImageIcon("Ikonice/Save-icon.png"));
		buttonSave.setToolTipText("Sačuvaj");
		buttonSave.setActionCommand("save");
		buttonSave.addActionListener(customToolBarListener);
		add(buttonSave);
		
		buttonSaveAs = new JButton();
		buttonSaveAs.setIcon(new ImageIcon("Ikonice/Save-as-icon.png"));
		buttonSaveAs.setToolTipText("Sačuvaj kao...");
		buttonSaveAs.setActionCommand("saveAs");
		buttonSaveAs.addActionListener(customToolBarListener);
		add(buttonSaveAs);
		
		addSeparator();
		
		buttonCut = new JButton();
		buttonCut.setIcon(new ImageIcon("Ikonice/Extras-CUt-icon.png"));
		buttonCut.setToolTipText("Isjeci");
		buttonCut.setActionCommand("cut");
		buttonCut.addActionListener(customToolBarListener);
		add(buttonCut);
		
		buttonCopy = new JButton();
		buttonCopy.setIcon(new ImageIcon("Ikonice/page-copy-icon.png"));
		buttonCopy.setToolTipText("Kopiraj");
		buttonCopy.setActionCommand("copy");
		buttonCopy.addActionListener(customToolBarListener);
		add(buttonCopy);
		
		buttonPate = new JButton();
		buttonPate.setIcon(new ImageIcon("Ikonice/page-paste-icon.png"));
		buttonPate.setToolTipText("Zalijepi");
		buttonPate.setActionCommand("paste");
		buttonPate.addActionListener(customToolBarListener);
		add(buttonPate);
		
		addSeparator();
		
		buttonUndo = new JButton();
		buttonUndo.setIcon(new ImageIcon("Ikonice/Undo-icon.png"));
		buttonUndo.setToolTipText("Povratak u nazad");
		buttonUndo.setActionCommand("undo");
		buttonUndo.addActionListener(customToolBarListener);
		add(buttonUndo);
		
		buttonRedo = new JButton();
		buttonRedo.setIcon(new ImageIcon("Ikonice/Redo-icon.png"));
		buttonRedo.setToolTipText("Ponovo uradi");
		buttonRedo.setActionCommand("redo");
		buttonRedo.addActionListener(customToolBarListener);
		add(buttonRedo);
		
		addSeparator();
		
		buttonSelect = new JButton();
		buttonSelect.setIcon(new ImageIcon("Ikonice/cursor-icon.png"));
		buttonSelect.setPreferredSize(new Dimension(30,30));
		buttonSelect.setToolTipText("Selektuj");
		buttonSelect.setActionCommand("select");
		buttonSelect.setOpaque(false);             
		buttonSelect.setContentAreaFilled(false);  
		buttonSelect.setBorderPainted(false);
		buttonSelect.addActionListener(customToolBarListener);
		add(buttonSelect);
		
		buttonMove = new JButton();
		buttonMove.setIcon(new ImageIcon("Ikonice/transform-move-icon.png"));
		buttonMove.setPreferredSize(new Dimension(30,30));
		buttonMove.setToolTipText("Pomjeri");
		buttonMove.setActionCommand("move");
		buttonMove.setOpaque(false);             
		buttonMove.setContentAreaFilled(false);  
		buttonMove.setBorderPainted(false);
		buttonMove.addActionListener(customToolBarListener);
		add(buttonMove);
		
		buttonRotate = new JButton();
		buttonRotate.setIcon(new ImageIcon("Ikonice/transform-rotate-icon.png"));
		buttonRotate.setPreferredSize(new Dimension(30,30));
		buttonRotate.setToolTipText("Rotiraj");
		buttonRotate.setActionCommand("rotate");
		buttonRotate.setOpaque(false);             
		buttonRotate.setContentAreaFilled(false);  
		buttonRotate.setBorderPainted(false);
		buttonRotate.addActionListener(customToolBarListener);
		add(buttonRotate);
		
		buttonDelete = new JButton();
		buttonDelete.setIcon(new ImageIcon("Ikonice/Actions-edit-delete-icon.png"));
		buttonDelete.setPreferredSize(new Dimension(30,30));
		buttonDelete.setToolTipText("Obrisi");
		buttonDelete.setActionCommand("delete");
		buttonDelete.setOpaque(false);             
		buttonDelete.setContentAreaFilled(false);  
		buttonDelete.setBorderPainted(false);
		buttonDelete.addActionListener(customToolBarListener);
		add(buttonDelete);
		
		addSeparator();
		
		buttonChangeColor = new JButton();
		buttonChangeColor.setIcon(new ImageIcon("Ikonice/color-wheel-icon.png"));
		buttonChangeColor.setToolTipText("Izaberi boju");
		buttonChangeColor.setActionCommand("color");
		buttonChangeColor.addActionListener(customToolBarListener);
		add(buttonChangeColor);
		
		String[] letterSize = {"8","9","10","11","12","14","16","18","22","24","26","28","26"};
		cmbChangeSize = new JComboBox(letterSize);
		cmbChangeSize.setMaximumSize(new Dimension(40,18));
		cmbChangeSize.setSelectedIndex(4);
		cmbChangeSize.setToolTipText("Izaberi veličinu");
		cmbChangeSize.setActionCommand("size");
		cmbChangeSize.addActionListener(customToolBarListener);
		add(cmbChangeSize);
		
	}
}
