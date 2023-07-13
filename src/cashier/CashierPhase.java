/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cashier;

import com.formdev.flatlaf.ui.FlatListCellBorder.Default;
import java.awt.Color;
import javax.swing.JPanel;
import manager.ViewStockInternalFrame;

/**
 *
 * @author medo4
 */
public class CashierPhase extends javax.swing.JFrame {

    /**
     * Creates new form CashierPhase
     */
    
    public void compositecoloringset(JPanel panel1,Color a,JPanel panel2,Color b)
    {
        panel1.setBackground(a);
        panel2.setBackground(b);
       
    }
     Color Default,Dragged,Clicked,color;
    public CashierPhase() {
        initComponents();
        Default=new Color(255,255,255);
         Dragged=new Color(229,229,229);
         Clicked=new Color(51,204,255);
          color=new Color(60,110,113);
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
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lab = new javax.swing.JLabel();
        lab2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        labelbutton = new javax.swing.JLabel();
        viewcustomerspanel = new javax.swing.JPanel();
        viewCustomersButton = new javax.swing.JLabel();
        addnewcustomerpanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 153, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 153, 255));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(1076, 588));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Cashier ID");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 170, 30));

        lab.setBackground(new java.awt.Color(255, 255, 255));
        lab.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        lab.setForeground(new java.awt.Color(0, 204, 255));
        lab.setText("MENU");
        lab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labMouseExited(evt);
            }
        });
        jPanel1.add(lab, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 150, 50));

        lab2.setBackground(new java.awt.Color(255, 255, 255));
        lab2.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        lab2.setForeground(new java.awt.Color(255, 255, 255));
        lab2.setText("CASHIER");
        lab2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lab2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lab2MouseExited(evt);
            }
        });
        jPanel1.add(lab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 180, 60));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Cashier Name");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 160, 30));

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/clerk.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel10MousePressed(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 160, 90));

        kGradientPanel2.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        kGradientPanel2.setkEndColor(new java.awt.Color(255, 153, 153));
        kGradientPanel2.setkGradientFocus(200);
        kGradientPanel2.setkStartColor(new java.awt.Color(255, 102, 102));
        kGradientPanel2.setMaximumSize(new java.awt.Dimension(800, 800));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelbutton.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        labelbutton.setForeground(new java.awt.Color(255, 255, 255));
        labelbutton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/logouticon.png"))); // NOI18N
        labelbutton.setText("LOG OUT");
        labelbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelbuttonMouseClicked(evt);
            }
        });
        kGradientPanel2.add(labelbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 170, 60));

        jPanel1.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 200, 70));

        viewcustomerspanel.setBackground(new java.awt.Color(255, 255, 255));
        viewcustomerspanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewcustomerspanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                viewcustomerspanelMouseDragged(evt);
            }
        });
        viewcustomerspanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewcustomerspanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewcustomerspanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewcustomerspanelMouseExited(evt);
            }
        });

        viewCustomersButton.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        viewCustomersButton.setForeground(new java.awt.Color(0, 204, 0));
        viewCustomersButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewCustomersButton.setText("View Customers");
        viewCustomersButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewCustomersButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        viewCustomersButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewCustomersButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewCustomersButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewCustomersButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                viewCustomersButtonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout viewcustomerspanelLayout = new javax.swing.GroupLayout(viewcustomerspanel);
        viewcustomerspanel.setLayout(viewcustomerspanelLayout);
        viewcustomerspanelLayout.setHorizontalGroup(
            viewcustomerspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewcustomerspanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(viewCustomersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        viewcustomerspanelLayout.setVerticalGroup(
            viewcustomerspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewcustomerspanelLayout.createSequentialGroup()
                .addComponent(viewCustomersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(viewcustomerspanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 190, -1));

        addnewcustomerpanel.setBackground(new java.awt.Color(255, 255, 255));
        addnewcustomerpanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addnewcustomerpanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                addnewcustomerpanelMouseDragged(evt);
            }
        });
        addnewcustomerpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addnewcustomerpanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addnewcustomerpanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addnewcustomerpanelMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("New Customer");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });

        javax.swing.GroupLayout addnewcustomerpanelLayout = new javax.swing.GroupLayout(addnewcustomerpanel);
        addnewcustomerpanel.setLayout(addnewcustomerpanelLayout);
        addnewcustomerpanelLayout.setHorizontalGroup(
            addnewcustomerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addnewcustomerpanelLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        addnewcustomerpanelLayout.setVerticalGroup(
            addnewcustomerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addnewcustomerpanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(addnewcustomerpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 190, 50));

        kGradientPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 230, 690));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 930, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );

        kGradientPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 930, 690));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        compositecoloringset(viewcustomerspanel,Default,addnewcustomerpanel,Clicked);
        newCustomerInternalFrame view=new newCustomerInternalFrame();
         jDesktopPane1.removeAll();
         jDesktopPane1.updateUI();
        jDesktopPane1.add(view).setVisible(true);
    }//GEN-LAST:event_jLabel5MousePressed

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MousePressed

    private void labMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labMouseEntered
        Color a=new Color(51,0,204) ;
        lab.setForeground(a);
        // TODO add your handling code here:
    }//GEN-LAST:event_labMouseEntered

    private void labMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labMouseExited
        lab.setForeground(Color.WHITE);        // TODO add your handling code here:
    }//GEN-LAST:event_labMouseExited

    private void lab2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lab2MouseEntered

    private void lab2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lab2MouseExited

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MousePressed

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MousePressed

    private void labelbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelbuttonMouseClicked
       
    }//GEN-LAST:event_labelbuttonMouseClicked

    private void viewCustomersButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewCustomersButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_viewCustomersButtonMouseEntered

    private void viewCustomersButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewCustomersButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_viewCustomersButtonMouseExited

    private void viewCustomersButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewCustomersButtonMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewCustomersButtonMousePressed

    private void viewCustomersButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewCustomersButtonMouseClicked
          compositecoloringset(viewcustomerspanel,Clicked,addnewcustomerpanel,Default);
        CustomerListInternalFrame view=new CustomerListInternalFrame();
         jDesktopPane1.removeAll();
         jDesktopPane1.updateUI();
        jDesktopPane1.add(view).setVisible(true);
    }//GEN-LAST:event_viewCustomersButtonMouseClicked

    private void viewcustomerspanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewcustomerspanelMouseDragged

    }//GEN-LAST:event_viewcustomerspanelMouseDragged

    private void viewcustomerspanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewcustomerspanelMouseClicked
        compositecoloringset(viewcustomerspanel,Clicked,addnewcustomerpanel,Default);
        CustomerListInternalFrame view=new CustomerListInternalFrame();
         jDesktopPane1.removeAll();
         jDesktopPane1.updateUI();
        jDesktopPane1.add(view).setVisible(true);
    }//GEN-LAST:event_viewcustomerspanelMouseClicked

    private void viewcustomerspanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewcustomerspanelMouseEntered

    }//GEN-LAST:event_viewcustomerspanelMouseEntered

    private void viewcustomerspanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewcustomerspanelMouseExited

    }//GEN-LAST:event_viewcustomerspanelMouseExited

    private void addnewcustomerpanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addnewcustomerpanelMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_addnewcustomerpanelMouseDragged

    private void addnewcustomerpanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addnewcustomerpanelMouseClicked
  
    }//GEN-LAST:event_addnewcustomerpanelMouseClicked

    private void addnewcustomerpanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addnewcustomerpanelMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_addnewcustomerpanelMouseEntered

    private void addnewcustomerpanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addnewcustomerpanelMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_addnewcustomerpanelMouseExited

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
            java.util.logging.Logger.getLogger(CashierPhase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CashierPhase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CashierPhase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CashierPhase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CashierPhase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addnewcustomerpanel;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JLabel lab;
    private javax.swing.JLabel lab2;
    private javax.swing.JLabel labelbutton;
    private javax.swing.JLabel viewCustomersButton;
    private javax.swing.JPanel viewcustomerspanel;
    // End of variables declaration//GEN-END:variables
}
