import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class RegistrationForm implements ActionListener
{
	JFrame f1;
	JLabel l1,l2,l3,l4;
	JTextField t1,t2,t3,t4;
	JButton b1,b2;

	public void clearFields() {
		t1.setText(null);
		t2.setText(null);
		t3.setText(null);
		t4.setText(null);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() ==  b1) {
			String name = t1.getText();
			String age = t2.getText();
			String phone = t3.getText();
			String email = t4.getText();
			System.out.println("Employee Name "+name);
			System.out.println("Employee Age "+age);
			System.out.println("Employee Email "+email);
			System.out.println("Employee Phone "+phone);
			clearFields();
		}
		else if(ae.getSource() == b2) {
			JOptionPane.showConfirmDialog(null, "Do you want to clear the details?");
			clearFields();
		}
	}
	
	public RegistrationForm() {
		f1 = new JFrame("Registration Form");
		l1 = new JLabel("Employee Full Name");
		l2 = new JLabel("Employee Current Age ");
		l3 = new JLabel("Employee Phone Number ");
		l4 = new JLabel("Employee Email Id ");
		t1 = new JTextField(30);
		t2 = new JTextField(30);
		t3 = new JTextField(30);
		t4 = new JTextField(30);
		b1 = new JButton("Submit Details");
		b2 = new JButton("Cancel");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		var layoutObject = new GridLayout(5,2);
		
		f1.setLayout(layoutObject);
		f1.setSize(400,250);
		f1.setVisible(true);
		
		f1.add(l1);
		f1.add(t1);
		f1.add(l2);
		f1.add(t2);
		f1.add(l3);
		f1.add(t3);
		f1.add(l4);
		f1.add(t4);
		f1.add(b1);
		f1.add(b2);
		
	}
}	
