/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitymanagementsystem.allframe;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import universitymanagementsystem.employee.Employee;
import universitymanagementsystem.employee.EmployeeModel;



/**
 *
 * @author jubel
 */
public class EmployeeRegistration extends javax.swing.JPanel {

    /**
     * Creates new form StudentRegForm
     */
    EmployeeModel employeeModel;
    public EmployeeRegistration() throws SQLException {
        initComponents();
        maleRadioBtn.setActionCommand("male");
        femaleRadioBtn.setActionCommand("female");
        employeeModel = EmployeeModel.getInstance();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderBtnGroup = new javax.swing.ButtonGroup();
        empSalary = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        empId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        empName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        empEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        maleRadioBtn = new javax.swing.JRadioButton();
        femaleRadioBtn = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        departmentComboBox = new javax.swing.JComboBox<>();
        empType = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(0, 102, 204));
        setMaximumSize(new java.awt.Dimension(680, 506));
        setMinimumSize(new java.awt.Dimension(680, 506));
        setPreferredSize(new java.awt.Dimension(680, 506));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        empSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empSalaryActionPerformed(evt);
            }
        });
        add(empSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 140, 33));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Employee Registration");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 240, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 100, 30));

        empId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empIdActionPerformed(evt);
            }
        });
        add(empId, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 186, 33));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 100, 30));

        empName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empNameActionPerformed(evt);
            }
        });
        add(empName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 186, 33));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 100, 30));

        empEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empEmailActionPerformed(evt);
            }
        });
        add(empEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 186, 33));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Type");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 100, 30));

        genderBtnGroup.add(maleRadioBtn);
        maleRadioBtn.setSelected(true);
        maleRadioBtn.setText("Male");
        add(maleRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 80, -1));

        genderBtnGroup.add(femaleRadioBtn);
        femaleRadioBtn.setText("Female");
        add(femaleRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 80, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Gender");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 100, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Department Name");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 140, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Salary");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 140, 30));

        addBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addBtn.setText("ADD EMPLOYEE");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 150, 30));

        departmentComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        departmentComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SWE", "CSE", "ETE", "English" }));
        add(departmentComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 140, 30));

        empType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        empType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Coordinator", "Staff" }));
        add(empType, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 180, 180, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void empSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empSalaryActionPerformed

    private void empIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empIdActionPerformed

    private void empNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empNameActionPerformed

    private void empEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empEmailActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        
       String id = empId.getText();
       String name = empName.getText();
       String email = empEmail.getText();
       String type = empType.getSelectedItem().toString();
       String gender = genderBtnGroup.getSelection().getActionCommand();
       String depertmentName = departmentComboBox.getSelectedItem().toString();
       String salaryText = empSalary.getText();
      
       
       if(id.isEmpty() || name.isEmpty() || email.isEmpty() || salaryText.isEmpty()){
           JOptionPane.showMessageDialog(getRootPane(), "please fill up all field");
       }
        
       else{
                if(isDouble(salaryText)){
                    Employee emp = new Employee(id, name, email, type, gender, depertmentName, Double.parseDouble(salaryText));
                    employeeModel.addEmployee(emp);
           
                    JOptionPane.showMessageDialog(getRootPane(), "Employee Added Successfull");
                 }
                else{
                    JOptionPane.showMessageDialog(getRootPane(), "Please Input Number in Salary Box");
                }
             
       }
                    
    }//GEN-LAST:event_addBtnActionPerformed

    public boolean isDouble(String salary){
        try{
            double num = Double.parseDouble(salary);
            return true;
        }catch(Exception e){
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JComboBox<String> departmentComboBox;
    private javax.swing.JTextField empEmail;
    private javax.swing.JTextField empId;
    private javax.swing.JTextField empName;
    private javax.swing.JTextField empSalary;
    private javax.swing.JComboBox<String> empType;
    private javax.swing.JRadioButton femaleRadioBtn;
    private javax.swing.ButtonGroup genderBtnGroup;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton maleRadioBtn;
    // End of variables declaration//GEN-END:variables
}
