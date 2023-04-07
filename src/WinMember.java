import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class WinMember extends JDialog {
   private JTextField tfId;
   private JTextField tfPw;
   private JTextField tfName;
   private JTextField tfMobile;
   private JTextField tfAddr;
   private JTextField tfEmail;
   private JTextField tfBirth;
   
   private JButton btnJoin;
   private JButton btnDup;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               WinMember dialog = new WinMember();
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
   public WinMember() {
      setTitle("회원가입창");
      setBounds(100, 100, 385, 304);
      getContentPane().setLayout(null);
      
      JLabel lblId = new JLabel("아이디:");
      lblId.setBounds(34, 23, 57, 15);
      getContentPane().add(lblId);
      
      tfId = new JTextField();
      tfId.addKeyListener(new KeyAdapter() {
         @Override
         public void keyPressed(KeyEvent e) {
            if(e.getKeyCode()==KeyEvent.VK_ENTER) {  // 엔터키를 누르면
               tfPw.requestFocus();
            }
         }
      });
      tfId.setBounds(104, 20, 116, 21);
      getContentPane().add(tfId);
      tfId.setColumns(10);
      
      btnDup = new JButton("중복확인");   
      btnDup.setBounds(235, 19, 97, 23);
      getContentPane().add(btnDup);
      
      JLabel lblPw = new JLabel("패스워드:");
      lblPw.setBounds(34, 54, 57, 15);
      getContentPane().add(lblPw);
      
      tfPw = new JTextField();
      tfPw.addKeyListener(new KeyAdapter() {
         @Override
         public void keyPressed(KeyEvent e) {
            if(e.getKeyCode()==KeyEvent.VK_ENTER) {  // 엔터키를 누르면
               tfName.requestFocus();
            }
         }
      });
      tfPw.setColumns(10);
      tfPw.setBounds(104, 51, 116, 21);
      getContentPane().add(tfPw);
      
      JLabel lblName = new JLabel("이름:");
      lblName.setBounds(34, 89, 57, 15);
      getContentPane().add(lblName);
      
      tfName = new JTextField();
      tfName.addKeyListener(new KeyAdapter() {
         @Override
         public void keyPressed(KeyEvent e) {
            if(e.getKeyCode()==KeyEvent.VK_ENTER) {  // 엔터키를 누르면
               tfMobile.requestFocus();
            }
         }
      });
      tfName.setColumns(10);
      tfName.setBounds(104, 86, 116, 21);
      getContentPane().add(tfName);
      
      JLabel lblMobile = new JLabel("연락처:");
      lblMobile.setBounds(34, 129, 57, 15);
      getContentPane().add(lblMobile);
      
      tfMobile = new JTextField();
      tfMobile.addKeyListener(new KeyAdapter() {
         @Override
         public void keyPressed(KeyEvent e) {
            if(e.getKeyCode()==KeyEvent.VK_ENTER) {  // 엔터키를 누르면
               tfAddr.requestFocus();
            }
         }
      });
      tfMobile.setColumns(10);
      tfMobile.setBounds(104, 126, 116, 21);
      getContentPane().add(tfMobile);
      
      JLabel lblAddr = new JLabel("주소:");
      lblAddr.setBounds(34, 163, 57, 15);
      getContentPane().add(lblAddr);
      
      tfAddr = new JTextField();
      tfAddr.addKeyListener(new KeyAdapter() {
         @Override
         public void keyPressed(KeyEvent e) {
            if(e.getKeyCode()==KeyEvent.VK_ENTER) {  // 엔터키를 누르면
               tfEmail.requestFocus();
            }
         }
      });
      tfAddr.setColumns(10);
      tfAddr.setBounds(104, 160, 116, 21);
      getContentPane().add(tfAddr);
      
      JLabel lblEmail = new JLabel("이메일:");
      lblEmail.setBounds(34, 196, 57, 15);
      getContentPane().add(lblEmail);
      
      tfEmail = new JTextField();
      tfEmail.addKeyListener(new KeyAdapter() {
         @Override
         public void keyPressed(KeyEvent e) {
            if(e.getKeyCode()==KeyEvent.VK_ENTER) {  // 엔터키를 누르면
               tfBirth.requestFocus();
            }
         }
      });
      tfEmail.setColumns(10);
      tfEmail.setBounds(104, 193, 116, 21);
      getContentPane().add(tfEmail);
      
      JLabel lblBirth = new JLabel("생일:");
      lblBirth.setBounds(34, 232, 57, 15);
      getContentPane().add(lblBirth);
      
      tfBirth = new JTextField();
      tfBirth.addKeyListener(new KeyAdapter() {
         @Override
         public void keyPressed(KeyEvent e) {
            if(e.getKeyCode()==KeyEvent.VK_ENTER) {  // 엔터키를 누르면
               btnJoin.requestFocus();
            }
         }
      });
      tfBirth.setColumns(10);
      tfBirth.setBounds(104, 229, 116, 21);
      getContentPane().add(tfBirth);
      
      btnJoin = new JButton("회원가입");
      btnJoin.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
           String sId = tfId.getText();
           String sPw = tfPw.getText();
           String sName = tfName.getText();
           String sMoblie = tfMobile.getText();
           String sAddr = tfAddr.getText();
           String sEmail = tfEmail.getText();
           String sBirth = tfBirth.getText();
           
           String sql = "insert into XXXTBL values('" + sId + "','" ;
           sql = sql + sPw + "','" + sName + "')" ;
           System.out.println(sql);
         }
      });
      btnJoin.setBounds(235, 228, 97, 23);
      getContentPane().add(btnJoin);

   }

}