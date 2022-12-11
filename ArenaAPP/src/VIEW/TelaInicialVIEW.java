/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import REPOSITORY.BancoDeDados;
import REPOSITORY.UsuarioRepository;
import static REPOSITORY.UsuarioRepository.usuarioLogado;

/**
 *
 * @author netoi
 */
public class TelaInicialVIEW extends javax.swing.JFrame {

    public static String navegacao = ""; 
    /**
     * Creates new form Home
     */
    public TelaInicialVIEW() {
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

        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        opcaoMenuPesquisa = new javax.swing.JPanel();
        btnPesquisarPrincipal = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        iconPesquisar = new javax.swing.JLabel();
        fundoPesquisa = new javax.swing.JLabel();
        opcaoMenuCriaTime = new javax.swing.JPanel();
        btnCriarTimePrincipal = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        iconAddEquipeMenu = new javax.swing.JLabel();
        fundoAddEquipe = new javax.swing.JLabel();
        opcaoMenuPerfil = new javax.swing.JPanel();
        btnEditarPerfilPrincipal = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        iconPerfilMenu = new javax.swing.JLabel();
        fundoPerfilMenu = new javax.swing.JLabel();
        menuTopo = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        btnPerfilSecundario = new javax.swing.JButton();
        btnPesquisarSecundario = new javax.swing.JButton();
        btnEquipeSecundario = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ArenaAPP");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/ArenaAPP-Logo.png")).getImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Política de Privavidade");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, -1, -1));

        jButton1.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Termos de Uso");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, -1, -1));

        opcaoMenuPesquisa.setOpaque(false);
        opcaoMenuPesquisa.setLayout(null);

        btnPesquisarPrincipal.setBorderPainted(false);
        btnPesquisarPrincipal.setContentAreaFilled(false);
        btnPesquisarPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisarPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarPrincipalActionPerformed(evt);
            }
        });
        opcaoMenuPesquisa.add(btnPesquisarPrincipal);
        btnPesquisarPrincipal.setBounds(0, 0, 200, 280);

        jLabel9.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(116, 116, 116));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("<html><p style=\"text-align: center;\">Pesquise por equipes<br>que praticam esportes<br>perto de voce</p></html>");
        opcaoMenuPesquisa.add(jLabel9);
        jLabel9.setBounds(20, 220, 150, 50);

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Pesquisar");
        opcaoMenuPesquisa.add(jLabel3);
        jLabel3.setBounds(0, 190, 190, 25);

        iconPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pesquisar-icon.png"))); // NOI18N
        opcaoMenuPesquisa.add(iconPesquisar);
        iconPesquisar.setBounds(30, 40, 130, 130);

        fundoPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/opcao-menu.png"))); // NOI18N
        fundoPesquisa.setText("jLabel3");
        opcaoMenuPesquisa.add(fundoPesquisa);
        fundoPesquisa.setBounds(0, 0, 189, 280);

        getContentPane().add(opcaoMenuPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 190, 280));

        opcaoMenuCriaTime.setOpaque(false);
        opcaoMenuCriaTime.setLayout(null);

        btnCriarTimePrincipal.setBorderPainted(false);
        btnCriarTimePrincipal.setContentAreaFilled(false);
        btnCriarTimePrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCriarTimePrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarTimePrincipalActionPerformed(evt);
            }
        });
        opcaoMenuCriaTime.add(btnCriarTimePrincipal);
        btnCriarTimePrincipal.setBounds(0, 0, 190, 280);

        jLabel10.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(116, 116, 116));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("<html><p style=\"text-align: center;\">Crie sua propria equipe<br>para praticas de esportes<br>perto de voce</p></html>");
        opcaoMenuCriaTime.add(jLabel10);
        jLabel10.setBounds(20, 220, 150, 50);

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Criar Equipe");
        opcaoMenuCriaTime.add(jLabel4);
        jLabel4.setBounds(0, 190, 190, 25);

        iconAddEquipeMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adicionar-equipe.png"))); // NOI18N
        opcaoMenuCriaTime.add(iconAddEquipeMenu);
        iconAddEquipeMenu.setBounds(30, 40, 130, 130);

        fundoAddEquipe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/opcao-menu.png"))); // NOI18N
        fundoAddEquipe.setText("jLabel3");
        opcaoMenuCriaTime.add(fundoAddEquipe);
        fundoAddEquipe.setBounds(0, 0, 189, 280);

        getContentPane().add(opcaoMenuCriaTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 190, 280));

        opcaoMenuPerfil.setOpaque(false);
        opcaoMenuPerfil.setLayout(null);

        btnEditarPerfilPrincipal.setBorderPainted(false);
        btnEditarPerfilPrincipal.setContentAreaFilled(false);
        btnEditarPerfilPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarPerfilPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPerfilPrincipalActionPerformed(evt);
            }
        });
        opcaoMenuPerfil.add(btnEditarPerfilPrincipal);
        btnEditarPerfilPrincipal.setBounds(0, 0, 190, 280);

        jLabel11.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(116, 116, 116));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("<html><p style=\"text-align: center;\">Vizualize e edite<br> as informações do<br>seu perfil</p></html>");
        opcaoMenuPerfil.add(jLabel11);
        jLabel11.setBounds(20, 220, 150, 50);

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Editar Perfil");
        opcaoMenuPerfil.add(jLabel5);
        jLabel5.setBounds(0, 190, 190, 25);

        iconPerfilMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usuario-icon.png"))); // NOI18N
        opcaoMenuPerfil.add(iconPerfilMenu);
        iconPerfilMenu.setBounds(30, 40, 130, 130);

        fundoPerfilMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/opcao-menu.png"))); // NOI18N
        fundoPerfilMenu.setText("jLabel3");
        opcaoMenuPerfil.add(fundoPerfilMenu);
        fundoPerfilMenu.setBounds(0, 0, 189, 280);

        getContentPane().add(opcaoMenuPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, 190, 280));

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

        btnPerfilSecundario.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        btnPerfilSecundario.setForeground(new java.awt.Color(255, 255, 255));
        btnPerfilSecundario.setText("Perfil");
        btnPerfilSecundario.setBorderPainted(false);
        btnPerfilSecundario.setContentAreaFilled(false);
        btnPerfilSecundario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPerfilSecundario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilSecundarioActionPerformed(evt);
            }
        });
        menuTopo.add(btnPerfilSecundario);
        btnPerfilSecundario.setBounds(832, 10, 90, 30);

        btnPesquisarSecundario.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        btnPesquisarSecundario.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisarSecundario.setText("Pesquisar");
        btnPesquisarSecundario.setBorderPainted(false);
        btnPesquisarSecundario.setContentAreaFilled(false);
        btnPesquisarSecundario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisarSecundario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarSecundarioActionPerformed(evt);
            }
        });
        menuTopo.add(btnPesquisarSecundario);
        btnPesquisarSecundario.setBounds(540, 10, 130, 30);

        btnEquipeSecundario.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        btnEquipeSecundario.setForeground(new java.awt.Color(255, 255, 255));
        btnEquipeSecundario.setText("Equipe");
        btnEquipeSecundario.setBorderPainted(false);
        btnEquipeSecundario.setContentAreaFilled(false);
        btnEquipeSecundario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEquipeSecundario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEquipeSecundarioActionPerformed(evt);
            }
        });
        menuTopo.add(btnEquipeSecundario);
        btnEquipeSecundario.setBounds(680, 10, 140, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundo-menu-topo.png"))); // NOI18N
        menuTopo.add(jLabel2);
        jLabel2.setBounds(0, 0, 960, 50);

        getContentPane().add(menuTopo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundo-home.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnPesquisarSecundarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarSecundarioActionPerformed
        TelaPesquisaVIEW j = new TelaPesquisaVIEW();
        this.dispose();
        j.setVisible(true);
    }//GEN-LAST:event_btnPesquisarSecundarioActionPerformed

    private void btnEquipeSecundarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEquipeSecundarioActionPerformed
        TelaEquipeVIEW j = new TelaEquipeVIEW();
        this.dispose();
        j.setVisible(true);
    }//GEN-LAST:event_btnEquipeSecundarioActionPerformed

    private void btnPerfilSecundarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilSecundarioActionPerformed

        if (usuarioLogado.isLogado()) {
            TelaPerfilVIEW j = new TelaPerfilVIEW();
            this.dispose();
            j.setVisible(true);
        } else {
            FormLoginVIEW j = new FormLoginVIEW();
            this.dispose();
            j.setVisible(true);
        }
    }//GEN-LAST:event_btnPerfilSecundarioActionPerformed

    private void btnPesquisarPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarPrincipalActionPerformed
        TelaPesquisaVIEW j = new TelaPesquisaVIEW();
        this.dispose();
        j.setVisible(true);
    }//GEN-LAST:event_btnPesquisarPrincipalActionPerformed

    private void btnCriarTimePrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarTimePrincipalActionPerformed
        
        if (usuarioLogado.isLogado()) {

            FormEditarEquipeVIEW j = new FormEditarEquipeVIEW();
            this.dispose();
            j.setVisible(true);

        } else {
           navegacao = "criarEquipe";
            
            FormLoginVIEW j = new FormLoginVIEW();
            this.dispose();
            j.setVisible(true);

        }


    }//GEN-LAST:event_btnCriarTimePrincipalActionPerformed

    private void btnEditarPerfilPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPerfilPrincipalActionPerformed
        FormEditarPerfilVIEW j = new FormEditarPerfilVIEW();
        this.dispose();
        j.setVisible(true);
    }//GEN-LAST:event_btnEditarPerfilPrincipalActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHomeActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicialVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicialVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicialVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicialVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicialVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JButton btnCriarTimePrincipal;
    private javax.swing.JButton btnEditarPerfilPrincipal;
    private javax.swing.JButton btnEquipeSecundario;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnPerfilSecundario;
    private javax.swing.JButton btnPesquisarPrincipal;
    private javax.swing.JButton btnPesquisarSecundario;
    private javax.swing.JLabel fundoAddEquipe;
    private javax.swing.JLabel fundoPerfilMenu;
    private javax.swing.JLabel fundoPesquisa;
    private javax.swing.JLabel iconAddEquipeMenu;
    private javax.swing.JLabel iconPerfilMenu;
    private javax.swing.JLabel iconPesquisar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel menuTopo;
    private javax.swing.JPanel opcaoMenuCriaTime;
    private javax.swing.JPanel opcaoMenuPerfil;
    private javax.swing.JPanel opcaoMenuPesquisa;
    // End of variables declaration//GEN-END:variables
}
