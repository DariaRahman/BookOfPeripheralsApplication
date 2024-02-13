package bookofperipheralsapplication;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 * @author Daria Rahman
 * @version 1.0 8.11.22 
 * Класс, реализующий окно UserWindow для работы с пользователями
 */
public class UserWindow extends javax.swing.JFrame {

    Connection Con = null; // Connection - соединение с базой данных
    Statement St = null; // Statement - выполнение SQL-запросов
    ResultSet Rs = null; // ResultSet - построчный доступ к результатам запросов в базе данных

    /**
     * Создание формы UserWindow
     */
    public UserWindow() {
        initComponents();
        selectUsers();
    }

    /**
     * Метод подключения к бд и вывода всех данных в таблицу JTable из таблицы бд TBLUSERS
     */
    public void selectUsers() {
        try {
            Con = DBManager.getConnection();
            St = Con.createStatement();
            Rs = St.executeQuery("Select * from User1.TBLUSERS");
            jtblUsers.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Database connection error");
        }
    }

    /**
     * 
     * Создание компонент и оформление интерфейса (расположение, шрифт, фон)
     * Данный метод вызывается из конструктора для инициализации формы
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kgrdpnlMain = new com.k33ptoo.components.KGradientPanel();
        jlblManageUser = new javax.swing.JLabel();
        jlblUserName = new javax.swing.JLabel();
        jtxtfldUserName = new javax.swing.JTextField();
        jlblUserGender = new javax.swing.JLabel();
        jcmbbxGender = new javax.swing.JComboBox<>();
        jlblUserPassword = new javax.swing.JLabel();
        jtxtfldUserPassword = new javax.swing.JTextField();
        jlblListOfUsers = new javax.swing.JLabel();
        jscrlpnUsers = new javax.swing.JScrollPane();
        jtblUsers = new javax.swing.JTable();
        jlblUserID = new javax.swing.JLabel();
        jtxtfldUserID = new javax.swing.JTextField();
        kbtnUserAdd = new com.k33ptoo.components.KButton();
        kbtnUserEdit = new com.k33ptoo.components.KButton();
        kbtnUserDelete = new com.k33ptoo.components.KButton();
        kbtnUserClear = new com.k33ptoo.components.KButton();
        kbtnLogout = new com.k33ptoo.components.KButton();
        kbtnExit = new com.k33ptoo.components.KButton();
        kbtnUpdateAdmin = new com.k33ptoo.components.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kgrdpnlMain.setkEndColor(new java.awt.Color(0, 153, 153));
        kgrdpnlMain.setkStartColor(new java.awt.Color(153, 153, 255));

        jlblManageUser.setBackground(new java.awt.Color(255, 255, 255));
        jlblManageUser.setFont(new java.awt.Font("Charter", 1, 30)); // NOI18N
        jlblManageUser.setForeground(new java.awt.Color(255, 255, 255));
        jlblManageUser.setText("Manage User");

        jlblUserName.setBackground(new java.awt.Color(255, 255, 255));
        jlblUserName.setFont(new java.awt.Font("Charter", 1, 20)); // NOI18N
        jlblUserName.setForeground(new java.awt.Color(255, 255, 255));
        jlblUserName.setText("Name");

        jtxtfldUserName.setFont(new java.awt.Font("Charter", 0, 12)); // NOI18N

        jlblUserGender.setBackground(new java.awt.Color(255, 255, 255));
        jlblUserGender.setFont(new java.awt.Font("Charter", 1, 20)); // NOI18N
        jlblUserGender.setForeground(new java.awt.Color(255, 255, 255));
        jlblUserGender.setText("Gender");

        jcmbbxGender.setFont(new java.awt.Font("Charter", 0, 12)); // NOI18N
        jcmbbxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", " " }));

        jlblUserPassword.setBackground(new java.awt.Color(255, 255, 255));
        jlblUserPassword.setFont(new java.awt.Font("Charter", 1, 20)); // NOI18N
        jlblUserPassword.setForeground(new java.awt.Color(255, 255, 255));
        jlblUserPassword.setText("Password");

        jtxtfldUserPassword.setFont(new java.awt.Font("Charter", 0, 12)); // NOI18N

        jlblListOfUsers.setBackground(new java.awt.Color(255, 255, 255));
        jlblListOfUsers.setFont(new java.awt.Font("Charter", 1, 30)); // NOI18N
        jlblListOfUsers.setForeground(new java.awt.Color(255, 255, 255));
        jlblListOfUsers.setText("List Of Users");

        jtblUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Gender", "Password"
            }
        ));
        jtblUsers.setRowHeight(25);
        jtblUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblUsersMouseClicked(evt);
            }
        });
        jscrlpnUsers.setViewportView(jtblUsers);

        jlblUserID.setBackground(new java.awt.Color(255, 255, 255));
        jlblUserID.setFont(new java.awt.Font("Charter", 1, 20)); // NOI18N
        jlblUserID.setForeground(new java.awt.Color(255, 255, 255));
        jlblUserID.setText("User ID");

        jtxtfldUserID.setFont(new java.awt.Font("Charter", 0, 12)); // NOI18N

        kbtnUserAdd.setForeground(new java.awt.Color(0, 0, 0));
        kbtnUserAdd.setText("Add");
        kbtnUserAdd.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        kbtnUserAdd.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        kbtnUserAdd.setkEndColor(new java.awt.Color(204, 204, 255));
        kbtnUserAdd.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kbtnUserAdd.setkHoverForeGround(new java.awt.Color(102, 102, 255));
        kbtnUserAdd.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kbtnUserAdd.setkPressedColor(new java.awt.Color(204, 204, 255));
        kbtnUserAdd.setkStartColor(new java.awt.Color(153, 153, 255));
        kbtnUserAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kbtnUserAddMouseClicked(evt);
            }
        });

        kbtnUserEdit.setForeground(new java.awt.Color(0, 0, 0));
        kbtnUserEdit.setText("Edit");
        kbtnUserEdit.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        kbtnUserEdit.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        kbtnUserEdit.setkEndColor(new java.awt.Color(204, 204, 255));
        kbtnUserEdit.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kbtnUserEdit.setkHoverForeGround(new java.awt.Color(102, 102, 255));
        kbtnUserEdit.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kbtnUserEdit.setkPressedColor(new java.awt.Color(204, 204, 255));
        kbtnUserEdit.setkStartColor(new java.awt.Color(153, 153, 255));
        kbtnUserEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kbtnUserEditMouseClicked(evt);
            }
        });

        kbtnUserDelete.setForeground(new java.awt.Color(0, 0, 0));
        kbtnUserDelete.setText("Delete");
        kbtnUserDelete.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        kbtnUserDelete.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        kbtnUserDelete.setkEndColor(new java.awt.Color(204, 204, 255));
        kbtnUserDelete.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kbtnUserDelete.setkHoverForeGround(new java.awt.Color(102, 102, 255));
        kbtnUserDelete.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kbtnUserDelete.setkPressedColor(new java.awt.Color(204, 204, 255));
        kbtnUserDelete.setkStartColor(new java.awt.Color(153, 153, 255));
        kbtnUserDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kbtnUserDeleteMouseClicked(evt);
            }
        });

        kbtnUserClear.setForeground(new java.awt.Color(0, 0, 0));
        kbtnUserClear.setText("Clear");
        kbtnUserClear.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        kbtnUserClear.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        kbtnUserClear.setkEndColor(new java.awt.Color(204, 204, 255));
        kbtnUserClear.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kbtnUserClear.setkHoverForeGround(new java.awt.Color(102, 102, 255));
        kbtnUserClear.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kbtnUserClear.setkPressedColor(new java.awt.Color(204, 204, 255));
        kbtnUserClear.setkStartColor(new java.awt.Color(153, 153, 255));
        kbtnUserClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kbtnUserClearMouseClicked(evt);
            }
        });

        kbtnLogout.setForeground(new java.awt.Color(0, 0, 0));
        kbtnLogout.setText("Logout");
        kbtnLogout.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        kbtnLogout.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        kbtnLogout.setkEndColor(new java.awt.Color(204, 204, 255));
        kbtnLogout.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kbtnLogout.setkHoverForeGround(new java.awt.Color(102, 102, 255));
        kbtnLogout.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kbtnLogout.setkPressedColor(new java.awt.Color(204, 204, 255));
        kbtnLogout.setkStartColor(new java.awt.Color(153, 153, 255));
        kbtnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kbtnLogoutMouseClicked(evt);
            }
        });

        kbtnExit.setForeground(new java.awt.Color(0, 0, 0));
        kbtnExit.setText("Exit");
        kbtnExit.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        kbtnExit.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        kbtnExit.setkEndColor(new java.awt.Color(204, 204, 255));
        kbtnExit.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kbtnExit.setkHoverForeGround(new java.awt.Color(102, 102, 255));
        kbtnExit.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kbtnExit.setkPressedColor(new java.awt.Color(204, 204, 255));
        kbtnExit.setkStartColor(new java.awt.Color(153, 153, 255));
        kbtnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kbtnExitMouseClicked(evt);
            }
        });

        kbtnUpdateAdmin.setForeground(new java.awt.Color(0, 0, 0));
        kbtnUpdateAdmin.setText("Update Admin");
        kbtnUpdateAdmin.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        kbtnUpdateAdmin.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        kbtnUpdateAdmin.setkEndColor(new java.awt.Color(204, 204, 255));
        kbtnUpdateAdmin.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kbtnUpdateAdmin.setkHoverForeGround(new java.awt.Color(102, 102, 255));
        kbtnUpdateAdmin.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kbtnUpdateAdmin.setkPressedColor(new java.awt.Color(204, 204, 255));
        kbtnUpdateAdmin.setkStartColor(new java.awt.Color(153, 153, 255));
        kbtnUpdateAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kbtnUpdateAdminMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kgrdpnlMainLayout = new javax.swing.GroupLayout(kgrdpnlMain);
        kgrdpnlMain.setLayout(kgrdpnlMainLayout);
        kgrdpnlMainLayout.setHorizontalGroup(
            kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kgrdpnlMainLayout.createSequentialGroup()
                .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, kgrdpnlMainLayout.createSequentialGroup()
                        .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kgrdpnlMainLayout.createSequentialGroup()
                                .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(kgrdpnlMainLayout.createSequentialGroup()
                                        .addGap(105, 105, 105)
                                        .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlblUserID)
                                            .addComponent(jlblUserName))
                                        .addGap(18, 18, 18)
                                        .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jtxtfldUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                            .addComponent(jtxtfldUserID))
                                        .addGap(42, 42, 42)
                                        .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlblUserPassword)
                                            .addComponent(jlblUserGender)))
                                    .addGroup(kgrdpnlMainLayout.createSequentialGroup()
                                        .addGap(355, 355, 355)
                                        .addComponent(jlblListOfUsers)))
                                .addGap(18, 18, 18)
                                .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcmbbxGender, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtfldUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(kgrdpnlMainLayout.createSequentialGroup()
                                .addGap(215, 215, 215)
                                .addComponent(kbtnUserAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(kbtnUserEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(kbtnUserDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(kbtnUserClear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 96, Short.MAX_VALUE))
                    .addGroup(kgrdpnlMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jscrlpnUsers)
                            .addGroup(kgrdpnlMainLayout.createSequentialGroup()
                                .addComponent(kbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(kbtnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(kbtnUpdateAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(kgrdpnlMainLayout.createSequentialGroup()
                .addGap(356, 356, 356)
                .addComponent(jlblManageUser)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kgrdpnlMainLayout.setVerticalGroup(
            kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kgrdpnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblManageUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jcmbbxGender, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblUserGender)
                    .addComponent(jtxtfldUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblUserID))
                .addGap(18, 18, 18)
                .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jlblUserName)
                    .addComponent(jtxtfldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblUserPassword)
                    .addComponent(jtxtfldUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kbtnUserAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kbtnUserEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kbtnUserDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kbtnUserClear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jlblListOfUsers)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jscrlpnUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(kbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kbtnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kbtnUpdateAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kgrdpnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kgrdpnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

          
    /**
     * Метод установки значений полей по строкам и колонкам
     * @param evt - класс java.awt.event.MouseEvent для работы с событиями (нажатие на кнопку)
     */
    private void jtblUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblUsersMouseClicked
        DefaultTableModel model = (DefaultTableModel) jtblUsers.getModel();
        int Myindex = jtblUsers.getSelectedRow();
        jtxtfldUserID.setText(model.getValueAt(Myindex, 0).toString());
        jtxtfldUserName.setText(model.getValueAt(Myindex, 1).toString());
        jtxtfldUserPassword.setText(model.getValueAt(Myindex, 3).toString());

    }//GEN-LAST:event_jtblUsersMouseClicked
    
       
       
    /**
     * Метод добавления пользоваталей
     * @param evt - класс java.awt.event.MouseEvent для работы с событиями (нажатие на кнопку)
     */
    private void kbtnUserAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kbtnUserAddMouseClicked
        if (jtxtfldUserName.getText().isEmpty() || jtxtfldUserPassword.getText().isEmpty() || jtxtfldUserID.getText().isEmpty()) { //проверка на заполненность полей

            JOptionPane.showMessageDialog(this, "Missing Information");
        } else {

            try {
                PreparedStatement add = Con.prepareStatement("Insert into TBLUSERS values(?, ?, ?, ?)");
                //запрос, который позволяет добавить строки в таблицу
                add.setInt(1, Integer.valueOf(jtxtfldUserID.getText())); //добавление значения поля ID
                add.setString(2, jtxtfldUserName.getText()); //добавление значения поля Name (Имя)
                add.setString(3, jcmbbxGender.getSelectedItem().toString()); //добавление значения поля Gender (Пол)
                add.setString(4, jtxtfldUserPassword.getText().toString()); //добавление значения поля Password (Пароль)

                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "User Added Successfully");
                Con.close();
                selectUsers();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "User Adding Error");

            }
        }
    }//GEN-LAST:event_kbtnUserAddMouseClicked
    
    /**
     * Метод для редактирования данных о пользoвателе
     * @param evt - класс java.awt.event.MouseEvent для работы с событиями (нажатие на кнопку)
     */
    private void kbtnUserEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kbtnUserEditMouseClicked
        if (jtxtfldUserName.getText().isEmpty() || jtxtfldUserPassword.getText().isEmpty() || jtxtfldUserID.getText().isEmpty()) { //проверка на заполненность полей
            JOptionPane.showMessageDialog(this, "Missing Information");
        } else {
            try {
                String Query = "Update User1.TBLUSERS set NAME='" + jtxtfldUserName.getText() + "'" + ",GENDER='" + jcmbbxGender.getSelectedItem().toString()
                        + "'" + ",PASSWORD='" + jtxtfldUserPassword.getText() + "'" + "where ID=" + jtxtfldUserID.getText();
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                selectUsers();
                JOptionPane.showMessageDialog(this, "User Updated Successfully");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_kbtnUserEditMouseClicked
    
    /**
     * Метод, реализующий удаление пользователей
     *
     * @param evt - класс java.awt.event.MouseEvent для работы с событиями (нажатие на кнопку)
     */
    private void kbtnUserDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kbtnUserDeleteMouseClicked
        if (jtxtfldUserID.getText().isEmpty()) { //проверка выбрано ли поле для удаления
            JOptionPane.showMessageDialog(this, "Enter The User To be Deleted");
        } else {
            try {
                String UserID = jtxtfldUserID.getText();
                String Query = "Delete from User1.TBLUSERS where ID=" + UserID; // удаление по ID
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                selectUsers();
                JOptionPane.showMessageDialog(this, "User Deleted Successfully");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "User Delete Error");
            }
        }
    }//GEN-LAST:event_kbtnUserDeleteMouseClicked
    
    /**
     * Метод для очистки полей
     *
     * @param evt - класс java.awt.event.MouseEvent для работы с событиями
     * (нажатие на кнопку)
     */
    private void kbtnUserClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kbtnUserClearMouseClicked
        jtxtfldUserID.setText("");
        jtxtfldUserName.setText("");
        jtxtfldUserPassword.setText("");
    }//GEN-LAST:event_kbtnUserClearMouseClicked
    
    /**
     * Метод, который позволяет при нажатии на клавишу сделать видимым окно LoginWindow и закрыть текущее окно 
     * @param evt - класс java.awt.event.MouseEvent для работы с событиями (нажатие на кнопку)
     */
    private void kbtnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kbtnLogoutMouseClicked
        new LoginWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_kbtnLogoutMouseClicked
    
    /**
     * Метод, который закрывает программу при нажатии на клавишу
     * @param evt - класс java.awt.event.MouseEvent для работы с событиями (нажатие на кнопку)
     */
    private void kbtnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kbtnExitMouseClicked
        this.dispose();
    }//GEN-LAST:event_kbtnExitMouseClicked
    
    /**
     * Метод, который позволяет при нажатии на клавишу сделать видимым окно UpdateAdminWindow и закрыть текущее окно 
     * @param evt - класс java.awt.event.MouseEvent для работы с событиями (нажатие на кнопку)
     */
    private void kbtnUpdateAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kbtnUpdateAdminMouseClicked
        new UpdateAdminWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_kbtnUpdateAdminMouseClicked

    // поля компонентов фрейма
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jcmbbxGender;
    private javax.swing.JLabel jlblListOfUsers;
    private javax.swing.JLabel jlblManageUser;
    private javax.swing.JLabel jlblUserGender;
    private javax.swing.JLabel jlblUserID;
    private javax.swing.JLabel jlblUserName;
    private javax.swing.JLabel jlblUserPassword;
    private javax.swing.JScrollPane jscrlpnUsers;
    private javax.swing.JTable jtblUsers;
    private javax.swing.JTextField jtxtfldUserID;
    private javax.swing.JTextField jtxtfldUserName;
    private javax.swing.JTextField jtxtfldUserPassword;
    private com.k33ptoo.components.KButton kbtnExit;
    private com.k33ptoo.components.KButton kbtnLogout;
    private com.k33ptoo.components.KButton kbtnUpdateAdmin;
    private com.k33ptoo.components.KButton kbtnUserAdd;
    private com.k33ptoo.components.KButton kbtnUserClear;
    private com.k33ptoo.components.KButton kbtnUserDelete;
    private com.k33ptoo.components.KButton kbtnUserEdit;
    private com.k33ptoo.components.KGradientPanel kgrdpnlMain;
    // End of variables declaration//GEN-END:variables
}
