package frame;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeCellRenderer;
import javax.swing.tree.TreeSelectionModel;

import frame.treeView.CustomTreeNodeRenderer;

public class TreeView extends JTree {

	private static final long serialVersionUID = 1L;
	Dimension dimenzija = Toolkit.getDefaultToolkit().getScreenSize();

	public TreeView() {
		
		setLayout(new BorderLayout());
		setBorder(BorderFactory.createEmptyBorder(0, 0, 5, 5));
		setPreferredSize(new Dimension(dimenzija.width / 4, dimenzija.height));
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("Workspace");
		// DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root cvor", false);
		// - znacilo bi da ne moze imati djecu
		DefaultTreeModel defaultStablo = new DefaultTreeModel(root);
		this.setModel(defaultStablo);
		DefaultMutableTreeNode child_0 = new DefaultMutableTreeNode("Projekat1");		
		DefaultMutableTreeNode subchild_0 = new DefaultMutableTreeNode("Dijagram1");
		DefaultMutableTreeNode subchild_1 = new DefaultMutableTreeNode("Stranica1.1");
		DefaultMutableTreeNode subchild_2 = new DefaultMutableTreeNode("Stranica1.2");
		subchild_0.add(subchild_1);
		subchild_0.add(subchild_2);
		child_0.add(subchild_0);
		DefaultMutableTreeNode child_1 =new DefaultMutableTreeNode("Projekat2");
		DefaultMutableTreeNode child_2 = new DefaultMutableTreeNode("Dijagram2");
		DefaultMutableTreeNode subchild_3 = new DefaultMutableTreeNode("Stranica2.1");
		DefaultMutableTreeNode subchild_4 = new DefaultMutableTreeNode("Stranica2.2");
		child_2.add(subchild_3);
		child_2.add(subchild_4);
		
		DefaultMutableTreeNode subchild_5 = new DefaultMutableTreeNode("Stranica2.1.1");
		DefaultMutableTreeNode subchild_6 = new DefaultMutableTreeNode("Stranica2.1.2");
		subchild_3.add(subchild_5);
		subchild_3.add(subchild_6);		
		DefaultMutableTreeNode child_3 = new DefaultMutableTreeNode("Dijagram3");		
		DefaultMutableTreeNode subchild_7 = new DefaultMutableTreeNode("Stranica3.1");
		DefaultMutableTreeNode subchild_8 = new DefaultMutableTreeNode("Stranica3.2");
		DefaultMutableTreeNode subchild_9 = new DefaultMutableTreeNode("Stranica3.2.1");
		DefaultMutableTreeNode subchild_10 = new DefaultMutableTreeNode("Stranica3.2.2");
		DefaultMutableTreeNode subchild_11 = new DefaultMutableTreeNode("Stranica3.2.2.1");
		DefaultMutableTreeNode subchild_12 = new DefaultMutableTreeNode("Stranica3.2.2.2");
		
		subchild_10.add(subchild_11);
		subchild_10.add(subchild_12);
		subchild_8.add(subchild_9);
		subchild_8.add(subchild_10);
		
		child_3.add(subchild_7);
		child_3.add(subchild_8);
		
		child_1.add(child_2);
		child_1.add(child_3);
		
		root.add(child_0);
		root.add(child_1);
		//root.add(child_3);
				
		JTree tree = new JTree(root);

		tree.setRootVisible(false);
		tree.setShowsRootHandles(true);
		tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		tree.setCellRenderer(new CustomTreeNodeRenderer());

		JScrollPane jsp = new JScrollPane(tree);
		jsp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		jsp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		add(jsp, BorderLayout.CENTER);

		setVisible(true);

	}

}
