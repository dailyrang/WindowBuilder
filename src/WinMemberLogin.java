import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WinMemberLogin extends JDialog {
	private JTextField tfID;
	private JTextField tfPW;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WinMemberLogin dialog = new WinMemberLogin();
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
	public WinMemberLogin() {
		setTitle("로그인");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblID = new JLabel("아이디 : ");
		lblID.setBounds(32, 44, 101, 15);
		getContentPane().add(lblID);	
		
		tfID = new JTextField();
		tfID.setText("test");
		tfID.setBounds(101, 38, 116, 21);
		getContentPane().add(tfID);
		tfID.setColumns(10);

		tfPW = new JTextField();
		tfPW.setBounds(101, 87, 116, 21);
		getContentPane().add(tfPW);
		tfPW.setColumns(10);
		
		JLabel lblPW = new JLabel("패스워드 : ");
		lblPW.setBounds(32, 93, 101, 15);
		getContentPane().add(lblPW);
		
		JButton btnLogin = new JButton("로그인하기");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sID = tfID.getText();
				String sPW = tfPW.getText();
				// id: test pw:1234 성공 or 실패
					if(sID.equals("test") && sPW.equals("1234") ) {
						JOptionPane.showMessageDialog(null,"성공");
					WinF2C winF2C = new WinF2C();
					winF2C.setModal(true);
					winF2C.setVisible(true);
					}else {
						JOptionPane.showMessageDialog(null,"실패");
						WinRoot winRF = new WinRoot();
						winRF.setModal(true);
						winRF.setVisible(true);
						}
			}
		});
		btnLogin.setBounds(241, 41, 115, 64);
		getContentPane().add(btnLogin);
		
		JButton btnJoin = new JButton("회원가입");
		btnJoin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WinMember winMember = new WinMember();
				winMember.setModal(true);
				winMember.setVisible(true);
			}
		});
		btnJoin.setBounds(103, 133, 253, 44);
		getContentPane().add(btnJoin);

	}
}
