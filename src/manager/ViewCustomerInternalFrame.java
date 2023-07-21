/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package manager;

import Products.Customerinfo;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author medo4
 */  
public class ViewCustomerInternalFrame extends javax.swing.JInternalFrame {

    public ViewCustomerInternalFrame() {
         try {
            initComponents();
            
            //Theme initialize
           
            UIManager.setLookAndFeel(new FlatDarkLaf());
            //view of internal frame modifications
            this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
            BasicInternalFrameUI ui= (BasicInternalFrameUI)this.getUI();
            ui.setNorthPane(null);
            //disable Resize for internalJframe
            this.setResizable(false);
            
            //showing data from data base
            showdata();

            
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(ViewCustomerInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void showdata()
    {
         Connection conn;
         PreparedStatement ps;
         ResultSet res;
         
         
         ArrayList <Customerinfo> data=new ArrayList<>();
         DefaultTableModel t1=(DefaultTableModel) CustomersTable.getModel();
        try{          
//Connection to database
            String URL = "jdbc:sqlserver://localhost:1433;databaseName=Billing_system_db;integratedSecurity=true;encrypt=false";
            conn = DriverManager.getConnection(URL);
           String Query="SELECT customer_id,first_name,last_name,phone,address,membership FROM customer c JOIN cus_phone cp ON c.customer_id=cp.id JOIN cus_address ca ON cp.id=ca.id;";
           ps=conn.prepareStatement(Query);
           res=ps.executeQuery();
 //put data into arraylist and from this to array to table    

          Object [] eachrow=new Object[6];
          while(res.next())
          {
              data.add(new Customerinfo (res.getInt("customer_id"),res.getString("first_name"),res.getString("last_name"),res.getString("phone")
              ,res.getString("address"),res.getString("membership")));
              
          }
         
  //from Arraylist to obj array then to table 
          for (int i=0;i<data.size();i++)
          {
              eachrow[0]=data.get(i).getCust_id();
              eachrow[1]=data.get(i).getFirstname();
              eachrow[2]=data.get(i).getLastname();
              eachrow[3]=data.get(i).getPhone();
              eachrow[4]=data.get(i).getAddress();
              eachrow[5]=data.get(i).getMembership();
             
              t1.addRow(eachrow);
          }
           
        }
        catch (SQLException ex) {
            Logger.getLogger(ViewCustomerInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
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

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CustomersTable = new javax.swing.JTable();
        keytext = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lab = new javax.swing.JLabel();
        keytext2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lab1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximizable(true);
        setResizable(true);
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 153, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 153, 204));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(812, 584));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(204, 255, 153));
        jScrollPane1.setBorder(null);

        CustomersTable.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        CustomersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Phone", "Address", "Membership"
            }
        ){
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
        CustomersTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        CustomersTable.setColumnSelectionAllowed(true);
        CustomersTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CustomersTable.setShowVerticalLines(true);
        CustomersTable.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                CustomersTableComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(CustomersTable);

        kGradientPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 870, 460));

        keytext.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        keytext.setToolTipText("search by all fields");
        keytext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keytextActionPerformed(evt);
            }
        });
        keytext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                keytextKeyReleased(evt);
            }
        });
        kGradientPanel1.add(keytext, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 580, 210, 31));

        jLabel2.setBackground(new java.awt.Color(255, 0, 102));
        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("General Search");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 580, 160, 32));

        lab.setBackground(new java.awt.Color(51, 51, 51));
        lab.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        lab.setForeground(new java.awt.Color(255, 255, 255));
        lab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/costumer.png"))); // NOI18N
        lab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labMouseExited(evt);
            }
        });
        kGradientPanel1.add(lab, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 80, 70));

        keytext2.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        keytext2.setToolTipText("search with first+last name");
        keytext2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keytext2ActionPerformed(evt);
            }
        });
        keytext2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                keytext2KeyReleased(evt);
            }
        });
        kGradientPanel1.add(keytext2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 580, 220, 34));

        jLabel4.setBackground(new java.awt.Color(255, 0, 102));
        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Search by Name");
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 180, 32));

        lab1.setBackground(new java.awt.Color(51, 51, 51));
        lab1.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        lab1.setForeground(new java.awt.Color(255, 255, 255));
        lab1.setText("CUSTOMER INFORMATION");
        lab1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lab1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lab1MouseExited(evt);
            }
        });
        kGradientPanel1.add(lab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 490, 45));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 670));
        kGradientPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CustomersTableComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_CustomersTableComponentShown

    }//GEN-LAST:event_CustomersTableComponentShown

    private void keytextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keytextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keytextActionPerformed

    private void keytextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_keytextKeyReleased
      
        
        DefaultTableModel table=(DefaultTableModel) CustomersTable.getModel();

        String searchkey=keytext.getText();

        String pattern = "(?i)^" + searchkey;
        TableRowSorter<DefaultTableModel> tr=new TableRowSorter <>(table);
        CustomersTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(pattern));
    }//GEN-LAST:event_keytextKeyReleased

    private void labMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labMouseEntered
        
        // TODO add your handling code here:
    }//GEN-LAST:event_labMouseEntered

    private void labMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labMouseExited
            // TODO add your handling code here:
    }//GEN-LAST:event_labMouseExited

    private void keytext2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keytext2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keytext2ActionPerformed

    private void keytext2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_keytext2KeyReleased
        if(keytext2.getText().equals(" "))
        {
            showdata();
        }

        else
        {

            String URL = "jdbc:sqlserver://localhost:1433;databaseName=Billing_system_db;integratedSecurity=true;encrypt=false";
            String Query="SELECT customer_id,first_name,last_name,phone,address,membership FROM customer c JOIN cus_phone cp ON c.customer_id=cp.id JOIN cus_address ca ON cp.id=ca.id WHERE first_name+' '+last_name LIKE ? ;";

            String key=keytext2.getText();

            PreparedStatement stm;
            ResultSet res;
            Connection conn;
            ArrayList <Customerinfo> result=new ArrayList<>();
            DefaultTableModel t1=(DefaultTableModel) CustomersTable.getModel();

            int rowCount = t1.getRowCount();
            //Remove rows one by one from the end of the table
            for (int i = rowCount - 1; i >= 0; i--) {
                t1.removeRow(i);
            }
            try {
                conn=DriverManager.getConnection(URL);
                stm=conn.prepareStatement(Query);
                stm.setString(1, "%"+key+"%");

                res=stm.executeQuery();
                while(res.next())
                {
                    result.add(new Customerinfo (res.getInt("customer_id"),res.getString("first_name"),res.getString("last_name"),res.getString("phone")
                        ,res.getString("address"),res.getString("membership")));

            }
            Object  arr[]=new Object[6];
            for(int i=0;i<result.size();i++)
            {
                arr[0]=result.get(i).getCust_id();
                arr[1]=result.get(i).getFirstname();
                arr[2]=result.get(i).getLastname();
                arr[3]=result.get(i).getPhone();
                arr[4]=result.get(i).getAddress();
                arr[5]=result.get(i).getMembership();

                t1.addRow(arr);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ViewCustomerInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        }
    }//GEN-LAST:event_keytext2KeyReleased

    private void lab1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lab1MouseEntered

    private void lab1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lab1MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CustomersTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField keytext;
    private javax.swing.JTextField keytext2;
    private javax.swing.JLabel lab;
    private javax.swing.JLabel lab1;
    // End of variables declaration//GEN-END:variables
}
