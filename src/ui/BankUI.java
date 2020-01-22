
package ui;
import business.*;
import java.awt.Container;
import java.text.NumberFormat;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import validation.Validator;

/*
 **Date: 11/29/18
 * @author twalters25, dgraff, ngillil
 */
public class BankUI extends javax.swing.JFrame {
BankAccount bankAcct;
CheckingAccount checkingAcct;
SavingsAccount savingsAcct;

NumberFormat c = NumberFormat.getCurrencyInstance();
    public BankUI() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("bank_dollar.png")).getImage());
        //center form
        this.setLocationRelativeTo(this);
        //set Premier to be the default radio button
        jRadioButtonPremier.setSelected(true);
        //call populateComboBox() method
        populateComboBox();
        jComboBoxAccount.setSelectedIndex(-1);
        jComboBoxAccount.setRenderer(new PromptComboBoxRenderer("-Select Account Type-"));
        disableButtons();//call disableButtons()
        disableTextFields(); // call disableTextFields()
        /* Will need to enable the deposit/withdraw buttons 
            after an account is created!
        */
        jLabelMsg.setText("Status: Ready to create a new account");
    }
    //method: populateComboBox()
    public void populateComboBox(){
        jComboBoxAccount.removeAllItems();
        jComboBoxAccount.setModel(new DefaultComboBoxModel(AccountType.values()));
        jComboBoxAccount.setSelectedIndex(0);
    }
    public void disableButtons(){
        jButtonWithdraw.setEnabled(false);
        jButtonDeposit.setEnabled(false);
        jButtonPrintStatement.setEnabled(false);
        jButtonViewBalance.setEnabled(false);
    }
    public void enableButtons(){
        jButtonWithdraw.setEnabled(true);
        jButtonDeposit.setEnabled(true);
        jButtonPrintStatement.setEnabled(true);
        jButtonViewBalance.setEnabled(true);
    }
    
    // These two methods pertain to the deposit/withdraw text fields
    public void disableTextFields() {
        jTextFieldDeposit.setEnabled(false);
        jTextFieldWithdraw.setEnabled(false);
    }
    
    public void enableTextFields() {
        jTextFieldDeposit.setEnabled(true);
        jTextFieldWithdraw.setEnabled(true);
    }
    
    // This method pertains to the new account setup text fields
    public void disableAcctSetupFields() {
        jTextFieldAcctNumber.setEnabled(false);
        jTextFieldFirstName.setEnabled(false);
        jTextFieldLastName.setEnabled(false);
        
        // also the combo box and radio buttons
        jComboBoxAccount.setEnabled(false);
        jRadioButtonBasic.setEnabled(false);
        jRadioButtonPremier.setEnabled(false);
    }
    
        public void enableAcctSetupFields() {
        jTextFieldAcctNumber.setEnabled(true);
        jTextFieldFirstName.setEnabled(true);
        jTextFieldLastName.setEnabled(true);
        
        // also the combo box and radio buttons
        jComboBoxAccount.setEnabled(true);
        jRadioButtonBasic.setEnabled(true);
        jRadioButtonPremier.setEnabled(true);
    }
    
    public void disableRadioButtons() {
        jRadioButtonBasic.setEnabled(false);
        jRadioButtonPremier.setEnabled(false);
    }
    
    // This method pertains to the Welcome button only
    public void disableWelcomeButton() {
        jButtonWelcome.setEnabled(false);
    }
    
    // Method to hide radio buttons (if an account other than checking is selected)
    public void hideRadioButtons() {
        jRadioButtonBasic.setVisible(false);
        jRadioButtonPremier.setVisible(false);
    }
    
    public void clearTextFields() {
        jTextFieldAcctNumber.setText("");
        jTextFieldFirstName.setText("");
        jTextFieldLastName.setText("");
        jTextFieldDeposit.setText("");
        jTextFieldWithdraw.setText("");
    }
    
    public void resetFrame() {
        BankUI.this.dispose();
        new BankUI();
    }
   
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanelCustomerInfo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxAccount = new javax.swing.JComboBox<>();
        jRadioButtonBasic = new javax.swing.JRadioButton();
        jRadioButtonPremier = new javax.swing.JRadioButton();
        jTextFieldAcctNumber = new javax.swing.JTextField();
        jTextFieldFirstName = new javax.swing.JTextField();
        jTextFieldLastName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanelAccountActions = new javax.swing.JPanel();
        jLabelMsg = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldDeposit = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldWithdraw = new javax.swing.JTextField();
        jButtonWelcome = new javax.swing.JButton();
        jButtonDeposit = new javax.swing.JButton();
        jButtonWithdraw = new javax.swing.JButton();
        jButtonViewBalance = new javax.swing.JButton();
        jButtonPrintStatement = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jLabelWelcomeHeading = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 178, 153));

        jPanelCustomerInfo.setBackground(new java.awt.Color(204, 127, 51));
        jPanelCustomerInfo.setBorder(javax.swing.BorderFactory.createTitledBorder("Customer Information"));

        jLabel1.setText("Account:");

        jComboBoxAccount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxAccount.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxAccountItemStateChanged(evt);
            }
        });
        jComboBoxAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAccountActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonBasic);
        jRadioButtonBasic.setText("Basic");

        buttonGroup1.add(jRadioButtonPremier);
        jRadioButtonPremier.setText("Premier");

        jTextFieldAcctNumber.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldAcctNumber.setName("Account # "); // NOI18N

        jTextFieldFirstName.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldFirstName.setName("First Name"); // NOI18N

        jTextFieldLastName.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldLastName.setName("Last Name "); // NOI18N

        jLabel4.setText("Account #:");

        jLabel5.setText("First Name: ");

        jLabel6.setText("Last Name: ");

        javax.swing.GroupLayout jPanelCustomerInfoLayout = new javax.swing.GroupLayout(jPanelCustomerInfo);
        jPanelCustomerInfo.setLayout(jPanelCustomerInfoLayout);
        jPanelCustomerInfoLayout.setHorizontalGroup(
            jPanelCustomerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCustomerInfoLayout.createSequentialGroup()
                .addGroup(jPanelCustomerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCustomerInfoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelCustomerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)))
                    .addGroup(jPanelCustomerInfoLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCustomerInfoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanelCustomerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCustomerInfoLayout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addGroup(jPanelCustomerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldAcctNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelCustomerInfoLayout.createSequentialGroup()
                                .addComponent(jRadioButtonBasic)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButtonPremier))
                            .addComponent(jTextFieldFirstName)
                            .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jComboBoxAccount, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        jPanelCustomerInfoLayout.setVerticalGroup(
            jPanelCustomerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCustomerInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCustomerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCustomerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonBasic)
                    .addComponent(jRadioButtonPremier))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCustomerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAcctNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCustomerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCustomerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelAccountActions.setBackground(new java.awt.Color(204, 127, 51));
        jPanelAccountActions.setBorder(javax.swing.BorderFactory.createTitledBorder("Transactions"));

        jLabelMsg.setText("jLabel2");

        jLabel2.setText("Deposit Amount: ");

        jTextFieldDeposit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldDepositFocusGained(evt);
            }
        });
        jTextFieldDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDepositActionPerformed(evt);
            }
        });

        jLabel3.setText("Withdraw Amount:");

        jTextFieldWithdraw.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldWithdrawFocusGained(evt);
            }
        });

        javax.swing.GroupLayout jPanelAccountActionsLayout = new javax.swing.GroupLayout(jPanelAccountActions);
        jPanelAccountActions.setLayout(jPanelAccountActionsLayout);
        jPanelAccountActionsLayout.setHorizontalGroup(
            jPanelAccountActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAccountActionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAccountActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAccountActionsLayout.createSequentialGroup()
                        .addComponent(jLabelMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanelAccountActionsLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanelAccountActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(jPanelAccountActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldWithdraw, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldDeposit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))))
        );
        jPanelAccountActionsLayout.setVerticalGroup(
            jPanelAccountActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAccountActionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAccountActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAccountActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButtonWelcome.setText("Welcome");
        jButtonWelcome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonWelcomeActionPerformed(evt);
            }
        });

        jButtonDeposit.setText("Deposit");
        jButtonDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDepositActionPerformed(evt);
            }
        });

        jButtonWithdraw.setText("Withdraw");
        jButtonWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonWithdrawActionPerformed(evt);
            }
        });

        jButtonViewBalance.setText("View Balance ");
        jButtonViewBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewBalanceActionPerformed(evt);
            }
        });

        jButtonPrintStatement.setText("Print Statement ");
        jButtonPrintStatement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrintStatementActionPerformed(evt);
            }
        });

        jButtonClear.setText("Clear");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        jButtonExit.setText("Exit");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jLabelWelcomeHeading.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabelWelcomeHeading.setForeground(new java.awt.Color(51, 51, 0));
        jLabelWelcomeHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelWelcomeHeading.setText("Welcome to Team 4's Meramec Online Banking Application");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanelCustomerInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jPanelAccountActions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelWelcomeHeading)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonViewBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPrintStatement, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabelWelcomeHeading)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelCustomerInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelAccountActions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonWelcome)
                    .addComponent(jButtonDeposit)
                    .addComponent(jButtonWithdraw)
                    .addComponent(jButtonViewBalance)
                    .addComponent(jButtonPrintStatement)
                    .addComponent(jButtonClear)
                    .addComponent(jButtonExit))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonWelcomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonWelcomeActionPerformed
        // local variables
        String accountNo=null,fname=null,lname=null,msg=null;
        if (Validator.isValidAccountNumber(jTextFieldAcctNumber)) {
            if (Validator.isValidName(jTextFieldFirstName)) {
                if (Validator.isValidName(jTextFieldLastName)) {
                   if (jComboBoxAccount.getSelectedItem() != null){
                        
                        
            
         
        // assign values to local variables
        accountNo=jTextFieldAcctNumber.getText();
        fname=jTextFieldFirstName.getText();
        lname=jTextFieldLastName.getText();
        
        // enable/disable appropriately
        enableButtons();
        enableTextFields();
        disableAcctSetupFields();
        disableWelcomeButton();
        
        
        
        // determine which object to create
        // if checking account is selected...
        if (jComboBoxAccount.getSelectedItem()== AccountType.Checking) {
            //instantiate CheckingAccount
            checkingAcct=new CheckingAccount(accountNo,fname,lname);
            if (jRadioButtonBasic.isSelected()){
                checkingAcct.setCheckingAcctType(CheckingAccountType.Basic);
            }
            else if (jRadioButtonPremier.isSelected()){
                checkingAcct.setCheckingAcctType(CheckingAccountType.Premier);
            }
        
        // update displayed message for checking account
        jLabelMsg.setText("<html>Customer Information: <br/>"+checkingAcct.getOwner());
                         
        }
        
        // if savings account is selected
        else if (jComboBoxAccount.getSelectedItem() == AccountType.Savings) {
            // instantiate SavingsAccount
            savingsAcct = new SavingsAccount(accountNo, fname, lname);
            
            // update displayed message for checking account
            jLabelMsg.setText("<html>Customer Information: <br/>"+savingsAcct.getOwner());
                       
        }
               
        
                   }
                   else{
                        JOptionPane.showMessageDialog(rootPane, "Please select an account type");
                   }//close the combobox check if
                } // close valid last name if
            } // close valid first name if
        } // close valid acct number if
        
        else {
            JOptionPane.showMessageDialog(rootPane, "Please select an account type" 
            + "\n" + "and enter a valid account number and name.");
        }        
    }//GEN-LAST:event_jButtonWelcomeActionPerformed

    private void jButtonWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonWithdrawActionPerformed
        try {
        // local variables
        double amount;
        amount=Double.parseDouble(jTextFieldWithdraw.getText());
        String message = "<html>New withdraw: " + c.format(amount) + "<br/>" 
                + "Current balance: ";
        //if checking is selected
        if (jComboBoxAccount.getSelectedItem()==AccountType.Checking) {
            try {
            if (jRadioButtonBasic.isSelected()){
                checkingAcct.withdraw(amount, CheckingAccountType.Basic);
            }
            else if (jRadioButtonPremier.isSelected()){
                checkingAcct.withdraw(amount, CheckingAccountType.Premier);
            }
            message += c.format(checkingAcct.getBalance());
            }
            catch (IllegalArgumentException ex){
               JOptionPane.showMessageDialog(rootPane, ex.getMessage());
               return;
            }
            // reset text field to be blank
            jTextFieldWithdraw.setText(" ");
        }
        // if savings is selected
        else if (jComboBoxAccount.getSelectedItem()==AccountType.Savings) {
            //******************ADD YOUR CODE***********************
            
            // subtract withdraw amount from balance as long as there are enough funds to do so
            // (use basic checking account logic for now)
            // may need to code the withdraw function for the savings account branch
            try{
            savingsAcct.withdraw(amount);
            
            }
            catch(IllegalArgumentException ex){
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                return;
                
            }
            // update message
            message += c.format(savingsAcct.getBalance());
            
            // reset text field to be blank
            jTextFieldWithdraw.setText(" ");
        }
        else if (jComboBoxAccount.getSelectedItem()==AccountType.CDs){
            JOptionPane.showMessageDialog(rootPane, "Customer "+bankAcct.getOwner()
            +" does not have CDs");
        
        }
        jLabelMsg.setText(message);
        }
        catch (IllegalArgumentException ex){
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_jButtonWithdrawActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        // exit program
        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDepositActionPerformed
        // TODO add your handling code here:
        double amount=Double.parseDouble(jTextFieldDeposit.getText());
        String message = "<html>New deposit: " + c.format(amount) + "<br/>"
                +"Customer balance: ";
        if (jComboBoxAccount.getSelectedItem()==AccountType.Checking){
            checkingAcct.deposit(amount);
            message += c.format(checkingAcct.getBalance());
            // reset text field to be blank
            jTextFieldDeposit.setText(" ");
        }
        else if (jComboBoxAccount.getSelectedItem()==AccountType.Savings){
            //***************YOUR CODE HERE**********************
            savingsAcct.deposit(amount);
            message+=c.format(savingsAcct.getBalance());
            // reset text field to be blank
            jTextFieldDeposit.setText(" ");
        }
        else if (jComboBoxAccount.getSelectedItem()==AccountType.CDs){
             JOptionPane.showMessageDialog(rootPane, "Customer "+bankAcct.getOwner()
            +" does not have CDs");
        }
        jLabelMsg.setText(message);
    }//GEN-LAST:event_jButtonDepositActionPerformed

    private void jTextFieldDepositFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldDepositFocusGained
        // TODO add your handling code here:
        jTextFieldWithdraw.setText("");
        jButtonWithdraw.setEnabled(false);
        jButtonDeposit.setEnabled(true);
    }//GEN-LAST:event_jTextFieldDepositFocusGained

    private void jTextFieldWithdrawFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldWithdrawFocusGained
        jTextFieldDeposit.setText("");
        jButtonWithdraw.setEnabled(true);
        jButtonDeposit.setEnabled(false);
    }//GEN-LAST:event_jTextFieldWithdrawFocusGained

    private void jButtonPrintStatementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrintStatementActionPerformed
        // print bank statement
        Date date=new Date();
        if (jComboBoxAccount.getSelectedItem()==AccountType.Checking){
            JOptionPane.showMessageDialog(rootPane, "Statement date as of today, "
            +date+", " + "\n"
            + "for " +checkingAcct.getOwner()+"\n"
            +"Current Checking Account Balance is "
            +c.format(checkingAcct.getBalance())+"\n"
            +"Total number of overdrafts are "
            +checkingAcct.getNumOfOverdrafts()+"\n"
            +"Total overdraft fees charged for the month are "
            +c.format(checkingAcct.getOverdraftFee()));
        }
        
        if (jComboBoxAccount.getSelectedItem()==AccountType.Savings){
            //**************YOUR CODE HERE**********************
            JOptionPane.showMessageDialog(rootPane, "Statement date as of today, "
            + date + ", " + "\n"
            + "for " + savingsAcct.getOwner() + "\n"
            + "Current Savings Account Balance is "
            + c.format(savingsAcct.getBalance()) + "\n"
            + "Interest earned for this month is "
            + c.format(savingsAcct.CalculateInterest()) + "\n"
            + "Total Savings Account Balance including interest earned is "
            + c.format(savingsAcct.InterestAddedToBalance()));
        }
    }//GEN-LAST:event_jButtonPrintStatementActionPerformed

    private void jButtonViewBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewBalanceActionPerformed
        // view current balance
        Date date=new Date();
        if (jComboBoxAccount.getSelectedItem()==AccountType.Checking){
            JOptionPane.showMessageDialog(rootPane, "As of today "
            +date+" "+"\n"
            +"Customer "+checkingAcct.getOwner()+"\n"
            +"Current Balance is "+c.format(checkingAcct.getBalance()));
        } // close if checking selected
        else if (jComboBoxAccount.getSelectedItem() == AccountType.Savings) {
            JOptionPane.showMessageDialog(rootPane, "As of today, "
            +date+", "+"\n"
            +"Customer "+savingsAcct.getOwner()+"\n"
            +"Current Balance -- excluding interest earned -- is "+c.format(savingsAcct.getBalance()));
        }
    }//GEN-LAST:event_jButtonViewBalanceActionPerformed

    
    // Code that came from double-clicking on UI components in the design screen
    private void jTextFieldDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDepositActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDepositActionPerformed

    private void jComboBoxAccountItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxAccountItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxAccountItemStateChanged

    private void jComboBoxAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAccountActionPerformed
                  
        // TODO add your handling code here:
        if(jComboBoxAccount.getSelectedItem()==AccountType.Checking) {
            // default to premier
            jRadioButtonPremier.setSelected(true);
            
            // make radio button choices available
            jRadioButtonBasic.setVisible(true);
            jRadioButtonPremier.setVisible(true);
            jRadioButtonBasic.setEnabled(true);
            jRadioButtonPremier.setEnabled(true);
            
        }                                                
        else {
            buttonGroup1.clearSelection();
            jRadioButtonBasic.setEnabled(false);
            jRadioButtonPremier.setEnabled(false);
        }
    }//GEN-LAST:event_jComboBoxAccountActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        // TODO add your handling code here:
        // reset text fields to blanks
        // reset combo box
        // disable appropriate buttons
        // enable customer information group
        
        enableAcctSetupFields();
        jButtonWelcome.setEnabled(true);
        jComboBoxAccount.setSelectedIndex(-1);
        jComboBoxAccount.setRenderer(new PromptComboBoxRenderer("-Select Account Type-"));
        disableButtons();
        clearTextFields();
        disableTextFields(); // deposit-withdraw fields
    }//GEN-LAST:event_jButtonClearActionPerformed

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
            java.util.logging.Logger.getLogger(BankUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BankUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BankUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDeposit;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonPrintStatement;
    private javax.swing.JButton jButtonViewBalance;
    private javax.swing.JButton jButtonWelcome;
    private javax.swing.JButton jButtonWithdraw;
    private javax.swing.JComboBox<String> jComboBoxAccount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelMsg;
    private javax.swing.JLabel jLabelWelcomeHeading;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelAccountActions;
    private javax.swing.JPanel jPanelCustomerInfo;
    private javax.swing.JRadioButton jRadioButtonBasic;
    private javax.swing.JRadioButton jRadioButtonPremier;
    private javax.swing.JTextField jTextFieldAcctNumber;
    private javax.swing.JTextField jTextFieldDeposit;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldWithdraw;
    // End of variables declaration//GEN-END:variables


}
