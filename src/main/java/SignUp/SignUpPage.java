package SignUp;

import Login.LoginPage;
import com.formdev.flatlaf.FlatLightLaf;
import com.mycompany.evalsystem.EvalSystem;
import java.awt.Color;
import java.awt.Cursor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class SignUpPage extends javax.swing.JFrame {
    
    Connection conn;
    ResultSet rs;
    PreparedStatement pst;
    
    
    public SignUpPage() {
        FlatLightLaf.setup();
        initComponents();
        
        conn = EvalSystem.conn();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        backgroundPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        studentNumberField = new javax.swing.JTextField();
        firstNameField = new javax.swing.JTextField();
        lastNameField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        passwordField = new javax.swing.JTextField();
        confirmPasswordField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        loginHyperlink = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255, 180));

        jLabel1.setBackground(new java.awt.Color(0, 102, 204));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("Sign Up");

        studentNumberField.setBackground(new java.awt.Color(0, 102, 204));
        studentNumberField.setForeground(new java.awt.Color(153, 153, 153));
        studentNumberField.setText("Student Number");
        studentNumberField.setCaretColor(new java.awt.Color(204, 204, 204));
        studentNumberField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                studentNumberFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                studentNumberFieldFocusLost(evt);
            }
        });

        firstNameField.setBackground(new java.awt.Color(0, 102, 204));
        firstNameField.setForeground(new java.awt.Color(153, 153, 153));
        firstNameField.setText("First Name");
        firstNameField.setCaretColor(new java.awt.Color(204, 204, 204));
        firstNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                firstNameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                firstNameFieldFocusLost(evt);
            }
        });

        lastNameField.setBackground(new java.awt.Color(0, 102, 204));
        lastNameField.setForeground(new java.awt.Color(153, 153, 153));
        lastNameField.setText("Last Name");
        lastNameField.setCaretColor(new java.awt.Color(204, 204, 204));
        lastNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lastNameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lastNameFieldFocusLost(evt);
            }
        });

        emailField.setBackground(new java.awt.Color(0, 102, 204));
        emailField.setForeground(new java.awt.Color(153, 153, 153));
        emailField.setText("Email");
        emailField.setCaretColor(new java.awt.Color(204, 204, 204));
        emailField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFieldFocusLost(evt);
            }
        });

        passwordField.setBackground(new java.awt.Color(0, 102, 204));
        passwordField.setForeground(new java.awt.Color(153, 153, 153));
        passwordField.setText("Password");
        passwordField.setToolTipText("Confirm Password");
        passwordField.setCaretColor(new java.awt.Color(204, 204, 204));
        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFieldFocusLost(evt);
            }
        });

        confirmPasswordField.setBackground(new java.awt.Color(0, 102, 204));
        confirmPasswordField.setForeground(new java.awt.Color(153, 153, 153));
        confirmPasswordField.setText("Confirm Password");
        confirmPasswordField.setCaretColor(new java.awt.Color(204, 204, 204));
        confirmPasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                confirmPasswordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                confirmPasswordFieldFocusLost(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 102, 204));
        jButton1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("Already have an account?");

        loginHyperlink.setForeground(new java.awt.Color(0, 0, 204));
        loginHyperlink.setText("<html> <u>Login here</u> </html>");
        loginHyperlink.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        loginHyperlink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginHyperlinkMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(firstNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addComponent(studentNumberField)
                    .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginHyperlink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(57, 57, 57)
                .addComponent(studentNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(loginHyperlink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        backgroundPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 420, 660));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sign up/ccst bg.png"))); // NOI18N
        jLabel2.setText("asdfa");
        jLabel2.setToolTipText("");
        backgroundPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentNumberFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_studentNumberFieldFocusGained
        if(studentNumberField.getText().equals("Student Number")) {
            studentNumberField.setText("");
            studentNumberField.setForeground(new Color(255, 255, 255));
        }
    }//GEN-LAST:event_studentNumberFieldFocusGained

    private void studentNumberFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_studentNumberFieldFocusLost
        if (studentNumberField.getText().equals("")){
            studentNumberField.setText("Student Number");
            studentNumberField.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_studentNumberFieldFocusLost

    private void firstNameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameFieldFocusGained
        if(firstNameField.getText().equals("First Name")) {
            firstNameField.setText("");
            firstNameField.setForeground(new Color(255, 255, 255));
        }

    }//GEN-LAST:event_firstNameFieldFocusGained

    private void firstNameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameFieldFocusLost
        if (firstNameField.getText().equals("")){
            firstNameField.setText("First Name");
            firstNameField.setForeground(new Color(153,153,153));
    }

    }//GEN-LAST:event_firstNameFieldFocusLost

    private void lastNameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNameFieldFocusGained
        if(lastNameField.getText().equals("Last Name")) {
            lastNameField.setText("");
            lastNameField.setForeground(new Color(255, 255, 255));
        }

    }//GEN-LAST:event_lastNameFieldFocusGained

    private void lastNameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNameFieldFocusLost
        if (lastNameField.getText().equals("")){
            lastNameField.setText("Last Name");
            lastNameField.setForeground(new Color(153,153,153));
    }

    }//GEN-LAST:event_lastNameFieldFocusLost

    private void emailFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFieldFocusGained
        if(emailField.getText().equals("Email")) {
            emailField.setText("");
            emailField.setForeground(new Color(255, 255, 255));
        }

    }//GEN-LAST:event_emailFieldFocusGained

    private void emailFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFieldFocusLost
        if (emailField.getText().equals("")){
            emailField.setText("Email");
            emailField.setForeground(new Color(153,153,153));
    }

    }//GEN-LAST:event_emailFieldFocusLost

    private void passwordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusGained
        if(passwordField.getText().equals("Password") ){
            passwordField.setText("");
            passwordField.setForeground(new Color(255, 255, 255));
        }

    }//GEN-LAST:event_passwordFieldFocusGained

    private void passwordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusLost
        if (passwordField.getText().equals("")){
            passwordField.setText("Password");
            passwordField.setForeground(new Color(153,153,153));
    }

    }//GEN-LAST:event_passwordFieldFocusLost

    private void confirmPasswordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmPasswordFieldFocusGained
        if(confirmPasswordField.getText().equals("Confirm Password")) {
            confirmPasswordField.setText("");
            confirmPasswordField.setForeground(new Color(255, 255, 255));
        }

    }//GEN-LAST:event_confirmPasswordFieldFocusGained

    private void confirmPasswordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmPasswordFieldFocusLost
        if (confirmPasswordField.getText().equals("")){
            confirmPasswordField.setText("Confirm Password");
            confirmPasswordField.setForeground(new Color(153,153,153));
    }

    }//GEN-LAST:event_confirmPasswordFieldFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String studentNum, firstName, lastName, studentEmail, password, confirmPassword;
        studentNum = studentNumberField.getText();
        firstName = firstNameField.getText();
        lastName = lastNameField.getText();
        studentEmail = emailField.getText();
        password = passwordField.getText();
        confirmPassword = confirmPasswordField.getText();
        
        try {
            String checkExistenceQuery = "SELECT * FROM Student_Login WHERE Student_Number = ?";
            pst = conn.prepareStatement(checkExistenceQuery);
            pst.setString(1, studentNum);
            rs = pst.executeQuery();
            
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "A user with the same credentials is already in the database", "Unable to Create Account", JOptionPane.ERROR_MESSAGE);
            } else {
                if (studentNum.equals("") || firstName.equals("") || lastName.equals("") || studentEmail.equals("") || password.equals("") || confirmPassword.equals("")){
                    JOptionPane.showMessageDialog(null, "Please make sure to enter appropriate details", "Empty Fields Detected", JOptionPane.WARNING_MESSAGE);
                } else {
                    if (!password.equals(confirmPassword)) {
                        JOptionPane.showMessageDialog(null, "Please check your password and try again", "Incorrect Password", JOptionPane.WARNING_MESSAGE);
                    } else {
                        try {
                            String createUserQuery = "INSERT INTO Student_Number, Student_First_Name, Student_Last_Name, Student_Email, Student_Password VALUES (?, ?, ?, ?, ?)";
                            pst = conn.prepareStatement(createUserQuery);
                            pst.setString(1, studentNum);
                            pst.setString(2, firstName);
                            pst.setString(3, lastName);
                            pst.setString(4, studentEmail);
                            pst.setString(5, password);
                            pst.execute();
                            JOptionPane.showMessageDialog(null, "Account Creation Successful");
                        } catch (Exception e) {
                        }
                    }
                }
            }
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void loginHyperlinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginHyperlinkMouseClicked
        LoginPage newLogin = new LoginPage();
        newLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loginHyperlinkMouseClicked

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
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FlatLightLaf.setup();
                new SignUpPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JTextField confirmPasswordField;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel loginHyperlink;
    private javax.swing.JTextField passwordField;
    private javax.swing.JTextField studentNumberField;
    // End of variables declaration//GEN-END:variables
}
