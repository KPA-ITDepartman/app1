/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superliga;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Укиии Цар
 */
public class loginForm extends javax.swing.JFrame {

    Baza baza = new Baza();
    
    public loginForm() {
        initComponents();
        setTitle("Ulogujte se");
        transparent.setBackground(new Color(0, 0, 0, 100));
        setResizable(false);
        
        /*try {
            baza.poveziSaBazom();
        } catch (Exception e) {
            System.out.println("Greska sa bazom: " + e);
        } finally {
            baza.zatvoriBazu();
        }*/
    }
    
    public void closeCurrent() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
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
        dobrodosli = new javax.swing.JLabel();
        jl_korisnickoIme = new javax.swing.JLabel();
        tf_korisnickoIme = new javax.swing.JTextField();
        jl_lozinka = new javax.swing.JLabel();
        pf_lozinka = new javax.swing.JPasswordField();
        b_ulogujSe = new javax.swing.JButton();
        b_nastaviKaoGost = new javax.swing.JButton();
        transparent = new javax.swing.JPanel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(625, 395));
        setMinimumSize(new java.awt.Dimension(625, 395));
        setPreferredSize(new java.awt.Dimension(625, 395));
        setResizable(false);
        setSize(new java.awt.Dimension(625, 395));

        jPanel1.setMaximumSize(new java.awt.Dimension(625, 375));
        jPanel1.setMinimumSize(new java.awt.Dimension(625, 375));
        jPanel1.setLayout(null);

        dobrodosli.setBackground(new java.awt.Color(255, 255, 255));
        dobrodosli.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        dobrodosli.setForeground(new java.awt.Color(255, 255, 255));
        dobrodosli.setText("Dobrodošli. Molim Vas prijavite se ili nastavite kao gost.");
        jPanel1.add(dobrodosli);
        dobrodosli.setBounds(200, 80, 420, 20);

        jl_korisnickoIme.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jl_korisnickoIme.setForeground(new java.awt.Color(255, 255, 255));
        jl_korisnickoIme.setText("KORISNIČKO IME");
        jPanel1.add(jl_korisnickoIme);
        jl_korisnickoIme.setBounds(350, 120, 140, 23);

        tf_korisnickoIme.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jPanel1.add(tf_korisnickoIme);
        tf_korisnickoIme.setBounds(340, 140, 150, 23);

        jl_lozinka.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jl_lozinka.setForeground(new java.awt.Color(255, 255, 255));
        jl_lozinka.setText("LOZINKA");
        jPanel1.add(jl_lozinka);
        jl_lozinka.setBounds(380, 180, 80, 23);

        pf_lozinka.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jPanel1.add(pf_lozinka);
        pf_lozinka.setBounds(340, 200, 150, 23);

        b_ulogujSe.setText("Uloguj se");
        b_ulogujSe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ulogujSeActionPerformed(evt);
            }
        });
        jPanel1.add(b_ulogujSe);
        b_ulogujSe.setBounds(280, 260, 120, 23);

        b_nastaviKaoGost.setText("Nastavi kao gost");
        b_nastaviKaoGost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_nastaviKaoGostActionPerformed(evt);
            }
        });
        jPanel1.add(b_nastaviKaoGost);
        b_nastaviKaoGost.setBounds(420, 260, 120, 23);

        transparent.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout transparentLayout = new javax.swing.GroupLayout(transparent);
        transparent.setLayout(transparentLayout);
        transparentLayout.setHorizontalGroup(
            transparentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        transparentLayout.setVerticalGroup(
            transparentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );

        jPanel1.add(transparent);
        transparent.setBounds(200, 70, 420, 230);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/sp-logo-superliga_620x0_620x0.jpg"))); // NOI18N
        jPanel1.add(background);
        background.setBounds(0, 0, 620, 375);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_ulogujSeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ulogujSeActionPerformed
        try {
            baza.poveziSaBazom();
            
            int proveraAdmin = 0;
            String queryAdmin = "SELECT * FROM korisnici WHERE korisnicko_ime='" + tf_korisnickoIme.getText() + "' AND lozinka='" + pf_lozinka.getText() + "' AND admin='1'";
            ResultSet rezultatAdmin = baza.naredba.executeQuery(queryAdmin);
            while (rezultatAdmin.next()) {
                proveraAdmin++;
            }
            
            int proveraKorisnik = 0;
            String queryKorisnik = "SELECT * FROM korisnici WHERE korisnicko_ime='" + tf_korisnickoIme.getText() + "' AND lozinka='" + pf_lozinka.getText() + "' AND admin='0'";
            ResultSet rezultatKorisnik = baza.naredba.executeQuery(queryKorisnik);
            while (rezultatKorisnik.next()) {
                proveraKorisnik++;
            }
            
            if(proveraAdmin != 0) {
                admin a = new admin();
                a.setVisible(true);
                closeCurrent();
            } else if(proveraKorisnik != 0) {
                korisnik k = new korisnik();
                k.setVisible(true);
                closeCurrent();
            } else {
                JOptionPane.showMessageDialog(null, "Neispravno uneti podaci!", "GREŠKA", JOptionPane.ERROR_MESSAGE);
                tf_korisnickoIme.setText(null);
                pf_lozinka.setText(null);
            }
        } catch (Exception e) {
            System.out.println("Greska sa bazom: " + e);
        } finally {
            baza.zatvoriBazu();
        }
    }//GEN-LAST:event_b_ulogujSeActionPerformed

    private void b_nastaviKaoGostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_nastaviKaoGostActionPerformed
        gost g = new gost();
        g.setVisible(true);
        closeCurrent();
    }//GEN-LAST:event_b_nastaviKaoGostActionPerformed

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
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_nastaviKaoGost;
    private javax.swing.JButton b_ulogujSe;
    private javax.swing.JLabel background;
    private javax.swing.JLabel dobrodosli;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jl_korisnickoIme;
    private javax.swing.JLabel jl_lozinka;
    private javax.swing.JPasswordField pf_lozinka;
    private javax.swing.JTextField tf_korisnickoIme;
    private javax.swing.JPanel transparent;
    // End of variables declaration//GEN-END:variables
}