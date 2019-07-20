package com.mdhalim.soft.ShowInputDialogs;

import javax.swing.JOptionPane;

public class ShowInputDialog {

	public static void main(String[] args) {
		
		//Test -01
		/*String showInput = JOptionPane.showInputDialog("Enter Your Name :");
		JOptionPane.showMessageDialog(null, showInput + "  Welcome to my first program.");*/
		
		//Test -02
		
	/*	String firstName = JOptionPane.showInputDialog(null, "Enter your first name :" ,"REGISTRATION FORM",JOptionPane.QUESTION_MESSAGE);
		String lastName = JOptionPane.showInputDialog(null,"Enter Your Last Name :");
		
		String fullName = firstName +" "+lastName;
		JOptionPane.showMessageDialog(null, "Your full Name is :"+fullName);*/
		
		//Test -03 -showConfirmDialog
		
		int choose =JOptionPane.showConfirmDialog(null, "Do you want to quit program ?","ShowConfirmDialog",JOptionPane.YES_NO_OPTION);
		
		if(choose == JOptionPane.YES_NO_OPTION){
			
			System.exit(0);
		}
		else {
			System.out.println("Hi Every one program is OK !");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}  
