package bookofperipheralsapplication;

/**
 * @author Daria Rahman
 * @version 1.0 8.11.22 Класс, реализующий окно информации об авторе
 */
public class AboutAuthorWindow extends javax.swing.JFrame { //наследование от javax.swing.JFrame

    /*
     * Создание форму AboutAuthorWindow
     */
    public AboutAuthorWindow() {
        initComponents(); //вызываем метод, в котором находятся все компоненты окна
    }

    /**
     * Создание компонент и оформление интерфейса (расположение, шрифт, фон)
     * Данный метод вызывается из конструктора для инициализации формы
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kgrdpnlMain = new com.k33ptoo.components.KGradientPanel();
        jlblAuthor = new javax.swing.JLabel();
        jlblAuthorStudentGroup = new javax.swing.JLabel();
        jlblAuthorName = new javax.swing.JLabel();
        jlblAuthorMail = new javax.swing.JLabel();
        jlblAuthorPhoto = new javax.swing.JLabel();
        kbtnBack = new com.k33ptoo.components.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Об авторе"); // NOI18N

        kgrdpnlMain.setkEndColor(new java.awt.Color(0, 153, 153));
        kgrdpnlMain.setkStartColor(new java.awt.Color(153, 153, 255));

        jlblAuthor.setBackground(new java.awt.Color(255, 255, 255));
        jlblAuthor.setFont(new java.awt.Font("Charter", 0, 18)); // NOI18N
        jlblAuthor.setForeground(new java.awt.Color(255, 255, 255));
        jlblAuthor.setText("Автор");

        jlblAuthorStudentGroup.setBackground(new java.awt.Color(255, 255, 255));
        jlblAuthorStudentGroup.setFont(new java.awt.Font("Charter", 0, 16)); // NOI18N
        jlblAuthorStudentGroup.setForeground(new java.awt.Color(255, 255, 255));
        jlblAuthorStudentGroup.setText("студентка группы 10702120");

        jlblAuthorName.setBackground(new java.awt.Color(255, 255, 255));
        jlblAuthorName.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        jlblAuthorName.setForeground(new java.awt.Color(255, 255, 255));
        jlblAuthorName.setText("Рахман С.М. Дарья Каблур");

        jlblAuthorMail.setBackground(new java.awt.Color(255, 255, 255));
        jlblAuthorMail.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        jlblAuthorMail.setForeground(new java.awt.Color(255, 255, 255));
        jlblAuthorMail.setText("dasharahman009@gmail.com");

        jlblAuthorPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookofperipheralsapplication/Images/AuthorPhoto.jpg"))); // NOI18N

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

        javax.swing.GroupLayout kgrdpnlMainLayout = new javax.swing.GroupLayout(kgrdpnlMain);
        kgrdpnlMain.setLayout(kgrdpnlMainLayout);
        kgrdpnlMainLayout.setHorizontalGroup(
            kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kgrdpnlMainLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kgrdpnlMainLayout.createSequentialGroup()
                        .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblAuthorName)
                            .addComponent(jlblAuthorStudentGroup))
                        .addGap(8, 8, 8))
                    .addComponent(jlblAuthorMail, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(42, 42, 42))
            .addGroup(kgrdpnlMainLayout.createSequentialGroup()
                .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kgrdpnlMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlblAuthorPhoto))
                    .addGroup(kgrdpnlMainLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jlblAuthor))
                    .addGroup(kgrdpnlMainLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(kbtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kgrdpnlMainLayout.setVerticalGroup(
            kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kgrdpnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblAuthorPhoto)
                .addGap(14, 14, 14)
                .addComponent(jlblAuthor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblAuthorStudentGroup)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblAuthorName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblAuthorMail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kbtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kgrdpnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kgrdpnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
     * Метод, который делает видимым окно PeripheralsWindow при нажатии на клавишу
     * и закрывает текущее окно
     * @param evt - класс java.awt.event.MouseEvent для работы с событиями
     */
    private void kbtnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kbtnBackMouseClicked
        new PeripheralsWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_kbtnBackMouseClicked

        
    // приватные поля компонентов фрейма
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlblAuthor;
    private javax.swing.JLabel jlblAuthorMail;
    private javax.swing.JLabel jlblAuthorName;
    private javax.swing.JLabel jlblAuthorPhoto;
    private javax.swing.JLabel jlblAuthorStudentGroup;
    private com.k33ptoo.components.KButton kbtnBack;
    private com.k33ptoo.components.KGradientPanel kgrdpnlMain;
    // End of variables declaration//GEN-END:variables
}
