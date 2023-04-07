import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WinRoot extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField tfA;
	private JTextField tfB;
	private JTextField tfC;
	private JTextField tfx1;
	private JTextField tfx2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			WinRoot dialog = new WinRoot();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public WinRoot() {
		setTitle("근의 공식");
		setBounds(100, 100, 320, 320);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblA = new JLabel("a : ");
			lblA.setBounds(39, 36, 57, 15);
			contentPanel.add(lblA);
		}
		{
			tfA = new JTextField();
			tfA.setBounds(110, 33, 116, 21);
			contentPanel.add(tfA);
			tfA.setColumns(10);
		}
		{
			JLabel lblB = new JLabel("b : ");
			lblB.setBounds(39, 76, 57, 15);
			contentPanel.add(lblB);
		}
		{
			tfB = new JTextField();
			tfB.setColumns(10);
			tfB.setBounds(110, 73, 116, 21);
			contentPanel.add(tfB);
		}
		{
			JLabel lblC = new JLabel("c : ");
			lblC.setBounds(39, 118, 57, 15);
			contentPanel.add(lblC);
		}
		{
			tfC = new JTextField();
			tfC.setColumns(10);
			tfC.setBounds(110, 115, 116, 21);
			contentPanel.add(tfC);
		}
		{
			JButton btnCalc = new JButton("계산");
			btnCalc.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double a = Double.parseDouble(tfA.getText());
					double b = Double.parseDouble(tfB.getText());
					double c = Double.parseDouble(tfC.getText());
					
//					System.out.println(a+" "+b+" "+c);
					if(b*b - 4*a*c >=0) {
					double x1 = (-b + Math.sqrt(b*b - 4*a*c)) / 2*a;
					double x2 = (-b - Math.sqrt(b*b - 4*a*c)) / 2*a;
					tfx1.setText(Double.toString(x1));
					tfx2.setText(Double.toString(x2));
//					System.out.println(x1+" , "+x2);
					}else {
						JOptionPane.showMessageDialog(null,"허수가 나왔네요","오류",JOptionPane.ERROR_MESSAGE);
					}
				}
			});
			btnCalc.setBounds(110, 146, 116, 32);
			contentPanel.add(btnCalc);
		}
		{
			JLabel lblX1 = new JLabel("x1");
			lblX1.setBounds(39, 191, 57, 15);
			contentPanel.add(lblX1);
		}
		{
			tfx1 = new JTextField();
			tfx1.setColumns(10);
			tfx1.setBounds(110, 188, 116, 21);
			contentPanel.add(tfx1);
		}
		{
			JLabel lblX2 = new JLabel("x2");
			lblX2.setBounds(39, 233, 57, 15);
			contentPanel.add(lblX2);
		}
		{
			tfx2 = new JTextField();
			tfx2.setColumns(10);
			tfx2.setBounds(110, 230, 116, 21);
			contentPanel.add(tfx2);
		}
	}

}
