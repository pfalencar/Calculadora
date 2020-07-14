package calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frmCalcversion;
	private JTextField textField;
	
	private double firstNumber;
	private double secondNumber;
	private double result;
	private String operation;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmCalcversion.setVisible(true);
					window.frmCalcversion.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalcversion = new JFrame("MyCalc");
		frmCalcversion.setTitle("MyCalc");
		frmCalcversion.setBounds(100, 100, 225, 341);
		frmCalcversion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalcversion.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 198, 29);
		frmCalcversion.getContentPane().add(textField);
		textField.setColumns(10);
	
		
		//############################### Row 1 ##################################
		
		//-------------------button Backspace-----------------------------------
		JButton btnBackSpace = new JButton("<-");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				
				if (textField.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() - 1);
					backspace = strB.toString();
					textField.setText(backspace);
				}
			}
		});
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBackSpace.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBackSpace.setBounds(10, 51, 49, 49);
		frmCalcversion.getContentPane().add(btnBackSpace);
		
		//-------------------button Clear -----------------------------------
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnC.setBounds(60, 51, 49, 48);
		frmCalcversion.getContentPane().add(btnC);
		
		//------------------- button % -----------------------------------
		JButton btnPorc = new JButton("%");
		btnPorc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";
			}
			
		});		
		btnPorc.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPorc.setBounds(110, 51, 48, 48);
		frmCalcversion.getContentPane().add(btnPorc);
		
		//------------------- button +- ----------------------------------
		JButton btnPM = new JButton("\u00B1");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double varTrocaSinal = Double.parseDouble(textField.getText());
				
				varTrocaSinal = (-1) * varTrocaSinal;
				textField.setText(String.valueOf(varTrocaSinal));
			}
		});
		btnPM.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnPM.setBounds(160, 51, 48, 48);
		frmCalcversion.getContentPane().add(btnPM);
				
				
		//############################### Row 2 ##################################
		
		//-------------------button 7-----------------------------------
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber7 = textField.getText() + btn7.getText();
				textField.setText(enterNumber7);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(10, 101, 48, 48);
		frmCalcversion.getContentPane().add(btn7);
		
		//-------------------button 8-----------------------------------
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber8 = textField.getText() + btn8.getText();
				textField.setText(enterNumber8);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(60, 101, 48, 48);
		frmCalcversion.getContentPane().add(btn8);
		
		//-------------------button 9-----------------------------------
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber9 = textField.getText() + btn9.getText();
				textField.setText(enterNumber9);
			}
		});
		
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(110, 101, 48, 48);
		frmCalcversion.getContentPane().add(btn9);
		
		//---------------------button Plus-----------------------------------
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
			
		});
		
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPlus.setBounds(160, 101, 48, 48);
		frmCalcversion.getContentPane().add(btnPlus);
		
		
		//############################### Row 3 ##################################
		
		//-------------------button 4-----------------------------------
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber4 = textField.getText() + btn4.getText();
				textField.setText(enterNumber4);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(10, 151, 48, 48);
		frmCalcversion.getContentPane().add(btn4);
		
		//-------------------button 5-----------------------------------
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber5 = textField.getText() + btn5.getText();
				textField.setText(enterNumber5);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(60, 151, 48, 48);
		frmCalcversion.getContentPane().add(btn5);
		
		//-------------------button 6-----------------------------------
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber6 = textField.getText() + btn6.getText();
				textField.setText(enterNumber6);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(110, 151, 48, 48);
		frmCalcversion.getContentPane().add(btn6);
		
		//-------------------button Subtraction-----------------------------------
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");	
				operation = "-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSub.setBounds(160, 151, 48, 48);
		frmCalcversion.getContentPane().add(btnSub);
		
		
		//############################### Row 4 ##################################
		
		//-------------------button 1-----------------------------------
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber1 = textField.getText() + btn1.getText();
				textField.setText(enterNumber1);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(10, 201, 48, 48);
		frmCalcversion.getContentPane().add(btn1);
		
		//-------------------button 2-----------------------------------
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber2 = textField.getText() + btn2.getText();
				textField.setText(enterNumber2);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(60, 201, 48, 48);
		frmCalcversion.getContentPane().add(btn2);
		
		//-------------------button 3-----------------------------------
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber3 = textField.getText() + btn3.getText();
				textField.setText(enterNumber3);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(110, 201, 48, 48);
		frmCalcversion.getContentPane().add(btn3);
		
		//-------------------button Multiplication-------------------------------
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMult.setBounds(160, 201, 48, 48);
		frmCalcversion.getContentPane().add(btnMult);
		
		
		//############################### Row 5 ##################################
		
		//-------------------button 0-----------------------------------
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber0 = textField.getText() + btn0.getText();
				textField.setText(enterNumber0);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(10, 251, 48, 48);
		frmCalcversion.getContentPane().add(btn0);
		
		//-------------------button Dot-----------------------------------
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumberDot = textField.getText() + btnDot.getText();
				textField.setText(enterNumberDot);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDot.setBounds(60, 251, 48, 48);
		frmCalcversion.getContentPane().add(btnDot);
		
		//-------------------button Equal-----------------------------------
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				
				secondNumber = Double.parseDouble(textField.getText());
				
				if (operation == "+") {	
					
					result = firstNumber + secondNumber;
					answer = String.format("%.2f", result);
					textField.setText(answer);
						
				} else if (operation == "-") {	
					
					result = firstNumber - secondNumber;
					answer = String.format("%.2f", result);
					textField.setText(answer);
						
				} else if (operation == "*") {	
					
					result = firstNumber * secondNumber;
					answer = String.format("%.2f", result);
					textField.setText(answer);
					
				} else if (operation == "/") {	
					
					if (secondNumber != 0) {
						result = firstNumber / secondNumber;
						answer = String.format("%.2f", result);
						textField.setText(answer);
					} else {
						textField.setText("Não existe divisão por zero");
					}
						
				} else if (operation == "%") {	
					
					result = (firstNumber/100) * secondNumber;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEqual.setBounds(110, 251, 48, 48);
		frmCalcversion.getContentPane().add(btnEqual);
		
		//-------------------button Division-----------------------------------
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDiv.setBounds(160, 251, 48, 48);
		frmCalcversion.getContentPane().add(btnDiv);
		
	}
	
}
