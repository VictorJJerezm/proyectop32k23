/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seguridad.Vista;


import Seguridad.Controlador.clsBitacora;
import Seguridad.Controlador.clsUsuario;
import Seguridad.Controlador.clsAplicacion;
import Seguridad.Controlador.clsAplicacionUsuario;
import Seguridad.Controlador.clsUsuarioConectado;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;


/**
 *
 * @author visitante
 */
public class frmAplicacionUsuario extends javax.swing.JInternalFrame {
    
//int codigoAplicacion=preguntar;

    public void llenadoDeCombos() {
        /*EmpleadoDAO empleadoDAO = new EmpleadoDAO();
        List<Empleado> empleados = empleadoDAO.select();
        cbox_empleado.addItem("Seleccione una opción");
        for (int i = 0; i < empleados.size(); i++) {
            cbox_empleado.addItem(empleados.get(i).getNombreEmpleado());
        } */
    }

public void llenadoDeTabla1() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Aplicacion");
        modelo.addColumn("Nombre Aplicacion");
        clsAplicacion aplicacion = new clsAplicacion();
        List<clsAplicacion> listaAplicaciones = aplicacion.getListadoAplicaciones();
        tablaAplicacionesDisponibles.setModel(modelo);
        String[] dato = new String[2];
        for (int i = 0; i < listaAplicaciones.size(); i++) {
            dato[0] = Integer.toString(listaAplicaciones.get(i).getIdAplicacion());
            dato[1] = listaAplicaciones.get(i).getNombreAplicacion();
            modelo.addRow(dato);
        }   
    }
    
    public void llenadoDeTabla2() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Aplicacion");
        modelo.addColumn("ID Usuario");
        modelo.addColumn("INS");
        modelo.addColumn("UPD");
        modelo.addColumn("DEL");
        modelo.addColumn("PRI"); 
        clsAplicacionUsuario aplicacionusuario = new clsAplicacionUsuario();
        List<clsAplicacionUsuario> listaAplicacionUsuarios = aplicacionusuario.getListadoAplicacionUsuario();
        tablaAplicacionesAsignadas.setModel(modelo);
        String[] dato = new String[6];
        for (int i = 0; i < listaAplicacionUsuarios.size(); i++) {
            dato[0] = Integer.toString(listaAplicacionUsuarios.get(i).getIdAplicacion());
            dato[1] = Integer.toString(listaAplicacionUsuarios.get(i).getIdUsuario());
            dato[2] = listaAplicacionUsuarios.get(i).getRegAplUsu();
            dato[3] = listaAplicacionUsuarios.get(i).getModAplUsu();
            dato[4] = listaAplicacionUsuarios.get(i).getEliAplUsu();
            dato[5] = listaAplicacionUsuarios.get(i).getImpAplUsu();
            modelo.addRow(dato);
        }   
    }
    
    int codigoAplicacion= 12;
    public frmAplicacionUsuario() {
        initComponents();
        llenadoDeTabla1();
        llenadoDeTabla2();
        llenadoDeCombos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb2 = new javax.swing.JLabel();
        lbusu = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAplicacionesAsignadas = new javax.swing.JTable();
        txtIdUsuario = new javax.swing.JTextField();
        label5 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaAplicacionesDisponibles = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        label7 = new javax.swing.JLabel();
        txtTipoUsuario = new javax.swing.JTextField();
        btnAgregarUno = new javax.swing.JButton();
        btnAgregarTodos = new javax.swing.JButton();
        btnQuitarUno = new javax.swing.JButton();
        btnQuitarTodos = new javax.swing.JButton();
        rbRegistrar = new javax.swing.JRadioButton();
        rbModificar = new javax.swing.JRadioButton();
        rbEliminar = new javax.swing.JRadioButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rbImprimir = new javax.swing.JRadioButton();
        btnActualizar = new javax.swing.JButton();
        cbUsuarios = new javax.swing.JComboBox<>();

        lb2.setForeground(new java.awt.Color(204, 204, 204));
        lb2.setText(".");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Aplicacion Usuario");
        setVisible(true);

        label1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label1.setText("Aplicaciones Asignadas");

        label3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label3.setText("Nombre:");

        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtNombre.setOpaque(false);

        tablaAplicacionesAsignadas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(tablaAplicacionesAsignadas);

        txtIdUsuario.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtIdUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtIdUsuario.setOpaque(false);
        txtIdUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdUsuarioActionPerformed(evt);
            }
        });

        label5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label5.setText("ID Usuario:");

        label4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label4.setText("Permisos a registrar:");

        label6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label6.setText("Aplicaciones Disponibles:");

        tablaAplicacionesDisponibles.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jScrollPane2.setViewportView(tablaAplicacionesDisponibles);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        label7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label7.setText("Tipo Usuario:");

        txtTipoUsuario.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtTipoUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtTipoUsuario.setOpaque(false);
        txtTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoUsuarioActionPerformed(evt);
            }
        });

        btnAgregarUno.setText(">");
        btnAgregarUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarUnoActionPerformed(evt);
            }
        });

        btnAgregarTodos.setText(">>");
        btnAgregarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarTodosActionPerformed(evt);
            }
        });

        btnQuitarUno.setText("<");
        btnQuitarUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarUnoActionPerformed(evt);
            }
        });

        btnQuitarTodos.setText("<<");
        btnQuitarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarTodosActionPerformed(evt);
            }
        });

        rbRegistrar.setText("Registrar");
        rbRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRegistrarActionPerformed(evt);
            }
        });

        rbModificar.setText("Modificar");

        rbEliminar.setText("Eliminar");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agregar");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Quitar");

        rbImprimir.setText("Imprimir");
        rbImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbImprimirActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        cbUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUsuariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(label3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label7, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIdUsuario)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(cbUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(btnActualizar)))
                        .addContainerGap(362, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnAgregarTodos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnQuitarTodos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAgregarUno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnQuitarUno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(label6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label4)
                        .addGap(41, 41, 41)
                        .addComponent(rbRegistrar)
                        .addGap(18, 18, 18)
                        .addComponent(rbModificar)
                        .addGap(18, 18, 18)
                        .addComponent(rbEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(rbImprimir)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label5)
                            .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar)
                            .addComponent(btnLimpiar)
                            .addComponent(cbUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label3)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label7)
                            .addComponent(txtTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnActualizar)
                        .addGap(27, 27, 27)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label1)
                    .addComponent(label6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregarUno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregarTodos)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnQuitarUno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnQuitarTodos)
                        .addGap(53, 53, 53)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbRegistrar)
                    .addComponent(label4)
                    .addComponent(rbModificar)
                    .addComponent(rbEliminar)
                    .addComponent(rbImprimir))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdUsuarioActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        clsUsuario usuario = new clsUsuario();
        //usuario.setNombreUsuario(txtbuscado.getText());
        usuario.setIdUsuario(Integer.parseInt(txtIdUsuario.getText()));
        usuario = usuario.getBuscarInformacionUsuarioPorId(usuario);
        System.out.println("Usuario retornado:" + usuario);
        txtNombre.setText(usuario.getNombreUsuario());
        txtTipoUsuario.setText(Integer.toString(usuario.getTipoUsuario()));
        clsAplicacionUsuario aplicacionusuario = new clsAplicacionUsuario();
        aplicacionusuario.setIdUsuario(Integer.parseInt(txtIdUsuario.getText()));
        aplicacionusuario = aplicacionusuario.getBuscarInformacionAplicacionUsuarioPorId(aplicacionusuario);
        DefaultTableModel model = (DefaultTableModel) tablaAplicacionesAsignadas.getModel();
        String[] dato = new String[6];
        if (aplicacionusuario != null) {
            // Rellenar el array con los datos del usuario
            dato[0] = Integer.toString(aplicacionusuario.getIdAplicacion());
            dato[1] = Integer.toString(aplicacionusuario.getIdUsuario());
            dato[2] = aplicacionusuario.getRegAplUsu();
            dato[3] = aplicacionusuario.getEliAplUsu();
            dato[4] = aplicacionusuario.getEliAplUsu();
            dato[5] = aplicacionusuario.getImpAplUsu();
            // Agregar el array a la tabla
            model.addRow(dato);
        }else{
            JOptionPane.showMessageDialog(null, "El usuario no existe.");
        }
        
        //Agregando bitácora 
        
        int resultadoBitacora=0;
        clsBitacora bitacoraRegistro = new clsBitacora();
        resultadoBitacora = bitacoraRegistro.setIngresarBitacora(clsUsuarioConectado.getIdUsuario(), codigoAplicacion, "REA");
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoUsuarioActionPerformed

    private void rbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbRegistrarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarTextos();
        //habilitarBotones();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void rbImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbImprimirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbImprimirActionPerformed

    private void btnQuitarUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarUnoActionPerformed
        // TODO add your handling code here:
        //Acción realizada por Karla Gómez
        String is=txtIdUsuario.getText();
        if(is.length()>0){
            DefaultTableModel model = (DefaultTableModel)
            tablaAplicacionesAsignadas.getModel();
            clsAplicacionUsuario aplicacionusuario = new clsAplicacionUsuario();
            aplicacionusuario.setIdUsuario(Integer.parseInt(txtIdUsuario.getText()));
            int s = tablaAplicacionesAsignadas.getSelectedRow();
            if (s<0){
                JOptionPane.showMessageDialog(null,"Debe seleccionar una fila de la tabla" );
            }else {
                int aid=Integer.parseInt(tablaAplicacionesAsignadas.getValueAt(s, 0).toString());
                aplicacionusuario.setIdAplicacion(aid);
                int confirmar=JOptionPane.showConfirmDialog(null,"¿Esta seguro que desea Eliminar esta aplicacion para usuario? ");
                if(JOptionPane.OK_OPTION==confirmar) {
                    aplicacionusuario.setBorrarAplicacion(aplicacionusuario);
                    model.removeRow(s);
                    JOptionPane.showMessageDialog(null,"Aplicacion para el usuario Eliminada exitosamente" );
                }
            }
        }else{
            JOptionPane.showMessageDialog(null,"Debe ingresar el ID del Usuario");
        }
        
        //Agregando bitácora 
        
        int resultadoBitacora=0;
        clsBitacora bitacoraRegistro = new clsBitacora();
        resultadoBitacora = bitacoraRegistro.setIngresarBitacora(clsUsuarioConectado.getIdUsuario(), codigoAplicacion, "DEL");
    }//GEN-LAST:event_btnQuitarUnoActionPerformed

    private void btnQuitarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarTodosActionPerformed
        // TODO add your handling code here:
        //Acción realizada por Nelson Pineda
        String is=txtIdUsuario.getText();
        if(is.length()>0){
            DefaultTableModel modeloDestino = (DefaultTableModel)tablaAplicacionesAsignadas.getModel();
            tablaAplicacionesAsignadas.getModel();{        
                clsAplicacionUsuario aplicacionusuario = new clsAplicacionUsuario();
                aplicacionusuario.setIdUsuario(Integer.parseInt(txtIdUsuario.getText()));
                int a = tablaAplicacionesAsignadas.getRowCount();
                for(int i=a-1; i>=0; i--){
                    aplicacionusuario.setBorrarTodoAplicacion(aplicacionusuario);
                    modeloDestino.removeRow(i);  
                }  
                JOptionPane.showMessageDialog(null,"Aplicaciones para el usuario Eliminada exitosamente");
            }   
        }else{
            JOptionPane.showMessageDialog(null,"Debe ingresar el ID del Usuario");
        }
        
        //Agregando bitácora 
        
        int resultadoBitacora=0;
        clsBitacora bitacoraRegistro = new clsBitacora();
        resultadoBitacora = bitacoraRegistro.setIngresarBitacora(clsUsuarioConectado.getIdUsuario(), codigoAplicacion, "DELALL");
    }//GEN-LAST:event_btnQuitarTodosActionPerformed

    private void btnAgregarUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarUnoActionPerformed
        // TODO add your handling code here:
        // Acción realizada por Alyson Rodríguez y Carlos González
        String is=txtIdUsuario.getText();
        if(is.length()>0){
            if(rbRegistrar.isSelected()||rbModificar.isSelected()||rbEliminar.isSelected()||rbImprimir.isSelected()){
                int FilaSeleccionada= tablaAplicacionesDisponibles.getSelectedRow();
                if(FilaSeleccionada !=-1){
                    String idAplicacion, idUsuario=txtIdUsuario.getText();
                    idAplicacion= tablaAplicacionesDisponibles.getValueAt(FilaSeleccionada,0).toString();
                    idUsuario= tablaAplicacionesDisponibles.getValueAt(FilaSeleccionada,1).toString();

                    String datos[]={idAplicacion, idUsuario};
                    DefaultTableModel modeloAplicacionesAsignadas = (DefaultTableModel)tablaAplicacionesAsignadas.getModel();
                    modeloAplicacionesAsignadas.addRow(datos);
                    clsAplicacionUsuario aplicacionusuario = new clsAplicacionUsuario();
                    aplicacionusuario.setIdAplicacion(Integer.parseInt(idAplicacion));
                    aplicacionusuario.setIdUsuario(Integer.parseInt(txtIdUsuario.getText()));
                    if(rbRegistrar.isSelected()){
                        aplicacionusuario.setRegAplUsu("T");
                    }else{
                        aplicacionusuario.setRegAplUsu("F");
                    }if(rbModificar.isSelected()){
                        aplicacionusuario.setModAplUsu("T");
                    }else{
                        aplicacionusuario.setModAplUsu("F");
                    }if(rbEliminar.isSelected()){
                        aplicacionusuario.setEliAplUsu("T");
                    }else{
                        aplicacionusuario.setEliAplUsu("F");
                    }if(rbImprimir.isSelected()){
                        aplicacionusuario.setImpAplUsu("T");
                    }else{
                        aplicacionusuario.setImpAplUsu("F");
                    }
                    aplicacionusuario.setIngresarAplicacionUsuario(aplicacionusuario);
                    JOptionPane.showMessageDialog(null, "Registro Ingresado\n", 
                                "Información del Sistema", JOptionPane.INFORMATION_MESSAGE);
                    llenadoDeTabla2();
                }else{
                    JOptionPane.showMessageDialog(null,"Debe seleccionar un registro");
                }
            }else{
                JOptionPane.showMessageDialog(null,"Debe seleccionar por lo menos un permiso");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Debe ingresar el ID del Usuario");
        }
        
        int resultadoBitacora=0;
        clsBitacora bitacoraRegistro = new clsBitacora();
        resultadoBitacora = bitacoraRegistro.setIngresarBitacora(clsUsuarioConectado.getIdUsuario(), codigoAplicacion, "INS");
        
    }//GEN-LAST:event_btnAgregarUnoActionPerformed

    private void btnAgregarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTodosActionPerformed
        // TODO add your handling code here:
        //Acción realizada por Alyson Rodriguez y Carlos González
        String is=txtIdUsuario.getText();
        if(is.length()>0){
            if(rbRegistrar.isSelected()||rbModificar.isSelected()||rbEliminar.isSelected()||rbImprimir.isSelected()){
                DefaultTableModel modeloOrigen = (DefaultTableModel)tablaAplicacionesDisponibles.getModel(), modeloDestino = (DefaultTableModel)tablaAplicacionesAsignadas.getModel();
                for (int i=0;i<tablaAplicacionesDisponibles.getRowCount(); i++) {
                    Object fila [] = new Object [tablaAplicacionesDisponibles.getColumnCount()];
                    for (int j=0; j<tablaAplicacionesDisponibles.getColumnCount(); j++){
                        fila[j] = tablaAplicacionesDisponibles.getValueAt(i,j);
                        String idAplicacion= tablaAplicacionesDisponibles.getValueAt(i,j).toString();
                    }
                    String idAplicacion= tablaAplicacionesDisponibles.getValueAt(i,0).toString();
                    clsAplicacionUsuario aplicacionusuario = new clsAplicacionUsuario();
                    aplicacionusuario.setIdAplicacion(Integer.parseInt(idAplicacion));
                    aplicacionusuario.setIdUsuario(Integer.parseInt(txtIdUsuario.getText()));
                    if(rbRegistrar.isSelected()){
                        aplicacionusuario.setRegAplUsu("T");
                    }else{
                        aplicacionusuario.setRegAplUsu("F");
                    }if(rbModificar.isSelected()){
                        aplicacionusuario.setModAplUsu("T");
                    }else{
                        aplicacionusuario.setModAplUsu("F");
                    }if(rbEliminar.isSelected()){
                        aplicacionusuario.setEliAplUsu("T");
                    }else{
                        aplicacionusuario.setEliAplUsu("F");
                    }if(rbImprimir.isSelected()){
                        aplicacionusuario.setImpAplUsu("T");
                    }else{
                        aplicacionusuario.setImpAplUsu("F");
                    }
                    aplicacionusuario.setIngresarAplicacionUsuario(aplicacionusuario);
                    JOptionPane.showMessageDialog(null, "Registro Ingresado\n", 
                                "Información del Sistema", JOptionPane.INFORMATION_MESSAGE);
                    modeloDestino.addRow(fila);
                    llenadoDeTabla2();
                }
            }else{
                JOptionPane.showMessageDialog(null,"Debe seleccionar por lo menos un permiso");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Debe ingresar el ID del Usuario");
        }
        
        int resultadoBitacora=0;
        clsBitacora bitacoraRegistro = new clsBitacora();
        resultadoBitacora = bitacoraRegistro.setIngresarBitacora(clsUsuarioConectado.getIdUsuario(), codigoAplicacion, "INSALL");
    }//GEN-LAST:event_btnAgregarTodosActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        llenadoDeTabla1();
        llenadoDeTabla2();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void cbUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUsuariosActionPerformed
        // TODO add your handling code here:
        clsUsuario usuario = new clsUsuario();
        List<clsUsuario> listaUsuarios = usuario.getListadoUsuarios();
        for(clsUsuario usu : listaUsuarios){
            cbUsuarios.addItem(String.valueOf(usu.getIdUsuario()));
        }
    }//GEN-LAST:event_cbUsuariosActionPerformed
    public void limpiarTextos()
    {
        txtNombre.setText("");
        txtIdUsuario.setText("");
        txtTipoUsuario.setText("");
    }
    /*public void habilitarBotones()
    {
        btnRegistrar.setEnabled(true);
        btnModificar.setEnabled(true);
        btnEliminar.setEnabled(true);
    }
    public void desHabilitarBotones()
    {
        btnRegistrar.setEnabled(false);
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }    */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregarTodos;
    private javax.swing.JButton btnAgregarUno;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnQuitarTodos;
    private javax.swing.JButton btnQuitarUno;
    private javax.swing.JComboBox<String> cbUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lbusu;
    private javax.swing.JRadioButton rbEliminar;
    private javax.swing.JRadioButton rbImprimir;
    private javax.swing.JRadioButton rbModificar;
    private javax.swing.JRadioButton rbRegistrar;
    private javax.swing.JTable tablaAplicacionesAsignadas;
    private javax.swing.JTable tablaAplicacionesDisponibles;
    private javax.swing.JTextField txtIdUsuario;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTipoUsuario;
    // End of variables declaration//GEN-END:variables
}
