
import javax.swing.*;
import java.util.*;

public class Partiel2020 extends javax.swing.JFrame {

    /**
     * Creates new form Partiel2020
     */
    private LesTickets lestic;
    
    public Partiel2020() {
        initComponents();
        this.lestic= new LesTickets();
        this.lestic.initTickets();
        initListeLibelles();
        initListeReferences();
        Edition.setText("");
    }

    private void initListeLibelles()
    { ArrayList<String> ll = new ArrayList<String> ();
     ll= this.lestic.getListeLibelles();
     for (int i=0; i<ll.size();i++)
        ListeLibelles.addItem(ll.get(i));    
     
    }
     
  
    private void initListeReferences(){
        DefaultListModel mod = new DefaultListModel();
        ListeReferences.setModel(mod);
        for (int i=0; i<lestic.getNbTickets(); i++)
          mod.addElement(this.lestic.getTicket(i).getReference());
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GroupeCategorie = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        LTitre = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        BRLogiciels = new javax.swing.JRadioButton();
        BRLangages = new javax.swing.JRadioButton();
        BRTous = new javax.swing.JRadioButton();
        BPhoto = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        LLibelle = new javax.swing.JLabel();
        ListeLibelles = new javax.swing.JComboBox<>();
        LReference = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ListeReferences = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Edition = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LTitre.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        LTitre.setText("Gestion des tickets");
        jPanel1.add(LTitre);

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setLayout(new java.awt.GridLayout(2, 1));

        jPanel5.setLayout(new java.awt.GridLayout(3, 1));

        GroupeCategorie.add(BRLogiciels);
        BRLogiciels.setText("Logiciels");
        BRLogiciels.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRLogicielsActionPerformed(evt);
            }
        });
        jPanel5.add(BRLogiciels);

        GroupeCategorie.add(BRLangages);
        BRLangages.setText("Langages");
        BRLangages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRLangagesActionPerformed(evt);
            }
        });
        jPanel5.add(BRLangages);

        GroupeCategorie.add(BRTous);
        BRTous.setText("Tous les tcickets");
        BRTous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRTousActionPerformed(evt);
            }
        });
        jPanel5.add(BRTous);

        jPanel2.add(jPanel5);
        jPanel2.add(BPhoto);

        getContentPane().add(jPanel2, java.awt.BorderLayout.EAST);

        jPanel3.setLayout(new java.awt.GridLayout(2, 1));

        jPanel4.setLayout(new java.awt.GridLayout(3, 1));

        LLibelle.setText("Libellé ?");
        jPanel4.add(LLibelle);

        ListeLibelles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListeLibellesActionPerformed(evt);
            }
        });
        jPanel4.add(ListeLibelles);

        LReference.setText("Référence ?");
        jPanel4.add(LReference);

        jPanel3.add(jPanel4);

        ListeReferences.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ListeReferences.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListeReferencesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(ListeReferences);

        jPanel3.add(jScrollPane3);

        getContentPane().add(jPanel3, java.awt.BorderLayout.WEST);

        Edition.setColumns(20);
        Edition.setLineWrap(true);
        Edition.setRows(5);
        jScrollPane1.setViewportView(Edition);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);
        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListeReferencesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListeReferencesMouseClicked
        // TODO add your handling code here:
        int ind =ListeReferences.getSelectedIndex();
        if (ind != -1)
        {   Object o= ListeReferences.getSelectedValue();
            int ref=Integer.parseInt(o.toString());
            Ticket t= this.lestic.getTicketReference(ref);
            if (t!= null)
            {
            Edition.setText(t.toString());
            BPhoto.setIcon(t.getPhoto()); 
            BRTous.setSelected(false);
            BRLogiciels.setSelected(false);
            BRLangages.setSelected(false);
            }
            
        }
            
        
    }//GEN-LAST:event_ListeReferencesMouseClicked

    private void BRLogicielsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRLogicielsActionPerformed
        // TODO add your handling code here:
        LesTickets lt= this.lestic.getTicketsLogiciel();
        Edition.setText(lt.toString());
        BPhoto.setIcon(null);
    }//GEN-LAST:event_BRLogicielsActionPerformed

    private void BRLangagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRLangagesActionPerformed
        // TODO add your handling code here:
         LesTickets lt= this.lestic.getTicketsLangage();
        Edition.setText(lt.toString());
        BPhoto.setIcon(null);
    }//GEN-LAST:event_BRLangagesActionPerformed

    private void BRTousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRTousActionPerformed
        // TODO add your handling code here:
        Edition.setText(this.lestic.toString());
        
    }//GEN-LAST:event_BRTousActionPerformed

    private void ListeLibellesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListeLibellesActionPerformed
        // TODO add your handling code here:
         int ind =ListeLibelles.getSelectedIndex();
        if (ind != -1)
        { 
           
            String lib= ListeLibelles.getSelectedItem().toString();
            LesTickets lt= this.lestic.getTicketsLibelle(lib);
            Edition.setText(lt.toString());
            BPhoto.setIcon(null);
            BRTous.setSelected(false);
            BRLogiciels.setSelected(false);
            BRLangages.setSelected(false);
        }
    }//GEN-LAST:event_ListeLibellesActionPerformed

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
            java.util.logging.Logger.getLogger(Partiel2020.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Partiel2020.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Partiel2020.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Partiel2020.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Partiel2020().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BPhoto;
    private javax.swing.JRadioButton BRLangages;
    private javax.swing.JRadioButton BRLogiciels;
    private javax.swing.JRadioButton BRTous;
    private javax.swing.JTextArea Edition;
    private javax.swing.ButtonGroup GroupeCategorie;
    private javax.swing.JLabel LLibelle;
    private javax.swing.JLabel LReference;
    private javax.swing.JLabel LTitre;
    private javax.swing.JComboBox<String> ListeLibelles;
    private javax.swing.JList<String> ListeReferences;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
