
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO Z40-75
 */
public class Dua extends javax.swing.JFrame {

    /**
     * Creates new form Dua
     */
    public Dua() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        penyetoran = new javax.swing.JButton();
        petunjuk = new javax.swing.JButton();
        info = new javax.swing.JButton();
        penarikan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BRI.jpeg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 0, 780, 310);

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setLayout(null);

        penyetoran.setText("PENYETORAN");
        penyetoran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penyetoranActionPerformed(evt);
            }
        });
        jPanel2.add(penyetoran);
        penyetoran.setBounds(80, 330, 160, 50);

        petunjuk.setText("PETUNJUK");
        petunjuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                petunjukActionPerformed(evt);
            }
        });
        jPanel2.add(petunjuk);
        petunjuk.setBounds(680, 330, 160, 50);

        info.setText("INFO SALDO");
        info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoActionPerformed(evt);
            }
        });
        jPanel2.add(info);
        info.setBounds(480, 330, 160, 50);

        penarikan.setText("PENARIKAN");
        penarikan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penarikanActionPerformed(evt);
            }
        });
        jPanel2.add(penarikan);
        penarikan.setBounds(280, 330, 160, 50);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 920, 610);

        setBounds(0, 0, 943, 663);
    }// </editor-fold>//GEN-END:initComponents

    private void penyetoranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penyetoranActionPerformed
           String str1, str, setor;
        int m, tab=50000,z;
        
        str1 = JOptionPane.showInputDialog(null,"Masukkan jumlah Setor : " ); //menabung
            m = Integer.parseInt(str1);
            setor jadi = new setor();
            tab =jadi.getsaldo();
            
            z=JOptionPane.showConfirmDialog(null,"Melanjutkan transaksi lain ?","ATM BRI",
                JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain
            if (z==0)
            {
                this.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Terimakasih telah menggunakan ATM BRI, ambil kartu ATM Anda.");
                System.exit(0);
            }    
    }//GEN-LAST:event_penyetoranActionPerformed

    private void penarikanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penarikanActionPerformed
               
    }//GEN-LAST:event_penarikanActionPerformed

    private void infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoActionPerformed
              
    }//GEN-LAST:event_infoActionPerformed

    private void petunjukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_petunjukActionPerformed
               
    }//GEN-LAST:event_petunjukActionPerformed

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
            java.util.logging.Logger.getLogger(Dua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dua().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton penarikan;
    private javax.swing.JButton penyetoran;
    private javax.swing.JButton petunjuk;
    // End of variables declaration//GEN-END:variables
}
