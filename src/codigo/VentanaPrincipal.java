/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aghsk
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    //PARA ACCEDER A LOS METODOS DE GESTORDECONEXIONES
    GestorDeConexiones manager = new GestorDeConexiones();

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        manager.conection();

        //MOSTRAR TABLAS
        mostrarTablaPelicula();
        mostrarTablaCritica();
        mostrarTablaCritico();

        //WINDOWS LISTENER QUE DETECTA CUANDO SE CIERRA LA VENTANA 
        //SI SE CIERRA TE DESCONECTAS DE LA BBDD
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                manager.cerrarConexion();
                System.exit(0);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane = new javax.swing.JTabbedPane();
        jPanelPeliculas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePeliculas = new javax.swing.JTable();
        jPanelCriticas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCriticas = new javax.swing.JTable();
        jPanelCriticos = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableCriticos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTablePeliculas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTablePeliculas);

        javax.swing.GroupLayout jPanelPeliculasLayout = new javax.swing.GroupLayout(jPanelPeliculas);
        jPanelPeliculas.setLayout(jPanelPeliculasLayout);
        jPanelPeliculasLayout.setHorizontalGroup(
            jPanelPeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPeliculasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 873, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelPeliculasLayout.setVerticalGroup(
            jPanelPeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPeliculasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Peliculas", jPanelPeliculas);

        jTableCriticas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTableCriticas);

        javax.swing.GroupLayout jPanelCriticasLayout = new javax.swing.GroupLayout(jPanelCriticas);
        jPanelCriticas.setLayout(jPanelCriticasLayout);
        jPanelCriticasLayout.setHorizontalGroup(
            jPanelCriticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCriticasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 873, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelCriticasLayout.setVerticalGroup(
            jPanelCriticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCriticasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(202, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Criticas", jPanelCriticas);

        jTableCriticos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTableCriticos);

        javax.swing.GroupLayout jPanelCriticosLayout = new javax.swing.GroupLayout(jPanelCriticos);
        jPanelCriticos.setLayout(jPanelCriticosLayout);
        jPanelCriticosLayout.setHorizontalGroup(
            jPanelCriticosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCriticosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 873, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelCriticosLayout.setVerticalGroup(
            jPanelCriticosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCriticosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(262, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Criticos", jPanelCriticos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanelCriticas;
    private javax.swing.JPanel jPanelCriticos;
    private javax.swing.JPanel jPanelPeliculas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JTable jTableCriticas;
    private javax.swing.JTable jTableCriticos;
    private javax.swing.JTable jTablePeliculas;
    // End of variables declaration//GEN-END:variables

    private void mostrarTablaPelicula() {
        //ESTE METODO ES PARA CARGAR LOS DATOS DE LA TABLA PELICULA
        //SE CREA LA TABLA
        DefaultTableModel modelo = new DefaultTableModel();
        //AQUI SE INSERTA LA CONSULTA QUE VA EN POOLCONEXIONES
        //CONSULTA SIMPLE YA QUE COGEMOS TODOS LOS DATOS
        ResultSet rs = (ResultSet) manager.mostrarTabla("SELECT * FROM pelicula ORDER BY id_Pelicula");
        try {
            //COGEMOS LOS NOMBRES DE LA COLUMNAS
            ResultSetMetaData metaDatos = rs.getMetaData();
            int numeroColumnas = metaDatos.getColumnCount();
            String[] etiquetas = new String[numeroColumnas];
            for (int i = 0; i < numeroColumnas; i++) {
                etiquetas[i] = metaDatos.getColumnLabel(i + 1);
                modelo.setColumnIdentifiers(etiquetas);
            }
            while (rs.next()) {
                //COGEMOS LOS DATOS DE LAS FILAS
                modelo.addRow(new Object[]{rs.getString("id_Pelicula"), rs.getString("nombre_Pelicula"),
                    rs.getString("genero_Pelicula"), rs.getString("director_Pelicula"), rs.getString("duracion_Pelicula")});
            }
            //SE INSERTAN LOS DATOS EN LA TABLA
            jTablePeliculas.setModel(modelo);
            rs.close();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    private void mostrarTablaCritica() {
        //ESTE METODO ES PARA CARGAR LOS DATOS DE LA TABLA CRITICA
        //ESTE METODO ES PARA CARGAR LOS DATOS DE LA TABLA CRITICO
        //SE CREA LA TABLA
        DefaultTableModel modelo = new DefaultTableModel();
        //AQUI SE INSERTA LA CONSULTA QUE VA EN POOLCONEXIONES
        //CONSULTA SIMPLE YA QUE COGEMOS TODOS LOS DATOS
        ResultSet rs = (ResultSet) manager.mostrarTabla("SELECT * FROM critica ORDER BY id_Critica");
        try {
            //COGEMOS LOS NOMBRES DE LA COLUMNAS
            ResultSetMetaData metaDatos = rs.getMetaData();
            int numeroColumnas = metaDatos.getColumnCount();
            String[] etiquetas = new String[numeroColumnas];
            for (int i = 0; i < numeroColumnas; i++) {
                etiquetas[i] = metaDatos.getColumnLabel(i + 1);
                modelo.setColumnIdentifiers(etiquetas);
            }
            while (rs.next()) {
                //COGEMOS LOS DATOS DE LAS FILAS
                modelo.addRow(new Object[]{rs.getString("id_Critica"), rs.getString("texto_Critica"), rs.getString("puntuacion_Critica")});
            }
            //SE INSERTAN LOS DATOS EN LA TABLA
            jTableCriticas.setModel(modelo);
            rs.close();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    private void mostrarTablaCritico() {
        //ESTE METODO ES PARA CARGAR LOS DATOS DE LA TABLA CRITICO
        //SE CREA LA TABLA
        DefaultTableModel modelo = new DefaultTableModel();
        //AQUI SE INSERTA LA CONSULTA QUE VA EN POOLCONEXIONES
        //CONSULTA SIMPLE YA QUE COGEMOS TODOS LOS DATOS
        ResultSet rs = (ResultSet) manager.mostrarTabla("SELECT * FROM critico ORDER BY id_Critico");
        try {
            //COGEMOS LOS NOMBRES DE LA COLUMNAS
            ResultSetMetaData metaDatos = rs.getMetaData();
            int numeroColumnas = metaDatos.getColumnCount();
            String[] etiquetas = new String[numeroColumnas];
            for (int i = 0; i < numeroColumnas; i++) {
                etiquetas[i] = metaDatos.getColumnLabel(i + 1);
                modelo.setColumnIdentifiers(etiquetas);
            }
            while (rs.next()) {
                //COGEMOS LOS DATOS DE LAS FILAS
                modelo.addRow(new Object[]{rs.getString("id_Critico"), rs.getString("nombre_Director"), rs.getString("id_Critico_Critica")});
            }
            //SE INSERTAN LOS DATOS EN LA TABLA
            jTableCriticos.setModel(modelo);
            rs.close();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

}
