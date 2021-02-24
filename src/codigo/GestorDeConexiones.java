/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
    public void insertarCritica(String id_Critica, String cod_critico, String critica_Nombre, String texto_Critica, String puntuacion_Critica) {
        Statement sta;
        try {
            sta = conexion.createStatement();
            sta.executeUpdate("INSERT INTO critica(id_Critica, cod_critico,critica_Nombre, texto_Critica, puntuacion_Critica)"
                    + " VALUES(" + id_Critica + ", '" + cod_critico + "', '" + critica_Nombre + "', '" + texto_Critica + "', '" + puntuacion_Critica + "');");
            sta.close();

        } catch (SQLException ex) {
            System.out.println(ex.toString());
            System.out.println("Error al insertar Critica");
        }
    }

    //INSERTAR CRITICO
    public void insertarCritico(String id_Critico, String nombre_Critico, String cod_Critico_Critica) {
        Statement sta;
        try {
            sta = conexion.createStatement();
            sta.executeUpdate("INSERT INTO critico(id_Critico, nombre_Critico, cod_Critico_Critica)"
                    + " VALUES(" + id_Critico + ", '" + nombre_Critico + "', '" + cod_Critico_Critica + "');");
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

            //sta.executeUpdate("DELETE FROM critico WHERE id_Critico_Critica= " + id_Critica + ";");
            sta.executeUpdate("DELETE FROM critica WHERE id_Critica = " + id_Critica + ";");

            sta.close();

        } catch (SQLException ex) {
            System.out.println(ex.toString());
            System.out.println("Error al eliminar Critica.");
        }
    }

    //ELIMINAR CRITICO HACE FALTA ELIMINAR CRITICAS ANTES POR FOREIGN KEY
    public void eliminarCritico(String cod_Critico_Critica) {
        Statement sta;
        try {
            sta = conexion.createStatement();

            sta.executeUpdate("DELETE FROM critica WHERE cod_critico = " + cod_Critico_Critica + ";");
            sta.executeUpdate("DELETE FROM critico WHERE cod_Critico_Critica = " + cod_Critico_Critica + ";");

            sta.close();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            System.out.println("Error al eliminar Critico.");
        }
    }

    //PREPARED STATEMENT
    public void cosulta_PreparedStatement(String cosaAConsultar) {
        String query = "SELECT * FROM pelicula WHERE director_Pelicula= ?;";

        try {
            PreparedStatement pst = conexion.prepareStatement(query);
            pst.setString(1, cosaAConsultar);

            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                System.out.println("ID: " + rs.getString("id_Pelicula")
                        + ", Titulo: " + rs.getString("nombre_Pelicula")
                        + ", Genero: " + rs.getString("genero_Pelicula")
                        + ", Director: " + rs.getString("director_Pelicula")
                        + ", Duracion: " + rs.getString("duracion_Pelicula"));
            }

            rs.close();
            pst.close();

        } catch (SQLException ex) {
            System.out.println(ex.toString());
            System.out.println("Error en el Prepared Statement.");
        }
    }

    //TRANSACCIONES
    public void insertarConCommit() {
        Statement sta;
        try {
            conexion.setAutoCommit(false);

            sta = conexion.createStatement();

            sta.executeUpdate("INSERT INTO pelicula VALUE ('1', 'JAWS', 'Suspense', 'Spielberg', '140 min');");
            sta.executeUpdate("INSERT INTO pelicula VALUE ('2', 'JAWS 2', 'Suspense', 'Spielberg', '148 min');");
            sta.executeUpdate("INSERT INTO pelicula VALUE ('3', 'JAWS 3', 'Suspense', 'Spielberg', '150 min');");

            sta.close();

            conexion.commit();

        } catch (SQLException ex) {
            System.out.println(ex.toString());
            System.out.println("Error en el InsertConCommit.");

            if (conexion != null) {
                try {
                    conexion.rollback();
                } catch (SQLException ex1) {
                    System.out.println(ex1.toString());
                    System.out.println("Error en el InsertConCommit.");

                }
            }
        }
    }

    //EDITAR DATOS DE LA BBDD
    //CRITICO, SOLO SE PUEDE CAMBIAR EL NOMBRE Y EL ID DE LA CRITICA SI SE PUEDE
    public void editarCritico(String nombre_Critico, String cod_Critico_Critica) {
        Statement sta;
        try {

            conexion.setAutoCommit(false);
            sta = conexion.createStatement();

            sta.executeUpdate("UPDATE critico SET nombre_Critico = '" + nombre_Critico
                    + "', cod_Critico_Critica = '"
                    + cod_Critico_Critica + ";");

            sta.close();

            conexion.commit();

        } catch (Exception ex) {
            System.out.println(ex.toString());
            System.out.println("Error al actualizar critico.");
            if (conexion != null) {
                try {
                    conexion.rollback();
                } catch (SQLException ex1) {
                    System.out.println(ex1.toString());
                    System.out.println("Error al actualizar critico.");
                }
            }
        }
    }
    //PARA PODER EDITAR Y AUTOCOMPLETAR CAMPOS
}
