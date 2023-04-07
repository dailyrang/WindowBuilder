import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WinJumincheck extends JDialog {
   private JTextField tfJumin;
   private JTextArea textArea;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               WinJumincheck dialog = new WinJumincheck();
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
   public WinJumincheck() {
      setTitle("주민번호 체커기");
      setBounds(100, 100, 450, 300);
      getContentPane().setLayout(null);
      
      JLabel lblJumin = new JLabel("주민번호입력:");
      lblJumin.setBounds(12, 24, 78, 15);
      getContentPane().add(lblJumin);
      
      tfJumin = new JTextField();
      tfJumin.setBounds(117, 21, 200, 21);
      getContentPane().add(tfJumin);
      tfJumin.setColumns(10);
      
      JButton btnRun = new JButton("생성");
      btnRun.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            String strJumin = tfJumin.getText();
            
               //주민번호 체크
               int sum=0, check = 0, i;
               int arr[] = {2,3,4,5,6,7,8,9,2,3,4,5};
               int arrJumin[] = new int[13];
               for(i=0; i<13; i++) {
                  arrJumin[i] = (int)(Math.random()*9);
                  System.out.print(arrJumin[i]);
               }
               for(i=0; i<12; i++) {
                  sum = sum + arrJumin[i] * arr[i];
                  check = (11 - sum % 11)%10;                  
               }
               String createJumin = "" ;
               for(i=0;i<12;i++)
                  createJumin = createJumin + arrJumin[i];
               createJumin = createJumin + check;
               
               tfJumin.setText(createJumin);
               textArea.setText(textArea.getText() + "\n" + createJumin);
            
         }
      });
      btnRun.setBounds(325, 20, 97, 23);
      getContentPane().add(btnRun);
      
      textArea = new JTextArea();
      textArea.setBounds(12, 53, 410, 186);
      getContentPane().add(textArea);

   }
}