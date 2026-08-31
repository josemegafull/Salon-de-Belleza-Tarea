package com.tarea2026.logica;

import com.tarea2026.modelos.Cliente;
import com.tarea2026.modelos.Enlaces;
import com.tarea2026.modelos.Profesional;
import com.tarea2026.modelos.Servicio;
import java.awt.HeadlessException;  import java.io.BufferedReader;      import java.io.BufferedWriter;
import java.io.File;                import java.io.FileReader;          import java.io.FileWriter;
import java.io.IOException;         import java.sql.Connection;         import java.sql.Statement;
import java.sql.ResultSet;          import java.sql.PreparedStatement;  import java.sql.SQLException;       
import java.text.ParseException;    import java.text.SimpleDateFormat;
import java.util.Date;              import java.util.List;              
import javax.swing.JOptionPane;
//import javax.swing.JOptionPane;
/**
 *
 * @author Jose Cambisaca Baquerizo
 */
public class ModeloBD {
String SQL ="";
Conexion conectar =new Conexion(); Objetos IN=new Objetos(); MControles VC = new MControles();
Connection conl = null;     Statement sent = null;  ResultSet rst= null;   PreparedStatement sta = null;
int valact[],suma[],valing[];

/*------------------------------------------------------------------------------  
                   Codigo para cargar los empleados registrados
  ------------------------------------------------------------------------------*/     
public String CARGAREMPLEADOS (){
String resp="";  String Rempleado []=new String[9];
try {
   conl=conectar.getConectar();     SQL =" Select * From EMPLEADOS";
   sent = conl.createStatement();   rst =sent.executeQuery(SQL);
    while (rst.next()){
        Rempleado[0]=rst.getString("Cedula");   Rempleado[1]=rst.getString("Nombres");
        Rempleado[2]=rst.getString("Telefono"); Rempleado[3]=rst.getString("Correo");
        Rempleado[4]=rst.getString("Especialidad");
        IN.AGEmpleados(new Profesional(Rempleado[0],Rempleado[1], Rempleado[2], Rempleado[3],Rempleado[4]));
    }
}catch (NumberFormatException | SQLException e ){
    resp=e.getMessage();
}
return resp;
}

/*-------------------------------------------------------------------------------------------  
                            Guardar el registro de un nuevo empleado
---------------------------------------------------------------------------------------------*/
public String INempleado(String bus){
int n;  String operacion="";
String[] registro = new String[10];
try {
    conl= conectar.getConectar();   sent = conl.createStatement();
    SQL = " INSERT INTO EMPLEADOS(Cedula,Nombres,Telefono,Correo,Especialidad)VALUES(?,?,?,?,?)";
    sta= conl.prepareCall(SQL);
        for (int i = 0; i < Objetos.PRO.size(); i++) {
            Profesional remp = Objetos.PRO.get(i);
            if(remp.getCedula().equals(bus)){
                registro[0] = remp.getCedula(); registro[1] = remp.getNombre();
                registro[2] = remp.getTelefono();  registro[3] = remp.getCorreo(); registro[4] = remp.getEspecialidad();
                sta.setString(1,registro[0]);sta.setString(2,registro[1]);
                sta.setString(3, registro[2]);sta.setString(4,registro[3]);  sta.setString(5,registro[4]);
                n = sta.executeUpdate();
                 if(n>0){operacion = "";}
              }
        } 
} catch (NumberFormatException | SQLException e) {
    operacion=e.getMessage();
}              
return operacion;
}
/*-------------------------------------------------------------------------------------------  
                      Guardar el registro editado de un empleado
---------------------------------------------------------------------------------------------*/
public String EDempleado(String bus){
int n;  String operacion="";
String[] registro = new String[10];
try {
    conl= conectar.getConectar();   sent = conl.createStatement();
    SQL = " update EMPLEADOS set Nombres = ?,Telefono = ?,Correo = ?,Especialidad = ? where cedula = ?";
    sta= conl.prepareCall(SQL);
        for (int i = 0; i < Objetos.PRO.size(); i++) {
            Profesional remp = Objetos.PRO.get(i);
            if(remp.getCedula().equals(bus)){
                registro[0] = remp.getCedula(); registro[1] = remp.getNombre();
                registro[2] = remp.getTelefono(); registro[3] = remp.getCorreo(); 
                registro[4] = remp.getEspecialidad();
                sta.setString(1,registro[1]);   sta.setString(2,registro[2]);   sta.setString(3,registro[3]);   
                sta.setString(4,registro[4]);   sta.setString(5,registro[0]);
                n = sta.executeUpdate();
                if(n>0){operacion ="";}
            }
        } 
} catch (NumberFormatException | SQLException e) {
    operacion=e.getMessage();
}              
  return operacion;
}
/*-------------------------------------------------------------------------------------------  
                      Eliminar el registro de un empleado
---------------------------------------------------------------------------------------------*/
public String eliminaremp(String bus){
int n;  String operacion="";
String[] registro = new String[3];
try {
    conl= conectar.getConectar();   sent = conl.createStatement();
    SQL = " delete from EMPLEADOS where cedula = ?";
    sta= conl.prepareCall(SQL);
        for (int i = 0; i < Objetos.PRO.size(); i++) {
            Profesional remp = Objetos.PRO.get(i);
                if(remp.getCedula().equals(bus)){
                    registro[0] = remp.getCedula();
                    sta.setString(1,registro[0]);
        n = sta.executeUpdate();
        if(n>0){
        operacion = "completada";
     }
   }
} 
}catch (NumberFormatException | SQLException e) {
  operacion=e.getMessage();
}              
return operacion;
}

/*------------------------------------------------------------------------------  
                   Codigo para cargar los empleados cliente
  ------------------------------------------------------------------------------*/     
public String CARGARCLIENTES (){
String resp="";  String Rcliente []=new String[8];
try {
   conl=conectar.getConectar();     SQL =" Select * From CLIENTES";
   sent = conl.createStatement();   rst =sent.executeQuery(SQL);
    while (rst.next()){
        Rcliente[0]=rst.getString("Idcliente"); Rcliente[1]=rst.getString("Cedula");   
        Rcliente[2]=rst.getString("Nombres");   Rcliente[3]=rst.getString("Telefono"); 
        Rcliente[4]=rst.getString("Correo");    Rcliente[5]=rst.getString("Tipo");
        switch (Rcliente[5]) {

                case "Nuevo" -> IN.AGCliente(new ClienteNuevo(Rcliente[0],Rcliente[1],Rcliente[2],Rcliente[3],Rcliente[4]));

                case "Regular" -> IN.AGCliente(new ClienteRegular(
                            Rcliente[0],Rcliente[1],Rcliente[2],Rcliente[3],Rcliente[4]));

                case "VIP" -> IN.AGCliente(new ClienteVIP(Rcliente[0],Rcliente[1],Rcliente[2],Rcliente[3],Rcliente[4]));
            }      
    }
}catch (NumberFormatException | SQLException e ){
    resp=e.getMessage();
}
return resp;
}

/*-------------------------------------------------------------------------------------------  
                            Guardar el registro de un nuevo cliente
---------------------------------------------------------------------------------------------*/
public String INCliente(String bus){
int n;  String operacion="";
String[] registro = new String[10];
try {
    conl= conectar.getConectar();   sent = conl.createStatement();
    SQL = " INSERT INTO CLIENTES(IdCliente,Cedula,Nombres,Telefono,Correo,Tipo)VALUES(?,?,?,?,?,?)";
    sta= conl.prepareCall(SQL);
        for (int i = 0; i < Objetos.CLI.size(); i++) {
            Cliente remp = Objetos.CLI.get(i);
            if(remp.getCedula().equals(bus)){
                registro[0] = remp.getIdcliente();
                registro[1] = remp.getCedula(); registro[2] = remp.getNombre();
                registro[3] = remp.getTelefono();  registro[4] = remp.getCorreo();
                registro[5] = remp.getTipo();
                sta.setString(1,registro[0]);sta.setString(2,registro[1]);
                sta.setString(3, registro[2]);sta.setString(4,registro[3]);  sta.setString(5,registro[4]);
                sta.setString(6,registro[5]);
                n = sta.executeUpdate();
                 if(n>0){operacion = "";}
              }
        } 
} catch (NumberFormatException | SQLException e) {
    operacion=e.getMessage();
}              
return operacion;
}
/*-------------------------------------------------------------------------------------------  
                      Guardar el registro editado de un cliente
---------------------------------------------------------------------------------------------*/
public String EDCliente(String bus){
int n;  String operacion="";
String[] registro = new String[10];
try {
    conl= conectar.getConectar();   sent = conl.createStatement();
    SQL = " update CLIENTES set IdCliente = ?,Nombres = ?,Telefono = ?,Correo = ?,Tipo = ? where cedula = ?";
    sta= conl.prepareCall(SQL);
        for (int i = 0; i < Objetos.CLI.size(); i++) {
            Cliente remp = Objetos.CLI.get(i);
            if(remp.getCedula().equals(bus)){
                registro[0] = remp.getIdcliente();
                registro[1] = remp.getCedula(); registro[2] = remp.getNombre();
                registro[3] = remp.getTelefono(); registro[4] = remp.getCorreo(); 
                registro[5] = remp.getTipo();
                
                //JOptionPane.showMessageDialog(null,remp.getCedula()+" "+bus+" "+registro[0]+registro[1]+registro[2]+registro[3]+registro[4]+registro[5]);
                sta.setString(1,registro[0]);   sta.setString(2,registro[2]);   sta.setString(3,registro[3]);   
                sta.setString(4,registro[4]);   sta.setString(5,registro[5]);   sta.setString(6,registro[1]);
                n = sta.executeUpdate();
                if(n>0){operacion ="";}
            }
        } 
} catch (NumberFormatException | SQLException e) {
    operacion=e.getMessage();
}              
  return operacion;
}
/*-------------------------------------------------------------------------------------------  
                      Eliminar el registro de un cliente
---------------------------------------------------------------------------------------------*/
public String ELICliente(String bus){
int n;  String operacion="";
String[] registro = new String[3];
try {
    conl= conectar.getConectar();   sent = conl.createStatement();
    SQL = " delete from CLIENTES where cedula = ?";
    sta= conl.prepareCall(SQL);
        for (int i = 0; i < Objetos.CLI.size(); i++) {
            Cliente remp = Objetos.CLI.get(i);
                if(remp.getCedula().equals(bus)){
                    registro[0] = remp.getCedula();
                    sta.setString(1,registro[0]);
        n = sta.executeUpdate();
        if(n>0){
        operacion = "completada";
     }
   }
} 
}catch (NumberFormatException | SQLException e) {
  operacion=e.getMessage();
}              
return operacion;
}

/*------------------------------------------------------------------------------  
                   Codigo para cargar los Servicios
  ------------------------------------------------------------------------------*/     
public String CARGARSERVICOS (){
String resp="";  String RServicios []=new String[9];
try {
   conl=conectar.getConectar();     SQL =" Select * From SERVICIOS";
   sent = conl.createStatement();   rst =sent.executeQuery(SQL);
    while (rst.next()){
        RServicios[0]=rst.getString("codigo");
        RServicios[1]=rst.getString("nombre");   RServicios[2]=rst.getString("descripcion");
        RServicios[3]=rst.getString("precio"); RServicios[4]=rst.getString("duracion");
        IN.AGSerivio(new Servicio(RServicios[0],RServicios[1], RServicios[2], Double.parseDouble(RServicios[3]),Double.parseDouble(RServicios[4])));
    }
}catch (NumberFormatException | SQLException e ){
    resp=e.getMessage();
}
return resp;
}

/*-------------------------------------------------------------------------------------------  
                            Guardar el registro de un nuevo Servicios
---------------------------------------------------------------------------------------------*/
public String INServicio(String bus){
int n;  String operacion="";
String[] registro = new String[10];
try {
    conl= conectar.getConectar();   sent = conl.createStatement();
    SQL = " INSERT INTO SERVICIOS(codigo,nombre,descripcion,precio,duracion)VALUES(?,?,?,?,?)";
    sta= conl.prepareCall(SQL);
        for (int i = 0; i < Objetos.SERV.size(); i++) {
            Servicio remp = Objetos.SERV.get(i);
            if(remp.getCodigo().equals(bus)){
                registro[0] = remp.getCodigo();
                registro[1] = remp.getNombre(); registro[2] = remp.getDescripcion();
                registro[3] = remp.getPrecio()+"";  registro[4] = remp.getDuracion()+""; 
                sta.setString(1,registro[0]);sta.setString(2,registro[1]);
                sta.setString(3, registro[2]);sta.setDouble(4,Double.parseDouble(registro[3]));  
                sta.setDouble(5,Double.parseDouble(registro[4]));
                n = sta.executeUpdate();
                 if(n>0){operacion = "";}
              }
        } 
} catch (NumberFormatException | SQLException e) {
    operacion=e.getMessage();
}              
return operacion;
}
/*-------------------------------------------------------------------------------------------  
                      Guardar el registro editado de un Servicios
---------------------------------------------------------------------------------------------*/
public String EDServicio(String cod){
   
int n;  String operacion="";
String[] registro = new String[10];
try {
    conl= conectar.getConectar();   sent = conl.createStatement();
    SQL = " update SERVICIOS set nombre = ?,descripcion = ?,precio = ?,duracion = ? where codigo = ?";
    sta= conl.prepareCall(SQL);
        for (int i = 0; i < Objetos.SERV.size(); i++) {
            Servicio remp = Objetos.SERV.get(i);
            if(remp.getCodigo().equals(cod)){
                registro[0] = remp.getCodigo();
                registro[1] = remp.getNombre(); registro[2] = remp.getDescripcion();
                registro[3] = remp.getPrecio()+""; registro[4] = remp.getDuracion()+"";
               
                sta.setString(1,registro[1]);   sta.setString(2,registro[2]);   sta.setDouble(3,Double.parseDouble(registro[3]));   
                sta.setDouble(4,Double.parseDouble(registro[4]));  sta.setString(5,registro[0]);
                n = sta.executeUpdate();
                if(n>0){operacion ="";}
            }
        } 
} catch (NumberFormatException | SQLException e) {
    operacion=e.getMessage();
}              
  return operacion;
}
/*-------------------------------------------------------------------------------------------  
                      Eliminar el registro de un Servicios
---------------------------------------------------------------------------------------------*/
public String ELIServicio(String bus){
int n;  String operacion="";
String[] registro = new String[3];
try {
    conl= conectar.getConectar();   sent = conl.createStatement();
    SQL = " delete from SERVICIOS where codigo = ?";
    sta= conl.prepareCall(SQL);
        for (int i = 0; i < Objetos.SERV.size(); i++) {
            Servicio remp = Objetos.SERV.get(i);
                if(remp.getCodigo().equalsIgnoreCase(bus)){
                    registro[0] = remp.getCodigo();
                    sta.setString(1,registro[0]);
        n = sta.executeUpdate();
        if(n>0){
        operacion = "completada";
     }
   }
} 
}catch (NumberFormatException | SQLException e) {
  operacion=e.getMessage();
}              
return operacion;
}



private java.sql.Date TranformaciondeFechas (String Vfecha){
  Date fecha;  java.sql.Date Nvfecha = null;
  SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
    try {
        fecha = formato.parse(Vfecha);
        long timeInMilliSeconds = fecha.getTime();
        Nvfecha = new java.sql.Date(timeInMilliSeconds);
    } catch (ParseException ex) {
        Nvfecha=null; 
    }   
return Nvfecha;
}


public String CREARTABLA (String nomb){
String respuesta = ""; int n ;
String b[]=nomb.split(" ");
try {
    conl= conectar.getConectar();   sent = conl.createStatement();
    switch(b[0].toLowerCase()){
    case "suministro":
        //JOptionPane.showMessageDialog(null, nomb);
        SQL = "CREATE TABLE ["+nomb+"](CODIGO VARCHAR(250),DETALLE VARCHAR(500),PEDIDO INT,"
        + "PRECIO DECIMAL,BODEGA INT,FALTANTE INT,KARDEX INT,MEDIDA VARCHAR(50),FECHA DATETIME)";
    break;            
    case "activo":
       //JOptionPane.showMessageDialog(null, nomb);
       SQL = "CREATE TABLE ["+nomb+"](ID INT,FACTURA VARCHAR(250),FECHA DATETIME,CODIGO VARCHAR(255),DESCRIPCION VARCHAR(300),"
               + " CANTIDAD INT,PUNITARIO DECIMAL,UBICACION VARCHAR(50),VIDAUTIL INT,CUSTODIO VARCHAR(500),"
               + " CARGO VARCHAR(500),OBSERVACIONES VARCHAR(500))";  
    break; 
     }
    sta=conl.prepareStatement(SQL);
    n=sta.executeUpdate();
     if(n==0){
       respuesta="";
   }
}catch (HeadlessException|SQLException e){
    respuesta=e.getMessage();
}
    return respuesta; 
}
public String Registrartabla(String nom,String cod,String fecha){
 SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
 Date fech; String respuesta="";    int n;
 try {
 fech = formato.parse(fecha);
 long timeInMilliSeconds = fech.getTime();
 java.sql.Date date = new java.sql.Date(timeInMilliSeconds);
       conl= conectar.getConectar();    sent = conl.createStatement();
       SQL = " INSERT INTO PARTIDA(CODIGO,DESCRIPCION,FECHA)VALUES(?,?,?)";
       sta= conl.prepareStatement(SQL);     sta.setString(1,cod);   sta.setString(2,nom); sta.setDate(3, date);
       n = sta.executeUpdate();
        if(n>0){respuesta = "";} 
    } catch (SQLException |ParseException e) {
        respuesta=e.getMessage();
    }        
    return respuesta;
}
public static void Conectar (List<Enlaces> Lista) {
 String rutaBD,sCarpAct;  File carpeta;   BufferedWriter escr;
    try {
          sCarpAct = System.getProperty("user.dir");    carpeta = new File(sCarpAct);   rutaBD=carpeta+"\\src\\CN.txt";
          escr=new BufferedWriter(new FileWriter(rutaBD));
          for(Enlaces en: Lista){   escr.write(en.getEnlace()+"\t"+en.getEnIm1()+"\t"+en.getEnIm2()+"\t"+en.getEnNEMP());}//---------->cierre
          escr.close();
    } catch (IOException e) {
        
    }
}
 public static void LeerEnlaces () {
    String sCarpAct,rutaBD,linea=""; File carpeta=null, folder; BufferedReader leer; Objetos OB=new Objetos();
     try {
         sCarpAct = System.getProperty("user.dir"); carpeta = new File(sCarpAct);   rutaBD =carpeta+"\\src\\CN.txt";
         leer=new BufferedReader(new FileReader(rutaBD));
         if ((linea=leer.readLine())!=null) { String[]enlaces =linea.split("\t");
         //JOptionPane.showMessageDialog(null, enlaces.length);
            switch(enlaces.length){  
                    case 0: OB.AGEnlace(new Enlaces("vacio","vacio","vacio","vacio"));break;
                    case 1: OB.AGEnlace(new Enlaces(enlaces[0],"vacio","vacio","vacio"));break;
                    case 2: OB.AGEnlace(new Enlaces(enlaces[0],enlaces[1],enlaces[2],"vacio"));break;
                    case 3: OB.AGEnlace(new Enlaces(enlaces[0],enlaces[1],enlaces[2],"vacio"));break;
                    case 4: OB.AGEnlace(new Enlaces(enlaces[0],enlaces[1],enlaces[2],enlaces[3]));break;
            }
            if(enlaces.length>=5){
                if (Objetos.ENL.isEmpty()){
                    OB.AGEnlace(new Enlaces(enlaces[0],enlaces[1],enlaces[2],enlaces[3]));
                }
                if (Objetos.ENL.size()>=0){
                    OB.LMPEnlace();
                    OB.AGEnlace(new Enlaces(enlaces[0],enlaces[1],enlaces[2],enlaces[3]));
                }
                Conectar(Objetos.ENL);
            }
        }
        /*
        }**/
         leer.close();
    } catch (ArrayIndexOutOfBoundsException|IOException e) {
        rutaBD=carpeta+"\\src"; folder = new File(rutaBD);  if(!folder.exists()){folder.mkdir();}//------->Cierre 
            OB.AGEnlace(new Enlaces("vacio","vacio","vacio","vacio"));     Conectar(Objetos.ENL);
    }
        
}
}
