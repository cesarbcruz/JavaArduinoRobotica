/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cesar.javaarduinorobotica;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.Duration;
import java.time.Instant;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author cesar
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    Arduino arduino = null;
    LinkedList<Comando> gravacao = new LinkedList<Comando>();
    private long delayAcumuladoBase = 0;
    private long delayAcumuladoDistancia = 0;
    private long delayAcumuladoGarra = 0;
    private long delayAcumuladoAltura = 0;

    public MainForm() {
        initComponents();
        listaComando.setModel(new DefaultListModel<>());
        arduino = new Arduino();
        abrir();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        valorBase = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        valorGarra = new javax.swing.JSpinner();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        valorAltura = new javax.swing.JSpinner();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        valorDistancia = new javax.swing.JSpinner();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        reproduzir = new javax.swing.JButton();
        repetir = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaComando = new javax.swing.JList<>();
        jSeparator1 = new javax.swing.JSeparator();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Base"));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        valorBase.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        valorBase.setModel(new javax.swing.SpinnerNumberModel(90, 0, 180, 5));
        valorBase.setEditor(new javax.swing.JSpinner.NumberEditor(valorBase, ""));
        valorBase.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                valorBaseStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(valorBase, gridBagConstraints);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cesar/javaarduinorobotica/imagens/Actions-go-previous-icon.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        jPanel1.add(jButton1, gridBagConstraints);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cesar/javaarduinorobotica/imagens/Actions-go-next-icon.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        jPanel1.add(jButton2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jPanel1, gridBagConstraints);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Garra"));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        valorGarra.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        valorGarra.setModel(new javax.swing.SpinnerNumberModel(90, 0, 180, 5));
        valorGarra.setEditor(new javax.swing.JSpinner.NumberEditor(valorGarra, ""));
        valorGarra.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                valorGarraStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weightx = 1.0;
        jPanel2.add(valorGarra, gridBagConstraints);

        jButton7.setText("Abrir");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel2.add(jButton7, gridBagConstraints);

        jButton8.setText("Fechar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel2.add(jButton8, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jPanel2, gridBagConstraints);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Antebraço"));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        valorAltura.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        valorAltura.setModel(new javax.swing.SpinnerNumberModel(90, 0, 180, 5));
        valorAltura.setEditor(new javax.swing.JSpinner.NumberEditor(valorAltura, ""));
        valorAltura.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                valorAlturaStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel3.add(valorAltura, gridBagConstraints);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cesar/javaarduinorobotica/imagens/Actions-go-previous-icon.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel3.add(jButton5, gridBagConstraints);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cesar/javaarduinorobotica/imagens/Actions-go-next-icon.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        jPanel3.add(jButton6, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jPanel3, gridBagConstraints);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Braço"));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        valorDistancia.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        valorDistancia.setModel(new javax.swing.SpinnerNumberModel(90, 0, 180, 5));
        valorDistancia.setEditor(new javax.swing.JSpinner.NumberEditor(valorDistancia, ""));
        valorDistancia.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                valorDistanciaStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel4.add(valorDistancia, gridBagConstraints);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cesar/javaarduinorobotica/imagens/Actions-go-top-icon.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel4.add(jButton3, gridBagConstraints);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cesar/javaarduinorobotica/imagens/Actions-go-bottom-icon.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel4.add(jButton4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jPanel4, gridBagConstraints);

        reproduzir.setText("Reproduzir Tudo");
        reproduzir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reproduzirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(reproduzir, gridBagConstraints);

        repetir.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        getContentPane().add(repetir, gridBagConstraints);

        listaComando.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaComandoMouseClicked(evt);
            }
        });
        listaComando.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                listaComandoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(listaComando);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jScrollPane1, gridBagConstraints);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        getContentPane().add(jSeparator1, gridBagConstraints);

        jButton9.setText("Gravar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(jButton9, gridBagConstraints);

        jButton10.setText("Posição Inicial");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(jButton10, gridBagConstraints);

        jButton11.setText("Reproduzir Selecionados");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        getContentPane().add(jButton11, gridBagConstraints);

        setSize(new java.awt.Dimension(860, 439));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void valorBaseStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_valorBaseStateChanged
        delayAcumuladoBase += enviaComando(ServoEnum.BASE.getIdentificador(), (int) valorBase.getValue());
    }//GEN-LAST:event_valorBaseStateChanged

    private void valorDistanciaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_valorDistanciaStateChanged
        delayAcumuladoDistancia += enviaComando(ServoEnum.DISTANCIA.getIdentificador(), (int) valorDistancia.getValue());
    }//GEN-LAST:event_valorDistanciaStateChanged

    private void valorGarraStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_valorGarraStateChanged
        delayAcumuladoGarra += enviaComando(ServoEnum.GARRA.getIdentificador(), (int) valorGarra.getValue());
    }//GEN-LAST:event_valorGarraStateChanged

    private void valorAlturaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_valorAlturaStateChanged
        delayAcumuladoAltura += enviaComando(ServoEnum.ALTURA.getIdentificador(), (int) valorAltura.getValue());
    }//GEN-LAST:event_valorAlturaStateChanged

    private void reproduzirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reproduzirActionPerformed
        if (gravacao.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Não existe gravação para reproduzir!");
        } else {
            try {
                resetPosicao();
                Thread.sleep(100);
                int qtde = Integer.parseInt(repetir.getValue().toString());
                reproduzir(qtde);
                
            } catch (InterruptedException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao reproduzir:\n" + ex.getMessage());
            }
        }
    }//GEN-LAST:event_reproduzirActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (valorAltura.getModel().getNextValue() != null) {
            valorAltura.getModel().setValue(valorAltura.getModel().getNextValue());
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (valorBase.getModel().getPreviousValue() != null) {
            valorBase.getModel().setValue(valorBase.getModel().getPreviousValue());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (valorBase.getModel().getNextValue() != null) {
            valorBase.getModel().setValue(valorBase.getModel().getNextValue());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (valorDistancia.getModel().getPreviousValue() != null) {
            valorDistancia.getModel().setValue(valorDistancia.getModel().getPreviousValue());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (valorDistancia.getModel().getNextValue() != null) {
            valorDistancia.getModel().setValue(valorDistancia.getModel().getNextValue());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (valorAltura.getModel().getPreviousValue() != null) {
            valorAltura.getModel().setValue(valorAltura.getModel().getPreviousValue());
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (valorGarra.getModel().getNextValue() != null) {
            valorGarra.getModel().setValue(valorGarra.getModel().getNextValue());
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (valorGarra.getModel().getPreviousValue() != null) {
            valorGarra.getModel().setValue(valorGarra.getModel().getPreviousValue());
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void listaComandoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaComandoMouseClicked
        if(evt.getClickCount()==2){
            editarComando();
        }
    }//GEN-LAST:event_listaComandoMouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        gravarComando();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void listaComandoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listaComandoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            removerComando();
        }
    }//GEN-LAST:event_listaComandoKeyReleased

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        resetPosicao();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        if (gravacao.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Não existe gravação para reproduzir!");
        } else {
            try {
                resetPosicao();
                Thread.sleep(100);
                int qtde = Integer.parseInt(repetir.getValue().toString());
                for (int i = 0; i < qtde; i++) {
                    reproduzirSelecionados();
                }
            } catch (InterruptedException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao reproduzir:\n" + ex.getMessage());
            }
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private long enviaComando(String identificador, int posicao) {
        Instant before = Instant.now();
        String comando = identificador + (String.format("%02d", posicao));
        arduino.comunicacaoArduino(comando);
        Instant after = Instant.now();
        long delta = Duration.between(before, after).toMillis() * 120;
        return delta;
    }

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList<String> listaComando;
    private javax.swing.JSpinner repetir;
    private javax.swing.JButton reproduzir;
    private javax.swing.JSpinner valorAltura;
    private javax.swing.JSpinner valorBase;
    private javax.swing.JSpinner valorDistancia;
    private javax.swing.JSpinner valorGarra;
    // End of variables declaration//GEN-END:variables

    private void gravarComando() {

        gravaComando(ServoEnum.BASE.getIdentificador(), (int) valorBase.getValue(), delayAcumuladoBase);
        delayAcumuladoBase = 0;

        gravaComando(ServoEnum.DISTANCIA.getIdentificador(), (int) valorDistancia.getValue(), delayAcumuladoDistancia);
        delayAcumuladoDistancia = 0;

        gravaComando(ServoEnum.GARRA.getIdentificador(), (int) valorGarra.getValue(), delayAcumuladoGarra);
        delayAcumuladoAltura = 0;

        gravaComando(ServoEnum.ALTURA.getIdentificador(), (int) valorAltura.getValue(), delayAcumuladoAltura);
        delayAcumuladoAltura = 0;

        salvar();
    }

    private void resetPosicao() {
        enviaComando(ServoEnum.ALTURA.getIdentificador(), 90);
        enviaComando(ServoEnum.BASE.getIdentificador(), 90);
        enviaComando(ServoEnum.DISTANCIA.getIdentificador(), 90);
        enviaComando(ServoEnum.GARRA.getIdentificador(), 90);
        valorAltura.setValue(90);
        valorBase.setValue(90);
        valorDistancia.setValue(90);
        valorGarra.setValue(90);

        delayAcumuladoBase = 0;
        delayAcumuladoDistancia = 0;
        delayAcumuladoGarra = 0;
        delayAcumuladoAltura = 0;
    }

    private void reproduzir(int qtde) throws InterruptedException {
        Thread worker = new Thread() {
            public void run() {
                for (int i = 0; i < qtde; i++) {
                for (Comando comando : gravacao) {                    

                    if (comando.getIdentificadorServo().equals(ServoEnum.ALTURA.getIdentificador())) {
                        valorAltura.getModel().setValue(comando.getPosicao());
                    } else if (comando.getIdentificadorServo().equals(ServoEnum.BASE.getIdentificador())) {
                        valorBase.getModel().setValue(comando.getPosicao());
                    } else if (comando.getIdentificadorServo().equals(ServoEnum.DISTANCIA.getIdentificador())) {
                        valorDistancia.getModel().setValue(comando.getPosicao());
                    } else if (comando.getIdentificadorServo().equals(ServoEnum.GARRA.getIdentificador())) {
                        valorGarra.getModel().setValue(comando.getPosicao());
                    }
                    try {
                        Thread.sleep(comando.getDelay());
                    } catch (InterruptedException ex) {
                        Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            }
        };
        worker.start();
    }

    private void reproduzirSelecionados() throws InterruptedException {
        Thread worker = new Thread() {
            public void run() {

                for (Object obj : listaComando.getSelectedValues()) {
                    Comando comando = (Comando) obj;
                    if (comando.getIdentificadorServo().equals(ServoEnum.ALTURA.getIdentificador())) {
                        valorAltura.getModel().setValue(comando.getPosicao());
                    } else if (comando.getIdentificadorServo().equals(ServoEnum.BASE.getIdentificador())) {
                        valorBase.getModel().setValue(comando.getPosicao());
                    } else if (comando.getIdentificadorServo().equals(ServoEnum.DISTANCIA.getIdentificador())) {
                        valorDistancia.getModel().setValue(comando.getPosicao());
                    } else if (comando.getIdentificadorServo().equals(ServoEnum.GARRA.getIdentificador())) {
                        valorGarra.getModel().setValue(comando.getPosicao());
                    }
                    try {
                        Thread.sleep(comando.getDelay());
                    } catch (InterruptedException ex) {
                        Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };
        worker.start();
    }

    private void salvar() {
        try {
            FileOutputStream fileOut = new FileOutputStream("gravacao");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(gravacao);
            out.close();
            fileOut.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao salvar arquivo de gravação:\n" + e.getMessage());
        }
    }

    private void abrir() {
        resetPosicao();
        try {
            if (new File("gravacao").exists()) {
                FileInputStream fileIn = new FileInputStream("gravacao");
                ObjectInputStream in = new ObjectInputStream(fileIn);
                gravacao = (LinkedList<Comando>) in.readObject();
                in.close();
                fileIn.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao abrir arquivo de gravação:\n" + e.getMessage());
        }

        carregarListaComando();
    }

    private void carregarListaComando() {
        DefaultListModel model = (DefaultListModel) listaComando.getModel();
        model.removeAllElements();
        for (Comando comando : gravacao) {
            model.addElement(comando);
        }

    }

    private void gravaComando(String identificador, int posicao, long delay) {
        Comando novoComando = new Comando(identificador, posicao, (int) delay);
        gravacao.add(novoComando);
        carregarListaComando();

    }

    private void removerComando() {
        if (listaComando.getSelectedIndex() > -1) {

            int reply = JOptionPane.showConfirmDialog(rootPane, "Deseja remover o comando selecionado?", "Confirma", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                gravacao.removeAll(listaComando.getSelectedValuesList());
                salvar();
                carregarListaComando();
            }

        }
    }

    private void editarComando() {
        Comando comando = (Comando)((DefaultListModel)listaComando.getModel()).getElementAt(listaComando.getSelectedIndex());
        new EditarComando(this, rootPaneCheckingEnabled, comando).setVisible(true);
        salvar();
        carregarListaComando();
    }
}
