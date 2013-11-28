package com.txh.javaUi;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Button extends JFrame{
	
	public static JButton createButton(String value){
		
		JButton b = new JButton(value);
		
		return b;
		
	}
}
