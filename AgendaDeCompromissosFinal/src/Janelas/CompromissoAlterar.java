/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Janelas;

import BD.GerenciadorBD;
import Tipos.Compromisso;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Rizzadinha
 */
public class CompromissoAlterar extends javax.swing.JInternalFrame {

    /**
     * Creates new form CompromissoAlterar
     */
    public CompromissoAlterar() {
        initComponents();
        this.setLocation(250, 100);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jTextField2 = new javax.swing.JTextField();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jDateChooserAlterarE = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldNomeCompromissoAchadoAlterar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaInfoCompromissoAchadoAlterar = new javax.swing.JTextArea();
        jToggleButtonEncontrarAlterar = new javax.swing.JToggleButton();
        jToggleButtonCompromissoAlterar = new javax.swing.JToggleButton();
        jButtonSelecionar = new javax.swing.JButton();
        jComboBoxCompromisso = new javax.swing.JComboBox<>();
        jFormattedTextData = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldHoraCompromissoAchadoAlterar = new javax.swing.JFormattedTextField();

        jLabel1.setText("jLabel1");

        jTextField2.setText("jTextField2");

        setClosable(true);
        setTitle("Alterar Compromisso");
        setPreferredSize(new java.awt.Dimension(455, 392));

        jLabel3.setText("Data:");

        jLabel2.setText("Nome:");

        jLabel4.setText("Hora:");

        jLabel5.setText("Data:");

        jLabel6.setText("Info:");

        jTextAreaInfoCompromissoAchadoAlterar.setColumns(20);
        jTextAreaInfoCompromissoAchadoAlterar.setRows(5);
        jScrollPane2.setViewportView(jTextAreaInfoCompromissoAchadoAlterar);

        jToggleButtonEncontrarAlterar.setText("Encontrar");
        jToggleButtonEncontrarAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonEncontrarAlterarActionPerformed(evt);
            }
        });

        jToggleButtonCompromissoAlterar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jToggleButtonCompromissoAlterar.setText("Alterar");
        jToggleButtonCompromissoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonCompromissoAlterarActionPerformed(evt);
            }
        });

        jButtonSelecionar.setText("Selecionar Compromisso");
        jButtonSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelecionarActionPerformed(evt);
            }
        });

        try {
            jFormattedTextData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextData.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel7.setText("YYYY/MM/DD");

        try {
            jTextFieldHoraCompromissoAchadoAlterar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextFieldHoraCompromissoAchadoAlterar.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jToggleButtonCompromissoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDateChooserAlterarE, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jToggleButtonEncontrarAlterar))
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonSelecionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxCompromisso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNomeCompromissoAchadoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldHoraCompromissoAchadoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(88, 88, 88)))
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jFormattedTextData, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(236, 236, 236))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBoxCompromisso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSelecionar)
                            .addComponent(jToggleButtonEncontrarAlterar)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDateChooserAlterarE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNomeCompromissoAchadoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldHoraCompromissoAchadoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jToggleButtonCompromissoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButtonEncontrarAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonEncontrarAlterarActionPerformed
        
        if(jDateChooserAlterarE.getDate() == null){
            JOptionPane.showMessageDialog(null, "Insira uma data válida");
        }
        else{
            ArrayList<Compromisso> encontrado = new ArrayList<Compromisso>();
            ArrayList<String> nomes = new ArrayList<String>();
            DateFormat dataFomatador = new SimpleDateFormat("yyyy/MM/dd"); 

            encontrado = GerenciadorBD.listarDatas(dataFomatador.format(jDateChooserAlterarE.getDate()),AuxCompromissoUsuario.getIdUC());
          
            if(encontrado.size() == 0){
                JOptionPane.showMessageDialog(null, "Nenhum compromisso encontrado com esse nome");
            }
            else{
                JOptionPane.showMessageDialog(null, "Compromissos encontrado(s)");
                for(int i=0;i<encontrado.size();i++)
                    nomes.add(encontrado.get(i).getNome());
      
                jComboBoxCompromisso.setModel(new DefaultComboBoxModel(nomes.toArray()));
            
            }
        }  
        
    }//GEN-LAST:event_jToggleButtonEncontrarAlterarActionPerformed

    private void jButtonSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelecionarActionPerformed
        
        
        DateFormat dataFomatador = new SimpleDateFormat("yyyy/MM/dd"); 
        
        Compromisso aC = GerenciadorBD.auxAlterar(jComboBoxCompromisso.getSelectedItem().toString(),dataFomatador.format(jDateChooserAlterarE.getDate()),AuxCompromissoUsuario.getIdUC());       
        
        System.out.println("teste:" + aC.getNome());
        
        jTextFieldNomeCompromissoAchadoAlterar.setText(aC.getNome());
        jTextFieldHoraCompromissoAchadoAlterar.setText(aC.getHora());
        jFormattedTextData.setText(aC.getData());
        jTextAreaInfoCompromissoAchadoAlterar.setText(aC.getInfo());
        
        
    }//GEN-LAST:event_jButtonSelecionarActionPerformed

    private void jToggleButtonCompromissoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonCompromissoAlterarActionPerformed
        
        
        if(jTextFieldNomeCompromissoAchadoAlterar.getText().equals("") || jTextFieldHoraCompromissoAchadoAlterar.getText().equals("  :  ") || jFormattedTextData.getText().equals("    /  /  ") || jTextAreaInfoCompromissoAchadoAlterar.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor preencha os campos");
        }
        else{
            DateFormat dataFomatador = new SimpleDateFormat("yyyy/MM/dd");
            Compromisso alterar = new Compromisso();

            alterar.setNome(jTextFieldNomeCompromissoAchadoAlterar.getText());
            alterar.setHora(jTextFieldHoraCompromissoAchadoAlterar.getText());
            alterar.setData(jFormattedTextData.getText());
            alterar.setInfo(jTextAreaInfoCompromissoAchadoAlterar.getText());

            GerenciadorBD.alterarCompromisso(alterar,dataFomatador.format(jDateChooserAlterarE.getDate()),jComboBoxCompromisso.getSelectedItem().toString(),AuxCompromissoUsuario.getIdUC());

            this.dispose();
        }
    }//GEN-LAST:event_jToggleButtonCompromissoAlterarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSelecionar;
    private javax.swing.JComboBox<String> jComboBoxCompromisso;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooserAlterarE;
    private javax.swing.JFormattedTextField jFormattedTextData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaInfoCompromissoAchadoAlterar;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JFormattedTextField jTextFieldHoraCompromissoAchadoAlterar;
    private javax.swing.JTextField jTextFieldNomeCompromissoAchadoAlterar;
    private javax.swing.JToggleButton jToggleButtonCompromissoAlterar;
    private javax.swing.JToggleButton jToggleButtonEncontrarAlterar;
    // End of variables declaration//GEN-END:variables
}
