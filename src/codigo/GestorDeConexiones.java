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
    //INSERTAR PELICULA
    public void insertarPelicula(String id_Pelicula, String nombre_Pelicula, String genero_Pelicula, String director_Pelicula, String duracion_Pelicula) {
        Statement sta;
        try {
            sta = conexion.createStatement();
            sta.executeUpdate("INSERT INTO pelicula(id_Pelicula, nombre_Pelicula, genero_Pelicula, director_Pelicula,duracion_Pelicula)"
                    + " VALUES(" + id_Pelicula + ", '" + nombre_Pelicula + "', '" + genero_Pelicula + "', '" + director_Pelicula + "', '" + duracion_Pelicula + "');");
            sta.close();

        } catch (SQLException ex) {
            System.out.println(ex.toString());
            System.out.println("Error al insertar Pelicula");
        }
    }

    //INSERTAR CRITICA
    public void insertarCritica(String id_Critica, String texto_Critica, String puntuacion_Critica) {
        Statement sta;
        try {
            sta = conexion.createStatement();
            sta.executeUpdate("INSERT INTO critica(id_Critica, texto_Critica, puntuacion_Critica)"
                    + " VALUES(" + id_Critica + ", '" + texto_Critica + "', '" + puntuacion_Critica + "');");
            sta.close();

        } catch (SQLException ex) {
            System.out.println(ex.toString());
            System.out.println("Error al insertar Critica");
        }
    }
    
     //INSERTAR CRITICO
    public void insertarCritico(String id_Critico, String nombre_Critico, String id_Critico_Critica) {
        Statement sta;
        try {
            sta = conexion.createStatement();
            sta.executeUpdate("INSERT INTO critico(id_Critico, nombre_Critico, id_Critico_Critica)"
                    + " VALUES(" + id_Critico + ", '" + nombre_Critico + "', '" + id_Critico_Critica + "');");
            sta.close();

        } catch (SQLException ex) {
            System.out.println(ex.toString());
            System.out.println("Error al insertar Critico");
        }
    }
    //METODO PARA DAR DE BAJA EN LA BBDD
     //ELIMINAR PELICULA
    public void eliminarPelicula(String id_Pelicula) {
        Statement sta;
        try {
            sta = conexion.createStatement();
            sta.executeUpdate("DELETE FROM pelicula WHERE id_Pelicula = " + id_Pelicula + ";");
            sta.close();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            System.out.println("Error al eliminar película.");
        }
    }
    
       //ELIMINAR CRITICA
    public void eliminarCritica(String id_Critica) {
        Statement sta;
        try {
            sta = conexion.createStatement();
            sta.executeUpdate("DELETE FROM critica WHERE id_Critica = " + id_Critica + ";");
            sta.close();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            System.out.println("Error al eliminar Critica.");
        }
    }
    
       //ELIMINAR CRITICO HACE FALTA CASCADA POR FOREIGN KEY
    public void eliminarCritico(String id_Critico) {
        Statement sta;
        try {
            sta = conexion.createStatement();
            sta.executeUpdate("DELETE FROM critico WHERE id_Critico = " + id_Critico + ";");
            sta.close();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            System.out.println("Error al eliminar Critico.");
        }
    }

}
