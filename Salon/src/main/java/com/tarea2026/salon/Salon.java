/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.tarea2026.salon;

import com.tarea2026.formulario.Central;
import com.tarea2026.logica.Conexion;
import java.sql.Connection;

/**
 *
 * @author JoseCambisaca
 */
public class Salon {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
              Conexion CN =new Conexion();Connection con= CN.getConectar();
              if(con != null){ new Central().setVisible(true);}//------->Cierre
        });
    }
}
