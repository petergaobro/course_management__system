package course_management_system;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class User{
	JFrame frame;
	JTextField field;
	JPasswordField p;
	JLabel l;
	JButton b;
	
	
	User(){
		
		frame = new JFrame("Login GUI : ");
		frame.setSize(500,200);
		frame.getContentPane().setBackground(Color.pink);
		frame.setLocation(300,200);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l = new JLabel("Enter UserName");
		l.setLocation(10,10);
		l.setSize(l.getPreferredSize());
		frame.add(l);
		
		
		field = new JTextField();
		field.setColumns(15);
		field.setSize(field.getPreferredSize());
		
		
		field.setLocation(150,10);
		if(field.equals("CK")){
			System.out.println("Login successfully");
		}
		else{
			System.out.println("Please re-enter your username");
		}
		field.setToolTipText("Enter User Name");
		
		frame.add(field);
		
		
		l = new JLabel("Enter Password");
		l.setLocation(10,40);
		l.setSize(l.getPreferredSize());
		frame.add(l);
		
		
		p = new JPasswordField();
		p.setColumns(15);
		p.setSize(p.getPreferredSize());
		
		
		p.setLocation(150,40);
		if(p.equals("ck!")){
			System.out.println("Login successfully");
		}
		else{
			System.out.println("Please re-enter your password");
		}
		
		
		p.setToolTipText("Enter Password");
		frame.add(p);
		
		b = new JButton("OK");
		b.setSize(b.getPreferredSize());
		b.setLocation(150,80);
		frame.add(b);

		frame.setVisible(true);
	}
	
	public static void main(String args[]){
		new User();
		
	}
	

	

}
