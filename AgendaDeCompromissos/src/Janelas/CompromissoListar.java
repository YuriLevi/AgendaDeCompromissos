/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Janelas;

import BD.GerenciadorBD;
import Tipos.Compromisso;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

import java.text.SimpleDateFormat;
import java.text.DateFormat;

/**
 *
 * @author Rizzadinha
 */
public class CompromissoListar extends javax.swing.JInternalFrame {

    /**
     * Creates new form CompromissoListar
     */
    public CompromissoListar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jDateChooserListarData = new com.toedter.calendar.JDateChooser();
        jToggleButtonListarData = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDatas = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldListarNome = new javax.swing.JTextField();
        jToggleButtonListarNome = new javax.swing.JToggleButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaNomes = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jButtonUListar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaUltimos = new javax.swing.JTextArea();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setClosable(true);
        setTitle("CompromissoListar");

        jLabel1.setText("Data:");

        jToggleButtonListarData.setText("Listar");
        jToggleButtonListarData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonListarDataActionPerformed(evt);
            }
        });

        jTextAreaDatas.setColumns(20);
        jTextAreaDatas.setRows(5);
        jScrollPane2.setViewportView(jTextAreaDatas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooserListarData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                        .addComponent(jToggleButtonListarData, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButtonListarData)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jDateChooserListarData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Por Data", jPanel1);

        jLabel2.setText("Nome:");

        jToggleButtonListarNome.setText("Listar");
        jToggleButtonListarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonListarNomeActionPerformed(evt);
            }
        });

        jTextAreaNomes.setColumns(20);
        jTextAreaNomes.setRows(5);
        jScrollPane3.setViewportView(jTextAreaNomes);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldListarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                        .addComponent(jToggleButtonListarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(202, 202, 202))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldListarNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButtonListarNome))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        jTabbedPane1.addTab("Por Nome", jPanel2);

        jButtonUListar.setText("Listar");
        jButtonUListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUListarActionPerformed(evt);
            }
        });

        jTextAreaUltimos.setColumns(20);
        jTextAreaUltimos.setRows(5);
        jScrollPane4.setViewportView(jTextAreaUltimos);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(jButtonUListar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(223, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonUListar)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Últimos", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonUListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUListarActionPerformed
        
        ArrayList<Compromisso> ultimos = new ArrayList<Compromisso>();
        
        ultimos = GerenciadorBD.listarUltimos();
        
        for(int i = 0; i < ultimos.size(); i++){
            
            jTextAreaUltimos.setText( jTextAreaUltimos.getText() + "Id: "+ ultimos.get(i).getId() + "  Nome: " + ultimos.get(i).getNome() + "  Hora:  " + ultimos.get(i).getHora() + "  Data: " + ultimos.get(i).getData()+ "  Info: " + ultimos.get(i).getInfo() + "\n\n"); 
        
        }
        
        
        
    }//GEN-LAST:event_jButtonUListarActionPerformed

    private void jToggleButtonListarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonListarNomeActionPerformed
        
        ArrayList<Compromisso> ultimos = new ArrayList<Compromisso>();
        
        ultimos = GerenciadorBD.listarNomes(jTextFieldListarNome.getText());
        
        for(int i = 0; i < ultimos.size(); i++){
            
            jTextAreaNomes.setText( jTextAreaNomes.getText() + "Id: "+ ultimos.get(i).getId() + "  Nome: " + ultimos.get(i).getNome() + "  Hora:  " + ultimos.get(i).getHora() + "  Data: " + ultimos.get(i).getData()+ "  Info: " + ultimos.get(i).getInfo() + "\n\n"); 
        
        }   
        
    }//GEN-LAST:event_jToggleButtonListarNomeActionPerformed

    private void jToggleButtonListarDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonListarDataActionPerformed
       
        ArrayList<Compromisso> ultimos = new ArrayList<Compromisso>();
        
        DateFormat dataFomatador = new SimpleDateFormat("yyyy/MM/dd"); 
                
        ultimos = GerenciadorBD.listarDatas(dataFomatador.format(jDateChooserListarData.getDate()));
        
        for(int i = 0; i < ultimos.size(); i++){
            
            jTextAreaDatas.setText( jTextAreaDatas.getText() + "Id: "+ ultimos.get(i).getId() + "  Nome: " + ultimos.get(i).getNome() + "  Hora:  " + ultimos.get(i).getHora() + "  Data: " + ultimos.get(i).getData()+ "  Info: " + ultimos.get(i).getInfo() + "\n\n"); 
                    
        }   
        
        
    }//GEN-LAST:event_jToggleButtonListarDataActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonUListar;
    private com.toedter.calendar.JDateChooser jDateChooserListarData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextAreaDatas;
    private javax.swing.JTextArea jTextAreaNomes;
    private javax.swing.JTextArea jTextAreaUltimos;
    private javax.swing.JTextField jTextFieldListarNome;
    private javax.swing.JToggleButton jToggleButtonListarData;
    private javax.swing.JToggleButton jToggleButtonListarNome;
    // End of variables declaration//GEN-END:variables
}
