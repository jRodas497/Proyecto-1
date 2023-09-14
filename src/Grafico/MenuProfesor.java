package Grafico;

import Archivos.Binario;
import Archivos.Texto;
import Clases.Actividad;
import Clases.Listas;
import Clases.Usuarios;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MenuProfesor extends javax.swing.JFrame {
    private int curso;
    private int code;
    private String alumno = "0";
    
    private String codigoC;
    private String nombre;
    private String descripcion;
    private String ponderacion;
    
    Listas listas;
    DefaultTableModel modeloTabla;
    Binario binario;
    Texto texto;
    Usuarios usuario;
    
    public MenuProfesor() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.texto = new Texto();
    }
    
    public void rebirUsuario(Usuarios usuario){
        this.usuario = usuario;
    }
    
    public void codigoCurso(int curso){
        this.curso = curso;
    }
    
    public void recibirListas(Listas listas){
        this.listas = listas;
        txtCurso.setText(String.valueOf("Detalles del curso " + listas.controladorCurso.cursoExist(curso).getNombreCurso()));
        actualizarPunteo();
        this.code = usuario.getCode();
        llenarTablaAlumno();
        llenarTablaActividad();        
    }
    
    private void mensaje(String msj){
        JOptionPane.showMessageDialog(null, msj);
    }
    
    public void actualizarPunteo(){
        txtAcumulado.setText(String.valueOf("Acumulado: " + listas.controladorCurso.cursoExist(curso).getAcumulado() + "/100"));
    }
    
    public void llenarTablaAlumno(){
        this.modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Código");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Correo");
        
        int size = listas.controladorUserXCurso.size();
        
        
        for (int i = 0; i < size; i++) {
            if (listas.controladorUserXCurso.getElemento(i).getCurso() == curso) {
                agregaFilaAlumno(listas.controladorUserXCurso.getElemento(i).getUsuario()
                    ,listas.controladorUsuario.usuarioExist(listas.controladorUserXCurso.getElemento(i).getUsuario()).getNombre()
                    ,listas.controladorUsuario.usuarioExist(listas.controladorUserXCurso.getElemento(i).getUsuario()).getCorreo());
            }
        }
    }
    
    private void agregaFilaAlumno(int code, String nombre, String correo){
        this.modeloTabla.addRow(new Object[]{code, nombre, correo});
        this.tabAlumnos.setModel(modeloTabla);
    }
    
    public void llenarTablaActividad(){
        this.modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Código");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Descripción");
        modeloTabla.addColumn("Ponderación");
        modeloTabla.addColumn("Promedio");
        
        int size = listas.controladorActividad.size();
        
        Actividad actividad;
        for (int i = 0; i < size; i++) {
            if (listas.controladorActividad.getElement(i).getCurso() == curso) {
                actividad = listas.controladorActividad.getElement(i);
                agregaFilaActividad(actividad.getCodigo(),actividad.getNombre(), actividad.getDescripcion(), actividad.getPunteo(), 0);
            }
        }
    }
    
    private void agregaFilaActividad(int codigo, String nombre, String descripcion, int ponderacion, int promedio){
        this.modeloTabla.addRow(new Object[]{codigo, nombre, descripcion, ponderacion, promedio});
        this.tabActividades.setModel(modeloTabla);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        txtCurso = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabAlumnos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabActividades = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAcumulado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnCSValumnos = new javax.swing.JButton();
        btn5mejor = new javax.swing.JButton();
        btn5peor = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnClean = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        txtDescripcion = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtPonderacion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnCSVactividades = new javax.swing.JButton();
        btnDesasignar = new javax.swing.JButton();
        btnMenuProfesor = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();

        jTextField3.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtCurso.setFont(new java.awt.Font("Bookman Old Style", 3, 24)); // NOI18N
        txtCurso.setBorder(null);
        txtCurso.setFocusable(false);
        txtCurso.setOpaque(false);
        txtCurso.setRequestFocusEnabled(false);

        tabAlumnos.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        tabAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabAlumnos.setRowHeight(24);
        tabAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabAlumnosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabAlumnos);

        tabActividades.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        tabActividades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabActividades.setRowHeight(24);
        jScrollPane2.setViewportView(tabActividades);

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel1.setText("Actividades");

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel2.setText("Listado de alumnos");

        txtAcumulado.setFont(new java.awt.Font("Bookman Old Style", 1, 16)); // NOI18N
        txtAcumulado.setBorder(null);
        txtAcumulado.setFocusable(false);
        txtAcumulado.setOpaque(false);
        txtAcumulado.setRequestFocusEnabled(false);

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel3.setText("Crear Avtividad");

        btnCSValumnos.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        btnCSValumnos.setText("Inscribir de manera masiva");
        btnCSValumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCSValumnosActionPerformed(evt);
            }
        });

        btn5mejor.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        btn5mejor.setText("Top 5 - Estudiantes con mejor rendimiento");

        btn5peor.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        btn5peor.setText("Top 5 - Estudiantes con peor rendimiento");
        btn5peor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5peorActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        jLabel5.setText("Nombre");

        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        jLabel6.setText("Descripción");

        jLabel7.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        jLabel7.setText("Ponderación");

        btnClean.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        btnClean.setText("Limpiar");
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        btnAdd.setText("Crear Actividad");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        txtDescripcion.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N

        txtNombre.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N

        txtPonderacion.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel8.setText("Reportes");

        btnCSVactividades.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        btnCSVactividades.setText("Actividades CSV");
        btnCSVactividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCSVactividadesActionPerformed(evt);
            }
        });

        btnDesasignar.setFont(new java.awt.Font("Bookman Old Style", 1, 16)); // NOI18N
        btnDesasignar.setText("Desasignar");
        btnDesasignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesasignarActionPerformed(evt);
            }
        });

        btnMenuProfesor.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btnMenuProfesor.setText("Regresar ←");
        btnMenuProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuProfesorActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        jLabel9.setText("Código");

        txtCodigo.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(318, 318, 318))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn5mejor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn5peor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCSValumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136)
                        .addComponent(btnDesasignar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 40, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnCSVactividades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(275, 275, 275)))
                                .addGap(10, 10, 10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel3)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtAcumulado, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtPonderacion, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(19, 19, 19))))
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 904, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMenuProfesor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMenuProfesor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCurso, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDesasignar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCSValumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(80, 80, 80)
                        .addComponent(btn5mejor, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCSVactividades, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAcumulado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 19, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPonderacion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn5peor, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn5peorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5peorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn5peorActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        limpiar();
    }//GEN-LAST:event_btnCleanActionPerformed

    public void limpiar(){
        txtCodigo.setText(null);
        txtNombre.setText(null);
        txtDescripcion.setText(null);
        txtPonderacion.setText(null);
    }
    
    private void tabAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabAlumnosMouseClicked
        int seleccionar = tabAlumnos.rowAtPoint(evt.getPoint());
        this.alumno = String.valueOf(tabAlumnos.getValueAt(seleccionar, 0));
    }//GEN-LAST:event_tabAlumnosMouseClicked

    private void btnDesasignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesasignarActionPerformed
        System.out.println(alumno);
        if (alumno != "0") {
            int number = Integer.parseInt(alumno);
            
            int respuesta = JOptionPane.showConfirmDialog(
            null,
            "¿Quieres eliminar a " + listas.controladorUsuario.usuarioExist(number).getNombre() + "?",
            "Confirmación",
            JOptionPane.YES_NO_OPTION);
            
            if (respuesta == JOptionPane.YES_OPTION) {
                if (listas.controladorUserXCurso.desasignar(number, curso)) {
                    llenarTablaAlumno();
                    mensaje("Se desasigno a " + listas.controladorUsuario.usuarioExist(number).getNombre() + " del curso" + listas.controladorCurso.cursoExist(curso).getNombreCurso());
                }else{
                    mensaje("Opps! Aún no encuentro una solución a ese error XD");
                    llenarTablaAlumno();
                }
            }else{
                JOptionPane.showMessageDialog(null, "La desasignación no se llevo a cabo");
            }
            
        }else{
            mensaje("Selecciona antes un Alumno");
        }
    }//GEN-LAST:event_btnDesasignarActionPerformed

    private void btnMenuProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuProfesorActionPerformed
        VistaProfesor vista = new VistaProfesor();
        vista.rebirUsuario(usuario);
        vista.recibirListas(listas);
        
        vista.setVisible(true);
                
        this.dispose();
    }//GEN-LAST:event_btnMenuProfesorActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String incomplete = "";
        this.codigoC = txtCodigo.getText();
        this.nombre = txtNombre.getText();
        this.descripcion = txtDescripcion.getText();
        this.ponderacion = txtPonderacion.getText();
        
        if(codigoC.equals("")) incomplete += "\nCódigo";
        if(nombre.equals("")) incomplete += "\nNombre";
        if(descripcion.equals("")) incomplete += "\nDescripción";
        if(ponderacion.equals("")) incomplete += "\nPonderación";
        
        if (!incomplete.equals("")) {
            mensaje("Llenar los campos " + incomplete);
        }else{
            agregar();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnCSVactividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCSVactividadesActionPerformed
        String path = texto.Buscar();
        texto.cargarActividades(path, listas.controladorActividad, curso);
        llenarTablaActividad();
        actualizarPunteo();
        mensaje("Carga masiva realizada");
    }//GEN-LAST:event_btnCSVactividadesActionPerformed

    private void btnCSValumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCSValumnosActionPerformed
        String path = texto.Buscar();
        texto.cargarAlumnosCurso(path, listas.controladorUserXCurso, curso);
        llenarTablaAlumno();
        mensaje("Carga masiva realizada");
    }//GEN-LAST:event_btnCSValumnosActionPerformed

    public void agregar(){
        codigoC.replaceAll("^[0-9]", "");
        ponderacion.replaceAll("^[0-9]", "");
         
       int cod = Integer.parseInt(codigoC);
        int pon = Integer.parseInt(ponderacion);
        
        if (listas.controladorActividad.addActividad(cod, nombre, descripcion, pon, curso)) {
            llenarTablaActividad();
            limpiar();
            actualizarPunteo();
            mensaje("Se agrego la actividad " + nombre);
        }else{
            mensaje("No se pudo agregar el curso");
        }
    }
    
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
            java.util.logging.Logger.getLogger(MenuProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuProfesor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn5mejor;
    private javax.swing.JButton btn5peor;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCSVactividades;
    private javax.swing.JButton btnCSValumnos;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnDesasignar;
    private javax.swing.JButton btnMenuProfesor;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTable tabActividades;
    private javax.swing.JTable tabAlumnos;
    private javax.swing.JTextField txtAcumulado;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCurso;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPonderacion;
    // End of variables declaration//GEN-END:variables
}
