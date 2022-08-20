package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class CustomToolBoxListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand())
		{
		case "homePage":
			JOptionPane.showMessageDialog(frame.MainFrame.framePosition,"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "subPage":
			JOptionPane.showMessageDialog(frame.MainFrame.framePosition,"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "gropuPages":
			JOptionPane.showMessageDialog(frame.MainFrame.framePosition,"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "futurePage":
			JOptionPane.showMessageDialog(frame.MainFrame.framePosition,"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "connect":
			JOptionPane.showMessageDialog(frame.MainFrame.framePosition,"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "intersection":
			JOptionPane.showMessageDialog(frame.MainFrame.framePosition,"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "lockPage":
			JOptionPane.showMessageDialog(frame.MainFrame.framePosition,"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "comment":
			JOptionPane.showMessageDialog(frame.MainFrame.framePosition,"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "attachment":
			JOptionPane.showMessageDialog(frame.MainFrame.framePosition,"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "image":
			JOptionPane.showMessageDialog(frame.MainFrame.framePosition,"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "audio":
			JOptionPane.showMessageDialog(frame.MainFrame.framePosition,"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "video":
			JOptionPane.showMessageDialog(frame.MainFrame.framePosition,"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "shop":
			JOptionPane.showMessageDialog(frame.MainFrame.framePosition,"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "news":
			JOptionPane.showMessageDialog(frame.MainFrame.framePosition,"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "cv":
			JOptionPane.showMessageDialog(frame.MainFrame.framePosition,"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "new":
			JOptionPane.showMessageDialog(frame.MainFrame.framePosition,"Metoda u implementaciji","Poruka",JOptionPane.INFORMATION_MESSAGE);
			break;
		}
		
	}

}
