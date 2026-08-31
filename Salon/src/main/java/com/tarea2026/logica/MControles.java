/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarea2026.logica;
  

import io.github.geniot.jortho.FileUserDictionary;
import io.github.geniot.jortho.PopupListener;
import io.github.geniot.jortho.SpellChecker;
import io.github.geniot.jortho.SpellCheckerOptions;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.JComboBox; 
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JViewport;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Jose Cambisaca Baquerizo
 */
public class MControles {
     TableRowSorter sorter ; 
    public void tamañocolumnas(JTable table,String ident) {
    int width=100;
    //Se obtiene el modelo de la columna
    TableColumnModel columnModel = table.getColumnModel();
    //Se obtiene el total de las columnas
    for (int column = 0; column < table.getColumnCount(); column++) {
        //Establecemos un valor minimo para el ancho de la columna
        //int width = 140; //Min Width
         switch (ident){
            case "egreso":
                width=160;
            break;
            case "suministro":
                width=140;
            break;
             case "activo fijo":
                width=50;
            break;
            case "ingreso":
                width=140;
            break;
            case "empleados":
                width=50;
            break;
            case "actas":
                width=50;
            break;
            }
        //Obtenemos el numero de filas de la tabla
        for (int row = 0; row < table.getRowCount(); row++) {        
            //Obtenemos el renderizador de la tabla
            TableCellRenderer renderer = table.getCellRenderer(row, column);
            //Creamos un objeto para preparar el renderer
            Component comp = table.prepareRenderer(renderer, row, column);
            //Establecemos el width segun el valor maximo del ancho de la columna
            width = Math.max(comp.getPreferredSize().width + 1, width);

        }
        //Se establece una condicion para no sobrepasar el valor de 300
        //Esto es Opcional
        /*if (width > 300) {
            width = 300;
        }*/
        //Se establece el ancho de la columna
        columnModel.getColumn(column).setPreferredWidth(width);
    }
}
/*----------------------------------------------------------------------------  
                 Codigo para manejar labels  
---------------------------------------------------------------------------*/ 
  public void manejodePaneles(JPanel a,String op){
     JPanel caja;
    for (int i=0;i<a.getComponentCount();i++){
        if(a.getComponent(i).getClass().getName().equals("javax.swing.JPanel")){
            caja= (JPanel)a.getComponent(i);
            switch(op){
              case "bloquear":
              caja.setEnabled(false);
              break;
              case "desbloquear":
              caja.setEnabled(true);
              break;
              case "nover":
              caja.setVisible(false);
              break;
              case "ver":
              caja.setVisible(true);
              break;
            }   
        }
    }    
}    
    
/*----------------------------------------------------------------------------  
                 Codigo para manejar labels  
---------------------------------------------------------------------------*/ 
  public void manejolabelsbotones (JPanel a,String op){
     JLabel caja;
    for (int i=0;i<a.getComponentCount();i++){
        if(a.getComponent(i).getClass().getName().equals("javax.swing.JLabel")){
            caja= (JLabel)a.getComponent(i);
            switch(op){
              case "bloquear":
              caja.setEnabled(false);
              break;
              case "desbloquear":
              caja.setEnabled(true);
              break;
              case "ocultar":
              caja.setVisible(false);
              break;
              case "ver":
              caja.setVisible(true);
              break;
            }   
        }
    }    
}
/*----------------------------------------------------------------------------  
                 Codigo para manejar labels efectos visuales label botones
---------------------------------------------------------------------------*/ 
  public void manejodefectoslabels (JLabel a){
     JLabel caja=a;
     caja.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                caja.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238,112,8)));
                caja.setBackground(new java.awt.Color(143, 143,143));
            }
        });
      caja.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
            caja.setBorder(null);
            caja.setBackground(new java.awt.Color(255,255,255));
            }
        });
}  
  
     
/*----------------------------------------------------------------------------  
                     Codigo para manejar combo box  
---------------------------------------------------------------------------*/ 
  public void mamejocombos (JPanel a,String op){
     JComboBox caja;
    for (int i=0;i<a.getComponentCount();i++){
        if(a.getComponent(i).getClass().getName().equals("javax.swing.JComboBox")){
            caja= (JComboBox)a.getComponent(i);
            switch(op){
              case "nover":
              caja.setVisible(false);
              break;
              case "ver":
              caja.setVisible(true);
              break;  
              case "bloquear":
              caja.setEnabled(false);
              break;
              case "desbloquear":
              caja.setEnabled(true);
              break;
            }   
        }
    }    
}
  /*----------------------------------------------------------------------------  
                 Codigo para manejar radio butooms  
---------------------------------------------------------------------------*/ 
  public void mamejoderadiobut (JPanel a,String op){
      JRadioButton caja;
    for (int i=0;i<a.getComponentCount();i++){
        if(a.getComponent(i).getClass().getName().equals("javax.swing.JRadioButton")){
            caja= (JRadioButton)a.getComponent(i);
            switch(op){
              case "bloquear":
              caja.setEnabled(false);
              break;
              case "desbloquear":
              caja.setEnabled(true);
              break;
              case "nover":
              caja.setVisible(false);
              break;
              case "ver":
              caja.setVisible(true);
              break;
            }   
        }
    }    
}  
/*----------------------------------------------------------------------------  
                     Codigo para manejar cajas de texto 
---------------------------------------------------------------------------*/ 
  public void manejocajas (JPanel a,String opc){
  JTextField caja;
    for (int i=0;i<a.getComponentCount();i++){
        if(a.getComponent(i).getClass().getName().equals("javax.swing.JTextField")){
            caja= (JTextField)a.getComponent(i);
             switch(opc){
              case "bloquear":
              caja.setEnabled(false);
              break;
              case "desbloquear":
              caja.setEnabled(true);
              break;
              case "limpiar" :
              caja.setText("");
              break;
              case "noeditar":
              caja.setEditable(false);
              break;
              case "editar":
              caja.setEditable(true);
              break;
              case "ver":
              caja.setVisible(true);
              break;
              case "nover":
              caja.setVisible(false);
              break;
             }
       }
   }    
}
  
  public void manejocajasenvTxt (JPanel a,String opc,String mensaje){
  JTextField caja;
    for (int i=0;i<a.getComponentCount();i++){
        if(a.getComponent(i).getClass().getName().equals("javax.swing.JTextField")){
            caja= (JTextField)a.getComponent(i);
             switch(opc){
              case "llenar":
              caja.setText(mensaje);
              break;
             }
       }
   }    
}  
 /*----------------------------------------------------------------------------  
                     Codigo para manejar cajas de texArea
---------------------------------------------------------------------------*/ 
  public void manejocajasgrades (JScrollPane a,String opc){     
  JTextArea caja;
    for (int i=0;i<a.getComponentCount();i++){
        if(a.getComponent(i).getClass().getName().equals("javax.swing.JViewport")){
            JViewport jv= (JViewport) a.getComponent(i);
            for (int j = 0; j < jv.getComponentCount(); j++) {
            //String mos= jv.getComponent(j).getClass().getName();
            //JOptionPane.showMessageDialog(null,mos);
            if(jv.getComponent(j).getClass().getName().equals("javax.swing.JTextArea")){
            caja= (JTextArea)jv.getComponent(j);
             switch(opc){
              case "bloquear":
              caja.setEnabled(false);
              break;
              case "desbloquear":
              caja.setEnabled(true);
              break;
              case "limpiar" :
              caja.setText("");
              break;
              case "noeditar":
              caja.setEditable(false);
              break;
              case "editar":
              caja.setEditable(true);
              break;
             }           
            }
        }
     }
   }    
}      
  public void manejocajasgrades1(JPanel a,String opc){// Parte principal del TextArea     
  JScrollPane caja;
    for (int i=0;i<a.getComponentCount();i++){
        if(a.getComponent(i).getClass().getName().equals("javax.swing.JScrollPane")){
            caja= (JScrollPane)a.getComponent(i);
             switch(opc){
              case "bloquear":
              caja.setEnabled(false);
                  manejocajasgrades(caja,opc);
              break;
              case "desbloquear":
              caja.setEnabled(true);
                  manejocajasgrades(caja,opc);
              break;
              case "limpiar" :
                  manejocajasgrades(caja,opc);
              break;
              case "noeditar":
                manejocajasgrades(caja,opc);
              break;
              case "editar":
                manejocajasgrades(caja,opc);
              break;
              case "evaluar":
                evaluarcajasgrandesvacias(caja);
              break;
             }
       }
   }    
}
public String evaluarcajasvacias(JPanel a){
String b="";
JTextField caja;
        for (int i=0;i<a.getComponentCount();i++){
            if(a.getComponent(i).getClass().getName().equals("javax.swing.JTextField")){
                caja= (JTextField)a.getComponent(i);
                if (caja.getText().equals("")){
                    caja.requestFocus();
                    b ="terminar";
                    break;
                }   
            }
        }   
    return b; 
}
public String evaluarcajasgrandesvacias(JScrollPane a){
String b="";
JTextArea caja;    
        for (int i=0;i<a.getComponentCount();i++){
        if(a.getComponent(i).getClass().getName().equals("javax.swing.JViewport")){
            JViewport jv= (JViewport) a.getComponent(i);
            for (int j = 0; j < jv.getComponentCount(); j++) {
                if(jv.getComponent(j).getClass().getName().equals("javax.swing.JTextArea")){
                    caja= (JTextArea)jv.getComponent(j);
                    if (caja.getText().equals("")){
                    caja.requestFocus();
                    b ="terminar";
                    break;
                }   
            }
        }
       }
     }
    return b; 
}

public String redimencionarcajas(JScrollPane a){
String b="";
JTextArea caja;    
        for (int i=0;i<a.getComponentCount();i++){
        if(a.getComponent(i).getClass().getName().equals("javax.swing.JViewport")){
            JViewport jv= (JViewport) a.getComponent(i);
            for (int j = 0; j < jv.getComponentCount(); j++) {
                if(jv.getComponent(j).getClass().getName().equals("javax.swing.JTextArea")){
                    caja= (JTextArea)jv.getComponent(j);
                    if (caja.getText().equals("")){
                    caja.requestFocus();
                    b ="terminar";
                    break;
                }   
            }
        }
       }
     }
    return b; 
}


 /*----------------------------------------------------------------------------  
                     Codigo para manejar visibilidad de paneles
---------------------------------------------------------------------------*/ 
  public void manejopaneles (JPanel a,String opc){     
  JPanel caja;
     for (int i=0;i<a.getComponentCount();i++){
        if(a.getComponent(i).getClass().getName().equals("javax.swing.JPanel")){
            caja= (JPanel)a.getComponent(i);
             switch(opc){
              case "bloquear":
              caja.setEnabled(false);
              break;
              case "desbloquear":
              caja.setEnabled(true);
              break;
              case "nover":
                caja.setVisible(false);
              break;
              case "ver":
                caja.setVisible(true);
              break;
             }
       }
   }    
}


  
/*----------------------------------------------------------------------------  
    Codigo controlar el ingreso de datos de las cajas
---------------------------------------------------------------------------*/ 
 public void numeropunto(java.awt.event.KeyEvent evt){
     int key = evt.getKeyChar();
        boolean num =key >=48 && key<=57||key==46;
        if (!num){
            evt.consume();
        }
  }
 public void numerosgion(java.awt.event.KeyEvent evt){
     int key = evt.getKeyChar();
        boolean num =key >=48 && key<=57||key==45;
        if (!num){
            evt.consume();
        }
  }
 public void numerodiagonal(java.awt.event.KeyEvent evt){
     int key = evt.getKeyChar();
        boolean num =key >=47 && key<=57||key==127;
        if (!num){
            evt.consume();
        }
  }
 public void numeros(java.awt.event.KeyEvent evt){
     int key = evt.getKeyChar();
        boolean num =key >=48 && key<=57;
        if (!num){
            evt.consume();
        }
  } 
public void MSimple(String mensj,String tit,int vl){
    JOptionPane.showMessageDialog(null,mensj,tit,vl);    
}
public void MensajeDBoton(){
   JOptionPane.showMessageDialog(null,"Boton Desactivado\nPor favor, siga los pasos de forma correcta\npara poder habilitar las opciones de despacho","Boton Inhabilitado!!!", JOptionPane.ERROR_MESSAGE);
} 

 /* --------------------------------------------------------------------------------------------------------- 
                                     validacion de numeros y letras para jtext 
   ---------------------------------------------------------------------------------------------------------*/ 
  public void letras(java.awt.event.KeyEvent evt){
      if(!(Character.isLetter(evt.getKeyChar()))&&!(evt.getKeyChar()== KeyEvent.VK_SPACE)){
            evt.consume();
      }
  }
       
  public void numerocedula(java.awt.event.KeyEvent evt,JTextField jc){
     int key = evt.getKeyChar();
        boolean num =key >=48 && key<=57;
        if (!num){
            evt.consume();
        }
        if (jc.getText().trim().length()==10){
            evt.consume();
        }
     
  }


public SpinnerNumberModel ConfiguracionSpinner (){
 SpinnerNumberModel md = new  SpinnerNumberModel();
    md.setMaximum(4);
    md.setMinimum(0);
   return md;
}

public void ConfirguracionDiccionario(JTextArea a,JTextArea b,JTextArea c) {
    String sCarpAct,rutaBD;     File carpeta;   URL Burl;
    sCarpAct = System.getProperty("user.dir"); carpeta = new File(sCarpAct);   rutaBD =carpeta+"\\src\\";
    try {Burl= new URL(rutaBD);} catch (MalformedURLException ex) {Burl=null;}//----->Cierre
    SpellCheckerOptions sco=new SpellCheckerOptions();    
    SpellChecker.setUserDictionaryProvider(new FileUserDictionary());
    SpellChecker.registerDictionaries(Burl,null);
    SpellChecker.register(a);SpellChecker.register(b);SpellChecker.register(c);
    sco.setCaseSensitive(true);
    sco.setSuggestionsLimitMenu(10);    
    JPopupMenu popup = SpellChecker.createCheckerPopup(sco);
         a.addMouseListener(new PopupListener(popup));
         b.addMouseListener(new PopupListener(popup));
         c.addMouseListener(new PopupListener(popup));      
    }


}