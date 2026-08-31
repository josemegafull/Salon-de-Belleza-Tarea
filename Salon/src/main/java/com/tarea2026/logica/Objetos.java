package com.tarea2026.logica;


import com.tarea2026.modelos.Citas;
import com.tarea2026.modelos.Cliente;
import com.tarea2026.modelos.Despachos;
import com.tarea2026.modelos.Profesional;
import com.tarea2026.modelos.Servicio;
import com.tarea2026.modelos.Enlaces;
import javax.swing.table.TableRowSorter;
import java.util.ArrayList;import java.util.Arrays;
             import javax.swing.table.DefaultTableModel;
import java.util.List;              
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;          
import org.apache.commons.lang3.text.WordUtils;
                  



/**
 *
 * @author Jose Cambisaca Baquerizo
 */
public class Objetos {
//VARIOSCONTROLES VC= new VARIOSCONTROLES();
public static List<Profesional> PRO = new ArrayList<Profesional>();
public static List<Citas>    CITA = new ArrayList<Citas>();
public static List<Cliente>  CLI = new ArrayList<Cliente>();
public static List<Servicio>    SERV = new ArrayList<Servicio>();
public static List<Enlaces> ENL = new ArrayList<Enlaces>();
public static List<Despachos> DTCMP = new ArrayList<Despachos>();

public Objetos() {
}


/*------------------------------------------------------------------------------  
       Codigo para agregare modidicar e elimanar datos de las distintas listas  
  ------------------------------------------------------------------------------ */

//------------------------- Lista Profesional ---------------------------------------
public void AGEmpleados (Profesional op){                       
   PRO.add(op);
}
public void EDEmpleados(Profesional op,int pos ){
    PRO.set(pos, op);
}
public void ELEmpleados(int pos){
    PRO.remove(pos);
}
public void LMPEmpleados(){
    PRO.clear();
}
//------------------------------- CLIENTE ------------------------------------------            
public void AGCliente (Cliente op){                        
   CLI.add(op);
}
public void EDCliente(Cliente op,int pos ){
    CLI.set(pos, op);
}
public void ELCliente(int pos){
    CLI.remove(pos);
}
public void LMPCliente(){
    CLI.clear();
}
//------------------------------- CITAS ------------------------------------------
public void AGCita (Citas op){                        
   CITA.add(op);
}
public void EDCita(Citas op,int pos ){
    CITA.set(pos, op);
}
public void ELCita(int pos){
    CITA.remove(pos);
}
public void LMPCita(){
    CITA.clear();
}
//------------------------------- SERVICIOS ------------------------------------------
public void AGSerivio (Servicio op){                        
   SERV.add(op);
}
public void EDSerivio(Servicio op,int pos ){
    SERV.set(pos, op);
}
public void ELSerivio(int pos){
    SERV.remove(pos);
}
public void LMPSerivio(){
    SERV.clear();
}
//------------------------------- Enlaces ------------------------------------------
public void AGEnlace (Enlaces op){                    // Lista de Usuarios
  ENL.add(op);  
}
public void EDEnlace(Enlaces op, int pos){
   ENL.set(pos,op);
}
public void ELEnlace(int pos){
    ENL.remove(pos);
}
public void LMPEnlace(){                                      
    ENL.clear();
}
public void AGDespEgProductos (Despachos op){                       //Lista de productos 
    DTCMP.add(op);
}
public void LMPDespEgProductos(){
    DTCMP.clear();
}
public void EDDespEgProductos(Despachos op,int pos){
    DTCMP.set(pos, op);
}
public void ELDespEgProductos (int pos){
    DTCMP.remove(pos);
}


/*-----------------------------------------------------------------------------  
                      Codigo para el modelo de tablas 
  ----------------------------------------------------------------------------- */
//------------------------------------------------------------------------------------------------------------    
public DefaultTableModel MostrartablaEmpleados(JTable jt) {                                      //Modelo de la tabla empleados
String[] titulos = {"CEDULA","NOMBRE","TELEFONO","CORREO","ESPECIALIDAD"};
String[] registro = new String[7];
DefaultTableModel modelo = new DefaultTableModel(null, titulos) {     
    @Override
    public boolean isCellEditable(int row, int column) {
    return false;
    }
};
TableRowSorter <DefaultTableModel> sorter = new TableRowSorter<>(modelo);
jt.setAutoCreateRowSorter(true);
jt.setRowSorter(sorter);

    for(int i=0;i<PRO.size();i++){
        Profesional remp = PRO.get(i);
          
            registro[0] = remp.getCedula();
            registro[1] = remp.getNombre();
            registro[2] = remp.getTelefono();
            registro[3] = remp.getCorreo();
            registro[4] = remp.getEspecialidad();
            modelo.addRow(registro);
        }
    return modelo;
}


public DefaultTableModel MostrartablaDespachos(String op) {                                   //Modelo de la tabla productos egresados (revisar uso)              
String [] registro = new String[15];
DefaultTableModel modelo =null;
switch(op.toLowerCase()){
    case "suministro":
        String[] titulos = {"N°","CITA","CODIGO","NOMBRE","DESCRIPCION","PRECIO"};
        modelo= new DefaultTableModel(null, titulos) {     
            @Override   public boolean isCellEditable(int row, int column) { return false;}
        };
        for(int i=0;i<DTCMP.size();i++){
        Despachos remp = DTCMP.get(i);
            registro[0] =(i+1)+"";
            registro[1] = remp.getScodigo();
            registro[2] = remp.getCodigo();
            registro[3] = remp.getDetalle();
            registro[4] = remp.getMedida();
            registro[5] = remp.getPrecio()+"";
            modelo.addRow(registro);
        }
    break;
    case "activo":
         
    break;
     case "control":
        
  }
    return modelo;
} 















public DefaultTableModel MostrartablaClientes(JTable jt) {                                      //Modelo de la tabla empleados
String[] titulos = {"ID CLIENTE","CEDULA","NOMBRE","TELEFONO","CORREO","TIPO"};
String[] registro = new String[7];
DefaultTableModel modelo = new DefaultTableModel(null, titulos) {     
    @Override
    public boolean isCellEditable(int row, int column) {
    return false;
    }
};
TableRowSorter <DefaultTableModel> sorter = new TableRowSorter<>(modelo);
jt.setAutoCreateRowSorter(true);
jt.setRowSorter(sorter);

    for(int i=0;i<CLI.size();i++){
        Cliente remp = CLI.get(i);
            registro[0] = remp.getIdcliente();
            registro[1] = remp.getCedula();
            registro[2] = remp.getNombre();
            registro[3] = remp.getTelefono();
            registro[4] = remp.getCorreo();
            registro[5] = remp.getTipo();
            modelo.addRow(registro);
        }
    return modelo;
}
 
public DefaultTableModel MostrartablaServicios(JTable jt) {                                      //Modelo de la tabla empleados
String[] titulos = {"CODIGO","NOMBRE","DESCRIPCION","PRECIO","DURACION"};
String[] registro = new String[7];
DefaultTableModel modelo = new DefaultTableModel(null, titulos) {     
    @Override
    public boolean isCellEditable(int row, int column) {
    return false;
    }
};
TableRowSorter <DefaultTableModel> sorter = new TableRowSorter<>(modelo);
jt.setAutoCreateRowSorter(true);
jt.setRowSorter(sorter);

    for(int i=0;i<SERV.size();i++){
        Servicio remp = SERV.get(i);
            registro[0] = remp.getCodigo();
            registro[1] = remp.getNombre();
            registro[2] = remp.getDescripcion();
            registro[3] = remp.getPrecio()+"";
            registro[4] = remp.getDuracion()+"";
            
            modelo.addRow(registro);
        }
    return modelo;
}
    public DefaultComboBoxModel TipoCliente(){                                         //Modelo de buscar por periodo
    //String[] lista= new String[1];
    String[] titulo= {"<<SELECCIONE>>","Nuevo","Regular","VIP"};
      DefaultComboBoxModel modelo = new DefaultComboBoxModel(titulo);{
         }
     return modelo;
    }
    public DefaultComboBoxModel EstadoCita(){                                         //Modelo de buscar por periodo
    //String[] lista= new String[1];
    String[] titulo= {"<<SELECCIONE>>","Pendiente","Confirmada","Cancelada","Atendida"};
      DefaultComboBoxModel modelo = new DefaultComboBoxModel(titulo);{
         }
     return modelo;
    }
    
    public DefaultComboBoxModel Clientes (){                                     //Modelo empleados para comprobante de egreso 
    String[] titulo= {"<<SELECCIONE>>"};

    String[] lista;
    String[] registro = new String[2];
    lista = new String[CLI.size()];
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(titulo);{
        }
          for(int i=0;i<CLI.size();i++){
              Cliente oe = CLI.get(i);
                registro[0] = oe.getNombre();
                lista[i]=WordUtils.capitalizeFully(registro[0].toLowerCase());
           }
            Arrays.sort(lista);
            for (String lista1 : lista) {
                modelo.addElement(lista1);
            }
        return modelo;
}
    public DefaultComboBoxModel Profesional (){                                     //Modelo empleados para comprobante de egreso 
    String[] titulo= {"<<SELECCIONE>>"};

    String[] lista;
    String[] registro = new String[2];
    lista = new String[PRO.size()];
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(titulo);{
        }
          for(int i=0;i<PRO.size();i++){
              Profesional oe = PRO.get(i);
                registro[0] = oe.getNombre();
                lista[i]=WordUtils.capitalizeFully(registro[0].toLowerCase());
           }
            Arrays.sort(lista);
            for (String lista1 : lista) {
                modelo.addElement(lista1);
            }
        return modelo;
}
       public DefaultComboBoxModel Servicio (){                                     //Modelo empleados para comprobante de egreso 
    String[] titulo= {"<<SELECCIONE>>"};

    String[] lista;
    String[] registro = new String[2];
    lista = new String[SERV.size()];
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(titulo);{
        }
          for(int i=0;i<SERV.size();i++){
              Servicio oe = SERV.get(i);
                registro[0] = oe.getNombre();
                lista[i]=WordUtils.capitalizeFully(registro[0].toLowerCase());
           }
            Arrays.sort(lista);
            for (String lista1 : lista) {
                modelo.addElement(lista1);
            }
        return modelo;
}
    

}
