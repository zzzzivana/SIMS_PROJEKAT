package frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTree;
import javax.swing.ScrollPaneLayout;
import javax.swing.SpringLayout;

import frame.popupMenu.DiagramPopupMenu;
import frame.popupMenu.WorkspacePopUpMenu;
import frame.toolBox.ToolBox;

public class MainPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public MainPanel()
	{
		setBackground(Color.black);
		setLayout(new BorderLayout(1,1));
		  
		//Statusna linija
		JPanel statusLinePanel = new JPanel(); 
		statusLinePanel.setBackground(Color.decode("#61A0CB"));
		statusLinePanel.setPreferredSize(new Dimension(0,20));		
		add(statusLinePanel,BorderLayout.SOUTH);
		statusLinePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel status=new JLabel("Spreman");
		status.setFont(new Font("Arial",1,12));
		status.setForeground(Color.white);
		status.setBounds(0, 0, 100, 12);
	    statusLinePanel.add(status);
		  
		//otvoreni projekt
		JPanel projectExplorerPanel = new JPanel(new GridLayout());
		projectExplorerPanel.setBackground(Color.white);
		projectExplorerPanel.setPreferredSize(new Dimension(200,0));
		projectExplorerPanel.add(new TreeView());
		add(projectExplorerPanel,BorderLayout.WEST);
		  
		//project info
		JPanel toolBox = new ToolBox();
		add(toolBox,BorderLayout.EAST);
		
		  
		//radna povrsina
		JPanel workspacePanel = new JPanel(new SpringLayout());
		workspacePanel.setSize(200,200);
		workspacePanel.setBackground(Color.white);
		workspacePanel.add(new Tabs());
		add(workspacePanel,BorderLayout.CENTER);

	}
}
