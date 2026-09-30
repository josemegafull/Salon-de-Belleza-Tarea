package com.tarea2026.formulario;

      
import com.tarea2026.logica.Conexion;
import java.awt.GridLayout;             import java.awt.HeadlessException;     
import java.awt.Color;import java.text.SimpleDateFormat;      import java.util.Date;
import com.tarea2026.logica.MControles;
import java.awt.Toolkit;                import java.awt.event.ActionEvent;      import java.awt.datatransfer.Clipboard;
import java.sql.SQLException;   import java.time.LocalDate;             import javax.swing.JPopupMenu;          
import javax.swing.Icon;        import javax.swing.ImageIcon;                            import java.awt.datatransfer.StringSelection;

import java.awt.event.ComponentAdapter;
import com.tarea2026.logica.ModeloBD;
import com.tarea2026.logica.Objetos;
import com.tarea2026.logica.SLIDE;
import com.tarea2026.modelos.Citas;
import com.tarea2026.modelos.Cliente;
import com.tarea2026.modelos.Despachos;
import com.tarea2026.modelos.Profesional;
import com.tarea2026.modelos.Servicio;
import com.tarea2026.repository.CitaRepository;
import com.tarea2026.repository.CitaRepositoryImpl;

import java.awt.event.ComponentEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

                
 

              //import masteradmitmultibusinnes.Controladores.MControles;   import net.sf.jasperreports.engine.JasperPrint;                                           
/**
 * @author Jose Cambisaca Baquerizo
 */
public class RevisionCitas extends javax.swing.JPanel {
    Objetos OB = new Objetos();       Conexion cn = new Conexion();   
    MControles vc= new MControles();
    CitaRepository repoCitas;
    Cliente cliente = null; Profesional profesional =null; 
    String fecha ="";
    int seleccion=-1,pos=-1;
    String valid="";
    String[] registro = null;
    private Cliente clienteSeleccionado;
    
    
    public RevisionCitas() {
        initComponents();

       
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel51 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jTextField7 = new javax.swing.JTextField();
        jPanel20 = new javax.swing.JPanel();

        addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                formAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(238, 112, 82));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/COMPLEMENTOS/expediente (1).png"))); // NOI18N
        jLabel1.setText("NUEVO");
        jLabel1.setToolTipText("NUEVO");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setIconTextGap(0);
        jLabel1.setOpaque(true);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel1MouseMoved(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(238, 112, 82));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/COMPLEMENTOS/bloc-de-dibujo.png"))); // NOI18N
        jLabel8.setText("EDITAR");
        jLabel8.setToolTipText("EDITAR");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel8.setIconTextGap(0);
        jLabel8.setOpaque(true);
        jLabel8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel8MouseMoved(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(238, 112, 82));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/COMPLEMENTOS/subir.png"))); // NOI18N
        jLabel9.setText("GUARDAR");
        jLabel9.setToolTipText("GUARDAR");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel9.setIconTextGap(0);
        jLabel9.setOpaque(true);
        jLabel9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel9.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel9MouseMoved(evt);
            }
        });
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(238, 112, 82));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/COMPLEMENTOS/busqueda.png"))); // NOI18N
        jLabel10.setText("BUSCAR");
        jLabel10.setToolTipText("BUSCAR");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel10.setIconTextGap(-2);
        jLabel10.setOpaque(true);
        jLabel10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel10.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel10MouseMoved(evt);
            }
        });
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(238, 112, 82));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/COMPLEMENTOS/expediente (2).png"))); // NOI18N
        jLabel11.setText("EXPORTAR");
        jLabel11.setToolTipText("CREAR PDF");
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel11.setIconTextGap(0);
        jLabel11.setOpaque(true);
        jLabel11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel11.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel11MouseMoved(evt);
            }
        });
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(238, 112, 82));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/COMPLEMENTOS/rechazado.png"))); // NOI18N
        jLabel16.setText("CANCELAR");
        jLabel16.setToolTipText("CANCELAR");
        jLabel16.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel16.setIconTextGap(0);
        jLabel16.setOpaque(true);
        jLabel16.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel16.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel16MouseMoved(evt);
            }
        });
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addContainerGap(495, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 70, 1000);

        jPanel3.setBackground(new java.awt.Color(153, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "CITAS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(38, 150, 209))); // NOI18N
        jPanel3.setAutoscrolls(true);
        jPanel3.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel3.setMinimumSize(new java.awt.Dimension(1685, 993));
        jPanel3.setOpaque(false);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setGridColor(new java.awt.Color(204, 204, 204));
        jTable1.setInheritsPopupMenu(true);
        jTable1.setRowHeight(24);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel51.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(38, 150, 209));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel51.setText("FECHA:");

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(38, 150, 209));
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel61.setText("HORA:");

        jDateChooser1.setToolTipText("");
        jDateChooser1.setDateFormatString("dd/MM/yyyy");
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jDateChooser1.setMaxSelectableDate(new java.util.Date(253370786490000L));
        jDateChooser1.setMinSelectableDate(new java.util.Date(-62135747910000L));
        jDateChooser1.setOpaque(false);
        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jPanel20.setBackground(new java.awt.Color(153, 255, 255));
        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(38, 150, 209))); // NOI18N
        jPanel20.setOpaque(false);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1768, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 468, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(593, Short.MAX_VALUE))
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 914, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(10, 10, 1780, 1010);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1780, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1002, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
     
    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
        ConfiguracionDInicio(); Ajustarpanel();

    }//GEN-LAST:event_formAncestorAdded

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       
    }//GEN-LAST:event_jTable1MouseClicked

    
    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
    
    }//GEN-LAST:event_jTable1MousePressed

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
     
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
    
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
  
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
         String cap,cap1,cap2,env; ModeloBD MD = new ModeloBD();
         guardarcita();
       try{
            //env=jTextField12.getText();    
            
            cap2=MD.GDDatosGeneralesCita("",capturarfecha());
            if (cap2.length()>0){
                JOptionPane.showMessageDialog(null,"Error:\n"+ cap2+"\n No se a podido completar el egreso", "Error", JOptionPane.ERROR_MESSAGE);
                return;    
            }
            cap= MD.GDDetalleServiciosEgresados("");
            if (cap.length()>0){
                JOptionPane.showMessageDialog(null,"Error:\n"+ cap+"\n No se a podido completar el egreso", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            JOptionPane.showMessageDialog(null," Datos del Comprobante guardados de manera exitosa" ," Guardar", JOptionPane.INFORMATION_MESSAGE);
            ConfiguracionDInicio();
       }catch (NumberFormatException|HeadlessException e) {
           JOptionPane.showMessageDialog(this, e.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
       }  
        
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
 
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseMoved
       
        
        
    }//GEN-LAST:event_jLabel1MouseMoved

    private void jLabel8MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseMoved

    }//GEN-LAST:event_jLabel8MouseMoved

    private void jLabel10MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseMoved
  
    }//GEN-LAST:event_jLabel10MouseMoved

    private void jLabel9MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseMoved

    }//GEN-LAST:event_jLabel9MouseMoved

    private void jLabel11MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseMoved
   
    }//GEN-LAST:event_jLabel11MouseMoved

    private void jLabel16MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseMoved

    }//GEN-LAST:event_jLabel16MouseMoved

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
      if ("date".equals(evt.getPropertyName())) {

        if (jDateChooser1.getDate() != null) {

            jTable1.setModel(
                OB.Mostrartablacitas(jTable1, capturarfecha())
            );
            }
        } 
    }//GEN-LAST:event_jDateChooser1PropertyChange
    


void MenuLateralclick (){
    int posicion = this.jPanel2.getX();
       if(posicion<0){
           
          Animacion.Animacion.mover_derecha(-70, 0, 2, 2,jPanel2);
       }else{
         Animacion.Animacion.mover_izquierda(0, -70, 2, 2,jPanel2);
       }
}

private void MenuRPD (){
     int posicion = this.jPanel2.getX();
       if(posicion>-1){
           Animacion.Animacion.mover_izquierda(0, -60, 0, 2,jPanel2);
       }
}

public int cancelarxsalida(){
    int vl =0;
    if(valid.length()==0){vl=0; return vl; }//-----Cierre
    if(valid.equalsIgnoreCase("editar")||valid.equalsIgnoreCase("nuevo")){
        vl =JOptionPane.showConfirmDialog(this,"Si sale de la Ventana Actual se Cancelara el Registro!!!\n ¿Desea cancelar el registro?\n Si acepta se borrara toda la informacion ingresada y no se guardaran los datos!!!", " Advertencia !!!!",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
            if(vl==JOptionPane.YES_OPTION){ ConfiguracionDInicio(); jTable1.setVisible(true);   jScrollPane1.setVisible(true);  valid="";}//---->Cierre   
        }
     return vl;
    }
private void CargarModelosCombox (){

/*jComboBox3.setModel(OB.EmpleadosAmd()); jComboBox5.setModel(OB.DetallesdeProductos(sum));
jComboBox1.setModel(OB.CONCEPTO1(sum,""));*/
}
private void ConfiguracionDInicio(){
    cargarobjetos();CargarModelosCombox();
    vc.manejocajas(jPanel3, "limpiar");
    jTable1.setModel(OB.MostrartablaDespachos("suministro")); 
   /* //if(cargarobjetos().length()>0){VC.MSimple(cargarobjetos(),"Error!!!",JOptionPane.ERROR_MESSAGE);return;}//----->Cierre
    vc.tamañocolumnas(jTable1,"empleados");
    valid=""; jTable1.setVisible(true);    jTable1.setModel(OB.MostrartablaEmpleados(jTable1));   
    //VC.manejolabelsbotones(jPanel2,"ocultar");   VC.tamañocolumnas(jTable1, "empleados");     VC.manejocajas(jPanel5,"noeditar");             
         //VC.manejocajas(jPanel5, "limpiar");                     
    //VC.mamejocombos(jPanel5,"bloquear");               
           // buttonGroup1.clearSelection();
   //jTextField9.setEditable(true);
    mostrarbotonesBase();      seleccion=-1;   pos=-1; */
} 
private void Ajustarpanel(){
jPanel2.setBounds(-70, 0,70,20000);
jPanel1.addComponentListener(new ComponentAdapter() {
     @Override
    public void componentResized(ComponentEvent e) {
            int anchoTotal = jPanel1.getWidth();
            int altoTotal = jPanel1.getHeight();
            jPanel3.setBounds(0, 0, anchoTotal, altoTotal);
            jPanel3.revalidate();
            jPanel3.repaint();
    }
});
this.repaint();
}

private String cargarobjetos(){
OB.LMPCliente(); OB.LMPEmpleados();OB.LMPSerivio();OB.LMPCita();
String a=""; ModeloBD MD = new ModeloBD();
if(MD.CARGARCLIENTES().length()>0){ a=MD.CARGARCLIENTES();} //-------->Cierre
if(MD.CARGAREMPLEADOS().length()>0){ a=MD.CARGAREMPLEADOS();} //-------->Cierre
if(MD.CARGARSERVICOS().length()>0){ a=MD.CARGARSERVICOS();} //-------->Cierre
if(MD.CARGARCITAS().length()>0){ a=MD.CARGARCITAS();} //-------->Cierre
return a;
//VC.MSimple("Problema al cargar Regitro de Empleado \n"+MD.CARGAREMPLEADOS(),"Error de Carga!!!",JOptionPane.ERROR_MESSAGE);
}

private void EditaroIngresar(String op ){
capturardatosproducto();    capturarfecha();
try{

switch(op){
    case"ingresar":
        OB.AGDespEgProductos(new Despachos(fecha,registro[0],registro[1], registro[2], registro[3], Double.parseDouble(registro[4])));
    break;
    case"editar":
        OB.EDDespEgProductos(new Despachos(fecha,registro[0],registro[1], registro[2], registro[3], Double.parseDouble(registro[4])),pos);
    break;
} 
//if(Objetos.DTCMP.isEmpty()){jComboBox1.setEnabled(true);} if(Objetos.DTCMP.size()>0){jComboBox1.setEnabled(false);}
  seleccion=-1;  pos=-1;
  jTable1.setModel(OB.MostrartablaDespachos("suministro"));   vc.tamañocolumnas(jTable1,"egreso");  jTable1.setComponentPopupMenu(null);
  //jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
  }catch(NumberFormatException e){
      JOptionPane.showMessageDialog(null,"Error "+e.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
  }
}



private String capturarfecha() {
    try {
        Date date = jDateChooser1.getDate();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

        fecha = sdf.format(date);

    } catch (Exception e) {
        fecha = "";
    }

    return fecha;
} 
private void capturardatosgenerales (){//recoger datos para el comprobante 
        registro = null;
        registro = new String[8];
        //registro[0]= jTextField12.getText();                    ///codigo
        registro[1]= capturarfecha();                           //fecha
        //cliente = (Cliente) jComboBox1.getSelectedItem();
        //profesional =   (Profesional) jComboBox2.getSelectedItem();
        //registro[2]= jComboBox1.getSelectedItem().toString();   //cliente
        //registro[3]= jComboBox2.getSelectedItem().toString();   //Profesional
        registro[4]= jTextField7.getText();                     //hora            
        //registro[5]= jComboBox3.getSelectedItem().toString();               //Estado
}
private void  guardarcita (){//guardar datos
 capturardatosgenerales();
 OB.AGCita(new Citas(registro[0],registro[1],registro[4],registro[5],cliente,profesional));
}


private void capturardatosproducto (){//recoger datos de los text
    registro = null;
    registro = new String[8];
    //registro[0]= jTextField12.getText();                                     //CODIGO DE CITA
    //registro[1]= jTextField2.getText();                                     //codigo DE SERVICIO
    //registro[2]= jComboBox5.getSelectedItem().toString();                    //NOMBRE SERVICIO
    //registro[3]= jTextField4.getText();                                     //DESCRIPCION SERVICIO
    //registro[4]= jTextField3.getText();                                     //precio
   
}



 private void mostrarbotonesBase(){  jLabel1.setVisible(true);jLabel8.setVisible(true);jLabel10.setVisible(true);jLabel11.setVisible(true);}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
