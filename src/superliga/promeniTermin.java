/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superliga;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Укиии Цар
 */
public class promeniTermin extends javax.swing.JFrame {

    Baza baza = new Baza();
    
    ArrayList<String> domacini=new ArrayList<String>();
    ArrayList<String> gosti=new ArrayList<String>();
    
    int domacinInt = 0;
    int gostInt = 0;
    String datum;
    
    public void closeCurrent() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    
    public promeniTermin() {
        initComponents();
        setResizable(false);
        setTitle("Promeni termin odigravanja utakmice");
        
        tf_update_datum.setEnabled(false);
        b_update_datum.setEnabled(false);
        
        try {
            baza.poveziSaBazom();

            String queryDomacini = "SELECT klubovi.ime_kluba FROM klubovi JOIN utakmice ON domacin_id = id_kluba";
            ResultSet rezultatDomacini = baza.naredba.executeQuery(queryDomacini);
            while(rezultatDomacini.next()) {
                domacini.add(rezultatDomacini.getString("ime_kluba"));
            }
            
            String queryGosti = "SELECT klubovi.ime_kluba FROM klubovi JOIN utakmice ON gost_id = id_kluba";
            ResultSet rezultatGosti = baza.naredba.executeQuery(queryGosti);
            while(rezultatGosti.next()) {
                gosti.add(rezultatGosti.getString("ime_kluba"));
            }
            
            for(int i = 0; i < domacini.size(); i++) {
                cb_izaberiUtakmicu.addItem(domacini.get(i) + " - " + gosti.get(i));
            }
        } catch (Exception e) {
            System.out.println("Greska - combobox: " + e);
        } finally {
            baza.zatvoriBazu();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        b_update_datum = new javax.swing.JButton();
        tf_update_datum = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        b_update_izaberiUtakmicu = new javax.swing.JButton();
        cb_izaberiUtakmicu = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("FORMAT: yyyy-mm-dd");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(110, 200, 150, 20);

        b_update_datum.setText("Promeni");
        b_update_datum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_update_datumActionPerformed(evt);
            }
        });
        jPanel1.add(b_update_datum);
        b_update_datum.setBounds(280, 170, 70, 23);

        tf_update_datum.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        tf_update_datum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_update_datumActionPerformed(evt);
            }
        });
        jPanel1.add(tf_update_datum);
        tf_update_datum.setBounds(110, 170, 150, 23);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setText("DATUM");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 170, 60, 23);

        b_update_izaberiUtakmicu.setText("Potvrdi");
        b_update_izaberiUtakmicu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_update_izaberiUtakmicuActionPerformed(evt);
            }
        });
        jPanel1.add(b_update_izaberiUtakmicu);
        b_update_izaberiUtakmicu.setBounds(280, 120, 70, 23);

        cb_izaberiUtakmicu.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        cb_izaberiUtakmicu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_izaberiUtakmicuActionPerformed(evt);
            }
        });
        jPanel1.add(cb_izaberiUtakmicu);
        cb_izaberiUtakmicu.setBounds(40, 120, 220, 23);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setText("IZABERI UTAKMICU");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 90, 150, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/super-liga-srbije-26.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 620, 298);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_update_izaberiUtakmicuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_update_izaberiUtakmicuActionPerformed
        try {
            tf_update_datum.setEnabled(true);
            b_update_datum.setEnabled(true);
            
            baza.poveziSaBazom();
            
            int index = cb_izaberiUtakmicu.getSelectedIndex();
        
            String domacin = domacini.get(index);
            String gost = gosti.get(index);
            
            String queryDomacinID = "SELECT id_kluba FROM klubovi WHERE ime_kluba='" + domacin + "'";
            ResultSet rezultatDomacinID = baza.naredba.executeQuery(queryDomacinID);
            while(rezultatDomacinID.next()) {
                domacinInt = Integer.parseInt(rezultatDomacinID.getString("id_kluba"));
            }
            
            String queryGostID = "SELECT id_kluba FROM klubovi WHERE ime_kluba='" + gost + "'";
            ResultSet rezultatGostID = baza.naredba.executeQuery(queryGostID);
            while(rezultatGostID.next()) {
                gostInt = Integer.parseInt(rezultatGostID.getString("id_kluba"));
            }
            
            String queryDatum = "SELECT datum FROM utakmice WHERE domacin_ID='" + domacinInt + "' AND gost_ID='" + gostInt + "'";
            ResultSet rezultatDatum = baza.naredba.executeQuery(queryDatum);
            while(rezultatDatum.next()) {
                datum = rezultatDatum.getString("datum");
                String[] datumParts = datum.split(" ");
                String part1 = datumParts[0];
                tf_update_datum.setText(part1);
            }
        } catch (Exception e) {
            System.out.println("Greska - potvrdi: " + e);
        } finally {
            baza.zatvoriBazu();
        }
    }//GEN-LAST:event_b_update_izaberiUtakmicuActionPerformed

    private void b_update_datumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_update_datumActionPerformed
        try {
            baza.poveziSaBazom();
            
            int index = cb_izaberiUtakmicu.getSelectedIndex();
            
            String domacin = domacini.get(index);
            String gost = gosti.get(index);
            
            String queryDomacinID = "SELECT id_kluba FROM klubovi WHERE ime_kluba='" + domacin + "'";
            ResultSet rezultatDomacinID = baza.naredba.executeQuery(queryDomacinID);
            while(rezultatDomacinID.next()) {
                domacinInt = Integer.parseInt(rezultatDomacinID.getString("id_kluba"));
            }
            
            String queryGostID = "SELECT id_kluba FROM klubovi WHERE ime_kluba='" + gost + "'";
            ResultSet rezultatGostID = baza.naredba.executeQuery(queryGostID);
            while(rezultatGostID.next()) {
                gostInt = Integer.parseInt(rezultatGostID.getString("id_kluba"));
            }
            
            int proveraDatum = 0;
            String queryProveraDatum = "SELECT * FROM utakmice WHERE domacin_id='" + domacinInt + "' AND datum=to_date('" + tf_update_datum.getText() + "', 'yyyy-mm-dd')";
            ResultSet rezultatProveraDatum = baza.naredba.executeQuery(queryProveraDatum);
            if(rezultatProveraDatum.next()) {
                proveraDatum++;
            }
            
            String queryProveraDatum2 = "SELECT * FROM utakmice WHERE gost_id='" + gostInt + "' AND datum=to_date('" + tf_update_datum.getText() + "', 'yyyy-mm-dd')";
            ResultSet rezultatProveraDatum2 = baza.naredba.executeQuery(queryProveraDatum2);
            if(rezultatProveraDatum.next()) {
                proveraDatum++;
            }
            
            String queryProveraDatum3 = "SELECT * FROM utakmice WHERE domacin_id='" + gostInt + "' AND datum=to_date('" + tf_update_datum.getText() + "', 'yyyy-mm-dd')";
            ResultSet rezultatProveraDatum3 = baza.naredba.executeQuery(queryProveraDatum3);
            if(rezultatProveraDatum3.next()) {
                proveraDatum++;
            }
            
            String queryProveraDatum4 = "SELECT * FROM utakmice WHERE gost_id='" + domacinInt + "' AND datum=to_date('" + tf_update_datum.getText() + "', 'yyyy-mm-dd')";
            ResultSet rezultatProveraDatum4 = baza.naredba.executeQuery(queryProveraDatum4);
            if(rezultatProveraDatum4.next()) {
                proveraDatum++;
            }
            
            datum = tf_update_datum.getText();
            DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
            Date d = df.parse(datum);
            
            if(proveraDatum != 0) {
                JOptionPane.showMessageDialog(null, "Uneli ste isti datum za odigravanje utakmice!", "GREŠKA!", JOptionPane.ERROR_MESSAGE);
            } else if(d.before(new Date())){
                JOptionPane.showMessageDialog(null, "Pokušali ste da zakažete utakmicu za datum koji je već prošao!", "GREŠKA!", JOptionPane.ERROR_MESSAGE);
            } else {
                String updateDatum = "UPDATE utakmice SET datum=to_date('" + tf_update_datum.getText() + "', 'yyyy-mm-dd') WHERE domacin_id='" + domacinInt + "' AND gost_id='" + gostInt + "'";
                baza.naredba.executeUpdate(updateDatum);

                JOptionPane.showMessageDialog(null, "Uspešno ste promenili termin za odigravanje meča između izabranih timova!", "OBAVEŠTENJE!", JOptionPane.INFORMATION_MESSAGE);

                closeCurrent();
                promeniTermin pt = new promeniTermin();
                pt.setVisible(true);
            }
        } catch (Exception e) {
            System.out.println("Greska sa bazom: " + e);
        } finally {
            baza.zatvoriBazu();
        }
    }//GEN-LAST:event_b_update_datumActionPerformed

    private void cb_izaberiUtakmicuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_izaberiUtakmicuActionPerformed
        tf_update_datum.setText(null);
        tf_update_datum.setEnabled(false);
        b_update_datum.setEnabled(false);
    }//GEN-LAST:event_cb_izaberiUtakmicuActionPerformed

    private void tf_update_datumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_update_datumActionPerformed
 
    }//GEN-LAST:event_tf_update_datumActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(promeniTermin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(promeniTermin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(promeniTermin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(promeniTermin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new promeniTermin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_update_datum;
    private javax.swing.JButton b_update_izaberiUtakmicu;
    private javax.swing.JComboBox<String> cb_izaberiUtakmicu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tf_update_datum;
    // End of variables declaration//GEN-END:variables
}
