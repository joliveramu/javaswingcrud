/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package swingcrud;

import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dinoalix
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        loadData();
    }
    DatabaseUtils _databaseUtils = new DatabaseUtils();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersons = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name");

        jLabel2.setText("Age");

        tblPersons.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPersons.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPersonsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPersons);

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel3.setText("ID");

        lblID.setText("ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1)
                                        .addComponent(txtAge)
                                        .addComponent(txtName)
                                        .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblID)
                                .addGap(60, 60, 60)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(8, 8, 8)
                        .addComponent(lblID)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDelete)
                            .addComponent(btnUpdate)
                            .addComponent(btnAdd))))
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
         try{
            Class.forName("com.mysql.cj.jdbc.Driver");  
            _databaseUtils.connection = DriverManager.getConnection(_databaseUtils.url, _databaseUtils.userName, _databaseUtils.passWord);
            _databaseUtils.statement = _databaseUtils.connection.prepareStatement("INSERT INTO persons(name, age) VALUES (?, ?);");
            _databaseUtils.statement.setString(1, txtName.getText());
            _databaseUtils.statement.setInt(2, Integer.parseInt(txtAge.getText()));
            _databaseUtils.statement.executeUpdate();
             System.out.println("Persons added!");
             JOptionPane.showMessageDialog(null, "Person Added");
            _databaseUtils.connection.close();
            loadData();
            txtName.setText(null);
            txtAge.setText(null);
         }catch(Exception ex)
         {
             JOptionPane.showMessageDialog(null, ex.getMessage());
         }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");  
            _databaseUtils.connection = DriverManager.getConnection(_databaseUtils.url, _databaseUtils.userName, _databaseUtils.passWord);
            _databaseUtils.statement = _databaseUtils.connection.prepareStatement("UPDATE persons SET name = ?, age = ? WHERE id = 1;");
            _databaseUtils.statement.setString(1, txtName.getText());
            _databaseUtils.statement.setInt(2, Integer.parseInt(txtAge.getText()));
            _databaseUtils.statement.executeUpdate();
             System.out.println("Persons added!");
             JOptionPane.showMessageDialog(null, "Person Updated");
            _databaseUtils.connection.close();
            loadData();
            txtName.setText(null);
            txtAge.setText(null);
            this.lblID.setText(null);
         }catch(Exception ex)
         {
             JOptionPane.showMessageDialog(null, ex.getMessage());
         }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblPersonsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPersonsMouseClicked
        // TODO add your handling code here:
        try
        {
             int row =  this.tblPersons.getSelectedRow();
             int column = this.tblPersons.getSelectedColumn();
             int valueInCell = (int)this.tblPersons.getValueAt(row, 0);
             int ageValueCell = (int)this.tblPersons.getValueAt(row, 2);
             this.txtName.setText((String) this.tblPersons.getValueAt(row, 1));
             this.txtAge.setText(String.valueOf(ageValueCell));
             this.lblID.setText(String.valueOf(valueInCell));  
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }//GEN-LAST:event_tblPersonsMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");  
            _databaseUtils.connection = DriverManager.getConnection(_databaseUtils.url, _databaseUtils.userName, _databaseUtils.passWord);
            _databaseUtils.statement = _databaseUtils.connection.prepareStatement("DELETE FROM persons WHERE id = ?");
            _databaseUtils.statement.setInt(1, Integer.parseInt(this.lblID.getText()));
            _databaseUtils.statement.executeUpdate();
             System.out.println("Person deleted!");
             JOptionPane.showMessageDialog(null, "Person Deleted");
            _databaseUtils.connection.close();
            loadData();
            txtName.setText(null);
            txtAge.setText(null);
            this.lblID.setText(null);
         }catch(Exception ex)
         {
             JOptionPane.showMessageDialog(null, ex.getMessage());
         }
    }//GEN-LAST:event_btnDeleteActionPerformed

    public void loadData()
    {
        try
        {
             Class.forName("com.mysql.cj.jdbc.Driver");  
             _databaseUtils.connection = DriverManager.getConnection(_databaseUtils.url, _databaseUtils.userName, _databaseUtils.passWord);
            DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Name","Age"}, 0);
            _databaseUtils.query = "SELECT id, name, age from persons;";
            _databaseUtils.statement = _databaseUtils.connection.prepareStatement(_databaseUtils.query);
            _databaseUtils.resultSet = _databaseUtils.statement.executeQuery();
            while(_databaseUtils.resultSet.next())
            {
                int personId  = _databaseUtils.resultSet.getInt("id");
                String personName = _databaseUtils.resultSet.getString("name");
                int personAge = _databaseUtils.resultSet.getInt("age");
                model.addRow(new Object[]{personId, personName, personAge});
    
            }
            this.tblPersons.setModel(model);
            _databaseUtils.connection.close();
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error: "+e.getMessage());
        }
    }
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblID;
    private javax.swing.JTable tblPersons;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}