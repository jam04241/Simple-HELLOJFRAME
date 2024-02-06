package cce103l;

import javax.management.loading.PrivateClassLoader;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

	public class Act5_2HelloJFrame extends JFrame implements ActionListener {
		final int WIDTH = 300;
		final int HEIGHT = 200;
		JLabel ask_name1 = new JLabel("First name: ");
		JLabel ask_name2 = new JLabel("Last name: ");
		JLabel ask_name3 = new JLabel("Gender: ");
		JTextField answer1 = new JTextField(10);
		JTextField answer2 = new JTextField(10);
		JTextField answer3 = new JTextField(10);
		Font italicfont = new Font("Comic Sans",Font.ITALIC,20);
		JLabel message = new JLabel("    ");
		JButton Me_btn = new JButton("Press the Button");
		String gender[] = {"Male","Female"};
		JComboBox genderBox = new JComboBox(gender);

	public Act5_2HelloJFrame() {
		setTitle("Activity 5.1");
		setSize(WIDTH,HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		ask_name1.setFont(italicfont);
		ask_name2.setFont(italicfont);
		ask_name3.setFont(italicfont);
		

		add(ask_name1);
		add(answer1);
		add(ask_name2);
		add(answer2);
		add(ask_name3);
		add(genderBox);
		add(Me_btn);
		add(message);
		
		Me_btn.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		answer1.getText();
		answer2.getText();
		String gender = "You are "+answer3;
		answer3.getText();
		String last = ask_name2.getName();
		
		JOptionPane.showMessageDialog(null, "Welcome "+answer1.getText()
																	+" "
																	+answer2.getText()
																	+"\nYour Gender is "
																	+ genderBox.getSelectedItem());	
		
	}

}
