package bookofperipheralsapplication;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 * @author Daria Rahman
 * @version 1.0 8.11.22 Класс, реализующий окно логин для аутентификации
 * пользователей
 */
public class LoginWindow extends javax.swing.JFrame { //наследование от javax.swing.JFrame

    Connection Con = null; //Connection - соединение с базой данных
    Statement St = null; //Statement - выполнение SQL-запросов
    ResultSet Rs = null; //ResultSet - построчный доступ к результатам запросов в базе данных

    /*
     * Cоздание формы LoginWindow
     */
    public LoginWindow() {
        initComponents();
        selectRole();

    }

    /*
     * Метод подключения к базе данных
     */
    public void selectRole() {
        try {
            Con = DBManager.getConnection(); //вызываем метод getConnection класса DBManager для подключения к базе данных
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Database connection error");
        }
    }

    /**
     * Создание компонент и оформление интерфейса (расположение, шрифт, фон, цвет)
     * Данный метод вызывается из конструктора для инициализации формы
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kgrdpnlMain = new com.k33ptoo.components.KGradientPanel();
        jlblLogin = new javax.swing.JLabel();
        jlblRole = new javax.swing.JLabel();
        jcmbbxRole = new javax.swing.JComboBox<>();
        jlblName = new javax.swing.JLabel();
        jtxtfldName = new javax.swing.JTextField();
        jlblPassword = new javax.swing.JLabel();
        jtxtfldPassword = new javax.swing.JPasswordField();
        kbtnLogin = new com.k33ptoo.components.KButton();
        kbtnClear = new com.k33ptoo.components.KButton();
        jmnbrHelp = new javax.swing.JMenuBar();
        jmnHelp = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kgrdpnlMain.setkEndColor(new java.awt.Color(0, 153, 153));
        kgrdpnlMain.setkStartColor(new java.awt.Color(153, 153, 255));

        jlblLogin.setBackground(new java.awt.Color(255, 255, 255));
        jlblLogin.setFont(new java.awt.Font("Charter", 1, 30)); // NOI18N
        jlblLogin.setForeground(new java.awt.Color(255, 255, 255));
        jlblLogin.setText("Login");
        jlblLogin.setToolTipText("");

        jlblRole.setBackground(new java.awt.Color(255, 255, 255));
        jlblRole.setFont(new java.awt.Font("Charter", 1, 20)); // NOI18N
        jlblRole.setForeground(new java.awt.Color(255, 255, 255));
        jlblRole.setText("Role");

        jcmbbxRole.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        jcmbbxRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));

        jlblName.setBackground(new java.awt.Color(255, 255, 255));
        jlblName.setFont(new java.awt.Font("Charter", 1, 20)); // NOI18N
        jlblName.setForeground(new java.awt.Color(255, 255, 255));
        jlblName.setText("Name");

        jtxtfldName.setFont(new java.awt.Font("Charter", 0, 12)); // NOI18N

        jlblPassword.setBackground(new java.awt.Color(255, 255, 255));
        jlblPassword.setFont(new java.awt.Font("Charter", 1, 20)); // NOI18N
        jlblPassword.setForeground(new java.awt.Color(255, 255, 255));
        jlblPassword.setText("Password");

        kbtnLogin.setForeground(new java.awt.Color(0, 0, 0));
        kbtnLogin.setText("Login");
        kbtnLogin.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        kbtnLogin.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        kbtnLogin.setkEndColor(new java.awt.Color(204, 204, 255));
        kbtnLogin.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kbtnLogin.setkHoverForeGround(new java.awt.Color(102, 102, 255));
        kbtnLogin.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kbtnLogin.setkPressedColor(new java.awt.Color(204, 204, 255));
        kbtnLogin.setkStartColor(new java.awt.Color(153, 153, 255));
        kbtnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kbtnLoginMouseClicked(evt);
            }
        });

        kbtnClear.setForeground(new java.awt.Color(0, 0, 0));
        kbtnClear.setText("Clear");
        kbtnClear.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        kbtnClear.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        kbtnClear.setkEndColor(new java.awt.Color(204, 204, 255));
        kbtnClear.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kbtnClear.setkHoverForeGround(new java.awt.Color(102, 102, 255));
        kbtnClear.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kbtnClear.setkPressedColor(new java.awt.Color(204, 204, 255));
        kbtnClear.setkStartColor(new java.awt.Color(153, 153, 255));
        kbtnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kbtnClearMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kgrdpnlMainLayout = new javax.swing.GroupLayout(kgrdpnlMain);
        kgrdpnlMain.setLayout(kgrdpnlMainLayout);
        kgrdpnlMainLayout.setHorizontalGroup(
            kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kgrdpnlMainLayout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kgrdpnlMainLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(kbtnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(kbtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(kgrdpnlMainLayout.createSequentialGroup()
                            .addComponent(jlblPassword)
                            .addGap(18, 18, 18)
                            .addComponent(jtxtfldPassword))
                        .addGroup(kgrdpnlMainLayout.createSequentialGroup()
                            .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlblName)
                                .addComponent(jlblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(53, 53, 53)
                            .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jcmbbxRole, 0, 220, Short.MAX_VALUE)
                                .addComponent(jtxtfldName)))))
                .addGap(137, 137, 137))
            .addGroup(kgrdpnlMainLayout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(jlblLogin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kgrdpnlMainLayout.setVerticalGroup(
            kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kgrdpnlMainLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jlblLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jlblRole)
                    .addComponent(jcmbbxRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jlblName)
                    .addComponent(jtxtfldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jlblPassword)
                    .addComponent(jtxtfldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kbtnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kbtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79))
        );

        jmnHelp.setForeground(new java.awt.Color(255, 255, 255));
        jmnHelp.setText("Help");
        jmnHelp.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        jmnHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmnHelpMouseClicked(evt);
            }
        });
        jmnbrHelp.add(jmnHelp);

        setJMenuBar(jmnbrHelp);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kgrdpnlMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kgrdpnlMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
     * Метод, который делает видимым окно HelpWindow при нажатии на клавишу
     * и закрывает текущее окно
     * @param evt - класс kgrdpnlMainMouseEvent для работы с событиями
     */
    private void jmnHelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmnHelpMouseClicked
        new HelpWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmnHelpMouseClicked

     
    /**
     * Метод для очистки полей
     *
     * @param evt - класс java.awt.event.MouseEvent для работы с событиями
     * (нажатие на кнопку)
     */
    private void kbtnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kbtnClearMouseClicked
       jtxtfldName.setText("");
       jtxtfldPassword.setText("");
    }//GEN-LAST:event_kbtnClearMouseClicked
    
    /*
     * Метод аутентификации пользователя
     * @param evt - класс java.awt.event.MouseEvent для работы с событиями
     */
    private void kbtnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kbtnLoginMouseClicked
        if (jcmbbxRole.getSelectedItem().toString().equals("Admin")) { //если выбрана роль Admin
            String Query = "select * from User1.TBLADMIN where NAME='" + jtxtfldName.getText()
            + "' and PASSWORD='" + jtxtfldPassword.getText() + "'"; //запрос к бд, к таблице TBLADMIN (поля NAME и PASSWORD)
            try {
                St = Con.createStatement(); //с помощью метода createStatement происходит отправка инструкций SQL в бд
                Rs = St.executeQuery(Query); //с помощью метода executeQuery происходит выборка данных в бд

                if (Rs.next()) { // в случае, если пользователь с таким логином и паролем существует, значит аутентификация прошла успешно
                    // метод next позволяет перейти в следующей строке в бд
                    new UserWindow().setVisible(true); //делаем видимым окно работы с пользователями
                    this.dispose(); //текущее окно закрываем
                } else { //иначе высвечитывается окно об ошибке
                    JOptionPane.showMessageDialog(this, "Wrong Admin ID or Password");
                }
            } catch (SQLException ex) { //если не удалось подключится к бд
                JOptionPane.showMessageDialog(this, "Database connection error");
            }
            //таким же образом происходит аутентификация User'a
        } else { // если выбрана роль User
            String Query = "select * from User1.TBLUSERS where NAME='" + jtxtfldName.getText() + "' and PASSWORD='" + jtxtfldPassword.getText() + "'";
            //запрос к бд, к таблице TBLUSERS (поля NAME и PASSWORD)
            try {
                St = Con.createStatement();
                Rs = St.executeQuery(Query);

                if (Rs.next()) {
                    new PeripheralsWindow().setVisible(true);
                    this.dispose();
                } else {

                    JOptionPane.showMessageDialog(this, "Wrong Admin ID or Password");
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Database connection error");
            }

        }
    }//GEN-LAST:event_kbtnLoginMouseClicked

    // приватные поля компонентов фрейма
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jcmbbxRole;
    private javax.swing.JLabel jlblLogin;
    private javax.swing.JLabel jlblName;
    private javax.swing.JLabel jlblPassword;
    private javax.swing.JLabel jlblRole;
    private javax.swing.JMenu jmnHelp;
    private javax.swing.JMenuBar jmnbrHelp;
    private javax.swing.JTextField jtxtfldName;
    private javax.swing.JPasswordField jtxtfldPassword;
    private com.k33ptoo.components.KButton kbtnClear;
    private com.k33ptoo.components.KButton kbtnLogin;
    private com.k33ptoo.components.KGradientPanel kgrdpnlMain;
    // End of variables declaration//GEN-END:variables
}
