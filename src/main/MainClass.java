package main;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import frame.MainFrame;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Look AND Feel
		 try {
		UIManager.setLookAndFeel(
		            "com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InstantiationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (UnsupportedLookAndFeelException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		MainFrame frame = new MainFrame();
	}

}
