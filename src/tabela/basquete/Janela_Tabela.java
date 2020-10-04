/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tabela.basquete;

import java.util.ArrayList;
import static tabela.basquete.Classes.*;
import tabela.basquete.Classes.Pontuacao;
import Frames.Aviso;

/**
 *
 * @author Alexandre
 */
public class Janela_Tabela extends javax.swing.JFrame {
    /**
     * Creates new form Janela_Tabela
     */
    public Janela_Tabela() {
        
        ArrayList<Pontuacao> tabelaPontos = new ArrayList<>();
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel9 = new javax.swing.JLabel();
        jLabelTabelaPontos = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButtonConfirma = new javax.swing.JButton();
        jCampoTextoPlacar = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabelTJogoAtual = new javax.swing.JLabel();
        jLabelTMaiorPontuacao = new javax.swing.JLabel();
        jLabelTMenorPontuacao = new javax.swing.JLabel();
        jLabelVJogoAtual = new javax.swing.JLabel();
        jLabelVMaiorPontuacao = new javax.swing.JLabel();
        jLabelTRecordeMaior = new javax.swing.JLabel();
        jLabelVMenorPontuacao = new javax.swing.JLabel();
        jLabelTReecordeMenor = new javax.swing.JLabel();
        jLabelVRecordesMaior = new javax.swing.JLabel();
        jLabelVRecordesMenor = new javax.swing.JLabel();
        jButtonConfirma1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 199, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabelTabelaPontos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelTabelaPontos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTabelaPontos.setText("Tabela de Pontos");
        jLabelTabelaPontos.setToolTipText("");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Inserir novo Placar:");

        jButtonConfirma.setText("Confirma");
        jButtonConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmaActionPerformed(evt);
            }
        });

        jCampoTextoPlacar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCampoTextoPlacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCampoTextoPlacarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCampoTextoPlacar))
                        .addGap(22, 22, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButtonConfirma)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCampoTextoPlacar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonConfirma)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelTJogoAtual.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelTJogoAtual.setText("Jogo Atual:");

        jLabelTMaiorPontuacao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelTMaiorPontuacao.setText("Maior Pontuação da Temporada:");

        jLabelTMenorPontuacao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelTMenorPontuacao.setText("Menor Pontuação da Temporada:");

        jLabelVJogoAtual.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelVJogoAtual.setText("-");

        jLabelVMaiorPontuacao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelVMaiorPontuacao.setText("-");

        jLabelTRecordeMaior.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelTRecordeMaior.setText("Recordes quebrados de maior Pontuação:");

        jLabelVMenorPontuacao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelVMenorPontuacao.setText("-");

        jLabelTReecordeMenor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelTReecordeMenor.setText("Recordes quebrados de menor Pontuação:");

        jLabelVRecordesMaior.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelVRecordesMaior.setText("-");

        jLabelVRecordesMenor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelVRecordesMenor.setText("-");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelTJogoAtual)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelVJogoAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTReecordeMenor)
                            .addComponent(jLabelTRecordeMaior)
                            .addComponent(jLabelTMenorPontuacao)
                            .addComponent(jLabelTMaiorPontuacao))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelVMaiorPontuacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelVMenorPontuacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelVRecordesMaior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelVRecordesMenor, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTJogoAtual)
                    .addComponent(jLabelVJogoAtual))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabelVMaiorPontuacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelVMenorPontuacao)
                            .addComponent(jLabelTMenorPontuacao)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabelTMaiorPontuacao)))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTRecordeMaior)
                    .addComponent(jLabelVRecordesMaior))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTReecordeMenor)
                    .addComponent(jLabelVRecordesMenor))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jButtonConfirma1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonConfirma1.setText("Consulta");
        jButtonConfirma1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirma1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Consulta pontuação");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText(" detalhada da tamporada:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jButtonConfirma1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel2)))))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTabelaPontos)
                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabelTabelaPontos)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jButtonConfirma1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmaActionPerformed
        // Adiciona pontuação na tabela;
        
        //A função TextoParaNumero transforma os dados digitados no campo de texto
        //em um numero int. Caso a string digitada não seja válida, -1 é retornado
        int ponto = TextoParaNumero(jCampoTextoPlacar.getText());
       
        if(ponto<0){
            jCampoTextoPlacar.setText("");
            //mensagem de erro; 
            Aviso jErro = new Aviso();
            jErro.AtualizaAviso("Apenas Números inteiros positivos são permitidos!");
            jErro.setVisible(true);
       
       }else if (ponto > 1000){
            jCampoTextoPlacar.setText("");
            //mensagem de erro; 
            Aviso jErro = new Aviso();
            jErro.AtualizaAviso2("Mais de 1000 pontos não são aceitos na tabela.","O recorde Mundial é 100 pontos, se você fez mais que 1000, procure a NBA ou a NASA.");
            jErro.setVisible(true);
       
       }else{
            int numeroJogos = tabelaPontos.size();
            Pontuacao resultadoPartida = new Pontuacao();
            //Insere a pontução da partida, e o número do jogo;
            resultadoPartida.AdicionaPontuacao(ponto);
            
            if (numeroJogos==0 ){
                numeroJogos=1;
                //Primeira pontuação
                resultadoPartida.InserePontuacao(1, ponto, ponto, 0, 0);
                      
            }else{
                
                int minTemp = (tabelaPontos.get(numeroJogos-1)).retornaRecordeMinimo();
                int maxTemp = (tabelaPontos.get(numeroJogos-1)).retornaRecordeMaximo();
                int recordeMin = (tabelaPontos.get(numeroJogos-1)).retornaQuebrasRecordeMinimo();
                int recordeMax = (tabelaPontos.get(numeroJogos-1)).retornaQuebrasRecordeMaximo();   

                if(ponto<minTemp ){                  
                    minTemp = ponto; 
                    recordeMin++;
                }else if(ponto>maxTemp ){                  
                    maxTemp = ponto;
                    recordeMax++;
                }
                
                numeroJogos++;
                resultadoPartida.InserePontuacao(numeroJogos, minTemp, maxTemp, recordeMin, recordeMax);

            } 
            
            tabelaPontos.add(resultadoPartida);
            jLabelVJogoAtual.setText(numeroJogos+"");
            jLabelVMaiorPontuacao.setText(tabelaPontos.get(numeroJogos-1).retornaRecordeMaximo()+"");
            jLabelVMenorPontuacao.setText(tabelaPontos.get(numeroJogos-1).retornaRecordeMinimo()+"");
            jLabelVRecordesMaior.setText(tabelaPontos.get(numeroJogos-1).retornaQuebrasRecordeMaximo()+"");
            jLabelVRecordesMenor.setText(tabelaPontos.get(numeroJogos-1).retornaQuebrasRecordeMinimo()+"");
            jCampoTextoPlacar.setText("");
            jCampoTextoPlacar.requestFocus();
            
            this.repaint();

       }
    }//GEN-LAST:event_jButtonConfirmaActionPerformed

    private void jButtonConfirma1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirma1ActionPerformed
        // TODO add your handling code here:
        JanelaConsulta jConsulta;
        jConsulta = new JanelaConsulta(tabelaPontos);       
        jConsulta.setVisible(true);
        
        
    }//GEN-LAST:event_jButtonConfirma1ActionPerformed

    private void jCampoTextoPlacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCampoTextoPlacarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCampoTextoPlacarActionPerformed

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
            java.util.logging.Logger.getLogger(Janela_Tabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Janela_Tabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Janela_Tabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Janela_Tabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Janela_Tabela().setVisible(true);
            }
        });
    }

    //tabelaPontos contem os dados que vão alimentar a tabela
    ArrayList<Pontuacao> tabelaPontos = new ArrayList<Pontuacao>();
    
    //precisa de função para verificar dados anteriores
    
    //public ArrayList<Pontuacao> AdicionaPontuacao (ArrayList<Pontuacao> tabela, int pts){    };
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConfirma;
    private javax.swing.JButton jButtonConfirma1;
    private javax.swing.JTextField jCampoTextoPlacar;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelTJogoAtual;
    private javax.swing.JLabel jLabelTMaiorPontuacao;
    private javax.swing.JLabel jLabelTMenorPontuacao;
    private javax.swing.JLabel jLabelTRecordeMaior;
    private javax.swing.JLabel jLabelTReecordeMenor;
    private javax.swing.JLabel jLabelTabelaPontos;
    private javax.swing.JLabel jLabelVJogoAtual;
    private javax.swing.JLabel jLabelVMaiorPontuacao;
    private javax.swing.JLabel jLabelVMenorPontuacao;
    private javax.swing.JLabel jLabelVRecordesMaior;
    private javax.swing.JLabel jLabelVRecordesMenor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

