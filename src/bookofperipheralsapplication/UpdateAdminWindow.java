package bookofperipheralsapplication;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 * @author Daria Rahman
 * @version 1.0 8.11.22 
 * Класс, реализующий окно UpdateAdminWindow для
 * возможности модификации данных об администраторе
 */
public class UpdateAdminWindow extends javax.swing.JFrame {

    Connection Con = null;

    /**
     * Создание формы SplashWindow
     */
    public UpdateAdminWindow() {
        initComponents();
    }

    /**
     * Создание компонент и оформление интерфейса (расположение, шрифт, фон)
     * Данный метод вызывается из конструктора для инициализации формы
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kgrdpnlMain = new com.k33ptoo.components.KGradientPanel();
        jlblUpdateAdmin = new javax.swing.JLabel();
        jlblNameAdmin = new javax.swing.JLabel();
        jtxtfldNameAdmin = new javax.swing.JTextField();
        jlblPasswordAdmin = new javax.swing.JLabel();
        kbtnBack = new com.k33ptoo.components.KButton();
        kbtnUpdate = new com.k33ptoo.components.KButton();
        kbtnClear = new com.k33ptoo.components.KButton();
        jtxtfldPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kgrdpnlMain.setkEndColor(new java.awt.Color(0, 153, 153));
        kgrdpnlMain.setkStartColor(new java.awt.Color(153, 153, 255));

        jlblUpdateAdmin.setBackground(new java.awt.Color(255, 255, 255));
        jlblUpdateAdmin.setFont(new java.awt.Font("Charter", 1, 30)); // NOI18N
        jlblUpdateAdmin.setForeground(new java.awt.Color(255, 255, 255));
        jlblUpdateAdmin.setText("Update Admin");

        jlblNameAdmin.setBackground(new java.awt.Color(255, 255, 255));
        jlblNameAdmin.setFont(new java.awt.Font("Charter", 1, 20)); // NOI18N
        jlblNameAdmin.setForeground(new java.awt.Color(255, 255, 255));
        jlblNameAdmin.setText("Name");

        jtxtfldNameAdmin.setFont(new java.awt.Font("Charter", 0, 12)); // NOI18N

        jlblPasswordAdmin.setBackground(new java.awt.Color(255, 255, 255));
        jlblPasswordAdmin.setFont(new java.awt.Font("Charter", 1, 20)); // NOI18N
        jlblPasswordAdmin.setForeground(new java.awt.Color(255, 255, 255));
        jlblPasswordAdmin.setText("Password");

        kbtnBack.setForeground(new java.awt.Color(0, 0, 0));
        kbtnBack.setText("Back");
        kbtnBack.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        kbtnBack.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        kbtnBack.setkEndColor(new java.awt.Color(204, 204, 255));
        kbtnBack.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kbtnBack.setkHoverForeGround(new java.awt.Color(102, 102, 255));
        kbtnBack.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kbtnBack.setkPressedColor(new java.awt.Color(204, 204, 255));
        kbtnBack.setkStartColor(new java.awt.Color(153, 153, 255));
        kbtnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kbtnBackMouseClicked(evt);
            }
        });

        kbtnUpdate.setForeground(new java.awt.Color(0, 0, 0));
        kbtnUpdate.setText("Update");
        kbtnUpdate.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        kbtnUpdate.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        kbtnUpdate.setkEndColor(new java.awt.Color(204, 204, 255));
        kbtnUpdate.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kbtnUpdate.setkHoverForeGround(new java.awt.Color(102, 102, 255));
        kbtnUpdate.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kbtnUpdate.setkPressedColor(new java.awt.Color(204, 204, 255));
        kbtnUpdate.setkStartColor(new java.awt.Color(153, 153, 255));
        kbtnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kbtnUpdateMouseClicked(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kgrdpnlMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlblUpdateAdmin)
                .addGap(162, 162, 162))
            .addGroup(kgrdpnlMainLayout.createSequentialGroup()
                .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kgrdpnlMainLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblPasswordAdmin)
                            .addComponent(jlblNameAdmin))
                        .addGap(35, 35, 35)
                        .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtxtfldNameAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtfldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(kgrdpnlMainLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(kbtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(kbtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kgrdpnlMainLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(kbtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        kgrdpnlMainLayout.setVerticalGroup(
            kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kgrdpnlMainLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jlblUpdateAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jlblNameAdmin)
                    .addComponent(jtxtfldNameAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblPasswordAdmin)
                    .addComponent(jtxtfldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kbtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kbtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(kbtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
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
     * Метод, который позволяет при нажатии на клавишу сделать видимым окно
     * UserWindow и закрыть текущее окно
     *
     * @param evt - класс java.awt.event.MouseEvent для работы с событиями
     * (нажатие на кнопку)
     */
    private void kbtnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kbtnBackMouseClicked
        new UserWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_kbtnBackMouseClicked

    /**
     * Метод обновления данных об Админе
     *
     * @param evt - класс java.awt.event.MouseEvent для работы с событиями
     * (нажатие на кнопку)
     */
    private void kbtnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kbtnUpdateMouseClicked
        if (jtxtfldNameAdmin.getText().isEmpty() || jtxtfldPassword.getText().isEmpty()) { // проверка на заполненность полей
            JOptionPane.showMessageDialog(this, "Missing Information");
        } else {
            try {
                Con = DBManager.getConnection();
                String Query = "Update User1.TBLADMIN set NAME='" + jtxtfldNameAdmin.getText() + "'" + ",PASSWORD='"
                        + jtxtfldPassword.getText() + "' " + "where ID=" + 1;
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Information Updated Successfully");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Information Updating Error");
            }
        }
    }//GEN-LAST:event_kbtnUpdateMouseClicked
    
    /**
     * Метод, реализующий очистку полей
     *
     * @param evt - класс java.awt.event.MouseEvent для работы с событиями
     * (нажатие на кнопку)
     */
    private void kbtnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kbtnClearMouseClicked
        jtxtfldNameAdmin.setText("");
        jtxtfldPassword.setText("");
    }//GEN-LAST:event_kbtnClearMouseClicked

    // поля компонентов фрейма
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlblNameAdmin;
    private javax.swing.JLabel jlblPasswordAdmin;
    private javax.swing.JLabel jlblUpdateAdmin;
    private javax.swing.JTextField jtxtfldNameAdmin;
    private javax.swing.JPasswordField jtxtfldPassword;
    private com.k33ptoo.components.KButton kbtnBack;
    private com.k33ptoo.components.KButton kbtnClear;
    private com.k33ptoo.components.KButton kbtnUpdate;
    private com.k33ptoo.components.KGradientPanel kgrdpnlMain;
    // End of variables declaration//GEN-END:variables
}
