package listeners.menu;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class MenuEditActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		switch (e.getActionCommand())
		{
		case "undo":
			JOptionPane.showMessageDialog((Component)e.getSource(),"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "redo":
			JOptionPane.showMessageDialog((Component)e.getSource(),"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "cut":
			JOptionPane.showMessageDialog((Component)e.getSource(),"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "copy":
			JOptionPane.showMessageDialog((Component)e.getSource(),"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "paste":
			JOptionPane.showMessageDialog((Component)e.getSource(),"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "delete":
			JOptionPane.showMessageDialog((Component)e.getSource(),"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "selectAll":
			JOptionPane.showMessageDialog((Component)e.getSource(),"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "rename":
			JOptionPane.showMessageDialog((Component)e.getSource(),"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "editElement":
			JOptionPane.showMessageDialog((Component)e.getSource(),"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "closeAll":
			JOptionPane.showMessageDialog((Component)e.getSource(),"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		}
	}

}
