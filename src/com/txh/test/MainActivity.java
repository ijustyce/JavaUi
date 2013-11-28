package com.txh.test;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.txh.javaUi.Button;

public class MainActivity extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static MainActivity main = new MainActivity();
	private Font font = new Font("Default",Font.PLAIN,21);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		main.setTitle(constant.mainTitle);
		main.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		main.setSize(320,320);
		main.setVisible(true);
	}
	
	/**
	 * Constructor , build interface .
	 */
	public MainActivity(){
		setLayout(new GridLayout(4,1));
		
		JButton  addButton = Button.createButton(constant.addFriend);
		addButton.setFont(font);
		add(addButton);
		
		JButton  viewButton = new JButton(constant.viewFriend);
		viewButton.setFont(font);
		add(viewButton);
		
		JButton  settingButton = new JButton(constant.setting);
		settingButton.setFont(font);
		add(settingButton);
		
		JButton  exitButton = new JButton(constant.exit);
		exitButton.setFont(font);
		add(exitButton);
	}
}
