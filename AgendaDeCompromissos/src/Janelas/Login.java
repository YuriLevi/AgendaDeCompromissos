
package Janelas;
import BD.GerenciadorBD;
import BD.MD5;
import Tipos.Usuario;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Rizzadinha
 */
public class Login extends javax.swing.JInternalFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldLogin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldSenha = new javax.swing.JTextField();
        jButtonLogar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Login");

        jLabel1.setText("Login:");

        jLabel2.setText("Senha:");

        jButtonLogar.setText("Logar");
        jButtonLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonLogar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButtonLogar)
                .addContainerGap())
        );

        setBounds(0, 0, 151, 177);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogarActionPerformed
          
        
        if(GerenciadorBD.checkLogin(jTextFieldLogin.getText(), MD5.md5Hash(jTextFieldSenha.getText()))){
        
        Usuario aux = GerenciadorBD.selecionaAlterarU(jTextFieldLogin.getText(), MD5.md5Hash(jTextFieldSenha.getText())); 
        AuxCompromissoUsuario.setIdUC(aux.getId()); 
        AuxCompromissoUsuario.setNomeUC(aux.getLogin());
        AuxCompromissoUsuario.setSenhaUC(aux.getSenha());
        
        AuxCompromissoUsuario.setValida(1);
        
        JOptionPane.showMessageDialog(null, "Login efetuado com sucesso");
        
        this.dispose();
        
        }
        else{
          
          JOptionPane.showMessageDialog(null, "Usuário não cadastrado ou login/senha incorretos");
          AuxCompromissoUsuario.setValida(0);
          
        }
      
        
      
      
      //System.out.println("senha: " + jTextFieldSenha.getText());
      //System.out.println("\n id: " + AuxCompromissoUsuario.getIdUC() + " login: " +AuxCompromissoUsuario.getNomeUC() + " senha: " + AuxCompromissoUsuario.getSenhaUC());
      
    }//GEN-LAST:event_jButtonLogarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextFieldLogin;
    private javax.swing.JTextField jTextFieldSenha;
    // End of variables declaration//GEN-END:variables
}
