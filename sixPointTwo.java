import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class sixPointTwo extends JFrame {

	private JPanel contentPane;
	JLabel label1 = new JLabel("First Number");
	JLabel label2 = new JLabel("Second Number");
	static JTextField field1 = new JTextField();
	static JTextField field2 = new JTextField();
	static JButton button1 = new JButton("Calculate");
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sixPointTwo frame = new sixPointTwo();
					frame.setVisible(true);
					button1.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent arg0) 
						{
							int x = 0;
							int y = 0;
							
							x = Integer.parseInt(field1.getText());
							y = Integer.parseInt(field2.getText());
							int z = x + y;
							JOptionPane.showMessageDialog(null, x + " + " + y + " = " + z);
						}
						
					});
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public sixPointTwo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		label1.setBounds(150, 80, 100, 20);
		label2.setBounds(150, 120, 100, 20);
		field1.setBounds(150, 100, 100, 20);
		field2.setBounds(150, 140, 100, 20);
		button1.setBounds(150, 170, 100, 20);
		contentPane = new JPanel();
		contentPane.add(label1);
		contentPane.add(label2);
		contentPane.add(field1);
		contentPane.add(field2);
		contentPane.add(button1);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
	}

}
