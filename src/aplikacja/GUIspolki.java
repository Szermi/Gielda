/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikacja;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.table.DefaultTableModel;
import klasy.*;
import wykresy.Wykres3;

/**
 *
 * @author Elater
 */


public class GUIspolki extends javax.swing.JInternalFrame {
    
private GUIspolka guispolka = new GUIspolka();
private Wykres3 wykres;
private JButton buttonInfo;
boolean pressingCTRL=false;//flag, if pressing CTRL it is true, otherwise it is false.
Vector selectedCells = new Vector<int[]>();//int[]because every entry will store {cellX,cellY}
List <Integer> newEntry = new ArrayList<>();
/**
     * Creates new form GUIinwestorzy
     */
    public GUIspolki() throws FileNotFoundException, IOException {
        
        setLocation(310, 60);
        initComponents();
                fillData();
    }

    
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaSpolek = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        text1 = new javax.swing.JTextField();
        text2 = new javax.swing.JTextField();
        text3 = new javax.swing.JTextField();
        buttomLosuj = new javax.swing.JButton();
        buttomDodaj = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        text4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        text5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        text6 = new javax.swing.JTextField();
        buttoInfo = new javax.swing.JButton();
        buttoWykresy = new javax.swing.JButton();

        setClosable(true);
        setTitle("Lista spółek");

        tabelaSpolek.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelaSpolek.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaSpolekMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaSpolek);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nowa spółka", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel1.setText("Nazwa:");

        jLabel2.setText("Data I wyceny:");

        jLabel3.setText("Kurs otwarcia:");

        buttomLosuj.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttomLosuj.setText("Losuj");
        buttomLosuj.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttomLosuj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttomLosujActionPerformed(evt);
            }
        });

        buttomDodaj.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttomDodaj.setText("Dodaj");
        buttomDodaj.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttomDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttomDodajActionPerformed(evt);
            }
        });

        jLabel7.setText("Liczba akcji:");

        text4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text4ActionPerformed(evt);
            }
        });

        jLabel8.setText("Kapitał własny:");

        text5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text5ActionPerformed(evt);
            }
        });

        jLabel9.setText("Kapitał zakładowy:");

        text6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text6ActionPerformed(evt);
            }
        });

        buttoInfo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttoInfo.setText("Info");
        buttoInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttoInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoInfoActionPerformed(evt);
            }
        });

        buttoWykresy.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttoWykresy.setText("Rysuj wykresy");
        buttoWykresy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttoWykresy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoWykresyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text2, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(text1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(text4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(text5)
                            .addComponent(text6)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(buttoInfo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttomLosuj, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttoWykresy, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(buttomDodaj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(text2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(text3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(text4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(text5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttomLosuj)
                    .addComponent(buttomDodaj))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttoInfo)
                    .addComponent(buttoWykresy))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttomLosujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttomLosujActionPerformed
        
        try {
            Spolka inw = new Spolka();
            text1.setText(inw.getNazwa());
            text2.setText(inw.getDataPierwszejWyceny());
            text3.setText(Double.toString(inw.getKursOtwarcia()));
            text4.setText(Integer.toString(inw.getLiczbaAkcji()));
            text5.setText(Double.toString(inw.getKapitalWlasny()));
            text6.setText(Double.toString(inw.getKapitalZakladowy()));
            //textBudzet.setText(Integer.toString(inw.getBudzetInwestycyjny()));
        } catch (IOException ex) {
            Logger.getLogger(GUIspolki.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }//GEN-LAST:event_buttomLosujActionPerformed

    private void buttomDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttomDodajActionPerformed
       Spolka inw = new Spolka(text1.getText(),text2.getText(),Double.parseDouble(text3.getText()),Double.parseDouble(text3.getText()),
              Double.parseDouble(text3.getText()),Double.parseDouble(text3.getText()),Integer.parseInt(text4.getText()), 
               0,0,Double.parseDouble(text5.getText()),Double.parseDouble(text6.getText()),0,0);
       
        try {
            boolean unikat=true;
            for(Spolka in: Main.listaSpolek)
            {
                if(in.getNazwa().equalsIgnoreCase(text1.getText())) unikat=false;
            }
            if(unikat==true) 
            {
                Main.listaSpolek.add(inw);
                fillData();
            }
        } catch (IOException ex) {
            Logger.getLogger(GUIspolki.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttomDodajActionPerformed

    private void text4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text4ActionPerformed

    private void text5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text5ActionPerformed

    private void text6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text6ActionPerformed

    private void tabelaSpolekMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaSpolekMouseClicked
          KeyListener tableKeyListener = new KeyAdapter() {

      @Override
      public void keyPressed(KeyEvent e) {
         if(KeyEvent.VK_CONTROL==e.getKeyCode()){//check if user is pressing CTRL key
            pressingCTRL=true;
         }
      }

      @Override
      public void keyReleased(KeyEvent e) {
         if(e.getKeyCode()==KeyEvent.VK_CONTROL){//check if user released CTRL key
            pressingCTRL=false;
         }
      }
        //buttonInfo.setEnabled(true);
          };
          MouseListener tableMouseListener = new MouseAdapter() {

      @Override
      public void mouseClicked(MouseEvent e) {
         if(pressingCTRL){//check if user is pressing CTRL key
            int row = tabelaSpolek.rowAtPoint(e.getPoint());//get mouse-selected row
            //int col = tabelaSpolek.columnAtPoint(e.getPoint());//get mouse-selected col
            newEntry.add(row);//{row,col}=selected cell
            if(selectedCells.contains(newEntry)){
               //cell was already selected, deselect it
               selectedCells.remove(newEntry);
            }else{
               //cell was not selected
               selectedCells.add(newEntry);
            }
         }
      }
   };
   tabelaSpolek.addKeyListener(tableKeyListener);
   tabelaSpolek.addMouseListener(tableMouseListener);

    }//GEN-LAST:event_tabelaSpolekMouseClicked

    private void buttoInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoInfoActionPerformed
       if(!guispolka.isVisible())
        {
            guispolka.setVisible(true);
            JDesktopPane desktopPane = (JDesktopPane) getParent();
            desktopPane.add(guispolka);
                Spolka sp;
            try {
                sp = new Spolka();
                int currentRow = tabelaSpolek.getSelectedRow();
                guispolka.fillData(sp.szukaj(tabelaSpolek.getValueAt(currentRow, 0).toString()));
            } catch (IOException ex) {
                Logger.getLogger(GUIspolki.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            try {
                Spolka sp = new Spolka();
                int currentRow = tabelaSpolek.getSelectedRow();
                guispolka.fillData(sp.szukaj(tabelaSpolek.getValueAt(currentRow, 0).toString()));
                
            } catch (IOException ex) {
                Logger.getLogger(GUIspolki.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_buttoInfoActionPerformed

    private void buttoWykresyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoWykresyActionPerformed
        List <Spolka> listaNaWykres = new ArrayList<>();
        for (int i=0; i<newEntry.size(); i++)
        listaNaWykres.add(Main.listaSpolek.get(newEntry.get(i)));
        try {
            Wykres3 wykres = new Wykres3(listaNaWykres);
        } catch (IOException ex) {
            Logger.getLogger(GUIspolki.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttoWykresyActionPerformed
public void fillData() throws FileNotFoundException, IOException
	{
            
		DefaultTableModel defaultTableModel = new DefaultTableModel();
		defaultTableModel.addColumn("Nazwa");
		defaultTableModel.addColumn("D.P.Wyceny");
		defaultTableModel.addColumn("Aktualny kurs");
		defaultTableModel.addColumn("L. akcji");
		defaultTableModel.addColumn("Kapitał własny");
		defaultTableModel.addColumn("Kapitał zakładowy");
		defaultTableModel.addColumn("Obroty");
		Spolka inw = new Spolka();
		for(Spolka in: Main.listaSpolek)
                {
                    //System.out.println("robimy coś");
			defaultTableModel.addRow(new Object[] {in.getNazwa(),in.getDataPierwszejWyceny(),
                            in.getAktualnyKurs(),in.getLiczbaAkcji(), in.getKapitalWlasny(), in.getKapitalZakladowy(),in.getObroty()});
                        //in.wyswietl();
                        
                }
		tabelaSpolek.setModel(defaultTableModel);
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttoInfo;
    private javax.swing.JButton buttoWykresy;
    private javax.swing.JButton buttomDodaj;
    private javax.swing.JButton buttomLosuj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaSpolek;
    private javax.swing.JTextField text1;
    private javax.swing.JTextField text2;
    private javax.swing.JTextField text3;
    private javax.swing.JTextField text4;
    private javax.swing.JTextField text5;
    private javax.swing.JTextField text6;
    // End of variables declaration//GEN-END:variables
}
