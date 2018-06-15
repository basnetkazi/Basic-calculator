import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class FirstGui {

	private JFrame frame;
	private final Action action = new SwingAction();
	private JButton btnAC;
	private JButton btnpm;
	private JButton btnmod;
	private JButton btndiv;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btnmult;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btndiff;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btnsum;
	private JButton btn0;
	private JButton btndot;
	private JButton btneql;
	private JLabel lblans;
	private double number1, number2, answer;
	private int operator;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstGui window = new FirstGui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FirstGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	//@SuppressWarnings("deprecation")
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 11));
		frame.setBounds(100, 100, 254, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnAC = new JButton("AC");
		btnAC.setBackground(new Color(153, 153, 204));
		btnAC.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnAC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblans.setText("0");
				number1=0; number2=0;
				operator=0;
				answer=0;
				lblans.setText("0");
			}
		});
		btnAC.setBounds(10, 84, 47, 23);
		frame.getContentPane().add(btnAC);
		
		btnpm = new JButton("+/-");
		btnpm.setBackground(new Color(153, 153, 204));
		btnpm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnpm.setBounds(67, 83, 49, 23);
		frame.getContentPane().add(btnpm);
		
		btnmod = new JButton("%");
		btnmod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickedoperator(10);
			}
		});
		btnmod.setBackground(new Color(153, 153, 204));
		btnmod.setBounds(126, 84, 46, 23);
		frame.getContentPane().add(btnmod);
		
		btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickedoperator(11);
			}
		});
		btndiv.setBackground(new Color(255, 153, 0));
		btndiv.setBounds(182, 84, 47, 23);
		frame.getContentPane().add(btndiv);
		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changednum(7);
			}
		});
		btn7.setBounds(10, 118, 47, 23);
		frame.getContentPane().add(btn7);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changednum(8);
			}
		});
		btn8.setBounds(67, 118, 49, 23);
		frame.getContentPane().add(btn8);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changednum(9);
			}
		});
		btn9.setBounds(126, 118, 46, 23);
		frame.getContentPane().add(btn9);
		
		btnmult = new JButton("*");
		btnmult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickedoperator(12);
			}
		});
		btnmult.setBackground(new Color(255, 153, 0));
		btnmult.setBounds(182, 118, 47, 23);
		frame.getContentPane().add(btnmult);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changednum(4);
			}
		});
		btn4.setBounds(10, 152, 47, 23);
		frame.getContentPane().add(btn4);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changednum(5);
			}
		});
		btn5.setBounds(67, 152, 49, 23);
		frame.getContentPane().add(btn5);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changednum(6);
			}
		});
		btn6.setBounds(126, 152, 46, 23);
		frame.getContentPane().add(btn6);
		
		btndiff = new JButton("-");
		btndiff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickedoperator(13);
			}
		});
		btndiff.setBackground(new Color(255, 153, 0));
		btndiff.setBounds(182, 152, 47, 23);
		frame.getContentPane().add(btndiff);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changednum(1);
				
			}
		});
		btn1.setBounds(10, 187, 47, 23);
		frame.getContentPane().add(btn1);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changednum(2);
			}
		});
		btn2.setBounds(67, 187, 49, 23);
		frame.getContentPane().add(btn2);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changednum(3);
			}
		});
		btn3.setBounds(126, 186, 46, 23);
		frame.getContentPane().add(btn3);
		
		btnsum = new JButton("+");
		btnsum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickedoperator(14);
			}
		});
		btnsum.setBackground(new Color(255, 153, 0));
		btnsum.setBounds(182, 186, 47, 23);
		frame.getContentPane().add(btnsum);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changednum(0);
			}
		});
		btn0.setBounds(10, 221, 106, 23);
		frame.getContentPane().add(btn0);
		
		btndot = new JButton(".");
		btndot.setBounds(126, 220, 46, 23);
		frame.getContentPane().add(btndot);
		
		btneql = new JButton("=");
		btneql.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickedoperator(15);
			}
		});
		btneql.setBackground(new Color(255, 153, 0));
		btneql.setBounds(182, 221, 47, 23);
		frame.getContentPane().add(btneql);
		
		lblans = new JLabel("0");
		lblans.setHorizontalAlignment(SwingConstants.RIGHT);
		lblans.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblans.setBounds(10, 11, 219, 62);
		frame.getContentPane().add(lblans);
		
		
	}
	public void changednum(int value) {
		
			double read= Double.parseDouble(lblans.getText());
			if(operator!=15) {
			if(read==0) {
				lblans.setText(String.valueOf(value));
				
				
			}
			else {
				int ans;
				ans=(int) read*10+value;
				lblans.setText(String.valueOf(ans));
			}
			/*if(operator!=0) {
				clickedoperator((int)operator);
			}*/
			}
			else {
				lblans.setText("0");
				answer=0;
				number1=0;
				operator=0;
				//lblans.setText(text);
			}
		}
	public void clickedoperator(int oper)
	{	
				
		if(number1==0) {
			number1= Double.parseDouble(lblans.getText());
			if(oper==15) {
				lblans.setText(String.valueOf(number1));
				
			}
			else {
				lblans.setText("0");
				
			}
		}
		/*else if (operator==0)
		{
			number2=Double.parseDouble(lblans.getText());
			operator=oper;
			
		}*/
		/*else if(oper==15 && number2==0){
			lblans.setText(String.valueOf(number1));
		}*/
		
		else if(number2==0) {
			number2=Double.parseDouble(lblans.getText());
			if(number2==0) {
				/*number1=0;
				answer=0;
				operator=0;*/
				//this.
				//lblans.setText("Error.......");
				//main(null);
				JOptionPane.showMessageDialog(null, "No second operand entered.");
				//try{this.getClass(); ;}catch(Exception e) {}
				//lblans.setText("0");
				//System.out.println(number2);
			  
			}
			else {
			calculate(operator);
			if(oper==15) {
				
				lblans.setText(String.valueOf(answer));
				number1=0;
			}
			else {
				
				lblans.setText("0");
			}
			
		
		
			}
		}
		operator=oper;
}
		
		

	
	
	public void calculate(int oper)
		{
		switch(oper) {
		case 10:
			answer=number1%number2;
			
			break;
		case 11:
			answer=number1/number2;
			
			break;
		case 12:
			answer=number1*number2;
			
			break;
		case 13:
			answer=number1-number2;
			
			break;
		
		case 14:
			answer=number1+number2;
			
			break;
		}
		
		number1=answer;
		number2=0;
		//System.out.println(number1);
		
		//lblans.setText(String.valueOf(answer));
		
		//operator=0;
		
		}
		
		
		
	
	
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			System.out.println("clicked");
		}
	}
}
