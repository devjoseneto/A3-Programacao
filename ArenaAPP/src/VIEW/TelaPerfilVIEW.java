/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import MODELS.UsuarioModel;
import REPOSITORY.UsuarioRepository;
import SERVICES.UsuarioService;

/**
 *
 * @author netoi
 */
public class TelaPerfilVIEW extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public TelaPerfilVIEW() {
        initComponents();
        readUsuario();

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
        btnPerfilEditarPerfil = new javax.swing.JButton();
        btnPerfilPesquisar = new javax.swing.JButton();
        btnPerfilEquipe = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnSair = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        cbCidade = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtUserID = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtIdade = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtBiografia = new javax.swing.JTextArea();
        lblNome2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ArenaAPP");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/ArenaAPP-Logo.png")).getImage());
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

        btnPerfilEditarPerfil.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        btnPerfilEditarPerfil.setForeground(new java.awt.Color(255, 255, 255));
        btnPerfilEditarPerfil.setText("Perfil");
        btnPerfilEditarPerfil.setBorderPainted(false);
        btnPerfilEditarPerfil.setContentAreaFilled(false);
        btnPerfilEditarPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPerfilEditarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilEditarPerfilActionPerformed(evt);
            }
        });
        menuTopo.add(btnPerfilEditarPerfil);
        btnPerfilEditarPerfil.setBounds(812, 10, 130, 30);

        btnPerfilPesquisar.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        btnPerfilPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btnPerfilPesquisar.setText("Pesquisar");
        btnPerfilPesquisar.setBorderPainted(false);
        btnPerfilPesquisar.setContentAreaFilled(false);
        btnPerfilPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPerfilPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilPesquisarActionPerformed(evt);
            }
        });
        menuTopo.add(btnPerfilPesquisar);
        btnPerfilPesquisar.setBounds(540, 10, 130, 30);

        btnPerfilEquipe.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        btnPerfilEquipe.setForeground(new java.awt.Color(255, 255, 255));
        btnPerfilEquipe.setText("Equipe");
        btnPerfilEquipe.setBorderPainted(false);
        btnPerfilEquipe.setContentAreaFilled(false);
        btnPerfilEquipe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPerfilEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilEquipeActionPerformed(evt);
            }
        });
        menuTopo.add(btnPerfilEquipe);
        btnPerfilEquipe.setBounds(680, 10, 130, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundo-menu-topo.png"))); // NOI18N
        menuTopo.add(jLabel2);
        jLabel2.setBounds(0, 0, 960, 50);

        getContentPane().add(menuTopo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 50));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(null);

        btnSair.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("Sair");
        btnSair.setBorderPainted(false);
        btnSair.setContentAreaFilled(false);
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jPanel3.add(btnSair);
        btnSair.setBounds(170, 400, 120, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botao120x30.png"))); // NOI18N
        jPanel3.add(jLabel4);
        jLabel4.setBounds(170, 390, 120, 40);

        btnSalvar.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Editar");
        btnSalvar.setBorderPainted(false);
        btnSalvar.setContentAreaFilled(false);
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jPanel3.add(btnSalvar);
        btnSalvar.setBounds(300, 400, 120, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botao120x30.png"))); // NOI18N
        jPanel3.add(jLabel3);
        jLabel3.setBounds(300, 390, 120, 40);

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
        jLabel16.setText("Idade");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(20, 200, 130, 14);

        txtIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdadeActionPerformed(evt);
            }
        });
        jPanel3.add(txtIdade);
        txtIdade.setBounds(20, 220, 190, 30);

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

    private void btnPerfilEditarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilEditarPerfilActionPerformed
        if (UsuarioRepository.usuarioLogado.isLogado()) {
            TelaPerfilVIEW j = new TelaPerfilVIEW();
            this.dispose();
            j.setVisible(true);
        } else {
            FormLoginVIEW j = new FormLoginVIEW();
            this.dispose();
            j.setVisible(true);
        }
    }//GEN-LAST:event_btnPerfilEditarPerfilActionPerformed

    private void btnPerfilPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilPesquisarActionPerformed
        TelaPesquisaVIEW j = new TelaPesquisaVIEW();
        this.dispose();
        j.setVisible(true);
    }//GEN-LAST:event_btnPerfilPesquisarActionPerformed

    private void btnPerfilEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilEquipeActionPerformed
        if (UsuarioRepository.usuarioLogado.isLogado()) {
            if (UsuarioRepository.usuarioLogado.getId_equipe() != 0) {
                TelaEquipeVIEW j = new TelaEquipeVIEW();
                this.dispose();
                j.setVisible(true);
            } else {
                FormEditarEquipeVIEW j = new FormEditarEquipeVIEW();
                this.dispose();
                j.setVisible(true);
            }
        } else {
            FormLoginVIEW j = new FormLoginVIEW();
            this.dispose();
            j.setVisible(true);
        }
    }//GEN-LAST:event_btnPerfilEquipeActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        TelaInicialVIEW j = new TelaInicialVIEW();
        j.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        FormEditarPerfilVIEW j = new FormEditarPerfilVIEW();
        j.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void cbCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCidadeActionPerformed

    private void txtUserIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserIDActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdadeActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        UsuarioRepository.usuarioLogado = new UsuarioModel();
        TelaInicialVIEW j = new TelaInicialVIEW();
        j.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPerfilVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPerfilVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPerfilVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPerfilVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPerfilVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnPerfilEditarPerfil;
    private javax.swing.JButton btnPerfilEquipe;
    private javax.swing.JButton btnPerfilPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbCidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtUserID;
    // End of variables declaration//GEN-END:variables

    public void readUsuario() {
        
        UsuarioModel usuario = new UsuarioModel();
        usuario.setId_usuario(UsuarioRepository.usuarioLogado.getId_usuario());
        UsuarioService service = new UsuarioService();
        usuario = service.readUsuario(usuario);
        
        txtNome.setText(usuario.getNome());
        txtBiografia.setText(usuario.getBiografia());
        txtUserID.setText(Integer.toString(usuario.getId_usuario()));
        txtIdade.setText(Integer.toString(service.getIdade(usuario.getNascimento())));
        cbCidade.setSelectedItem(usuario.getCidade());

        txtNome.setEnabled(false);
        txtBiografia.setEnabled(false);
        txtUserID.setEnabled(false);
        txtIdade.setEnabled(false);
        cbCidade.setEnabled(false);
    }

}
