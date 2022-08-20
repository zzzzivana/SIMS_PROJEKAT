package frame.treeView;

import java.awt.Component;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTree;
import javax.swing.tree.TreeCellRenderer;


public class CustomTreeNodeRenderer implements TreeCellRenderer{

	@Override
	public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded,
			boolean leaf, int row, boolean hasFocus) {
		
		JLabel label = null;
		label = new JLabel(value.toString());
		label.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		
		if(value.toString().contains("Dija"))
		{
			ImageIcon icon = new ImageIcon(Toolkit.getDefaultToolkit().getImage("Ikonice/sitemap.png"));
			label.setIcon(icon);
		}
		if(value.toString().contains("Pro"))

		{
			ImageIcon icon = new ImageIcon(Toolkit.getDefaultToolkit().getImage("Ikonice/Actions-project-open-icon.png"));
			label.setIcon(icon);
		
		}
		if(value.toString().contains("Str"))

		{
			ImageIcon icon = new ImageIcon(Toolkit.getDefaultToolkit().getImage("Ikonice/rectangle-icon (1).png").getScaledInstance(16, 16, Image.SCALE_DEFAULT));
			label.setIcon(icon);
		
		}
		tree.setRowHeight(20);
		return label;
	}

}
