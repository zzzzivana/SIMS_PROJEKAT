package listeners;

import java.awt.Component;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class CustomWindowListener implements WindowListener {

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		
		Object[] opcije = { "Da", "Ne",
        "Odustani" };
		 ImageIcon ikonica = new ImageIcon(Toolkit.getDefaultToolkit().getImage("Ikonice/FAQ-icon.png").getScaledInstance(44, 44, Image.SCALE_DEFAULT));

		int rezultat = JOptionPane.showOptionDialog((Component) e.getSource(),"Da li želite da sačuvate izmjene?",
				"Sačuvaj izmjene?",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,ikonica,opcije,null);
		if(rezultat == JOptionPane.YES_OPTION)
		{
			JOptionPane.showMessageDialog((Component) e.getSource(), "Metoda u implementaciji",
					"Poruka",JOptionPane.INFORMATION_MESSAGE);		
			System.exit(0);
		}
		else if(rezultat == JOptionPane.NO_OPTION)
		{
			System.exit(0);
		}
	}
	
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

}
