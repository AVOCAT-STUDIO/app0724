package org.sp.app0724.openapi;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class OpenFrame extends JFrame {
	JPanel p_north;
	JButton bt;
	JTextField t_url;
	JTable table;
	JScrollPane scroll;
	
	

	
	public OpenFrame() {
		p_north = new JPanel();
		bt = new JButton("검색"); 
		t_url = new JTextField(50);
		table = new JTable();
		scroll = new JScrollPane(table);
		
		p_north.add(bt);
		p_north.add(t_url);
		add(p_north, BorderLayout.NORTH);
		add(scroll);
		
		
		
		
		setSize(1000,800);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		bt.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {

		
			}
		});
		
	}
	
	
	public static void main(String[] args) {
		new OpenFrame();
	}
}
