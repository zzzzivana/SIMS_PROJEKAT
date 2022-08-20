package listeners.menu;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class MenuConvertActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch (e.getActionCommand())
		{
		case "xml":
			JOptionPane.showMessageDialog((Component)e.getSource(),"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "html":
			JOptionPane.showMessageDialog((Component)e.getSource(),"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		}
	}

}
