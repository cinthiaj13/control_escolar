package Interfaz;
import Interfaz.Direc;
import controlescolar.Conexion;
import static controlescolar.Conexion.URL;
import static controlescolar.Conexion.contraseña;
import static controlescolar.Conexion.usuario;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;


        
public class InicioS extends javax.swing.JFrame {
    Conexion conexion = new Conexion();
    
    public InicioS() {
        initComponents(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtpass = new javax.swing.JPasswordField();
        jPanel5 = new javax.swing.JPanel();
        ImagenIcono = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 194));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(32, 31, 31));
        jLabel2.setText("INICIO DE SESIÓN");

        jLabel3.setText("USUARIO:");

        jLabel4.setText("CONTRASEÑA:");

        txtusuario.setBackground(new java.awt.Color(255, 255, 194));
        txtusuario.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        txtusuario.setToolTipText("");
        txtusuario.setBorder(null);
        txtusuario.setName("txtusuario"); // NOI18N

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        jButton1.setText("INGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtpass.setBackground(new java.awt.Color(255, 255, 194));
        txtpass.setBorder(null);
        txtpass.setName(""); // NOI18N
        txtpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel2))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtusuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(1, 1, 1)
                .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        txtusuario.getAccessibleContext().setAccessibleName("");

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 200, 250));

        jPanel5.setBackground(new java.awt.Color(255, 248, 127));

        ImagenIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controlescolar/LogoAG.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoAG.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ImagenIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ImagenIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

        
   /* public void validarUsuario() throws SQLException{
        int resultado = 0;
        String pass = String.valueOf(txtpass.getPassword());
        String usuario = txtusuario.getText();
        String SQL = "select * from tbl_usuario where ID_Usuario='"+ID_Usuario+"' AND Contrasena='"+Contrasena+"'";
        try{
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            if(rs.next()){
               resultado = 1;
               if(resultado==1){
                //form= new();
                //form.setVisible(true);
                //this.dispose();
               }
            }
            else{
                JOptionPane.showMessageDialog(null,"Error de Acceso. Usuario no valido");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error" + e.getMessage());
        }
    }
    */
    
   /*private boolean validarUsuario(String Cargo_U, String Contrasena) {
   try{           
       Class.forName("com.mysql.jdbc.Driver");  
      // Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/javademo?" + "user=root&password=");    
       PreparedStatement pst = conexion.prepareStatement("Select * from tbl_usuarios where Cargo_U=? and Contrasena=?");
       pst.setString(1, Cargo_U); 
       pst.setString(2, Contrasena);
       ResultSet rs = pst.executeQuery();                        
       if(rs.next())            
           return true;    
       else
           return false;            
   }
   catch(Exception e){
       e.printStackTrace();
       return false;
   }       
}*/
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        if(txtusuario.getText().equals("Admin_AG") && txtpass.getText().equals("ag1111")){
            setVisible(false);
            new Admin().setVisible(true);
        }
        else{
            if(txtusuario.getText().equals("Direc_AG") && txtpass.getText().equals("ag2222")){
            setVisible(false);
            new Direc().setVisible(true);
            }
            else{
                if(txtusuario.getText().equals("Conta_AG") && txtpass.getText().equals("ag3333")){
                setVisible(false);
                new Conta().setVisible(true);
                }
                else{
                    if(txtusuario.getText().equals("Conta_AG") && txtpass.getText().equals("ag3333")){
                     setVisible(false);
                    new Conta().setVisible(true);
                    }
                    else{
                         if(txtusuario.getText().equals("CEK_AG") && txtpass.getText().equals("ag4444")){
                             setVisible(false);
                             new CEK().setVisible(true);
                         }
                         else{
                             if(txtusuario.getText().equals("CEP_AG") && txtpass.getText().equals("ag5555")){
                                 setVisible(false);
                                 new CEP().setVisible(true);
                             }
                             else{
                                 if(txtusuario.getText().equals("CES_AG") && txtpass.getText().equals("ag6666")){
                                     setVisible(false);
                                     new CES().setVisible(true);
                                 }
                                 else{
                                     if(txtusuario.getText().equals("Seg_AG") && txtpass.getText().equals("ag7777")){
                                         setVisible(false);
                                         new Seg().setVisible(true);
                                     }
                                     else{
                                        JOptionPane.showMessageDialog(null, "Usuario o password incorrectos");
                                     }
                                 }
                             }
                         }
                    }
                }
            }
        }


        
        /* if(txtusuario.getText().length()==0)  
      JOptionPane.showMessageDialog(null, "Campo vacío. Rellene todos los campos");
   else if(txtpass.getPassword().length==0)  
      JOptionPane.showMessageDialog(null, "Campo vacío. Rellene todos los campos");
   else{
       char[] us= null;
       String user = String.valueOf(us);
       user = txtusuario.getText(); 
       
       char[] pass = txtpass.getPassword(); // Collecting the input
       String pwd = String.copyValueOf(pass); 
       if(validarUsuario(user,pwd))
          JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso");        
       else
          JOptionPane.showMessageDialog(null, "Inicio de sesión incorrecto.");
   }   */
       /* Usuario usuario =new Usuario();
        SQLUsuario sqlUsuario = new SQLUsuario();
               
       String contraseña = new String(txtpass.getPassword());
      
       if (txtpass.getText().equals("") || txtusuario.equals(""))
          {
              JOptionPane.showMessageDialog(null, "Por favor rellene todos los campos");
          }else{
           String nuevaContraseña = CifrarContraseña.md5("Contrasena_U");
           usuario.setNombreUsuario(txtusuario.getText());
           usuario.setContraseña(nuevaContraseña);
           
           if(sqlUsuario.iniciarSesion("Usuario")){
               JOptionPane.showMessageDialog(null, "Felicidades, acabas de ingresar");
           }else {
               JOptionPane.showMessageDialog(null, "Datos incorrectos");
           }
       }
       */

    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        conexion.getConnection();
    }//GEN-LAST:event_formWindowOpened

    private void txtpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassActionPerformed

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
            java.util.logging.Logger.getLogger(InicioS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImagenIcono;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables


}

