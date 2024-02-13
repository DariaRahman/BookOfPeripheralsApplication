package bookofperipheralsapplication;

/**
 * @author Daria Rahman
 * @version 1.0 8.11.22
 * Класс, реализующий окно информации о программе
 */
public class AboutProgramWindow extends javax.swing.JFrame { //наследование от javax.swing.JFrame

   /*
    * Создание формы AboutProgramWindow
    */
    public AboutProgramWindow() {
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
        jscrlpnAboutProgram = new javax.swing.JScrollPane();
        jlstAboutProgram = new javax.swing.JList<>();
        jlblVersion = new javax.swing.JLabel();
        kbtnBack = new com.k33ptoo.components.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kgrdpnlMain.setkEndColor(new java.awt.Color(0, 153, 153));
        kgrdpnlMain.setkStartColor(new java.awt.Color(153, 153, 255));

        jlstAboutProgram.setBackground(new java.awt.Color(250, 250, 250));
        jlstAboutProgram.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        jlstAboutProgram.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Программа позволяет: ", "1) Добавлять периферийные устройства;", "2) Вносить данные об устройствах: название, кафедра, аудиторию хранения, ", "категорию периферийного устройства, состояние устройства, цену и количество;", "3) Редактировать периферийные устройства;", "4) Удалять периферийные устройства; ", "5) Сортировать периферийные устройства по кафедре, категории устройства,", "состоянию;", "6) Выводить на печать список устройств;", "При этом список периферийных устройств хранится в базе данных.", "Также в программе предусмотрена аутентификация пользователей. Администратор", "может добавлять, удалять, редактировать пользователей. Список пользователей", "также хранится в базе данных." };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jscrlpnAboutProgram.setViewportView(jlstAboutProgram);

        jlblVersion.setBackground(new java.awt.Color(250, 250, 250));
        jlblVersion.setFont(new java.awt.Font("Charter", 1, 24)); // NOI18N
        jlblVersion.setForeground(new java.awt.Color(255, 255, 255));
        jlblVersion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblVersion.setText("Version 1.0.0.2022");

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
            .addGroup(kgrdpnlMainLayout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jlblVersion)
                    .addComponent(kbtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(200, Short.MAX_VALUE))
            .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kgrdpnlMainLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jscrlpnAboutProgram, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        kgrdpnlMainLayout.setVerticalGroup(
            kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kgrdpnlMainLayout.createSequentialGroup()
                .addContainerGap(289, Short.MAX_VALUE)
                .addComponent(jlblVersion)
                .addGap(18, 18, 18)
                .addComponent(kbtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kgrdpnlMainLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jscrlpnAboutProgram, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(127, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kgrdpnlMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kgrdpnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Метод, который делает видимым окно PeripheralsWindow при нажатии на клавишу и закрывает текущее окно
     * @param evt - класс java.awt.event.MouseEvent для работы с событиями (нажатие на кнопку)
     */
    private void kbtnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kbtnBackMouseClicked
       new PeripheralsWindow().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_kbtnBackMouseClicked

   
    // приватные поля компонентов фрейма
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlblVersion;
    private javax.swing.JList<String> jlstAboutProgram;
    private javax.swing.JScrollPane jscrlpnAboutProgram;
    private com.k33ptoo.components.KButton kbtnBack;
    private com.k33ptoo.components.KGradientPanel kgrdpnlMain;
    // End of variables declaration//GEN-END:variables
}
