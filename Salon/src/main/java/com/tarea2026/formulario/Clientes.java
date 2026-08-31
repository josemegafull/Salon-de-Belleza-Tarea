package com.tarea2026.formulario;

   
import com.tarea2026.logica.ClienteNuevo;
import com.tarea2026.logica.ClienteRegular;
import com.tarea2026.logica.ClienteVIP;
import com.tarea2026.logica.Objetos;
import com.tarea2026.logica.MControles;
import com.tarea2026.logica.ModeloBD;
import com.tarea2026.modelos.Cliente;
import java.awt.GridLayout;                 import java.awt.event.ComponentAdapter;        
import java.awt.event.ComponentEvent;       import java.awt.event.KeyEvent;         import javax.swing.table.DefaultTableModel;        
import javax.swing.table.TableRowSorter;
import javax.swing.JOptionPane; import javax.swing.RowFilter;

/**
 *
 * @author Jose Cambisaca Baquerizo
 */
public class Clientes extends javax.swing.JPanel {
Objetos  OB=new Objetos(); ; TableRowSorter <DefaultTableModel>tr;
MControles VC = new MControles();

int seleccion=-1,pos=-1;
String valid="";
String[] registro = null;

public Clientes() {
initComponents();
//jPanel3.setLayout(new GridLayout(2,0)); /*jPanel4.setLayout(new GridLayout(0,2));*/
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField9 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1780, 993));
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
        jPanel2.setPreferredSize(new java.awt.Dimension(78, 1000));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/COMPLEMENTOS/expediente (1).png"))); // NOI18N
        jLabel1.setText("NUEVO");
        jLabel1.setToolTipText("NUEVO");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setFocusable(false);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/COMPLEMENTOS/bloc-de-dibujo.png"))); // NOI18N
        jLabel8.setText("EDITAR");
        jLabel8.setToolTipText("EDITAR");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/COMPLEMENTOS/subir.png"))); // NOI18N
        jLabel9.setText("GUARDAR");
        jLabel9.setToolTipText("GUARDAR");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/COMPLEMENTOS/rechazadoelm.png"))); // NOI18N
        jLabel10.setText("ELIMINAR");
        jLabel10.setToolTipText("ELIMINAR");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/COMPLEMENTOS/busqueda.png"))); // NOI18N
        jLabel11.setText("BUSCAR");
        jLabel11.setToolTipText("BUSCAR");
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/COMPLEMENTOS/rechazado.png"))); // NOI18N
        jLabel12.setText("CANCELAR");
        jLabel12.setToolTipText("CANCELAR");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 70, 1030);

        jPanel3.setBackground(new java.awt.Color(102, 255, 255));
        jPanel3.setOpaque(false);

        jPanel4.setBackground(new java.awt.Color(102, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CLIENTE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 36), new java.awt.Color(38, 150, 209))); // NOI18N
        jPanel4.setOpaque(false);

        jPanel5.setBackground(new java.awt.Color(102, 255, 255));
        jPanel5.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(38, 150, 209));
        jLabel2.setText("CEDULA");
        jLabel2.setDoubleBuffered(true);

        jTextField1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(38, 150, 209));
        jLabel4.setText("NOMBRES:");

        jTextField2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jTextField3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(38, 150, 209));
        jLabel13.setText("TELEFONO:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(38, 150, 209));
        jLabel7.setText("CORREO");

        jTextField4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(38, 150, 209));
        jLabel15.setText("ID CLIENTE:");

        jTextField5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(38, 150, 209));
        jLabel14.setText("TIPO:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1547, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField5)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField5)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(102, 255, 255));
        jPanel10.setOpaque(false);

        jScrollPane1.setBackground(new java.awt.Color(51, 255, 255));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setToolTipText("");
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
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setInheritsPopupMenu(true);
        jTable1.setRowHeight(24);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField9KeyReleased(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel17.setText("FILTRO:");
        jLabel17.setDoubleBuffered(true);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1352, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1778, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 1780, 990);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1780, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 993, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        if (seleccion<0){ VC.MSimple(" Debe elegir un registro a editar","Seleccion",JOptionPane.INFORMATION_MESSAGE);  return;}//----- Cierre      
             valid="editar";                    
             VC.manejocajas(jPanel5,"editar");      
             VC.mamejocombos(jPanel5,"desbloquear");VC.manejolabelsbotones(jPanel2,"ocultar");
             jLabel9.setVisible(true);  jLabel12.setVisible(true);
             jLabel11.setVisible(true); jTextField1.setEditable(false);    jTextField2.requestFocus(); 
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
     /*if (cedula().length()>0){  VC.MSimple(cedula()+"\n Revise los datos ingresados o "
      + "Actualice el registro correcto", " Duplicado de Datos !!!", JOptionPane.ERROR_MESSAGE);return;}//---->Cierre  */ 
    EditaroIngresar();      
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       ActivarNuevo();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        int valor =JOptionPane.showConfirmDialog(this,"¿Desea cancelar el registro?\n Si acepta "+MSimple(), " Advertencia !!!!",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        if(valor==JOptionPane.YES_OPTION){
         ConfiguracionDInicio();
         jPanel10.setVisible(true);
         jScrollPane1.setVisible(true); jTable1.setVisible(true);  jTable1.setModel(OB.MostrartablaClientes(jTable1));
         VC.tamañocolumnas(jTable1,"empleados");
         valid="";  seleccion=-1;pos=-1;
       }
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        String para;ModeloBD MD = new ModeloBD();
         if (seleccion<0){VC.MSimple(" Debe seleccionar un registro a eliminar"," Error !!!",JOptionPane.ERROR_MESSAGE);return;}
             int valor =JOptionPane.showConfirmDialog(this,"¿ Esta seguro de eliminar el registro ?\n Si acepta se borrara toda la informacion del registro  y no se podran \n recuperar los datos eliminados ", 
                  " Advertencia ¡¡¡",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
                if(valor==JOptionPane.YES_OPTION){
                    para=jTextField1.getText();
                     if (MD.eliminaremp(para).equals("completada")){
                        VC.MSimple("Registro eliminado correctamente","Eliminado completado",JOptionPane.INFORMATION_MESSAGE);
                        OB.LMPEmpleados();MD.CARGAREMPLEADOS();

                        jTable1.setModel(OB.MostrartablaClientes(jTable1));
                        VC.tamañocolumnas(jTable1, "empleados");
                        seleccion=-1;   pos=-1; 
                    }  
                 return;
              } 
           jTable1.setModel(OB.MostrartablaClientes(jTable1));    VC.tamañocolumnas(jTable1, "empleados");
           seleccion=-1;    pos=-1;     
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
         // TODO add your handling code here:
        /* String campos[]={"ID","CEDULA","NOMBRES","APELLIDOS"};
         String op[]={"BUSCAR","CANCELAR"};
         String val= (JOptionPane.showInputDialog(null,"seleccione un filtro para poder buscar","Buscar Empleado",
                JOptionPane.QUESTION_MESSAGE,null,campos,null)).toString();
         //val = JOptionPane.showInputDialog(this,comb,"Buscar Empleado",JOptionPane.PLAIN_MESSAGE,JOptionPane.QUESTION_MESSAGE,op,"Selecciona");
         */
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
       VC.letras(evt);
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
         VC.numeros(evt);
    }//GEN-LAST:event_jTextField1KeyTyped

    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
       ConfiguracionDInicio();Ajustarpanel(); 
    }//GEN-LAST:event_formAncestorAdded

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
    
        seleccion =jTable1.rowAtPoint(evt.getPoint());
        pos=jTable1.getSelectedRow();
        //JOptionPane.showMessageDialog(null, pos);
        //jTable1.setRowSelectionInterval(pos,seleccion);
        cargardatosentext();
    }//GEN-LAST:event_jTable1MousePressed

    private Integer Buscarposicion (){
    int vl=-1;
    for (int i = 0; i < Objetos.CLI.size(); i++) {
        Cliente emp = Objetos.CLI.get(i);
            if(String.valueOf(jTable1.getValueAt(pos,1)).equals(emp.getCedula())){ 
                vl=i;
            }//------->Cierre
        }
    return vl;
    }
    
    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        // TODO add your handling code here:
       if( (evt.getKeyCode()==KeyEvent.VK_DOWN)||(evt.getKeyCode()==KeyEvent.VK_UP)){
           pos=jTable1.getSelectedRow();   
           cargardatosentext();
      }
       
    }//GEN-LAST:event_jTable1KeyReleased

    private void jTextField9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyReleased
       filtro();
    }//GEN-LAST:event_jTextField9KeyReleased

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void filtro(){
        tr=new TableRowSorter<>(OB.MostrartablaClientes(jTable1));
        jTable1.setRowSorter(tr);
       try {
          tr.setRowFilter(RowFilter.regexFilter("(?i)"+jTextField9.getText()));
        } catch (Exception e) {
            
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

/* ------------------------------------------------------------  
                    Codigo para MSimpleria
   ------------------------------------------------------------*/  
    private String MSimple(){
       String MSimple="";
        if (valid.equalsIgnoreCase("editar")){  MSimple="no se guardaran los cambios realizados";}//---->Cierre
        if (valid.equalsIgnoreCase("nuevo")){   MSimple="se borrara toda la informacion ingresada y no se guardaran los datos!!";}//----->Cierre
        return MSimple;
    }
/* --------------------------------------------------------------------------------------------------------- 
     Codigo para manejo de  los datos de las cajas de texto ingreso y actualizacion de  la base de datos 
   ---------------------------------------------------------------------------------------------------------*/ 
/*private void EditaroIngresar(){
capturardatos();    ModeloBD MD = new ModeloBD();   String vl = "";
    try{
        switch(valid){
            case"nuevo":
                OB.AGCliente(new Cliente(registro[0],registro[1],registro[2],registro[3],registro[4]));
                if (MD.INCliente(registro[1]).length()>0){ VC.MSimple("No se pudo guardar el registro \n Error: "+MD.INempleado(registro[1]),"Error al guardar los datos",JOptionPane.ERROR_MESSAGE);return;}//----->Cierre
                vl=" Registro guardado de forma exitosa";  // jTable1.setVisible(true);   jScrollPane1.setVisible(true);    
            break;
            case"editar":
                OB.EDCliente(new Cliente(registro[0],registro[1],registro[2],registro[3],registro[4]),Buscarposicion());
                if (MD.EDCliente(registro[1]).length()>0){VC.MSimple("No se pudo actualizar el registro \n Error: "+MD.INempleado(registro[1]),"Error al guardar los datos",JOptionPane.ERROR_MESSAGE);return;}//---->Cierre
                vl=" Registro actualizado de forma exitosa";
            break;
        } 
       VC.MSimple(vl," Guardado completado", JOptionPane.INFORMATION_MESSAGE);
       ConfiguracionDInicio();  seleccion=-1;    pos=-1;
    }catch(NumberFormatException e){
          JOptionPane.showMessageDialog(null,"Error "+e.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
    }
}*/

private void EditaroIngresar() {
    capturardatos();    ModeloBD MD = new ModeloBD();   String vl = "";
    try {
        Cliente cliente = crearCliente();
        switch (valid) {
            case "nuevo":
                OB.AGCliente(cliente);
                if (MD.INCliente(registro[1]).length() > 0) {VC.MSimple("No se pudo guardar el registro\nError: "+ MD.INCliente(registro[1]),"Error al guardar los datos",
                        JOptionPane.ERROR_MESSAGE);return;}
                vl = "Registro guardado de forma exitosa";
                break;
            case "editar":
                
                OB.EDCliente(cliente, Buscarposicion());
                if (MD.EDCliente(registro[1]).length() > 0) {VC.MSimple("No se pudo actualizar el registro\nError: "+ MD.EDCliente(registro[1]),"Error al guardar los datos",
                        JOptionPane.ERROR_MESSAGE);return;}
                vl = "Registro actualizado de forma exitosa";
                break;
        }
        VC.MSimple(vl,"Guardado completado",JOptionPane.INFORMATION_MESSAGE);
        ConfiguracionDInicio();
        seleccion = -1;
        pos = -1;

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null,"Error " + e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
    }
}

private Cliente crearCliente() {

    return switch (registro[5]) {

        case "Nuevo" -> new ClienteNuevo(
                registro[0],
                registro[1],
                registro[2],
                registro[3],
                registro[4]
        );
            
        case "Regular" -> new ClienteRegular(
                registro[0],
                registro[1],
                registro[2],
                registro[3],
                registro[4]
        );

        case "VIP" -> new ClienteVIP(
                registro[0],
                registro[1],
                registro[2],
                registro[3],
                registro[4]
        );

        default -> throw new IllegalArgumentException(
                "Tipo de cliente no válido"
        );
    };
}
    private void capturardatos (){//recoger datos de los text
        registro = null;    registro = new String[10];
        registro[1]= jTextField1.getText(); 
        registro[2]= jTextField2.getText();
        registro[3]= jTextField3.getText();
        registro[4]= jTextField4.getText();
        registro[5]= jComboBox1.getSelectedItem().toString();
        registro[0]= jTextField5.getText();
      }

    private void cargardatosentext (){
        for (int i = 0; i < Objetos.CLI.size(); i++) {
            Cliente em= Objetos.CLI.get(i);
            //JOptionPane.showMessageDialog(null, jTable1.getValueAt(pos,0));
           if(String.valueOf(jTable1.getValueAt(pos,1)).equals(em.getCedula())){
           jTextField1.setText(em.getCedula());  jTextField2.setText(em.getNombre());    jTextField3.setText(em.getTelefono());
           jTextField4.setText(em.getCorreo());  jTextField5.setText(em.getIdcliente()); jComboBox1.setSelectedItem(em.getTipo());
        } 
    }  
  }        
 /* --------------------------------------------------------------------------------------------------------- 
                        validacion de datos ID y CEDULA por que son campos unicos   
   ---------------------------------------------------------------------------------------------------------*/ 

private String cedula(){
 String resp="";
    for (int i = 0; i < Objetos.CLI.size(); i++) {
            Cliente emp = Objetos.CLI.get(i);
        switch (valid){
         case "editar":
            if(emp.getCedula().equalsIgnoreCase(jTextField1.getText())){
                resp="Ya existe un registro con la cedula ingresada, la cedula es un campo unico!!!"; return resp;}//------>Cierre 
           break;
         case "nuevo":
            if(emp.getCedula().equalsIgnoreCase(jTextField1.getText())){resp="Ya existe un registro con la cedula ingresada";return resp;}//---Cierre 
            break;      
        }
    }
 return resp;
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
void MenuLateralclick (){
    int posicion = this.jPanel2.getX();
       if(posicion<0){
           
          Animacion.Animacion.mover_derecha(-70, 0, 2, 2,jPanel2);
       }else{
         Animacion.Animacion.mover_izquierda(0, -70, 2, 2,jPanel2);
       }
}
private void mostrarbotonesBase(){  jLabel1.setVisible(true);jLabel8.setVisible(true);jLabel10.setVisible(true);jLabel11.setVisible(true);}//----->Cierre
private void mostrarbotonesBase1(){ jLabel9.setVisible(true);jLabel12.setVisible(true);}//----->Cierre
private void ActivarNuevo(){
    valid="nuevo";
    VC.manejocajas(jPanel5, "limpiar");     VC.manejolabelsbotones(jPanel2,"ocultar");  VC.manejocajas(jPanel5,"editar");
    VC.mamejocombos(jPanel5,"desbloquear"); jTextField1.requestFocus();
    mostrarbotonesBase1();                  jPanel10.setVisible(false);
    jTable1.setVisible(false);             jScrollPane1.setVisible(false);
        
}
private void ConfiguracionDInicio(){
    if(cargarobjetos().length()>0){VC.MSimple(cargarobjetos(),"Error!!!",JOptionPane.ERROR_MESSAGE);return;}//----->Cierre
    valid=""; jTable1.setVisible(true);    jTable1.setModel(OB.MostrartablaClientes(jTable1));   VC.tamañocolumnas(jTable1,"empleados");
    VC.manejolabelsbotones(jPanel2,"ocultar");   VC.tamañocolumnas(jTable1, "empleados");     VC.manejocajas(jPanel5,"noeditar");             
         VC.manejocajas(jPanel5, "limpiar");                     
    VC.mamejocombos(jPanel5,"bloquear");               
            buttonGroup1.clearSelection();
   jTextField9.setEditable(true);        jTextField5.setEditable(false);
   jComboBox1.setModel(OB.TipoCliente()); 
    mostrarbotonesBase();      seleccion=-1;   pos=-1; 
} 
private String cargarobjetos(){
OB.LMPCliente();
String a=""; ModeloBD MD = new ModeloBD();
if(MD.CARGARCLIENTES().length()>0){ a=MD.CARGARCLIENTES();} //-------->Cierre
return a;
//VC.MSimple("Problema al cargar Regitro de Empleado \n"+MD.CARGAREMPLEADOS(),"Error de Carga!!!",JOptionPane.ERROR_MESSAGE);
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}