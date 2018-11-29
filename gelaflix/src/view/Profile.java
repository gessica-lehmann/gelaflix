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
    int codigo;
    public Profile(int id) {
        initComponents();
        codigo = id;
        pedidoSQL2 = "SELECT *, plano.descricao as 'plano', formapagamento.descricao as 'pagamento' FROM usuario, plano, formapagamento where usuario.codigo = "+id+" and idplano = plano.codigo and idpagamento = formapagamento.codigo;";
        pedidoSQL1 = "SELECT *, plano.descricao as 'plano', formapagamento.descricao as 'forma pagamento' FROM usuario, plano, formapagamento where usuario.codigo = 1 and idplano = plano.codigo and idpagamento = formapagamento.codigo";
        String address;
        acessoBD = new AcessoBD();
        acessoBD.conecta();
        rs = acessoBD.consulta(pedidoSQL2);
            try{
                while(rs.next()){
                    userName.setText(rs.getString("nome"));
                    userBirthDate.setText(rs.getString("dataNascimento"));
                    userCPF.setText(rs.getString("cpf"));
                    userEmail.setText(rs.getString("email"));
                    userState.setText(rs.getString("estado"));
                    userCountry.setText(rs.getString("pais"));
                    userCity.setText(rs.getString("cidade"));
                    userNeighborhood.setText(rs.getString("bairro"));
                    userStreet.setText(rs.getString("rua"));
                    userStreetNumber.setText(rs.getString("numero"));
                    userPhone.setText(rs.getString("telefone"));
                    jcbPgto.setSelectedIndex(Integer.parseInt(rs.getString("idPagamento"))-1);
                    jcbPlano.setSelectedIndex(Integer.parseInt((rs.getString("idPlano")))-1);
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

        jTextField1 = new javax.swing.JTextField();
        Content = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        goBackButton = new javax.swing.JButton();
        userAccountDeletion = new javax.swing.JButton();
        jcbPlano = new javax.swing.JComboBox<>();
        jcbPgto = new javax.swing.JComboBox<>();
        userEmail = new javax.swing.JTextField();
        userBirthDate = new javax.swing.JFormattedTextField();
        userCPF = new javax.swing.JFormattedTextField();
        userUpdate = new javax.swing.JButton();
        userCountry = new javax.swing.JTextField();
        userCity = new javax.swing.JTextField();
        userState = new javax.swing.JTextField();
        userNeighborhood = new javax.swing.JTextField();
        userStreet = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        userPhone = new javax.swing.JFormattedTextField();
        userStreetNumber = new javax.swing.JFormattedTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Content.setBackground(new java.awt.Color(255, 255, 255));

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

        userName.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        userName.setForeground(new java.awt.Color(255, 88, 100));
        userName.setText("[name]");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 88, 100));
        jLabel6.setText("Plano:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 88, 100));
        jLabel7.setText("Forma de pagamento:");

        goBackButton.setBackground(new java.awt.Color(250, 40, 120));
        goBackButton.setForeground(new java.awt.Color(255, 255, 255));
        goBackButton.setText("Voltar");
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });

        userAccountDeletion.setBackground(new java.awt.Color(255, 88, 100));
        userAccountDeletion.setForeground(new java.awt.Color(255, 255, 255));
        userAccountDeletion.setText("Deletar minha conta");
        userAccountDeletion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userAccountDeletionActionPerformed(evt);
            }
        });

        jcbPlano.setBackground(new java.awt.Color(255, 100, 90));
        jcbPlano.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Premium" }));
        jcbPlano.setSelectedIndex(-1);
        jcbPlano.setToolTipText("Tipo de plano");
        jcbPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPlanoActionPerformed(evt);
            }
        });

        jcbPgto.setBackground(new java.awt.Color(255, 100, 90));
        jcbPgto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boleto", "Débito em conta", "Cartão de crédito" }));
        jcbPgto.setSelectedIndex(-1);
        jcbPgto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPgtoActionPerformed(evt);
            }
        });

        userEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userEmail.setText("[email]");

        try {
            userBirthDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        userBirthDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            userCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        userCPF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userCPFActionPerformed(evt);
            }
        });

        userUpdate.setBackground(new java.awt.Color(255, 100, 90));
        userUpdate.setForeground(new java.awt.Color(255, 255, 255));
        userUpdate.setText("Atualizar");
        userUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userUpdateActionPerformed(evt);
            }
        });

        userCountry.setText("[country]");

        userCity.setText("[city]");

        userState.setText("[state]");

        userNeighborhood.setText("[neighborhood]");

        userStreet.setText("[street]");
        userStreet.setMinimumSize(new java.awt.Dimension(8, 20));
        userStreet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userStreetActionPerformed(evt);
            }
        });

        jLabel1.setText("-");

        jLabel8.setText(",");

        jLabel9.setText("-");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 88, 100));
        jLabel10.setText("Telefone:");

        try {
            userPhone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        userPhone.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            userStreetNumber.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###*")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        userStreetNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userStreetNumberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addComponent(goBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(userUpdate)
                        .addGap(105, 105, 105)
                        .addComponent(userAccountDeletion))
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jcbPgto, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(ContentLayout.createSequentialGroup()
                                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(userEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(userBirthDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(userCPF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(94, 94, 94)
                                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentLayout.createSequentialGroup()
                                        .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(userStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(userPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel6)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(userStreetNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel10)
                                    .addGroup(ContentLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(ContentLayout.createSequentialGroup()
                                                .addComponent(userState, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(userCountry))
                                            .addGroup(ContentLayout.createSequentialGroup()
                                                .addComponent(userCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(userNeighborhood, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jcbPlano, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 103, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userName)
                .addGap(28, 28, 28)
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4))
                    .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(userCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(userNeighborhood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(userStreetNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbPgto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbPlano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goBackButton)
                    .addComponent(userAccountDeletion)
                    .addComponent(userUpdate))
                .addContainerGap(26, Short.MAX_VALUE))
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
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed
        // TODO add your handling code here:
        System.out.println("Log out request");
        this.dispose();
        new Gelaflix(codigo).setVisible(true);
    }//GEN-LAST:event_goBackButtonActionPerformed

    private void userAccountDeletionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userAccountDeletionActionPerformed
        // TODO add your handling code here:
        System.out.println("Deletion request");
        this.dispose();
        new confirmDeletion(codigo).setVisible(true);
    }//GEN-LAST:event_userAccountDeletionActionPerformed

    private void jcbPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPlanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbPlanoActionPerformed

    private void jcbPgtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPgtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbPgtoActionPerformed

    private void userCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userCPFActionPerformed

    private void userUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userUpdateActionPerformed
        String name = userName.getText();
        String bdate = userBirthDate.getText();
        String cpf = userCPF.getText();
        String email = userEmail.getText();
        String state = userState.getText();
        String country = userCountry.getText();  
        String city = userCity.getText();
        String neighborhood = userNeighborhood.getText();
        String street = userStreet.getText();
        String streetNumber = userStreetNumber.getText(); 
        String phone = userPhone.getText();
        int plano = jcbPlano.getSelectedIndex()+1;
        int pgto = jcbPgto.getSelectedIndex()+1;
        pedidoSQL1 = "Update usuario set nome = '"+name+"', dataNascimento = '"+bdate+"', email = '"+email+"', cpf = '"+cpf+"',"
                + " rua = '"+street+"', numero = '"+streetNumber+"', bairro = '"+neighborhood+"', cidade = '"+city+"', estado = '"+state+"',"
                + " pais = '"+country+"', telefone = '"+phone+"', idPlano = '"+plano+"', idPagamento = '"+pgto+"'  where codigo = '"+codigo+"';";
        System.out.println(pedidoSQL1);
        acessoBD = new AcessoBD();
        acessoBD.conecta();
        acessoBD.executa(pedidoSQL1);
        rs = acessoBD.consulta(pedidoSQL2);
        try{
            while(rs.next()){
                System.out.print("conectando");}
        }
        catch(SQLException e){
            System.out.println("Exceção: " + e.toString());
        }
        acessoBD.fechaConexao();
        this.dispose();
        new Profile(codigo).setVisible(true);  
    }//GEN-LAST:event_userUpdateActionPerformed

    private void userStreetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userStreetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userStreetActionPerformed

    private void userStreetNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userStreetNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userStreetNumberActionPerformed

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
    private javax.swing.JButton goBackButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> jcbPgto;
    private javax.swing.JComboBox<String> jcbPlano;
    private javax.swing.JButton userAccountDeletion;
    private javax.swing.JFormattedTextField userBirthDate;
    private javax.swing.JFormattedTextField userCPF;
    private javax.swing.JTextField userCity;
    private javax.swing.JTextField userCountry;
    private javax.swing.JTextField userEmail;
    private javax.swing.JLabel userName;
    private javax.swing.JTextField userNeighborhood;
    private javax.swing.JFormattedTextField userPhone;
    private javax.swing.JTextField userState;
    private javax.swing.JTextField userStreet;
    private javax.swing.JFormattedTextField userStreetNumber;
    private javax.swing.JButton userUpdate;
    // End of variables declaration//GEN-END:variables
}
