
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author sahil
 */
public class Withdrawal extends javax.swing.JFrame {

    /**
     * Creates new form Withdrawal
     */
    String firstName;
    String firstEmail;
    String firstCardno;
    String firstPin;
    int balance;
    public Withdrawal(){
    initComponents();
    }
    public Withdrawal(String firstName, String firstEmail, String firstCardno, String firstPin, int balance) {
        this.firstName = firstName;
        this.firstEmail = firstEmail;
        this.firstCardno = firstCardno;
        this.firstPin = firstPin;
        this.balance = balance;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblwithdraw = new javax.swing.JLabel();
        txtwithdraw = new javax.swing.JTextField();
        btncancel = new javax.swing.JButton();
        btnwithdraw1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Deposit Amount");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblwithdraw.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblwithdraw.setForeground(new java.awt.Color(0, 102, 102));
        lblwithdraw.setText("Enter money to Withdraw : ");

        txtwithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtwithdrawActionPerformed(evt);
            }
        });

        btncancel.setBackground(new java.awt.Color(0, 102, 102));
        btncancel.setForeground(new java.awt.Color(255, 255, 255));
        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });

        btnwithdraw1.setBackground(new java.awt.Color(0, 102, 102));
        btnwithdraw1.setForeground(new java.awt.Color(255, 255, 255));
        btnwithdraw1.setText("Withdraw");
        btnwithdraw1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnwithdraw1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Withdraw Amount");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(txtwithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblwithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btncancel)
                        .addGap(122, 122, 122))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(97, 97, 97)
                    .addComponent(btnwithdraw1)
                    .addContainerGap(222, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(lblwithdraw)
                .addGap(27, 27, 27)
                .addComponent(txtwithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btncancel)
                .addGap(54, 54, 54))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(223, Short.MAX_VALUE)
                    .addComponent(btnwithdraw1)
                    .addGap(54, 54, 54)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtwithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtwithdrawActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtwithdrawActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        First first = new First(this.firstName, this.firstEmail, this.firstCardno, this.firstPin, this.balance);
        first.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btncancelActionPerformed

    private void btnwithdraw1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnwithdraw1ActionPerformed
        int balance = this.balance; //15000
        int withdraw = Integer.parseInt(txtwithdraw.getText()); //500
        if(withdraw > balance){
            JOptionPane.showMessageDialog(this, "Insufficient Balance");
        }
        else{
        balance = balance - withdraw; //15000 - 500
        String message = "You have successfully withdrawed "+withdraw+" rupees.";
        JOptionPane.showMessageDialog(this, message);
        Complete complete = new Complete(this.firstName, this.firstEmail, this.firstCardno, this.firstPin, balance);
        complete.setVisible(true);
        setVisible(false);
        }
    }//GEN-LAST:event_btnwithdraw1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Withdrawal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Withdrawal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Withdrawal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Withdrawal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Withdrawal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnwithdraw1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblwithdraw;
    private javax.swing.JTextField txtwithdraw;
    // End of variables declaration//GEN-END:variables
}
