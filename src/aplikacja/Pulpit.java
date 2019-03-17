/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikacja;

import inwestujacy.Inwestor;
import java.awt.Image;
import java.io.FileNotFoundException;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import odswiezanie.OdswiezanieInw;
import klasy.Reklama;
import klasy.Serial;
import odswiezanie.*;

/**
 *
 * @author Elater
 */
public class Pulpit extends javax.swing.JFrame implements Runnable {

    int x = 0;

    /**
     * Creates new form Pulpit
     */
    public Pulpit() throws InterruptedException {
        initComponents();

        setExtendedState(MAXIMIZED_BOTH);

        Thread threadReklama = new Thread(new Reklama(this));
        threadReklama.start();

        //reklama();
        //Image img =new ImageIcon(this.getClass().getResource("src/reklama/1.jpg")).getImage();
        //reklama.setIcon(new ImageIcon(img));
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        zaklaGielda = new javax.swing.JMenu();
        pokazGieldy = new javax.swing.JMenuItem();
        zakladkaInwestorzy = new javax.swing.JMenu();
        pokazInwestorow = new javax.swing.JMenuItem();
        zaklaFundusze = new javax.swing.JMenu();
        pokazFundusze = new javax.swing.JMenuItem();
        zaklaSpolki = new javax.swing.JMenu();
        pokazSpolki = new javax.swing.JMenuItem();
        zaklaSurowce = new javax.swing.JMenu();
        pokazSurowce = new javax.swing.JMenuItem();
        zaklaWaluty = new javax.swing.JMenu();
        pokazWaluty = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Symulator giełdy");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        desktopPane.setName("pulpit"); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Baner reklamowy", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 16))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reklama/4.jpg"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(254, 754));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
                .addContainerGap())
        );

        desktopPane.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 754, Short.MAX_VALUE))
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        zaklaGielda.setText("Giełda");

        pokazGieldy.setText("Pokaż");
        pokazGieldy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pokazGieldyActionPerformed(evt);
            }
        });
        zaklaGielda.add(pokazGieldy);

        jMenuBar1.add(zaklaGielda);

        zakladkaInwestorzy.setText("Inwestorzy");

        pokazInwestorow.setText("Pokaż");
        pokazInwestorow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pokazInwestorowActionPerformed(evt);
            }
        });
        zakladkaInwestorzy.add(pokazInwestorow);

        jMenuBar1.add(zakladkaInwestorzy);

        zaklaFundusze.setText("Fundusze");

        pokazFundusze.setText("Pokaż");
        pokazFundusze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pokazFunduszeActionPerformed(evt);
            }
        });
        zaklaFundusze.add(pokazFundusze);

        jMenuBar1.add(zaklaFundusze);

        zaklaSpolki.setText("Spółki");

        pokazSpolki.setText("Pokaż");
        pokazSpolki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pokazSpolkiActionPerformed(evt);
            }
        });
        zaklaSpolki.add(pokazSpolki);

        jMenuBar1.add(zaklaSpolki);

        zaklaSurowce.setText("Surowce");

        pokazSurowce.setText("Pokaż");
        pokazSurowce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pokazSurowceActionPerformed(evt);
            }
        });
        zaklaSurowce.add(pokazSurowce);

        jMenuBar1.add(zaklaSurowce);

        zaklaWaluty.setText("Waluty");

        pokazWaluty.setText("Pokaż");
        pokazWaluty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pokazWalutyActionPerformed(evt);
            }
        });
        zaklaWaluty.add(pokazWaluty);

        jMenuBar1.add(zaklaWaluty);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pokazInwestorowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pokazInwestorowActionPerformed
        try {
            GUIinwestorzy f = new GUIinwestorzy();
            Thread threadOdswiezanie = new Thread(new OdswiezanieInw(f));
            threadOdswiezanie.start();

            f.setVisible(true);

            desktopPane.add(f);
        } catch (IOException ex) {
            Logger.getLogger(Pulpit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Pulpit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pokazInwestorowActionPerformed

    private void pokazFunduszeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pokazFunduszeActionPerformed
        GUIfundusze f = null;
        try {
            f = new GUIfundusze();
        } catch (IOException ex) {
            Logger.getLogger(Pulpit.class.getName()).log(Level.SEVERE, null, ex);
        }

        f.setVisible(true);
        desktopPane.add(f);

    }//GEN-LAST:event_pokazFunduszeActionPerformed

    private void pokazSpolkiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pokazSpolkiActionPerformed
        GUIspolki f=null;
        try {
            f = new GUIspolki();
        } catch (IOException ex) {
            Logger.getLogger(Pulpit.class.getName()).log(Level.SEVERE, null, ex);
        }

        Thread threadOdswiezanieSpo = new Thread(new OdswiezanieSpo(f));
        threadOdswiezanieSpo.start();
        f.setVisible(true);
        desktopPane.add(f);
    }//GEN-LAST:event_pokazSpolkiActionPerformed

    private void pokazSurowceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pokazSurowceActionPerformed
        GUIsurowce f=null;
        try {
            f = new GUIsurowce();
        } catch (IOException ex) {
            Logger.getLogger(Pulpit.class.getName()).log(Level.SEVERE, null, ex);
        }

        Thread threadOdswiezanieSur = new Thread(new OdswiezanieSur(f));
        threadOdswiezanieSur.start();
        f.setVisible(true);
        desktopPane.add(f);
    }//GEN-LAST:event_pokazSurowceActionPerformed

    private void pokazWalutyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pokazWalutyActionPerformed
         GUIwaluty f=null;
        try {
            f = new GUIwaluty();
        } catch (IOException ex) {
            Logger.getLogger(Pulpit.class.getName()).log(Level.SEVERE, null, ex);
        }

        Thread threadOdswiezanieWal = new Thread(new OdswiezanieWal(f));
        threadOdswiezanieWal.start();
        f.setVisible(true);
        desktopPane.add(f);
    }//GEN-LAST:event_pokazWalutyActionPerformed

    private void pokazGieldyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pokazGieldyActionPerformed
        GUIgieldy f;
        try {
            f = new GUIgieldy();
            f.setVisible(true);
            desktopPane.add(f);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pulpit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pulpit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pokazGieldyActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Serial serial = new Serial();
        try {
            serial.zapisz();
        } catch (IOException ex) {
            Logger.getLogger(Pulpit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Pulpit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosed

    /*
     * @param args the command line arguments
     */
    public synchronized void reklama() throws InterruptedException {

        ImageIcon img = new ImageIcon("src/reklama/1.jpg");
        ImageIcon img2 = new ImageIcon("src/reklama/2.jpg");
        ImageIcon img3 = new ImageIcon("src/reklama/3.jpg");
        ImageIcon img4 = new ImageIcon("src/reklama/4.jpg");

        if (x == 0) {
            jLabel1.setIcon(img);
        } else if (x == 1) {
            jLabel1.setIcon(img2);
        } else if (x == 2) {
            jLabel1.setIcon(img3);
        } else if (x == 3) {
            jLabel1.setIcon(img4);
        }
        x++;
        if (x > 3) {
            x = 0;
        }

    }

    public static void main(String args[]
    ) throws IOException {
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
            java.util.logging.Logger.getLogger(Pulpit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pulpit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pulpit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pulpit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        // Waluta waluta = new Waluta();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Pulpit pulpit = new Pulpit();
                    pulpit.setVisible(true);
                    //System.out.println("hehehehehe");
                    //pulpit.reklama();

                } catch (InterruptedException ex) {
                    Logger.getLogger(Pulpit.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem pokazFundusze;
    private javax.swing.JMenuItem pokazGieldy;
    private javax.swing.JMenuItem pokazInwestorow;
    private javax.swing.JMenuItem pokazSpolki;
    private javax.swing.JMenuItem pokazSurowce;
    private javax.swing.JMenuItem pokazWaluty;
    private javax.swing.JMenu zaklaFundusze;
    private javax.swing.JMenu zaklaGielda;
    private javax.swing.JMenu zaklaSpolki;
    private javax.swing.JMenu zaklaSurowce;
    private javax.swing.JMenu zaklaWaluty;
    private javax.swing.JMenu zakladkaInwestorzy;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
