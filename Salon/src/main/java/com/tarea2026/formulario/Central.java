package com.tarea2026.formulario;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

/**
 *
 * @author Jose Cambisaca Baquerizo
 */
//import FORMULARIOS.INGRESOPROD;
import javax.swing.ImageIcon;


import javax.swing.UIManager;
//import javax.swing.JOptionPane;
public class Central extends javax.swing.JFrame {
   Empleados panel1 = new Empleados ();
   Reconexion panel2 = new Reconexion();
   Clientes panel3 = new Clientes();
   Servicios panel4 = new Servicios();
   Citas panel5 = new Citas();
   /*REPORTES panel6 = new REPORTES();*/
   //INVENTARIO panel3;   
   String vl1, seleccion;  int var1,var2,evl;  JPanel pl;
    /**
     * Creates new form EMPLEADOS
     */
    public Central() {
       initComponents();
       inicio();  
       //setIconImage(new ImageIcon(getClass().getResource("/COMPLEMENTOS/Icono Master Admit1.png")).getImage());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MASTER ADMIT");
        setIconImage(new ImageIcon(getClass().getResource("/COMPLEMENTOS/Icono Master Admit1.png")).getImage());
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jMenuBar1.setBackground(new java.awt.Color(102, 102, 102));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/COMPLEMENTOS/menu (1).png"))); // NOI18N
        jMenu5.setText("            ");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenu5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu5.setInheritsPopupMenu(true);
        jMenu5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jMenu5MouseMoved(evt);
            }
        });
        jMenu5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jMenu5FocusGained(evt);
            }
        });
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMenu5MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu5MousePressed(evt);
            }
        });
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        jMenu1.setForeground(new java.awt.Color(238, 112, 82));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/COMPLEMENTOS/1_-_Home_256x256_35385.png"))); // NOI18N
        jMenu1.setText("Inicio");
        jMenu1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 16)); // NOI18N
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jMenuItem10.setForeground(new java.awt.Color(238, 112, 82));
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/COMPLEMENTOS/community_users_12977.png"))); // NOI18N
        jMenuItem10.setText("Usuarios");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem10);

        jMenuItem9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jMenuItem9.setForeground(new java.awt.Color(238, 112, 82));
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/COMPLEMENTOS/Logout_37127 (1).png"))); // NOI18N
        jMenuItem9.setText("Salir");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuItem11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jMenuItem11.setForeground(new java.awt.Color(238, 112, 82));
        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/COMPLEMENTOS/community_users_12977.png"))); // NOI18N
        jMenuItem11.setText("Conexion");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem11);

        jMenuBar1.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(238, 112, 82));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/COMPLEMENTOS/Registro2.png"))); // NOI18N
        jMenu2.setText("Registro");
        jMenu2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 16)); // NOI18N
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jMenuItem5.setForeground(new java.awt.Color(238, 112, 82));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/COMPLEMENTOS/people_114360.png"))); // NOI18N
        jMenuItem5.setText("Cliente");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(238, 112, 82));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/COMPLEMENTOS/empresario.png"))); // NOI18N
        jMenuItem1.setText("Profesional");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jMenuItem2.setForeground(new java.awt.Color(238, 112, 82));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/COMPLEMENTOS/business_inventory_maintenance_product_box_boxes_2326.png"))); // NOI18N
        jMenuItem2.setText("Servicio");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jMenuItem13.setForeground(new java.awt.Color(238, 112, 82));
        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/COMPLEMENTOS/4288583documentfileresearchresumesearch-115773_115740.png"))); // NOI18N
        jMenuItem13.setText("Cita");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem13);

        jMenuBar1.add(jMenu2);

        jMenu3.setForeground(new java.awt.Color(238, 112, 82));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/COMPLEMENTOS/invoice_ticket_document_icon_188744.png"))); // NOI18N
        jMenu3.setText("Revision");
        jMenu3.setFont(new java.awt.Font("Yu Gothic Medium", 1, 16)); // NOI18N

        jMenuItem4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jMenuItem4.setForeground(new java.awt.Color(238, 112, 82));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/COMPLEMENTOS/4288583documentfileresearchresumesearch-115773_115740.png"))); // NOI18N
        jMenuItem4.setText("Citas");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1436, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       evl=jPanel1.getComponentCount();
        if (evl>0&&continuar(seleccion)!=0){   /*JOptionPane.showMessageDialog(null,"estoy aqui")*/  return;}//---->Cierre
        capturartamaño();
        abrirpaneles(panel1,var2,var1);
        seleccion = "panel1";
    }//GEN-LAST:event_jMenuItem1ActionPerformed
          
    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
         System.exit(0);      
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        evl=jPanel1.getComponentCount();
        if (evl>0&&continuar(seleccion)!=0){
     
            return;
        }
        capturartamaño();
        abrirpaneles(panel4,var2,var1);
        seleccion = "panel4";
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        evl=jPanel1.getComponentCount();
        if (evl>0&&continuar(seleccion)!=0){
            return;
        }
        capturartamaño();
        //abrirpaneles(panel5,var2,var1);
        seleccion = "panel5";
    }//GEN-LAST:event_jMenuItem4ActionPerformed
      private void abrirpaneles(JPanel p,int b,int a){
        p.setSize(b, a);
        p.setLocation(0,0);
        jPanel1.removeAll();
        jPanel1.add(p,BorderLayout.CENTER);
        jPanel1.revalidate();
        jPanel1.repaint();
    }
    
    
    private void capturartamaño(){
        var1 =jPanel1.getHeight();
        var2 =jPanel1.getWidth();
    }
    private int continuar(String pnl){
       int resp = 5;
       evl=jPanel1.getComponentCount();
       if(evl>0){
       switch(pnl){
        case"panel1":
            resp=panel1.cancelarxsalida();
        break;
        case"panel2":
            resp=panel2.cancelarxsalida();
        break;
        case"panel3":
            resp=panel3.cancelarxsalida();
        break;
          case"panel4":
            resp=panel4.cancelarxsalida();
        break;
        case"panel5":
            resp=panel5.cancelarxsalida();
        break;
        case"panel6":
            //resp=panel6.cancelarxsalida();
        break;
        case"panel7":
            //resp=panel7.Cancelarxsalida();
        break;
        case"panel9":
            //resp=panel9.cancelarxsalida();
        break;
       } 
      }
       return resp;
    }
    
      private void MenuLateral(String pnl ,String envt, String op){
       evl=jPanel1.getComponentCount();
       if(evl>0){
       switch(pnl){
        case"panel1":
           if(envt.equalsIgnoreCase("click")){panel1.MenuLateralclick();}
        break;
        case"panel2":
            
        case"panel3":
            if(envt.equalsIgnoreCase("click")){panel3.MenuLateralclick();}
        break;
          case"panel4":
           if(envt.equalsIgnoreCase("click")){panel4.MenuLateralclick();}
        break;
        case"panel5":
           //if(envt.equalsIgnoreCase("click")){panel5.MenuLateralclick();}
            if(envt.equalsIgnoreCase("click")){panel5.MenuLateralclick();}
        break;
        case"panel6":
          
        break;
          case"panel7":
          //if(envt.equalsIgnoreCase("click")){panel7.MenuLateralclick();}
        break;
        /*case"panel8":
            resp=panel8.cancelarxsalida();
        break;*/
        case"panel9":
            //resp=panel9.cancelarxsalida();
        break;
       } 
      }
    }
    
    
    
    
        private void inicio(){
         this.setLocationRelativeTo(null);
         this.setExtendedState(MAXIMIZED_BOTH);
    }
    
    public void mostrarReconexion() {
    capturartamaño();
    abrirpaneles(panel2, var2, var1);
    seleccion = "panel2";
}
        
        
    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
       
    }//GEN-LAST:event_formComponentShown

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
         //panel5.MenuLateral();
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
      
    

        //System.out.println("Se hizo clic en jMenu5");
        //Thread.dumpStack();
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MousePressed
        MenuLateral(seleccion,"click",null);
    }//GEN-LAST:event_jMenu5MousePressed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenu5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseMoved

    }//GEN-LAST:event_jMenu5MouseMoved

    private void jMenu5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseExited
        
    }//GEN-LAST:event_jMenu5MouseExited

    private void jMenu5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jMenu5FocusGained
        
    }//GEN-LAST:event_jMenu5FocusGained

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        evl=jPanel1.getComponentCount();
        if (evl>0&&continuar(seleccion)!=0){   /*JOptionPane.showMessageDialog(null,"estoy aqui")*/  return;}//---->Cierre
        capturartamaño();
        abrirpaneles(panel3,var2,var1);
        seleccion = "panel3";
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
        evl=jPanel1.getComponentCount();
        if (evl>0&&continuar(seleccion)!=0){   /*JOptionPane.showMessageDialog(null,"estoy aqui")*/  return;}//---->Cierre
        capturartamaño();
        abrirpaneles(panel5,var2,var1);
        seleccion = "panel5";
        
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        evl=jPanel1.getComponentCount();
        if (evl>0&&continuar(seleccion)!=0){
            return;
        }
        capturartamaño();
        abrirpaneles(panel2,var2,var1);
        seleccion = "panel2";
    }//GEN-LAST:event_jMenuItem11ActionPerformed

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
            java.util.logging.Logger.getLogger(Central.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Central.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Central.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Central.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        UIManager.put("Menu.selectionBackground", new Color(38, 150, 209)); // Fondo cuando se resalta un JMenu
        UIManager.put("Menu.selectionForeground", Color.WHITE);             // Texto cuando se resalta un JMenu
        UIManager.put("MenuItem.selectionBackground", new Color(38, 150, 209)); // Fondo para JMenuItem
        UIManager.put("MenuItem.selectionForeground", Color.WHITE);
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Central().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
