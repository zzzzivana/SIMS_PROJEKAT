package frame.toolBox;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import listeners.CustomToolBoxListener;

public class CustomTemplates extends JPanel{

	private static final long serialVersionUID = 1L;
	
	JButton buttonShopTemplate = null;
	JButton buttonNewsTemplate = null;
	JButton buttonCVPageTemplate = null;
	JButton buttonNewTemplate = null;
	
	public CustomTemplates()
	{
		
		FlowLayout raspored = new FlowLayout(4);
		setLayout(raspored);
		CustomToolBoxListener customToolBoxListeer = new CustomToolBoxListener();
		
		buttonShopTemplate = new JButton();
		buttonShopTemplate.setIcon(new ImageIcon("Ikonice/shopping-cart-icon.png"));
		buttonShopTemplate.setPreferredSize(new Dimension(30,30));
		buttonShopTemplate.setToolTipText("Šablon za online shop");
		buttonShopTemplate.setActionCommand("shop");
		buttonShopTemplate.setOpaque(false);             
		buttonShopTemplate.setContentAreaFilled(false);  
		buttonShopTemplate.setBorderPainted(false);
		buttonShopTemplate.addActionListener(customToolBoxListeer);
		add(buttonShopTemplate);
		
		buttonNewsTemplate = new JButton();
		buttonNewsTemplate.setIcon(new ImageIcon("Ikonice/news-icon.png"));
		buttonNewsTemplate.setPreferredSize(new Dimension(30,30));
		buttonNewsTemplate.setToolTipText("Šablon za vijesti");
		buttonNewsTemplate.setActionCommand("news");
		buttonNewsTemplate.setOpaque(false);             
		buttonNewsTemplate.setContentAreaFilled(false);  
		buttonNewsTemplate.setBorderPainted(false);
		buttonNewsTemplate.addActionListener(customToolBoxListeer);
		add(buttonNewsTemplate);
		
		buttonCVPageTemplate = new JButton();
		buttonCVPageTemplate.setIcon(new ImageIcon("Ikonice/User-blue-icon.png"));
		buttonCVPageTemplate.setPreferredSize(new Dimension(30,30));
		buttonCVPageTemplate.setToolTipText("Šablon za CV");
		buttonCVPageTemplate.setActionCommand("cv");
		buttonCVPageTemplate.setOpaque(false);             
		buttonCVPageTemplate.setContentAreaFilled(false);  
		buttonCVPageTemplate.setBorderPainted(false);
		buttonCVPageTemplate.addActionListener(customToolBoxListeer);
		add(buttonCVPageTemplate);
		
		buttonNewTemplate = new JButton();
		buttonNewTemplate.setIcon(new ImageIcon("Ikonice/Sign-Add-icon.png"));
		buttonNewTemplate.setPreferredSize(new Dimension(30,30));
		buttonNewTemplate.setToolTipText("Dodaj novi šablon");
		buttonNewTemplate.setActionCommand("new");
		buttonNewTemplate.setOpaque(false);             
		buttonNewTemplate.setContentAreaFilled(false);  
		buttonNewTemplate.setBorderPainted(false);
		buttonNewTemplate.addActionListener(customToolBoxListeer);
		add(buttonNewTemplate);
	}

	
}
