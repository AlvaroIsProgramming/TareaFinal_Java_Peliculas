/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author aghsk
 */
public class GestorDeConexiones {

    Connection conexion = null;

    public GestorDeConexiones() {
        //Se establece la conexion pero no te conectas aún (SET)
        BasicDataSource bdSource = new BasicDataSource();
        bdSource.setUrl("jdbc:mysql://localhost:3306/peliculas?serverTimezone=UTC");
        bdSource.setUsername("root");
        bdSource.setPassword("");
        try {
            conexion = bdSource.getConnection();
            if (conexion != null) {
                System.out.println("Conexion creada");
            } else {
                System.out.println("Conexion no creada");
            }
        } catch (Exception e) {
            System.err.println("Error");
        }
    }

    //Metodo para conectarte a la BBDD
    public void conection() {
        try {
            String url = "jdbc:mysql://localhost:3306/peliculas?serverTimezone=UTC";
            String user = "root";
            String password = "";

            conexion = DriverManager.getConnection(url, user, password);
            if (conexion != null) {
                System.out.println("Conectado con exito a Peliculas!");
            }

        } catch (Exception e) {
            System.out.println("Error en la conexion");
        }
    }

    //Metodo para desconectarte de la BBDD
    public void cerrarConexion() {
        try {
            conexion.close();
            System.out.println("Desconectado de Peliculas");
        } catch (SQLException ex) {
            System.out.println("Error en la desconexión");
        }
    }
    //MOSTRAR TABLAS
    //MOSTRAR TABLAS
    public ResultSet mostrarTabla(String query) {
        Statement sta;
        ResultSet rs = null;
        try {
            sta = conexion.createStatement();
            rs = sta.executeQuery(query);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return rs;
    }

    //METODO PARA DE ALTA EN LA BBDD
    //METODO PARA DAR DE BAJA EN LA BBDD
}
