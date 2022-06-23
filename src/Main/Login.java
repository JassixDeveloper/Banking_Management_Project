/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.Color;
import javax.swing.JPanel;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Anmol
 */
public class Login extends javax.swing.JFrame {

     public Connection connect;
     public static String AccountNo;
    public Login() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BasePanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BankPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        SignupPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        ForgetPanel = new javax.swing.JPanel();
        forgettext = new javax.swing.JLabel();
        ExitPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        username = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        SigningButton = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        CloseButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setUndecorated(true);

        BasePanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(3, 169, 244));

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sky Bank");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/pngwing.com.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("India's Number One Online Bank");

        BankPanel.setBackground(new java.awt.Color(3, 169, 244));
        BankPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BankPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BankPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BankPanelPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BankPanelPanelMouseExited(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/crearte Account.png"))); // NOI18N
        jLabel10.setText("Bank Account");

        javax.swing.GroupLayout BankPanelLayout = new javax.swing.GroupLayout(BankPanel);
        BankPanel.setLayout(BankPanelLayout);
        BankPanelLayout.setHorizontalGroup(
            BankPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BankPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BankPanelLayout.setVerticalGroup(
            BankPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BankPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SignupPanel.setBackground(new java.awt.Color(3, 169, 244));
        SignupPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignupPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignupPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SignupPanelPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SignupPanelPanelMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/crearte Account.png"))); // NOI18N
        jLabel7.setText("Create Account");

        javax.swing.GroupLayout SignupPanelLayout = new javax.swing.GroupLayout(SignupPanel);
        SignupPanel.setLayout(SignupPanelLayout);
        SignupPanelLayout.setHorizontalGroup(
            SignupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignupPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SignupPanelLayout.setVerticalGroup(
            SignupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SignupPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        ForgetPanel.setBackground(new java.awt.Color(3, 169, 244));
        ForgetPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ForgetPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ForgetPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ForgetPanelPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ForgetPanelPanelMouseExited(evt);
            }
        });

        forgettext.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 24)); // NOI18N
        forgettext.setForeground(new java.awt.Color(255, 255, 255));
        forgettext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/forgetpass.png"))); // NOI18N
        forgettext.setText("Forgot  Password");

        javax.swing.GroupLayout ForgetPanelLayout = new javax.swing.GroupLayout(ForgetPanel);
        ForgetPanel.setLayout(ForgetPanelLayout);
        ForgetPanelLayout.setHorizontalGroup(
            ForgetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ForgetPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(forgettext)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ForgetPanelLayout.setVerticalGroup(
            ForgetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ForgetPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(forgettext)
                .addContainerGap())
        );

        ExitPanel.setBackground(new java.awt.Color(3, 169, 244));
        ExitPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitPanelPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitPanelPanelMouseExited(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8-macos-close-30.png"))); // NOI18N
        jLabel9.setText("Exit");

        javax.swing.GroupLayout ExitPanelLayout = new javax.swing.GroupLayout(ExitPanel);
        ExitPanel.setLayout(ExitPanelLayout);
        ExitPanelLayout.setHorizontalGroup(
            ExitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExitPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ExitPanelLayout.setVerticalGroup(
            ExitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ExitPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ExitPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ForgetPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SignupPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(BankPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BankPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SignupPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(ForgetPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ExitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        username.setToolTipText("Enter Your User Name");
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/undraw_profile_pic_ic5t.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel5.setText("Password");

        jLabel6.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel6.setText("Username");

        SigningButton.setBackground(new java.awt.Color(0, 0, 255));
        SigningButton.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 24)); // NOI18N
        SigningButton.setForeground(new java.awt.Color(255, 255, 255));
        SigningButton.setText("Sigin");
        SigningButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SigningButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SigningButtonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("Welcome");

        CloseButton.setBackground(new java.awt.Color(255, 0, 0));
        CloseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8-close-window-30.png"))); // NOI18N
        CloseButton.setBorder(null);
        CloseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.CENTER, jPanel3Layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jLabel4)
                .addGap(167, 167, 167)
                .addComponent(CloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(191, 191, 191))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(SigningButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)))
                        .addGap(129, 129, 129))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(36, 36, 36)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(SigningButton)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BasePanelLayout = new javax.swing.GroupLayout(BasePanel);
        BasePanel.setLayout(BasePanelLayout);
        BasePanelLayout.setHorizontalGroup(
            BasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BasePanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BasePanelLayout.setVerticalGroup(
            BasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BasePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BasePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SignupPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignupPanelMouseClicked
        // TODO add your handling code here:
        CreateAccount AC = new CreateAccount();
        setVisible(false);
        dispose();
        AC.setVisible(true);
    }//GEN-LAST:event_SignupPanelMouseClicked

    private void SignupPanelPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignupPanelPanelMouseEntered
        // TODO add your handling code here:
        if(evt.getSource()==SignupPanel){                           // This event is as similar as above event
            SignupPanel.setBackground( new Color(2, 156, 227));
        }
        if(evt.getSource()==ForgetPanel){
            ForgetPanel.setBackground( new Color(2, 156, 227));
        }if(evt.getSource()==ExitPanel){
            ExitPanel.setBackground( new Color(2, 156, 227));
        }
    }//GEN-LAST:event_SignupPanelPanelMouseEntered

    private void SignupPanelPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignupPanelPanelMouseExited
        if(evt.getSource()==SignupPanel){                           // if mouse exited from signup panel it change color
            // evt.getSource check the particular mouse pointer leav or enter
            // accourding to that it react
            SignupPanel.setBackground( new Color(3, 169, 244));
        }
        if(evt.getSource()==ForgetPanel){
            ForgetPanel.setBackground( new Color(3, 169, 244));
        }if(evt.getSource()==ExitPanel){
            ExitPanel.setBackground( new Color(3, 169, 244));
        }
    }//GEN-LAST:event_SignupPanelPanelMouseExited

    private void ForgetPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForgetPanelMouseClicked
        setVisible(false);
        dispose();
        new ResetPassword().setVisible(true);
    }//GEN-LAST:event_ForgetPanelMouseClicked

    private void ForgetPanelPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForgetPanelPanelMouseEntered
        // TODO add your handling code here:
        if(evt.getSource()==SignupPanel){                           // This event is as similar as above event
            SignupPanel.setBackground( new Color(2, 156, 227));
        }
        if(evt.getSource()==ForgetPanel){
            ForgetPanel.setBackground( new Color(2, 156, 227));
        }if(evt.getSource()==ExitPanel){
            ExitPanel.setBackground( new Color(2, 156, 227));
        }
    }//GEN-LAST:event_ForgetPanelPanelMouseEntered

    private void ForgetPanelPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForgetPanelPanelMouseExited
        if(evt.getSource()==SignupPanel){                           // if mouse exited from signup panel it change color
            // evt.getSource check the particular mouse pointer leav or enter
            // accourding to that it react
            SignupPanel.setBackground( new Color(3, 169, 244));
        }
        if(evt.getSource()==ForgetPanel){
            ForgetPanel.setBackground( new Color(3, 169, 244));
        }if(evt.getSource()==ExitPanel){
            ExitPanel.setBackground( new Color(3, 169, 244));
        }
    }//GEN-LAST:event_ForgetPanelPanelMouseExited

    private void ExitPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitPanelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitPanelMouseClicked

    private void ExitPanelPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitPanelPanelMouseEntered
        // TODO add your handling code here:
        if(evt.getSource()==SignupPanel){                           // This event is as similar as above event
            SignupPanel.setBackground( new Color(2, 156, 227));
        }
        if(evt.getSource()==ForgetPanel){
            ForgetPanel.setBackground( new Color(2, 156, 227));
        }if(evt.getSource()==ExitPanel){
            ExitPanel.setBackground( new Color(2, 156, 227));
        }
    }//GEN-LAST:event_ExitPanelPanelMouseEntered

    private void ExitPanelPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitPanelPanelMouseExited
        if(evt.getSource()==SignupPanel){                           // if mouse exited from signup panel it change color
            // evt.getSource check the particular mouse pointer leav or enter
            // accourding to that it react
            SignupPanel.setBackground( new Color(3, 169, 244));
        }
        if(evt.getSource()==ForgetPanel){
            ForgetPanel.setBackground( new Color(3, 169, 244));
        }if(evt.getSource()==ExitPanel){
            ExitPanel.setBackground( new Color(3, 169, 244));
        }
    }//GEN-LAST:event_ExitPanelPanelMouseExited

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_usernameActionPerformed

    private void SigningButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SigningButtonActionPerformed

        try {
            Class.forName("com.mysql.jdbc.Driver");    //This Statment is used to load mysql jdbc driver
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/wandee bank","root","");    // To Connect with datatbase
            String query = "Select * from logindetail where Username=? and Password=?";     // Select Query
            PreparedStatement pst = connect.prepareStatement(query);    // Dynamic query fire class Prpare Statment
            pst.setString(1, username.getText());                       // to read data in the username text box
            pst.setString(2, password.getText());                       // to read password from password textfield
            ResultSet rs = pst.executeQuery();                          // Resultset which is used to execute query
            if(rs.next()){                                              // this method rs.next check query is execute or not
                AccountNo=rs.getString("AccountNumber");               // getNString is used to fetch String type data from database
                setVisible(false);
                new NewDashboard().setVisible(true);                    // here we call dashboard class with setVisible method
                dispose();                                              // it used to distroy cuurent class from memory
            }
            else if("".equals(username.getText()) && "".equals(password.getText())){
                JOptionPane.showMessageDialog(null, "Please Enter Username or Password!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid Credential !");
                username.setText("");
                password.setText("");
            }
            connect.close();                                                    // Here we close connection of database
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Cannot Connect With Server \n Please Check Your Internet Connection or Call to Bank");
        }

    }//GEN-LAST:event_SigningButtonActionPerformed

    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseButtonActionPerformed

        System.exit(0);
    }//GEN-LAST:event_CloseButtonActionPerformed

    private void BankPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BankPanelMouseClicked
        // TODO add your handling code here:
        BankAccount AC = new BankAccount();
        setVisible(false);
        dispose();
        AC.setVisible(true);
    }//GEN-LAST:event_BankPanelMouseClicked

    private void BankPanelPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BankPanelPanelMouseEntered
        // TODO add your handling code here:
        if(evt.getSource()==BankPanel){                           // This event is as similar as above event
            BankPanel.setBackground( new Color(2, 156, 227));
        }
        if(evt.getSource()==ForgetPanel){
            ForgetPanel.setBackground( new Color(2, 156, 227));
        }if(evt.getSource()==ExitPanel){
            ExitPanel.setBackground( new Color(2, 156, 227));
        }
    }//GEN-LAST:event_BankPanelPanelMouseEntered

    private void BankPanelPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BankPanelPanelMouseExited
        // TODO add your handling code here:
        if(evt.getSource()==BankPanel){                           // if mouse exited from signup panel it change color
            // evt.getSource check the particular mouse pointer leav or enter
            // accourding to that it react
            BankPanel.setBackground( new Color(3, 169, 244));
        }
        if(evt.getSource()==ForgetPanel){
            ForgetPanel.setBackground( new Color(3, 169, 244));
        }if(evt.getSource()==ExitPanel){
            ExitPanel.setBackground( new Color(3, 169, 244));
        }
    }//GEN-LAST:event_BankPanelPanelMouseExited

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BankPanel;
    private javax.swing.JPanel BasePanel;
    private javax.swing.JButton CloseButton;
    private javax.swing.JPanel ExitPanel;
    private javax.swing.JPanel ForgetPanel;
    private javax.swing.JButton SigningButton;
    private javax.swing.JPanel SignupPanel;
    private javax.swing.JLabel forgettext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
