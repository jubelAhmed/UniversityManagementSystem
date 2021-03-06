/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitymanagementsystem.allframe;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import universitymanagementsystem.student.ForeignStudent;
import universitymanagementsystem.student.LocalStudent;
import universitymanagementsystem.student.Student;
import universitymanagementsystem.student.StudentModel;

/**
 *
 * @author jubel
 */
public class StudentRegForm extends javax.swing.JPanel {

    /**
     * Creates new form StudentRegForm
     */
    StudentModel studentModel;
    public StudentRegForm() throws SQLException {
        initComponents();
        maleRadioBtn.setActionCommand("male");
        femaleRadioBtn.setActionCommand("female");
        studentModel = StudentModel.getInstance();
        
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
        jLabel1 = new javax.swing.JLabel();
        admissionYearText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        studentId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        studentName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        studentEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        maleRadioBtn = new javax.swing.JRadioButton();
        femaleRadioBtn = new javax.swing.JRadioButton();
        admissionSemisterComboBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        departmentComboBox = new javax.swing.JComboBox<>();
        studentTypeComboBox = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(0, 102, 204));
        setMaximumSize(new java.awt.Dimension(680, 506));
        setMinimumSize(new java.awt.Dimension(680, 506));
        setPreferredSize(new java.awt.Dimension(680, 506));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Admission Semister");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 140, 30));

        admissionYearText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admissionYearTextActionPerformed(evt);
            }
        });
        add(admissionYearText, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 140, 33));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Student Registration");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 240, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 100, 30));

        studentId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentIdActionPerformed(evt);
            }
        });
        add(studentId, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 186, 33));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 100, 30));

        studentName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentNameActionPerformed(evt);
            }
        });
        add(studentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 186, 33));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 100, 30));

        studentEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentEmailActionPerformed(evt);
            }
        });
        add(studentEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 186, 33));

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

        admissionSemisterComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        admissionSemisterComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Spring", "Summer", "Fall" }));
        add(admissionSemisterComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 140, 30));

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
        jLabel9.setText("Admission Year");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 140, 30));

        addBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addBtn.setText("ADD STUDENT");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 120, 30));

        departmentComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        departmentComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SWE", "CSE", "ETE", "English" }));
        add(departmentComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 140, 30));

        studentTypeComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        studentTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Local", "Foreign" }));
        add(studentTypeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 180, 180, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void admissionYearTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admissionYearTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_admissionYearTextActionPerformed

    private void studentIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentIdActionPerformed

    private void studentNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentNameActionPerformed

    private void studentEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentEmailActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        
       String id = studentId.getText();
       String name = studentName.getText();
       String email = studentEmail.getText();
       String type = studentTypeComboBox.getSelectedItem().toString();
       String gender = genderBtnGroup.getSelection().getActionCommand();
       String depertmentName = departmentComboBox.getSelectedItem().toString();
       String admissionYear = admissionYearText.getText();
       String admissionSemester = admissionSemisterComboBox.getSelectedItem().toString();
       
       if(id.isEmpty() || name.isEmpty() || email.isEmpty() || admissionYear.isEmpty()){
           JOptionPane.showMessageDialog(getRootPane(), "please fill up all field");
       }
        
       else{
           
           if(type.equals("Local") || type.equals("local")){
               Student st = new LocalStudent(id, name, email, type, gender, depertmentName, admissionYear, admissionSemester);
               studentModel.addStudent(st);
               
           }else{
                Student st = new ForeignStudent(id, name, email, type, gender, depertmentName, admissionYear, admissionSemester);
               studentModel.addStudent(st);
           }
           
           JOptionPane.showMessageDialog(getRootPane(), "Student Added Successfull");
       }
                    
    }//GEN-LAST:event_addBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JComboBox<String> admissionSemisterComboBox;
    private javax.swing.JTextField admissionYearText;
    private javax.swing.JComboBox<String> departmentComboBox;
    private javax.swing.JRadioButton femaleRadioBtn;
    private javax.swing.ButtonGroup genderBtnGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton maleRadioBtn;
    private javax.swing.JTextField studentEmail;
    private javax.swing.JTextField studentId;
    private javax.swing.JTextField studentName;
    private javax.swing.JComboBox<String> studentTypeComboBox;
    // End of variables declaration//GEN-END:variables
}
