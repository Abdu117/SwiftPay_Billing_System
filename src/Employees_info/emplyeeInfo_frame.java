/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Employees_info;

import db_connection.db_connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import manager.manager_frame;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author user
 */
public class emplyeeInfo_frame extends javax.swing.JFrame {

    /**
     * Creates new form emplyeeInfo_frame
     */
    Connection con;
            db_connection c= new db_connection();
            
    public emplyeeInfo_frame() {
        initComponents();
        con= c.connect();

            try {

                String selectedColoumns = "employee_id,name,role,phone,address,gender,sallary";

                PreparedStatement stmt = con.prepareStatement(
                        String.format("select %s from employee",selectedColoumns));

                ResultSet resultSet = stmt.executeQuery();
                
                EmployeeInfo.setModel(DbUtils.resultSetToTableModel(resultSet));

            } catch (SQLException ex) {
                System.out.println(ex);
            }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addNewEmployee = new javax.swing.JPanel();
        employeeName = new javax.swing.JLabel();
        employeeName1 = new javax.swing.JLabel();
        employeeName2 = new javax.swing.JLabel();
        employeeName3 = new javax.swing.JLabel();
        employeeName4 = new javax.swing.JLabel();
        employeeName5 = new javax.swing.JLabel();
        employeeName6 = new javax.swing.JLabel();
        employeeNameField = new javax.swing.JTextField();
        employeePhoneField = new javax.swing.JTextField();
        employeeAddressField = new javax.swing.JTextField();
        employeeSallaryField = new javax.swing.JTextField();
        employeePasswordField = new javax.swing.JPasswordField();
        employeeRoleComboBox = new javax.swing.JComboBox<>();
        genderComboBox = new javax.swing.JComboBox<>();
        addEmployeeButton = new javax.swing.JButton();
        displayAllEmployees = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmployeeInfo = new javax.swing.JTable();
        searchLabel = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        searchType = new javax.swing.JComboBox<>();
        BackButton = new javax.swing.JButton();
        SalaryField = new javax.swing.JTextField();
        NameLabel = new javax.swing.JLabel();
        RoleLabel = new javax.swing.JLabel();
        PhoneLabel = new javax.swing.JLabel();
        AddressLabel = new javax.swing.JLabel();
        SalaryLabel = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        AddressField = new javax.swing.JTextField();
        RoleField = new javax.swing.JTextField();
        PhoneField = new javax.swing.JTextField();
        updateInfo = new javax.swing.JButton();
        newEmployeeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 250, 244));

        addNewEmployee.setBackground(new java.awt.Color(12, 19, 79));

        employeeName.setForeground(new java.awt.Color(255, 250, 244));
        employeeName.setText("Employee Name");

        employeeName1.setForeground(new java.awt.Color(255, 250, 244));
        employeeName1.setText("Employee Address");

        employeeName2.setForeground(new java.awt.Color(255, 250, 244));
        employeeName2.setText("Employee Phone");

        employeeName3.setForeground(new java.awt.Color(255, 250, 244));
        employeeName3.setText("Employee Role");

        employeeName4.setForeground(new java.awt.Color(255, 250, 244));
        employeeName4.setText("Employee Gender");

        employeeName5.setForeground(new java.awt.Color(255, 250, 244));
        employeeName5.setText("Employee Password");

        employeeName6.setForeground(new java.awt.Color(255, 250, 244));
        employeeName6.setText("Employee Sallary");

        employeeRoleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manger", "Stock Manger", "Cashier" }));

        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "male", "female" }));

        addEmployeeButton.setText("Add Employee");

        javax.swing.GroupLayout addNewEmployeeLayout = new javax.swing.GroupLayout(addNewEmployee);
        addNewEmployee.setLayout(addNewEmployeeLayout);
        addNewEmployeeLayout.setHorizontalGroup(
            addNewEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addNewEmployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addNewEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addNewEmployeeLayout.createSequentialGroup()
                        .addGroup(addNewEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(employeeName)
                            .addComponent(employeeName6)
                            .addComponent(employeeName5)
                            .addComponent(employeeName3)
                            .addComponent(employeeName4)
                            .addComponent(employeeName1)
                            .addComponent(employeeName2))
                        .addGap(37, 37, 37)
                        .addGroup(addNewEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(employeePhoneField)
                            .addComponent(employeeAddressField)
                            .addComponent(employeeSallaryField)
                            .addComponent(employeeNameField)
                            .addComponent(employeePasswordField)
                            .addComponent(employeeRoleComboBox, 0, 190, Short.MAX_VALUE)
                            .addComponent(genderComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(addEmployeeButton))
                .addContainerGap(629, Short.MAX_VALUE))
        );
        addNewEmployeeLayout.setVerticalGroup(
            addNewEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addNewEmployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addNewEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employeeNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addNewEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeName2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employeePhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(addNewEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeName1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employeeAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addNewEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeName4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addNewEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeName3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employeeRoleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addNewEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeName5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employeePasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addNewEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeName6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employeeSallaryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addEmployeeButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        displayAllEmployees.setBackground(new java.awt.Color(12, 19, 79));

        EmployeeInfo.setBackground(new java.awt.Color(29, 38, 125));
        EmployeeInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(212, 173, 252)));
        EmployeeInfo.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        EmployeeInfo.setForeground(new java.awt.Color(255, 255, 255));
        EmployeeInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Employee_id", "name", "role", "phone", "address", "gender", "sallary"
            }
        ));
        EmployeeInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmployeeInfoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(EmployeeInfo);

        searchLabel.setForeground(new java.awt.Color(255, 250, 244));
        searchLabel.setText("Serch:");

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        searchType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "id", "name", "phone", "role" }));

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        NameLabel.setForeground(new java.awt.Color(255, 255, 255));
        NameLabel.setText("Name:");

        RoleLabel.setForeground(new java.awt.Color(255, 255, 255));
        RoleLabel.setText("Role:");

        PhoneLabel.setForeground(new java.awt.Color(255, 255, 255));
        PhoneLabel.setText("Phone:");

        AddressLabel.setForeground(new java.awt.Color(255, 255, 255));
        AddressLabel.setText("Address:");

        SalaryLabel.setForeground(new java.awt.Color(255, 255, 255));
        SalaryLabel.setText("Sallary:");

        updateInfo.setText("Update Info");
        updateInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateInfoActionPerformed(evt);
            }
        });

        newEmployeeButton.setText("Add new employee");

        javax.swing.GroupLayout displayAllEmployeesLayout = new javax.swing.GroupLayout(displayAllEmployees);
        displayAllEmployees.setLayout(displayAllEmployeesLayout);
        displayAllEmployeesLayout.setHorizontalGroup(
            displayAllEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayAllEmployeesLayout.createSequentialGroup()
                .addGroup(displayAllEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(displayAllEmployeesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(searchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(searchType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(displayAllEmployeesLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(displayAllEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchButton)
                    .addGroup(displayAllEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(displayAllEmployeesLayout.createSequentialGroup()
                            .addComponent(newEmployeeButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BackButton))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, displayAllEmployeesLayout.createSequentialGroup()
                            .addComponent(NameLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, displayAllEmployeesLayout.createSequentialGroup()
                            .addComponent(RoleLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RoleField, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(displayAllEmployeesLayout.createSequentialGroup()
                            .addComponent(PhoneLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(updateInfo)
                        .addGroup(displayAllEmployeesLayout.createSequentialGroup()
                            .addGroup(displayAllEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(AddressLabel)
                                .addComponent(SalaryLabel))
                            .addGap(18, 18, 18)
                            .addGroup(displayAllEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(AddressField)
                                .addComponent(SalaryField, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        displayAllEmployeesLayout.setVerticalGroup(
            displayAllEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayAllEmployeesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(displayAllEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addGroup(displayAllEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(displayAllEmployeesLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(displayAllEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NameLabel))
                        .addGap(18, 18, 18)
                        .addGroup(displayAllEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RoleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RoleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(displayAllEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PhoneLabel))
                        .addGap(18, 18, 18)
                        .addGroup(displayAllEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddressLabel))
                        .addGap(18, 18, 18)
                        .addGroup(displayAllEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SalaryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SalaryLabel))
                        .addGap(18, 18, 18)
                        .addComponent(updateInfo)
                        .addGap(67, 67, 67)
                        .addGroup(displayAllEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BackButton)
                            .addComponent(newEmployeeButton)))
                    .addGroup(displayAllEmployeesLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(displayAllEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(addNewEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(displayAllEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(addNewEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 33, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        if("".equals(searchField.getText().trim()))
        {
            JOptionPane.showMessageDialog(this, "Enter a value");
        }
        else
        {

            try {
                String s;
                switch (searchType.getSelectedIndex()) {
                    case 1 ->  s = "name";
                    case 2 ->  s = "phone";
                    case 3 ->  s = "role";
                    default -> s = "employee_id"; 
                }

                String selectedColoumns = "employee_id,name,role,phone,address,gender,sallary";

                PreparedStatement stmt = con.prepareStatement(
                        String.format("select %s from employee where %s = ?",selectedColoumns,s));
                
                stmt.setString(1, searchField.getText().trim());

                ResultSet resultSet = stmt.executeQuery();
                
                EmployeeInfo.setModel(DbUtils.resultSetToTableModel(resultSet));

            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
        
    }//GEN-LAST:event_searchButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        manager_frame mangerFrame=new manager_frame();
        mangerFrame.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void EmployeeInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeInfoMouseClicked
        // TODO add your handling code here:
        int row =        EmployeeInfo.getSelectedRow();
        String name =    EmployeeInfo.getValueAt(row, 1).toString();
        String role =    EmployeeInfo.getValueAt(row, 2).toString();
        String phone =   EmployeeInfo.getValueAt(row, 3).toString();
        String address = EmployeeInfo.getValueAt(row, 4).toString();
        String salary =  EmployeeInfo.getValueAt(row, 6).toString();
        
        NameField.setText(name);
        RoleField.setText(role);
        PhoneField.setText(phone);
        AddressField.setText(address);
        SalaryField.setText(salary);
        
    }//GEN-LAST:event_EmployeeInfoMouseClicked

    private void updateInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateInfoActionPerformed
        // TODO add your handling code here:
        int row =        EmployeeInfo.getSelectedRow();
        String id =      EmployeeInfo.getValueAt(row, 0).toString();
        String name =    NameField.getText();
        String role =    RoleField.getText();
        int phone =      Integer.parseInt(PhoneField.getText());
        String address = AddressField.getText();
        float sallary =  Float.parseFloat(SalaryField.getText());
        
        
        try{
            PreparedStatement stmt = con.prepareStatement("UPDATE employee SET"
                                                        + " name = ?,phone = ?,address= ?,role = ?,sallary = ? "
                                                        + "WHERE employee_id = ?;");
                
                stmt.setString(1, name);
                stmt.setInt(2, phone);
                stmt.setString(3, address);
                stmt.setString(4, role);
                stmt.setFloat(5, sallary);
                stmt.setString(6, id);

                stmt.executeQuery();
                
                
        }catch (SQLException ex) {
                System.out.println(ex);
            }

            try {

                String selectedColoumns = "employee_id,name,role,phone,address,gender,sallary";

                PreparedStatement stmt = con.prepareStatement(
                        String.format("select %s from employee",selectedColoumns));

                ResultSet resultSet = stmt.executeQuery();
                
                EmployeeInfo.setModel(DbUtils.resultSetToTableModel(resultSet));

            } catch (SQLException ex) {
                System.out.println(ex);
            }
    }//GEN-LAST:event_updateInfoActionPerformed

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
            java.util.logging.Logger.getLogger(emplyeeInfo_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(emplyeeInfo_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(emplyeeInfo_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(emplyeeInfo_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new emplyeeInfo_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressField;
    private javax.swing.JLabel AddressLabel;
    private javax.swing.JButton BackButton;
    private javax.swing.JTable EmployeeInfo;
    private javax.swing.JTextField NameField;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField PhoneField;
    private javax.swing.JLabel PhoneLabel;
    private javax.swing.JTextField RoleField;
    private javax.swing.JLabel RoleLabel;
    private javax.swing.JTextField SalaryField;
    private javax.swing.JLabel SalaryLabel;
    private javax.swing.JButton addEmployeeButton;
    private javax.swing.JPanel addNewEmployee;
    private javax.swing.JPanel displayAllEmployees;
    private javax.swing.JTextField employeeAddressField;
    private javax.swing.JLabel employeeName;
    private javax.swing.JLabel employeeName1;
    private javax.swing.JLabel employeeName2;
    private javax.swing.JLabel employeeName3;
    private javax.swing.JLabel employeeName4;
    private javax.swing.JLabel employeeName5;
    private javax.swing.JLabel employeeName6;
    private javax.swing.JTextField employeeNameField;
    private javax.swing.JPasswordField employeePasswordField;
    private javax.swing.JTextField employeePhoneField;
    private javax.swing.JComboBox<String> employeeRoleComboBox;
    private javax.swing.JTextField employeeSallaryField;
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton newEmployeeButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JComboBox<String> searchType;
    private javax.swing.JButton updateInfo;
    // End of variables declaration//GEN-END:variables
}
