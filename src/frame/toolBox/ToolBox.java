package frame.toolBox;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ToolBox extends JPanel{

	private static final long serialVersionUID = 1L;

	public ToolBox()
	{
		setPreferredSize(new Dimension(150,0));
		setBackground(Color.decode("#61A0CB"));
		setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));

		JPanel helper1 = new JPanel();
		
		helper1.setLayout(new BorderLayout());
		JButton naziv = new JButton("Elementi");
		naziv.setForeground(Color.decode("#61A0CB"));
		Font f = naziv.getFont();
		naziv.setFont(f.deriveFont(f.getStyle() | Font.BOLD));
		naziv.setPreferredSize(new Dimension(150,28));
		helper1.add(naziv,BorderLayout.NORTH);
		
		JPanel tools = new Tools();
		tools.setPreferredSize(new Dimension(10,10));
		helper1.add(tools,BorderLayout.CENTER);
		
		add(helper1);
			
		
		JPanel helper2 = new JPanel();
		helper2.setLayout(new BorderLayout());
		JButton sabloni = new JButton("Šabloni");
		sabloni.setForeground(Color.decode("#61A0CB"));
		Font p = sabloni.getFont();
		sabloni.setFont(p.deriveFont(f.getStyle() | Font.BOLD));
		naziv.setPreferredSize(new Dimension(150,28));
		helper2.add(sabloni,BorderLayout.NORTH);
		
		JPanel templates = new CustomTemplates();
		templates.setPreferredSize(new Dimension(10,10));
		helper2.add(templates,BorderLayout.CENTER);
		
		add(helper2);
	}
}
