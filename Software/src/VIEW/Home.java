/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

/**
 *
 * @author netoi
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
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
        jLabel3 = new javax.swing.JLabel();
        iconPesquisar = new javax.swing.JLabel();
        fundoPesquisa = new javax.swing.JLabel();
        opcaoMenuCriaTime = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        iconAddEquipeMenu = new javax.swing.JLabel();
        fundoAddEquipe = new javax.swing.JLabel();
        opcaoMenuPerfil = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        iconPerfilMenu = new javax.swing.JLabel();
        fundoPerfilMenu = new javax.swing.JLabel();
        menuTopo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Perfil");
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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundo-menu-topo.png"))); // NOI18N

        javax.swing.GroupLayout menuTopoLayout = new javax.swing.GroupLayout(menuTopo);
        menuTopo.setLayout(menuTopoLayout);
        menuTopoLayout.setHorizontalGroup(
            menuTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuTopoLayout.setVerticalGroup(
            menuTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuTopoLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(menuTopo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundo-home.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fundoAddEquipe;
    private javax.swing.JLabel fundoPerfilMenu;
    private javax.swing.JLabel fundoPesquisa;
    private javax.swing.JLabel iconAddEquipeMenu;
    private javax.swing.JLabel iconPerfilMenu;
    private javax.swing.JLabel iconPesquisar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel menuTopo;
    private javax.swing.JPanel opcaoMenuCriaTime;
    private javax.swing.JPanel opcaoMenuPerfil;
    private javax.swing.JPanel opcaoMenuPesquisa;
    // End of variables declaration//GEN-END:variables
}
