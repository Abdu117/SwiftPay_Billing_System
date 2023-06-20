/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Products;



import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;
import java.util.ArrayList;
import javax.swing.JPanel;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import manager.manager_frame;


/**
 *
 * @author medo4
 */
public class ViewCustomersFrame extends javax.swing.JFrame {

    /**
     * Creates new form ViewCustomersFrame
     */
    public ViewCustomersFrame() {
        try {
            initComponents();
            UIManager.setLookAndFeel(new FlatDarkLaf());
            showdata();
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(ViewCustomersFrame.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(ViewCustomersFrame.class.getName()).log(Level.SEVERE, null, ex);
        } 
      
        
    }
    public void SetColor (Label obj)
    {
        obj.setForeground(Color.red);
    }
     public void ResetColor (Label obj)
    {
        
        obj.setForeground(Color.WHITE);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CustomersTable = new javax.swing.JTable();
        keytext = new javax.swing.JTextField();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        labelbutton = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lab = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        keytext2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customers Details");
        setBackground(new java.awt.Color(51, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(51, 255, 204));
        setResizable(false);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 153, 153));
        kGradientPanel1.setkStartColor(new java.awt.Color(150, 222, 218));

        jScrollPane1.setBackground(new java.awt.Color(204, 255, 153));
        jScrollPane1.setBorder(null);

        CustomersTable.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
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
        CustomersTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

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

        kGradientPanel2.setkEndColor(new java.awt.Color(185, 134, 84));
        kGradientPanel2.setkGradientFocus(200);
        kGradientPanel2.setkStartColor(new java.awt.Color(255, 209, 0));
        kGradientPanel2.setMaximumSize(new java.awt.Dimension(800, 800));

        labelbutton.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        labelbutton.setForeground(new java.awt.Color(255, 255, 255));
        labelbutton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelbutton.setText("BACK");
        labelbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelbuttonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelbutton, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelbutton, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setBackground(new java.awt.Color(255, 0, 102));
        jLabel2.setFont(new java.awt.Font("Bahnschrift", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("General Search");

        lab.setBackground(new java.awt.Color(255, 255, 255));
        lab.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        lab.setForeground(new java.awt.Color(255, 255, 255));
        lab.setText("CUSTOMER INFORMATION");
        lab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labMouseExited(evt);
            }
        });

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

        jLabel4.setBackground(new java.awt.Color(255, 0, 102));
        jLabel4.setFont(new java.awt.Font("Bahnschrift", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Search by Name");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap(27, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(keytext2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kGradientPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(keytext, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 85, Short.MAX_VALUE)))))
                .addGap(41, 41, 41))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lab, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lab, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(keytext2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(keytext, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(89, Short.MAX_VALUE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void keytextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_keytextKeyReleased
        DefaultTableModel table=(DefaultTableModel) CustomersTable.getModel();
       
        String searchkey=keytext.getText();
    
    String pattern = "(?i)^" + searchkey;
        TableRowSorter<DefaultTableModel> tr=new TableRowSorter <>(table);
        CustomersTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(pattern));
    }//GEN-LAST:event_keytextKeyReleased

    private void keytextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keytextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keytextActionPerformed

    private void CustomersTableComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_CustomersTableComponentShown

    }//GEN-LAST:event_CustomersTableComponentShown

    private void labelbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelbuttonMouseClicked
manager_frame m1= new manager_frame();
this.setVisible(false);
m1.setVisible(true);

    }//GEN-LAST:event_labelbuttonMouseClicked

    private void labMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labMouseEntered
   lab.setForeground(Color.red);
// TODO add your handling code here:
    }//GEN-LAST:event_labMouseEntered

    private void labMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labMouseExited
lab.setForeground(Color.WHITE);        // TODO add your handling code here:
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
            Logger.getLogger(ViewCustomersFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
}
    }//GEN-LAST:event_keytext2KeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
            try {
                /* Set the Nimbus look and feel */
                //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
                /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
                * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
                */
                UIManager.setLookAndFeel(new FlatDarkLaf());
                
                try {
                    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                        if ("Nimbus".equals(info.getName())) {
                            javax.swing.UIManager.setLookAndFeel(info.getClassName());
                            break;
                        }
                    }
                } catch (ClassNotFoundException ex) {
                    java.util.logging.Logger.getLogger(ViewCustomersFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    java.util.logging.Logger.getLogger(ViewCustomersFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    java.util.logging.Logger.getLogger(ViewCustomersFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                    java.util.logging.Logger.getLogger(ViewCustomersFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                //</editor-fold>
                
                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new ViewCustomersFrame().setVisible(true);
                    }
                });
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(ViewCustomersFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            //</editor-fold>
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(ViewCustomersFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CustomersTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JTextField keytext;
    private javax.swing.JTextField keytext2;
    private javax.swing.JLabel lab;
    private javax.swing.JLabel labelbutton;
    // End of variables declaration//GEN-END:variables
}
