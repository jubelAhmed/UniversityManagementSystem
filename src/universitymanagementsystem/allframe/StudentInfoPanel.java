/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitymanagementsystem.allframe;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universitymanagementsystem.Course;
import universitymanagementsystem.CourseModel;
import universitymanagementsystem.student.Student;
import universitymanagementsystem.student.StudentModel;

/**
 *
 * @author jubel
 */
public class StudentInfoPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudentInfoPanel
     */
    CourseModel courseModel;
    StudentModel studentModel;
    public StudentInfoPanel() throws SQLException {
        
        initComponents();
        
        courseModel = CourseModel.getInstance();
        studentModel = StudentModel.getInstance();
        fillCourseCombobox();
        coursePanel.setVisible(false);
        
        
    }
    
    
     public void addCourseInCombobox(Course c){
         courseComboBox.addItem(c.getCourseName());
     }
   
    
    public void fillCourseCombobox(){
        try {
            courseModel = CourseModel.getInstance();
            LinkedList<Course> courseList = courseModel.getCourseList();
             int size = courseList.size();
        System.out.println("size  ssa   "+size);
        } catch (SQLException ex) {
            Logger.getLogger(StudentInfoPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        LinkedList<Course> courseList = courseModel.getCourseList();
        System.out.println("jjjj "+courseList);
        int size = courseList.size();
        System.out.println("size   "+size);
        
        for(Course c : courseList){
            boolean b = false;
            if(!c.getCourseName().equals("null")){  
               for(int i = 0 ; i<size ; i++){ 
                    if(c.getCourseName().equals(courseComboBox.getItemAt(i))){
                       b = true;
                       break;
                    }
               } 
               if(!b){
                   System.out.println("alson in ");
                    courseComboBox.addItem(c.getCourseName());
               }
               
            }
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

        jLabel1 = new javax.swing.JLabel();
        admissionYearText = new javax.swing.JTextField();
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
        departmentComboBox = new javax.swing.JComboBox<>();
        studentTypeComboBox = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        admissionYearField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        studentIdField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        studentNameField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        studentEmailField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        studentTypeField = new javax.swing.JTextField();
        studentGenderField = new javax.swing.JTextField();
        depertmentField = new javax.swing.JTextField();
        admissionSemesterField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        searchBtn = new javax.swing.JButton();
        searchIdText = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        courseComboBox = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        courseCreditText = new javax.swing.JTextField();
        courseCodeText = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        courseBtn = new javax.swing.JButton();
        coursePanel = new javax.swing.JPanel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Admission Semister");

        admissionYearText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admissionYearTextActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID");

        studentId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentIdActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name");

        studentName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentNameActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email");

        studentEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentEmailActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Type");

        maleRadioBtn.setSelected(true);
        maleRadioBtn.setText("Male");

        femaleRadioBtn.setText("Female");

        admissionSemisterComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        admissionSemisterComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Spring", "Summer", "Fall" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Gender");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Department Name");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Admission Year");

        departmentComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        departmentComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SWE", "CSE", "ETE", "English" }));

        studentTypeComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        studentTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Local", "Foreign" }));

        setBackground(new java.awt.Color(0, 153, 255));
        setMinimumSize(new java.awt.Dimension(680, 506));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(680, 506));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Admission Semister");

        admissionYearField.setEditable(false);
        admissionYearField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admissionYearFieldActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ID");

        studentIdField.setEditable(false);
        studentIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentIdFieldActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Name");

        studentNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentNameFieldActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Email");

        studentEmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentEmailFieldActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Type");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Gender");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Department Name");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Admission Year");

        studentTypeField.setEditable(false);
        studentTypeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentTypeFieldActionPerformed(evt);
            }
        });

        studentGenderField.setEditable(false);
        studentGenderField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentGenderFieldActionPerformed(evt);
            }
        });

        depertmentField.setEditable(false);
        depertmentField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depertmentFieldActionPerformed(evt);
            }
        });

        admissionSemesterField.setEditable(false);
        admissionSemesterField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admissionSemesterFieldActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Student Info");
        jLabel18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(14, 14, 14)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(studentGenderField)
                                        .addComponent(studentEmailField, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                        .addComponent(studentTypeField)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(0, 0, Short.MAX_VALUE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(admissionSemesterField, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                        .addComponent(depertmentField)
                                        .addComponent(admissionYearField))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(studentNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(studentIdField))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(studentGenderField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(depertmentField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(admissionYearField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(admissionSemesterField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 330, -1));

        searchBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(0, 0, 51));
        searchBtn.setText("SEARCH");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, -1, 30));
        add(searchIdText, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 180, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Student Id");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 10, 110, 30));

        addBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addBtn.setForeground(new java.awt.Color(0, 0, 102));
        addBtn.setText("ADD COURSE");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, 130, 40));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Course Credit");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 100, 30));

        courseComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        courseComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseComboBoxActionPerformed(evt);
            }
        });
        add(courseComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 150, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Chose Course");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 100, 40));

        courseCreditText.setEditable(false);
        courseCreditText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseCreditTextActionPerformed(evt);
            }
        });
        add(courseCreditText, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 150, 33));

        courseCodeText.setEditable(false);
        courseCodeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseCodeTextActionPerformed(evt);
            }
        });
        add(courseCodeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 150, 33));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Course Code");
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 100, 30));

        courseBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        courseBtn.setForeground(new java.awt.Color(0, 0, 51));
        courseBtn.setText("ADD COURSE");
        courseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseBtnActionPerformed(evt);
            }
        });
        add(courseBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 120, 30));

        coursePanel.setBackground(new java.awt.Color(51, 153, 255));
        coursePanel.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout coursePanelLayout = new javax.swing.GroupLayout(coursePanel);
        coursePanel.setLayout(coursePanelLayout);
        coursePanelLayout.setHorizontalGroup(
            coursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 348, Short.MAX_VALUE)
        );
        coursePanelLayout.setVerticalGroup(
            coursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
        );

        add(coursePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 350, 370));
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

    private void admissionYearFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admissionYearFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_admissionYearFieldActionPerformed

    private void studentIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentIdFieldActionPerformed

    private void studentNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentNameFieldActionPerformed

    private void studentEmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentEmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentEmailFieldActionPerformed

    private void studentTypeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentTypeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentTypeFieldActionPerformed

    private void studentGenderFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentGenderFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentGenderFieldActionPerformed

    private void depertmentFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depertmentFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_depertmentFieldActionPerformed

    private void admissionSemesterFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admissionSemesterFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_admissionSemesterFieldActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        String id = searchIdText.getText();
        fillFullStudentForm(id);
        
    }//GEN-LAST:event_searchBtnActionPerformed

    public void fillFullStudentForm(String id){
        try {
            Student st = studentModel.getStudent(id);
            if(st!=null){
                 studentIdField.setText(st.getId());
            studentEmailField.setText(st.getEmail());
            studentNameField.setText(st.getName());
            studentTypeField.setText(st.getType());
            studentGenderField.setText(st.getGender());
            depertmentField.setText(st.getDeprtmentName());
            admissionSemesterField.setText(st.getAdmissionSemister());
            admissionYearField.setText(st.getAdmissionYear());
            }
            else{
                JOptionPane.showMessageDialog(getRootPane(), "Please input correct ID");
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(StudentInfoPanel.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
    private void courseCodeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseCodeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseCodeTextActionPerformed

    private void courseCreditTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseCreditTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseCreditTextActionPerformed

    private void courseComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseComboBoxActionPerformed
        // TODO add your handling code here:
        Course c = courseModel.getCourse(courseComboBox.getSelectedItem().toString());
        courseCodeText.setText(c.getCourseCode());
        courseCreditText.setText(String.valueOf(c.getCourseCredit()));
    }//GEN-LAST:event_courseComboBoxActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        String id = searchIdText.getText();
         
        if(id.isEmpty()){
             JOptionPane.showMessageDialog(getRootPane(), "Please Input The Id");
        }
        else{
            try {
            Student st = studentModel.getStudent(id);
            if(st!= null){
                Course c = courseModel.getCourse(courseComboBox.getSelectedItem().toString());
                boolean b = studentModel.addCourse(st, c);
                if(b){
                    JOptionPane.showMessageDialog(getRootPane(), "Course Added Successfull");
                }
                else{
                    JOptionPane.showMessageDialog(getRootPane(), "Course already added");
                }
            }
            else{
                 JOptionPane.showMessageDialog(getRootPane(), "Please input correct ID");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentInfoPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        } 
       
    }//GEN-LAST:event_addBtnActionPerformed

    private void courseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseBtnActionPerformed
        // TODO add your handling code here:
        String id = searchIdText.getText();
        
        if(id.isEmpty()){
            JOptionPane.showMessageDialog(getRootPane(), "Please Input The Id");
            
        }
        else{
                try {
                    Student st = studentModel.getStudent(id);
                    if(st!=null){
                         fillFullStudentForm(id);
                    }
                    else{
                         JOptionPane.showMessageDialog(getRootPane(), "Please input correct ID");
                    }
                } catch (SQLException ex) {
                Logger.getLogger(StudentInfoPanel.class.getName()).log(Level.SEVERE, null, ex);
                 }
            
        }
       

    }//GEN-LAST:event_courseBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField admissionSemesterField;
    private javax.swing.JComboBox<String> admissionSemisterComboBox;
    private javax.swing.JTextField admissionYearField;
    private javax.swing.JTextField admissionYearText;
    private javax.swing.JButton courseBtn;
    private javax.swing.JTextField courseCodeText;
    private javax.swing.JComboBox<String> courseComboBox;
    private javax.swing.JTextField courseCreditText;
    private javax.swing.JPanel coursePanel;
    private javax.swing.JComboBox<String> departmentComboBox;
    private javax.swing.JTextField depertmentField;
    private javax.swing.JRadioButton femaleRadioBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton maleRadioBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchIdText;
    private javax.swing.JTextField studentEmail;
    private javax.swing.JTextField studentEmailField;
    private javax.swing.JTextField studentGenderField;
    private javax.swing.JTextField studentId;
    private javax.swing.JTextField studentIdField;
    private javax.swing.JTextField studentName;
    private javax.swing.JTextField studentNameField;
    private javax.swing.JComboBox<String> studentTypeComboBox;
    private javax.swing.JTextField studentTypeField;
    // End of variables declaration//GEN-END:variables
}
