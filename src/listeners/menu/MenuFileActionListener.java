package listeners.menu;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class MenuFileActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand())
		{
		/*
		 * case "newProject": JOptionPane.showMessageDialog((Component)e.getSource()
		 * ,"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE); break;
		 * case "newDiagram": JOptionPane.showMessageDialog((Component)e.getSource()
		 * ,"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE); break;
		 */
		case "open":
			JOptionPane.showMessageDialog((Component)e.getSource(),"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "export":
			JOptionPane.showMessageDialog((Component)e.getSource(),"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "save":
			JOptionPane.showMessageDialog((Component)e.getSource(),"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "saveAs":
			JOptionPane.showMessageDialog((Component)e.getSource(),"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "print":
			JOptionPane.showMessageDialog((Component)e.getSource(),"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "link":
			JOptionPane.showMessageDialog((Component)e.getSource(),"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "newProjekat":
			JOptionPane.showMessageDialog((Component)e.getSource(),"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "newDiagram":
			JOptionPane.showMessageDialog((Component)e.getSource(),"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		}
	}

}
