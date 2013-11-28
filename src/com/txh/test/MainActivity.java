package com.txh.test;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.txh.javaUi.Button;
import com.txh.javaUi.EditText;
import com.txh.javaUi.Label;

public class MainActivity extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static MainActivity main = new MainActivity();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		main.setTitle(constant.mainTitle);
		main.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		main.setSize(340,320);
		main.setVisible(true);
	}
	
	/**
	 * Constructor , build interface .
	 */
	public MainActivity(){
		setLayout(new GridLayout(5,1));
		
		JButton  addButton = Button.createButton(constant.addFriend);
		add(addButton);
		
		JButton  viewButton = Button.createButton(constant.viewFriend);
		add(viewButton);
		
		JButton  settingButton = Button.createButton(constant.setting);
		add(settingButton);
		
		JButton  exitButton = Button.createButton(constant.exit);
		add(exitButton);
		
		JPanel namePanel = new JPanel();	
		JTextField text = EditText.createEditText("¹þ¹þ" , 15);
		
		JLabel nameLabel = Label.createButton(constant.name);
		
		namePanel.add(nameLabel);
		namePanel.add(text);
		add(namePanel,BorderLayout.CENTER);
	}
}
