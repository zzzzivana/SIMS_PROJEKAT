package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class CustomToolBarListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch (e.getActionCommand())
		{
		case "newProjekat":
			JOptionPane.showMessageDialog(frame.MainFrame.framePosition,"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "save":
			JOptionPane.showMessageDialog(frame.MainFrame.framePosition,"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "saveAs":
			JOptionPane.showMessageDialog(frame.MainFrame.framePosition,"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "cut":
			JOptionPane.showMessageDialog(frame.MainFrame.framePosition,"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "copy":
			JOptionPane.showMessageDialog(frame.MainFrame.framePosition,"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "paste":
			JOptionPane.showMessageDialog(frame.MainFrame.framePosition,"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "undo":
			JOptionPane.showMessageDialog(frame.MainFrame.framePosition,"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "redo":
			JOptionPane.showMessageDialog(frame.MainFrame.framePosition,"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "select":
			JOptionPane.showMessageDialog(frame.MainFrame.framePosition,"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "move":
			JOptionPane.showMessageDialog(frame.MainFrame.framePosition,"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "rotate":
			JOptionPane.showMessageDialog(frame.MainFrame.framePosition,"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "color":
			JOptionPane.showMessageDialog(frame.MainFrame.framePosition,"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "size":
			JOptionPane.showMessageDialog(frame.MainFrame.framePosition,"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "delete":
			JOptionPane.showMessageDialog(frame.MainFrame.framePosition,"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		}
	}
}


