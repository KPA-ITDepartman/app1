/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superliga;

import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Укиии Цар
 */
public class zakaziUtakmicu extends javax.swing.JFrame {

    Baza baza = new Baza();
    private int domacinID;
    private int gostID;
    private String datum;
    
    public zakaziUtakmicu() {
        initComponents();
        setResizable(false);
        setTitle("Zakaži utakmicu");
        
        try {
            baza.poveziSaBazom();

            String queryIzaberiKlub = "SELECT ime_kluba FROM klubovi";
            ResultSet rezultatIzaberiKlub = baza.naredba.executeQuery(queryIzaberiKlub);
            while(rezultatIzaberiKlub.next()) {
                cb_domacin.addItem(rezultatIzaberiKlub.getString("ime_kluba"));
            }
            
            String queryIzaberiKlub2 = "SELECT ime_kluba FROM klubovi";
            ResultSet rezultatIzaberiKlub2 = baza.naredba.executeQuery(queryIzaberiKlub2);
            while(rezultatIzaberiKlub2.next()) {
                cb_gost.addItem(rezultatIzaberiKlub2.getString("ime_kluba"));
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
        jLabel6 = new javax.swing.JLabel();
        b_submit_zakazaiUtakmicu = new javax.swing.JButton();
        tf_brojUlaznica = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tf_datum = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cb_gost = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cb_domacin = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("FORMAT: dd/mm/yyyy");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(270, 140, 150, 23);

        b_submit_zakazaiUtakmicu.setText("Zakaži utakmicu");
        b_submit_zakazaiUtakmicu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_submit_zakazaiUtakmicuActionPerformed(evt);
            }
        });
        jPanel1.add(b_submit_zakazaiUtakmicu);
        b_submit_zakazaiUtakmicu.setBounds(150, 220, 120, 23);

        tf_brojUlaznica.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jPanel1.add(tf_brojUlaznica);
        tf_brojUlaznica.setBounds(160, 180, 100, 23);

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel7.setText("BROJ ULAZNICA");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 180, 120, 23);

        tf_datum.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jPanel1.add(tf_datum);
        tf_datum.setBounds(160, 140, 100, 23);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setText("DATUM");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(90, 140, 59, 23);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setText("-");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(220, 100, 6, 23);

        cb_gost.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jPanel1.add(cb_gost);
        cb_gost.setBounds(260, 100, 150, 23);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setText("GOST");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(310, 80, 50, 23);

        cb_domacin.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jPanel1.add(cb_domacin);
        cb_domacin.setBounds(40, 100, 150, 23);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setText("DOMAĆIN");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 80, 80, 23);

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

    private void b_submit_zakazaiUtakmicuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_submit_zakazaiUtakmicuActionPerformed
        try {
            baza.poveziSaBazom();
            
            String queryDomacinID = "SELECT id_kluba FROM klubovi WHERE ime_kluba='" + cb_domacin.getSelectedItem() + "'";
            ResultSet rezultatDomacinID = baza.naredba.executeQuery(queryDomacinID);
            while(rezultatDomacinID.next()) {
                domacinID = Integer.parseInt(rezultatDomacinID.getString("ID_kluba"));
            }
            
            String queryGostID = "SELECT id_kluba FROM klubovi WHERE ime_kluba='" + cb_gost.getSelectedItem() + "'";
            ResultSet rezultatGostID = baza.naredba.executeQuery(queryGostID);
            while(rezultatGostID.next()) {
                gostID = Integer.parseInt(rezultatGostID.getString("ID_kluba"));
            }
            
            datum = tf_datum.getText();
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            Date d = df.parse(datum);
            
            int proveraDatum = 0;
            String queryProveraDatum = "SELECT * FROM utakmice WHERE domacin_id='" + domacinID + "' AND datum=to_date('" + tf_datum.getText() + "', 'dd/mm/yyyy')";
            ResultSet rezultatProveraDatum = baza.naredba.executeQuery(queryProveraDatum);
            if(rezultatProveraDatum.next()) {
                proveraDatum++;
            }
            
            String queryProveraDatum2 = "SELECT * FROM utakmice WHERE gost_id='" + gostID + "' AND datum=to_date('" + tf_datum.getText() + "', 'dd/mm/yyyy')";
            ResultSet rezultatProveraDatum2 = baza.naredba.executeQuery(queryProveraDatum2);
            if(rezultatProveraDatum.next()) {
                proveraDatum++;
            }
            
            String queryProveraDatum3 = "SELECT * FROM utakmice WHERE domacin_id='" + gostID + "' AND datum=to_date('" + tf_datum.getText() + "', 'dd/mm/yyyy')";
            ResultSet rezultatProveraDatum3 = baza.naredba.executeQuery(queryProveraDatum3);
            if(rezultatProveraDatum3.next()) {
                proveraDatum++;
            }
            
            String queryProveraDatum4 = "SELECT * FROM utakmice WHERE gost_id='" + domacinID + "' AND datum=to_date('" + tf_datum.getText() + "', 'dd/mm/yyyy')";
            ResultSet rezultatProveraDatum4 = baza.naredba.executeQuery(queryProveraDatum4);
            if(rezultatProveraDatum4.next()) {
                proveraDatum++;
            }
            
            if(domacinID == gostID) {
                JOptionPane.showMessageDialog(null, "Fudbalski klub ne mоže igrati sam protiv sebe!", "GREŠKA!", JOptionPane.ERROR_MESSAGE);
            } else if(d.before(new Date())){
                JOptionPane.showMessageDialog(null, "Pokušali ste da zakažete utakmicu za datum koji je već prošao!", "GREŠKA!", JOptionPane.ERROR_MESSAGE);
            } else if(proveraDatum != 0) {
                 JOptionPane.showMessageDialog(null, "Fudbalski klub ne može igrati dve utakmice u toku dana!", "GREŠKA!", JOptionPane.ERROR_MESSAGE);
            } else {
                String queryZakaziUtakmicu = "INSERT INTO utakmice(domacin_ID, gost_ID, datum, broj_ulaznica) VALUES('" + domacinID + "', '" + gostID + "', to_date('" + tf_datum.getText() + "', 'dd/mm/yyyy'), '" + tf_brojUlaznica.getText() + "')";
                baza.naredba.executeUpdate(queryZakaziUtakmicu);
                JOptionPane.showMessageDialog(null, "Uspešno ste zakazali utakmicu između FK " + cb_domacin.getSelectedItem() + " i FK " + cb_gost.getSelectedItem() + ".", "OBAVEŠTENJE:", JOptionPane.INFORMATION_MESSAGE);
            } 
        } catch (Exception e) {
            System.out.println("Greska sa bazom: " + e);
        } finally {
            baza.zatvoriBazu();
        }
    }//GEN-LAST:event_b_submit_zakazaiUtakmicuActionPerformed

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
            java.util.logging.Logger.getLogger(zakaziUtakmicu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(zakaziUtakmicu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(zakaziUtakmicu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(zakaziUtakmicu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new zakaziUtakmicu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_submit_zakazaiUtakmicu;
    private javax.swing.JComboBox<String> cb_domacin;
    private javax.swing.JComboBox<String> cb_gost;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tf_brojUlaznica;
    private javax.swing.JTextField tf_datum;
    // End of variables declaration//GEN-END:variables
}
