/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.SQLException;
import static view.TelaCadastroCliente.acessoBD;
import static view.TelaCadastroCliente.pedidoSQL1;
import static view.TelaCadastroCliente.pedidoSQL2;
import static view.TelaCadastroCliente.rs;

/**
 *
 * @author danie
 */
public class Profile extends javax.swing.JFrame {

    /**
     * Creates new form Account
     */
    public Profile(int id) {
        initComponents();
            pedidoSQL2 = "SELECT *, plano.descricao as 'plano', formapagamento.descricao as 'pagamento' FROM usuario, plano, formapagamento where usuario.codigo = "+id+" and idplano = plano.codigo and idpagamento = formapagamento.codigo;";
            pedidoSQL1 = "SELECT *, plano.descricao as 'plano', formapagamento.descricao as 'forma pagamento' FROM usuario, plano, formapagamento where usuario.codigo = 1 and idplano = plano.codigo and idpagamento = formapagamento.codigo";
            String address;
            System.out.println(pedidoSQL2);
            acessoBD = new AcessoBD();
            acessoBD.conecta();
            rs = acessoBD.consulta(pedidoSQL2);
            try{
                while(rs.next()){
                    userName.setText(rs.getString("nome"));
                    userBirthDate.setText(rs.getString("dataNascimento"));
                    userCPF.setText(rs.getString("cpf"));
                    userEmail.setText(rs.getString("email"));
                    address = rs.getString("estado");
                    address += " - "+rs.getString("pais");
                    address += "\n"+rs.getString("cidade");
                    address += ", "+rs.getString("bairro");
                    address += "\n"+rs.getString("rua");
                    address += " - "+rs.getString("numero");
                    userAddress.setText(address);
                    userPlan.setText(rs.getString("plano"));
                    userPayment.setText(rs.getString("pagamento"));
                    
                }
            }
            catch(SQLException e){
                System.out.println("Exceção: " + e.toString());
            }
            acessoBD.fechaConexao();    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Content = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        userCPF = new javax.swing.JLabel();
        userEmail = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        userBirthDate = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userAddress = new javax.swing.JTextArea();
        userPayment = new javax.swing.JLabel();
        userPlan = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Content.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 88, 100));
        jLabel1.setText("Proprietário:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 88, 100));
        jLabel2.setText("Data de Nascimento:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 88, 100));
        jLabel3.setText("CPF:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 88, 100));
        jLabel4.setText("Email:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 88, 100));
        jLabel5.setText("Endereço:");

        userCPF.setText("[cpf]");

        userEmail.setText("[email]");

        userName.setText("[name]");

        userBirthDate.setText("[birthdate]");

        userAddress.setEditable(false);
        userAddress.setColumns(20);
        userAddress.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        userAddress.setLineWrap(true);
        userAddress.setRows(5);
        userAddress.setText("[address]");
        userAddress.setToolTipText("");
        userAddress.setWrapStyleWord(true);
        userAddress.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        userAddress.setCaretColor(new java.awt.Color(255, 255, 255));
        userAddress.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        userAddress.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        userAddress.setFocusable(false);
        userAddress.setMargin(new java.awt.Insets(0, 0, 0, 0));
        userAddress.setOpaque(false);
        jScrollPane1.setViewportView(userAddress);
        jScrollPane1.setBorder(null);

        userPayment.setText("[pagamento]");

        userPlan.setText("[plano]");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 88, 100));
        jLabel6.setText("Plano:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 88, 100));
        jLabel7.setText("Forma de pagamento:");

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentLayout.createSequentialGroup()
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ContentLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addGroup(ContentLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(userPayment)
                                    .addComponent(userPlan)
                                    .addComponent(userEmail)
                                    .addComponent(userCPF)
                                    .addComponent(userBirthDate)
                                    .addComponent(userName))))))
                .addContainerGap(364, Short.MAX_VALUE))
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userBirthDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userCPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userPlan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userPayment)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea userAddress;
    private javax.swing.JLabel userBirthDate;
    private javax.swing.JLabel userCPF;
    private javax.swing.JLabel userEmail;
    private javax.swing.JLabel userName;
    private javax.swing.JLabel userPayment;
    private javax.swing.JLabel userPlan;
    // End of variables declaration//GEN-END:variables
}
