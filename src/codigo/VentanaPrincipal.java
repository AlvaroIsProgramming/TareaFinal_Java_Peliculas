/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
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
        // manager.cosulta_PreparedStatement("Spielberg");
        // manager.insertarConCommit();
        mostrarTablaPelicula();
        mostrarTablaCritica();
        mostrarTablaCritico();

        editarTablas();

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldid_Critica = new javax.swing.JTextField();
        jTextFieldPuntuacion_Critica = new javax.swing.JTextField();
        jTextFieldTexto_Critica = new javax.swing.JTextField();
        jButtonAñadirCritica = new javax.swing.JButton();
        jTextFieldBorrarCritica = new javax.swing.JTextField();
        jButtonBorrarCritica = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldcod_Critico = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldCritica_Nombre = new javax.swing.JTextField();
        jPanelCriticos = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableCriticos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldid_Critico = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldnombre_Critico = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldcod_Critico_Critica = new javax.swing.JTextField();
        jButtonAñadirCritico = new javax.swing.JButton();
        jTextFieldBorrarCritico = new javax.swing.JTextField();
        jButtonBorrarCritico = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

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
                .addContainerGap(200, Short.MAX_VALUE))
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

        jLabel1.setText("ID:");

        jLabel2.setText("Critica:");

        jLabel3.setText("Puntuacion:");

        jButtonAñadirCritica.setText("Añadir Critica");
        jButtonAñadirCritica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAñadirCriticaActionPerformed(evt);
            }
        });

        jButtonBorrarCritica.setText("Borrar");
        jButtonBorrarCritica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarCriticaActionPerformed(evt);
            }
        });

        jLabel8.setText("Cod_Critico:");

        jLabel9.setText("Pelicula:");

        javax.swing.GroupLayout jPanelCriticasLayout = new javax.swing.GroupLayout(jPanelCriticas);
        jPanelCriticas.setLayout(jPanelCriticasLayout);
        jPanelCriticasLayout.setHorizontalGroup(
            jPanelCriticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCriticasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 873, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCriticasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTextFieldBorrarCritica, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonBorrarCritica)
                .addGap(137, 137, 137))
            .addGroup(jPanelCriticasLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanelCriticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanelCriticasLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldPuntuacion_Critica))
                    .addGroup(jPanelCriticasLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldid_Critica, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelCriticasLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTexto_Critica)))
                .addGap(42, 42, 42)
                .addGroup(jPanelCriticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonAñadirCritica)
                    .addGroup(jPanelCriticasLayout.createSequentialGroup()
                        .addGroup(jPanelCriticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelCriticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldcod_Critico, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(jTextFieldCritica_Nombre))))
                .addGap(25, 480, Short.MAX_VALUE))
        );
        jPanelCriticasLayout.setVerticalGroup(
            jPanelCriticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCriticasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCriticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBorrarCritica, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBorrarCritica))
                .addGap(12, 12, 12)
                .addGroup(jPanelCriticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldid_Critica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldcod_Critico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCriticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldPuntuacion_Critica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldCritica_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanelCriticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldTexto_Critica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAñadirCritica))
                .addContainerGap(80, Short.MAX_VALUE))
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

        jLabel4.setText("ID:");

        jLabel5.setText("Nombre:");

        jLabel6.setText("Codigo:");

        jButtonAñadirCritico.setText("Añadir");
        jButtonAñadirCritico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAñadirCriticoActionPerformed(evt);
            }
        });

        jButtonBorrarCritico.setText("Borrar");
        jButtonBorrarCritico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarCriticoActionPerformed(evt);
            }
        });

        jLabel10.setText("(Al eliminar un critico se eliminaran tambien sus criticas como consecuencia)");

        javax.swing.GroupLayout jPanelCriticosLayout = new javax.swing.GroupLayout(jPanelCriticos);
        jPanelCriticos.setLayout(jPanelCriticosLayout);
        jPanelCriticosLayout.setHorizontalGroup(
            jPanelCriticosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCriticosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 873, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelCriticosLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanelCriticosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelCriticosLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldnombre_Critico))
                    .addGroup(jPanelCriticosLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldid_Critico, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCriticosLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelCriticosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAñadirCritico)
                            .addComponent(jTextFieldcod_Critico_Critica))))
                .addGroup(jPanelCriticosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCriticosLayout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jTextFieldBorrarCritico, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBorrarCritico))
                    .addGroup(jPanelCriticosLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCriticosLayout.setVerticalGroup(
            jPanelCriticosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCriticosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCriticosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCriticosLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(jPanelCriticosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldid_Critico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldBorrarCritico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBorrarCritico))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelCriticosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextFieldnombre_Critico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCriticosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldcod_Critico_Critica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(jButtonAñadirCritico)
                .addGap(35, 35, 35))
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

    private void jButtonAñadirCriticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAñadirCriticaActionPerformed
        // BOTON AÑADIR CRITICA
        manager.insertarCritica(jTextFieldid_Critica.getText(), jTextFieldcod_Critico.getText(), jTextFieldCritica_Nombre.getText(), jTextFieldTexto_Critica.getText(), jTextFieldPuntuacion_Critica.getText());
        mostrarTablaCritica();
    }//GEN-LAST:event_jButtonAñadirCriticaActionPerformed

    private void jButtonBorrarCriticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarCriticaActionPerformed
        // BOTON ELIMINAR CRITICA
        manager.eliminarCritica(jTextFieldBorrarCritica.getText());
        mostrarTablaCritica();
    }//GEN-LAST:event_jButtonBorrarCriticaActionPerformed

    private void jButtonAñadirCriticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAñadirCriticoActionPerformed
        // BOTON AÑADIR CRITICO
        manager.insertarCritico(jTextFieldid_Critico.getText(), jTextFieldnombre_Critico.getText(), jTextFieldcod_Critico_Critica.getText());
        mostrarTablaCritico();
    }//GEN-LAST:event_jButtonAñadirCriticoActionPerformed

    private void jButtonBorrarCriticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarCriticoActionPerformed
        // BOTON ELIMINAR CRITICO
        manager.eliminarCritico(jTextFieldBorrarCritico.getText());
        mostrarTablaCritico();
    }//GEN-LAST:event_jButtonBorrarCriticoActionPerformed

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
    private javax.swing.JButton jButtonAñadirCritica;
    private javax.swing.JButton jButtonAñadirCritico;
    private javax.swing.JButton jButtonBorrarCritica;
    private javax.swing.JButton jButtonBorrarCritico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JTextField jTextFieldBorrarCritica;
    private javax.swing.JTextField jTextFieldBorrarCritico;
    private javax.swing.JTextField jTextFieldCritica_Nombre;
    private javax.swing.JTextField jTextFieldPuntuacion_Critica;
    private javax.swing.JTextField jTextFieldTexto_Critica;
    private javax.swing.JTextField jTextFieldcod_Critico;
    private javax.swing.JTextField jTextFieldcod_Critico_Critica;
    private javax.swing.JTextField jTextFieldid_Critica;
    private javax.swing.JTextField jTextFieldid_Critico;
    private javax.swing.JTextField jTextFieldnombre_Critico;
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
                modelo.addRow(new Object[]{rs.getString("id_Critica"), rs.getString("cod_critico"), rs.getString("critica_Nombre"), rs.getString("texto_Critica"), rs.getString("puntuacion_Critica")});
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
                modelo.addRow(new Object[]{rs.getString("id_Critico"),
                    rs.getString("nombre_Critico"),
                    rs.getString("cod_Critico_Critica")});
            }
            //SE INSERTAN LOS DATOS EN LA TABLA
            jTableCriticos.setModel(modelo);
            rs.close();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    private void editarTablas() {
        // METODO PARA QUE SE AUTOCOMPLETEN LOS CAMPOS AL PULSAR UN DATO DE LA TABLA
        //EDITAR TABLA ALBUM
        //SOLO SE EDITA EL NOMBRE, LA DISCOGRAFICA, EL LIDER Y EL GENERO
        jTableCriticas.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int filaCriticas = jTableCriticas.getSelectedRow();
                if (filaCriticas == -1) {
                    JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna fila.");
                } else {

                    String nombreCritica = (String) jTableCriticas.getValueAt(filaCriticas, 2);
                    String textoCritica = (String) jTableCriticas.getValueAt(filaCriticas, 3);
                    String puntiacionCritica = (String) jTableCriticas.getValueAt(filaCriticas, 4);
                    jTextFieldCritica_Nombre.setText(nombreCritica);
                    jTextFieldTexto_Critica.setText(textoCritica);
                    jTextFieldPuntuacion_Critica.setText(puntiacionCritica);
                }
            }
        });
        //EDITAR TABLA CANCIONES
        //SOLO SE EDITA EL NOMBRE Y LA DURACION DE LA CANCION
        jTableCriticos.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent ev) {
                int filaCanciones = jTableCriticos.getSelectedRow();
                if (filaCanciones == -1) {
                    JOptionPane.showMessageDialog(null, "No has seleccionado ninguna fila.");
                } else {
                    String nombreCritico = (String) jTableCriticos.getValueAt(filaCanciones, 1);
                    jTextFieldnombre_Critico.setText(nombreCritico);
                }
            }
        });
    }
}
