package com.tarea2026.logica;
/**
 * @author Jose Cambisaca 
 */
import com.tarea2026.formulario.Central;


import com.tarea2026.modelos.Enlaces;
import java.awt.HeadlessException;      import java.sql.*;                      import java.sql.Connection;
import java.sql.Statement;              import java.sql.ResultSet;              import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
   Connection conectar=null;    Statement sentencia=null;       ResultSet resultado=null;
public Conexion() {
String[] registro = new String[5];
    try {
    //String sCarpAct = System.getProperty("user.dir");
    ModeloBD.LeerEnlaces();
    for (int i = 0; i < Objetos.ENL.size(); i++) {
        Enlaces remp = Objetos.ENL.get(i);  registro[0] = remp.getEnlace();
    }
    String url = "jdbc:ucanaccess://"+registro[0];
    conectar=DriverManager.getConnection(url);
    sentencia=conectar.createStatement();
}catch (HeadlessException | SQLException e){
    JOptionPane.showMessageDialog(null,"Error al conectar la base de datos \n "+e.getMessage()+"\n Este error se produce cuando:"
    +"\n  > Se cambio el nombre de la base de datos. \n  > Se movio la base de datos de la carpeta raiz. \n  > Se elimino la base de datos de la carpeta raiz."
    +"\nSolucion: \n - En la siguiente ventana busque la base de datos para poder actualizar el Url de la Ubicacion");
    Central abriforms = new Central();
    abriforms.setVisible(true);

    javax.swing.SwingUtilities.invokeLater(() -> {
        abriforms.mostrarReconexion();
    });
}
    
} 

public Connection getConectar() {
    return conectar;
}

public Statement getSentencia() {
    return sentencia;
}

public ResultSet getResultado() {
    return resultado;
}
}