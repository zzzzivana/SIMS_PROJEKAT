package listeners.menu;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class MenuRepositoryActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand())
		{
		case "register":
			JOptionPane.showMessageDialog((Component)e.getSource(),"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "login":
			JOptionPane.showMessageDialog((Component)e.getSource(),"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "download":
			JOptionPane.showMessageDialog((Component)e.getSource(),"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "add":
			JOptionPane.showMessageDialog((Component)e.getSource(),"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		
		}
	}
}
