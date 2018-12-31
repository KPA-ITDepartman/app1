/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superliga;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JViewport;

/**
 *
 * @author Укиии Цар
 */
public class korisnik extends javax.swing.JFrame {

    Baza baza = new Baza();
    
    ArrayList<String> domacini=new ArrayList<String>();
    ArrayList<String> gosti=new ArrayList<String>();
    ArrayList<Integer> gostiID=new ArrayList<Integer>();
    ArrayList<Integer> domaciniID=new ArrayList<Integer>();
    
    String query = "SELECT utakmice.domacin_id, utakmice.gost_id, utakmice.datum, utakmice.broj_ulaznica FROM utakmice";
    String colNames[] = {"Domaćin", "Gost", "Datum", "Preostalo karata"};
    JTable table = new JTable();
    
    public void closeCurrent() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    
    public korisnik() {
        initComponents();
        setResizable(false);
        setTitle("Kupovina ulaznica");
        
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
                String queryDomacinID = "SELECT id_kluba FROM klubovi WHERE ime_kluba='" + domacini.get(i) + "'";
                ResultSet rezultatDomacinID = baza.naredba.executeQuery(queryDomacinID);
                while(rezultatDomacinID.next()) {
                    domaciniID.add(Integer.parseInt(rezultatDomacinID.getString("id_kluba")));
                }
            }
            
            for(int i = 0; i < domacini.size(); i++) {
                String queryGostID = "SELECT id_kluba FROM klubovi WHERE ime_kluba='" + gosti.get(i) + "'";
                ResultSet rezultatGostID = baza.naredba.executeQuery(queryGostID);
                while(rezultatGostID.next()) {
                    gostiID.add(Integer.parseInt(rezultatGostID.getString("id_kluba")));
                }
            }
            
            JViewport view = jTablePane1.getViewport();
            
            Vector dataSet = new Vector();
            String d;
            
            ResultSet rezultat = baza.naredba.executeQuery(query);
            ResultSetMetaData md = rezultat.getMetaData();
            int nColumns = md.getColumnCount() + 1;
            while (rezultat.next()) {
                Vector rowData = new Vector();
                for (int i = 1; i < nColumns; i++) {
                    if(i == 1) {
                        int j = Integer.valueOf((String) rezultat.getObject(i).toString());
                        int indexVal = domaciniID.indexOf(j);
                        rowData.addElement(domacini.get(indexVal));
                    } else if (i == 2) {
                        int j = Integer.valueOf((String) rezultat.getObject(i).toString());
                        int indexVal = gostiID.indexOf(j);
                        rowData.addElement(gosti.get(indexVal));
                    } else {
                        rowData.addElement(rezultat.getObject(i));
                    }
                }
                dataSet.addElement(rowData);
            }
            
            int nRows = dataSet.size();
            String[][] rowDataS = new String[nRows][colNames.length];
            for (int i = 0; i < nRows; i++) {
                Vector row = (Vector) dataSet.elementAt(i);
                for (int j = 0; j < row.size(); j++) {
                    rowDataS[i][j] = ((Object) row.elementAt(j)).toString();
                }
            }
            
            table = new JTable(rowDataS, colNames);
            view.add(table);
            
        } catch (Exception e) {
            System.out.println("Greska sa bazom: " + e);
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
        jButton1 = new javax.swing.JButton();
        b_kupiKartu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTablePane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        jButton1.setText("Odjavi se");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(420, 10, 80, 23);

        b_kupiKartu.setText("Kupi kartu");
        b_kupiKartu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_kupiKartuActionPerformed(evt);
            }
        });
        jPanel1.add(b_kupiKartu);
        b_kupiKartu.setBounds(280, 330, 80, 23);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("IZABERI ULAZNICU");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(230, 60, 185, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.add(jTablePane1);
        jTablePane1.setBounds(152, 102, 340, 220);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/tableBckgrnd.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 511, 425);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_kupiKartuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_kupiKartuActionPerformed
        //int index = table.getSelectedRow();
        //System.out.println(table.getValueAt(index, 0));
        if(table.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null, "Niste izabrali utakmicu!", "GREŠKA!", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                baza.poveziSaBazom();

                int index = table.getSelectedRow();

                int brojKarata = Integer.valueOf((String) table.getValueAt(index, 3));

                if(brojKarata == 0) {
                    JOptionPane.showMessageDialog(null, "Sve karte za izabranu utakmicu su rasprodate!", "KARTE RASPRODATE!", JOptionPane.WARNING_MESSAGE);
                } else {
                    String d = String.valueOf((String) table.getValueAt(index, 0));
                    String g = String.valueOf((String) table.getValueAt(index, 1));
                    String dt = String.valueOf((String) table.getValueAt(index, 2));
                    String datum;
                    String datumSplit = "";
                    int id1 = 0;
                    int id2 = 0;
                    int idFinal = 0;
                    
                    String queryID1 = "SELECT id_kluba FROM klubovi WHERE ime_kluba='" + d + "'";
                    ResultSet rezultatID1 = baza.naredba.executeQuery(queryID1);
                    while(rezultatID1.next()) {
                        id1 = Integer.parseInt(rezultatID1.getString("id_kluba"));
                    }
                    
                    String queryID2 = "SELECT id_kluba FROM klubovi WHERE ime_kluba='" + g + "'";
                    ResultSet rezultatID2 = baza.naredba.executeQuery(queryID2);
                    while(rezultatID2.next()) {
                        id2 = Integer.parseInt(rezultatID2.getString("id_kluba"));
                    }
                    
                    String queryDatum = "SELECT datum FROM utakmice WHERE domacin_ID='" + id1 + "' AND gost_ID='" + id2 + "'";
                    ResultSet rezultatDatum = baza.naredba.executeQuery(queryDatum);
                    while(rezultatDatum.next()) {
                        datum = rezultatDatum.getString("datum");
                        String[] datumParts = datum.split(" ");
                        String part1 = datumParts[0];
                        datumSplit = part1;
                    }
                    
                    String queryNadjiID = "SELECT id_utakmice FROM utakmice WHERE domacin_ID='" + id1 + "' AND gost_ID='" + id2 + "' AND datum=to_date('" + datumSplit + "', 'yyyy-mm-dd')";
                    ResultSet rezultatNadjiID = baza.naredba.executeQuery(queryNadjiID);
                    while(rezultatNadjiID.next()) {
                        idFinal = Integer.parseInt(rezultatNadjiID.getString("id_utakmice"));
                    }
                    
                    String queryKupiKartu = "UPDATE utakmice SET broj_ulaznica=broj_ulaznica-1 WHERE id_utakmice='" + idFinal + "' AND broj_ulaznica>0";
                    baza.naredba.executeUpdate(queryKupiKartu);
                    JOptionPane.showMessageDialog(null, "Uspešno ste kupili kartu za izabranu utakmicu!", "OБАВЕŠTENJE", JOptionPane.INFORMATION_MESSAGE);
                    
                    closeCurrent();
                    korisnik k = new korisnik();
                    k.setVisible(true);
                }           
            } catch (Exception e) {
                System.out.println("Greska sa bazom: " + e);
            } finally {
                baza.zatvoriBazu();
            }
        }
    }//GEN-LAST:event_b_kupiKartuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        loginForm lf = new loginForm();
        lf.setVisible(true);
        closeCurrent();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(korisnik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(korisnik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(korisnik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(korisnik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new korisnik().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_kupiKartu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable jTable1;
    private javax.swing.JScrollPane jTablePane1;
    // End of variables declaration//GEN-END:variables
}
