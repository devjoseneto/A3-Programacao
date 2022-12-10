/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import REPOSITORY.UsuarioRepository;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author netoi
 */
public class FormEditarPerfilVIEW extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public FormEditarPerfilVIEW() {
        initComponents();
        txtUserID.setEnabled(false);
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        txtBiografia.setLineWrap(true);
        txtBiografia.setWrapStyleWord(true);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuTopo = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        btnEditarPerfilPerfil = new javax.swing.JButton();
        btnEditarPerfilPesquisar = new javax.swing.JButton();
        btnEditarPerfilEquipe = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        checkMasc = new javax.swing.JCheckBox();
        checkFem = new javax.swing.JCheckBox();
        lblCidade = new javax.swing.JLabel();
        cbCidade = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtUserID = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtEmail1 = new javax.swing.JTextField();
        txtEmail3 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtEmail4 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtBiografia = new javax.swing.JTextArea();
        lblNome2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuTopo.setLayout(null);

        btnHome.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setBorderPainted(false);
        btnHome.setContentAreaFilled(false);
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        menuTopo.add(btnHome);
        btnHome.setBounds(30, 10, 100, 30);

        Logo.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        Logo.setForeground(new java.awt.Color(255, 255, 255));
        Logo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Logo.setText("ArenaAPP");
        menuTopo.add(Logo);
        Logo.setBounds(40, 10, 110, 30);

        btnEditarPerfilPerfil.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        btnEditarPerfilPerfil.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarPerfilPerfil.setText("Perfil");
        btnEditarPerfilPerfil.setBorderPainted(false);
        btnEditarPerfilPerfil.setContentAreaFilled(false);
        btnEditarPerfilPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarPerfilPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPerfilPerfilActionPerformed(evt);
            }
        });
        menuTopo.add(btnEditarPerfilPerfil);
        btnEditarPerfilPerfil.setBounds(832, 10, 90, 30);

        btnEditarPerfilPesquisar.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        btnEditarPerfilPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarPerfilPesquisar.setText("Pesquisar");
        btnEditarPerfilPesquisar.setBorderPainted(false);
        btnEditarPerfilPesquisar.setContentAreaFilled(false);
        btnEditarPerfilPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarPerfilPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPerfilPesquisarActionPerformed(evt);
            }
        });
        menuTopo.add(btnEditarPerfilPesquisar);
        btnEditarPerfilPesquisar.setBounds(540, 10, 130, 30);

        btnEditarPerfilEquipe.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        btnEditarPerfilEquipe.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarPerfilEquipe.setText("Equipe");
        btnEditarPerfilEquipe.setBorderPainted(false);
        btnEditarPerfilEquipe.setContentAreaFilled(false);
        btnEditarPerfilEquipe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarPerfilEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPerfilEquipeActionPerformed(evt);
            }
        });
        menuTopo.add(btnEditarPerfilEquipe);
        btnEditarPerfilEquipe.setBounds(680, 10, 140, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundo-menu-topo.png"))); // NOI18N
        menuTopo.add(jLabel2);
        jLabel2.setBounds(0, 0, 960, 50);

        getContentPane().add(menuTopo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 50));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(null);

        btnSalvar.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.setBorderPainted(false);
        btnSalvar.setContentAreaFilled(false);
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jPanel3.add(btnSalvar);
        btnSalvar.setBounds(270, 400, 160, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botaoEditarPerfil.png"))); // NOI18N
        jPanel3.add(jLabel3);
        jLabel3.setBounds(270, 390, 160, 40);

        jLabel12.setFont(new java.awt.Font("Lucida Sans", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(116, 116, 116));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Sexo");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(20, 380, 29, 14);

        checkMasc.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        checkMasc.setForeground(new java.awt.Color(116, 116, 116));
        checkMasc.setText("Masc");
        checkMasc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        checkMasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMascActionPerformed(evt);
            }
        });
        jPanel3.add(checkMasc);
        checkMasc.setBounds(20, 400, 60, 19);

        checkFem.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        checkFem.setForeground(new java.awt.Color(116, 116, 116));
        checkFem.setText("Fem");
        checkFem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        checkFem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkFemActionPerformed(evt);
            }
        });
        jPanel3.add(checkFem);
        checkFem.setBounds(80, 400, 48, 19);

        lblCidade.setFont(new java.awt.Font("Lucida Sans", 1, 11)); // NOI18N
        lblCidade.setForeground(new java.awt.Color(116, 116, 116));
        lblCidade.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCidade.setText("Cidade");
        jPanel3.add(lblCidade);
        lblCidade.setBounds(230, 200, 50, 14);

        cbCidade.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        cbCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Guanambi-BA", "Caetité-BA", "Igaporã-BA" }));
        cbCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCidadeActionPerformed(evt);
            }
        });
        jPanel3.add(cbCidade);
        cbCidade.setBounds(230, 220, 190, 30);

        jLabel11.setFont(new java.awt.Font("Lucida Sans", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(116, 116, 116));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("User ID");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(340, 20, 60, 14);

        txtUserID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserIDActionPerformed(evt);
            }
        });
        jPanel3.add(txtUserID);
        txtUserID.setBounds(340, 40, 80, 30);

        lblNome.setFont(new java.awt.Font("Lucida Sans", 1, 11)); // NOI18N
        lblNome.setForeground(new java.awt.Color(116, 116, 116));
        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNome.setText("Nome");
        jPanel3.add(lblNome);
        lblNome.setBounds(20, 20, 40, 14);

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        jPanel3.add(txtNome);
        txtNome.setBounds(20, 40, 300, 30);

        jLabel16.setFont(new java.awt.Font("Lucida Sans", 1, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(116, 116, 116));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Data de Nascimento");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(20, 200, 130, 14);

        txtEmail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmail1ActionPerformed(evt);
            }
        });
        jPanel3.add(txtEmail1);
        txtEmail1.setBounds(20, 220, 190, 30);

        txtEmail3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmail3ActionPerformed(evt);
            }
        });
        jPanel3.add(txtEmail3);
        txtEmail3.setBounds(230, 340, 190, 30);

        jLabel18.setFont(new java.awt.Font("Lucida Sans", 1, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(116, 116, 116));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("Confirmar Senha");
        jPanel3.add(jLabel18);
        jLabel18.setBounds(230, 320, 100, 14);

        txtEmail4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmail4ActionPerformed(evt);
            }
        });
        jPanel3.add(txtEmail4);
        txtEmail4.setBounds(20, 340, 190, 30);

        txtBiografia.setColumns(20);
        txtBiografia.setRows(5);
        jScrollPane2.setViewportView(txtBiografia);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(20, 100, 400, 86);

        lblNome2.setFont(new java.awt.Font("Lucida Sans", 1, 11)); // NOI18N
        lblNome2.setForeground(new java.awt.Color(116, 116, 116));
        lblNome2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNome2.setText("Biografia");
        jPanel3.add(lblNome2);
        lblNome2.setBounds(20, 80, 70, 20);

        jLabel14.setFont(new java.awt.Font("Lucida Sans", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(116, 116, 116));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Email");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(20, 260, 32, 14);
        jPanel3.add(txtEmail);
        txtEmail.setBounds(20, 280, 400, 30);

        jLabel19.setFont(new java.awt.Font("Lucida Sans", 1, 11)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(116, 116, 116));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("Nova Senha");
        jPanel3.add(jLabel19);
        jLabel19.setBounds(20, 320, 80, 14);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 440, 440));

        jPanel2.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Lucida Sans", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(116, 116, 116));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Sem equipe");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(60, 380, 310, 25);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/escudo-placeholder.png"))); // NOI18N
        jPanel2.add(jLabel9);
        jLabel9.setBounds(50, 20, 330, 330);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundo-user-time.png"))); // NOI18N
        jPanel2.add(jLabel8);
        jLabel8.setBounds(0, 0, 420, 440);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 420, 440));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundo-padrao.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtUserIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserIDActionPerformed

    private void cbCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCidadeActionPerformed

    private void btnEditarPerfilPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPerfilPerfilActionPerformed
        TelaPerfilVIEW j = new TelaPerfilVIEW();
        this.dispose();
        j.setVisible(true);
    }//GEN-LAST:event_btnEditarPerfilPerfilActionPerformed

    private void btnEditarPerfilPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPerfilPesquisarActionPerformed
        TelaPesquisaVIEW j = new TelaPesquisaVIEW();
        this.dispose();
        j.setVisible(true);
    }//GEN-LAST:event_btnEditarPerfilPesquisarActionPerformed

    private void btnEditarPerfilEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPerfilEquipeActionPerformed
        TelaEquipeVIEW j = new TelaEquipeVIEW();
        this.dispose();
        j.setVisible(true);
    }//GEN-LAST:event_btnEditarPerfilEquipeActionPerformed

    private void checkMascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMascActionPerformed
        checkFem.setSelected(false);
    }//GEN-LAST:event_checkMascActionPerformed

    private void checkFemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkFemActionPerformed
        checkMasc.setSelected(false);
    }//GEN-LAST:event_checkFemActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHomeActionPerformed

    private void txtEmail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmail1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmail1ActionPerformed

    private void txtEmail3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmail3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmail3ActionPerformed

    private void txtEmail4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmail4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmail4ActionPerformed

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
            java.util.logging.Logger.getLogger(FormEditarPerfilVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormEditarPerfilVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormEditarPerfilVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormEditarPerfilVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormEditarPerfilVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JButton btnEditarPerfilEquipe;
    private javax.swing.JButton btnEditarPerfilPerfil;
    private javax.swing.JButton btnEditarPerfilPesquisar;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbCidade;
    private javax.swing.JCheckBox checkFem;
    private javax.swing.JCheckBox checkMasc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome2;
    private javax.swing.JPanel menuTopo;
    private javax.swing.JTextArea txtBiografia;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmail1;
    private javax.swing.JTextField txtEmail3;
    private javax.swing.JTextField txtEmail4;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtUserID;
    // End of variables declaration//GEN-END:variables
}
