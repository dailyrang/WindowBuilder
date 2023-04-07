import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WinF2C extends JDialog {
	private JTextField tfCelsius;
	private JTextField tfFahrenheit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WinF2C dialog = new WinF2C();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public WinF2C() {
		setTitle("화씨를 섭씨로(F2C)");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblF = new JLabel("화씨(F)");
		lblF.setBounds(20, 9, 41, 15);
		getContentPane().add(lblF);
		
		tfFahrenheit = new JTextField();
		tfFahrenheit.setBounds(66, 6, 205, 21);
		tfFahrenheit.setColumns(10);
		getContentPane().add(tfFahrenheit);
		
		JButton btnConvert = new JButton("F2C");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//화씨를 가지고(getText) 와서 공식에 넣어 게산한 후, 결과를 섭씨에 넣는다.(setText)
				double Fahrenheit = Integer.parseInt(tfFahrenheit.getText());
				// System.out.println(Fahrenheit);
				double Celsius = (double)5/9*(Fahrenheit - 32);
				// System.out.println(Celsius);
				tfCelsius.setText(Double.toString(Celsius));
			}
		});
		btnConvert.setBounds(66, 55, 100, 50);
		getContentPane().add(btnConvert);
		
		JLabel lblC = new JLabel("섭씨(C)");
		lblC.setBounds(20, 133, 43, 15);
		getContentPane().add(lblC);
		
		tfCelsius = new JTextField();
		tfCelsius.setColumns(10);
		tfCelsius.setBounds(76,130,195,21);
		getContentPane().add(tfCelsius);
		
		
		JButton btnC2f = new JButton("C2F");
		btnC2f.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double Celsius = Double.parseDouble(tfFahrenheit.getText());
				double Fahrenheit = Celsius*9/5+32;
				tfFahrenheit.setText(Double.toString(Fahrenheit));
			}
		});
		
		btnC2f.setBounds(171, 55, 100, 50);
		getContentPane().add(btnC2f);

	}
}
