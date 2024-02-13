package bookofperipheralsapplication;

/**
 * @author Daria Rahman
 * @version 1.0 8.11.22 Класс, реализующий окно помощи для облегчения пользования приложением
 */
public class HelpWindow extends javax.swing.JFrame { //наследование от javax.swing.JFrame

    /*
     * Создание формы HelpWindow
     */
    public HelpWindow() {
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
        jscrlpnHelp = new javax.swing.JScrollPane();
        jlstHelp = new javax.swing.JList<>();
        kbtnBack = new com.k33ptoo.components.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kgrdpnlMain.setkEndColor(new java.awt.Color(0, 153, 153));
        kgrdpnlMain.setkStartColor(new java.awt.Color(153, 153, 255));

        jlstHelp.setBackground(new java.awt.Color(250, 250, 250));
        jlstHelp.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        jlstHelp.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Краткое руководство пользователя", "1) Получить логин и пароль у администратора;", "2) Произвести аутентификацию используя полученные данные;", "3) Ввести данные о периферийном устройстве и нажать на кнопку \"Add\" ", "(Добавить);", "4) В случае ошибки после добавления устройства нажать на нужное устройство ", "в списке и изменить в полях данные на верные, после чего нажать на кнопку ", "\"Edit\" (Редактировать);", "5) Если есть необходимость убрать периферийное устройство из списка, его ", "можно удалить, предварительно выбрав нужное устройство в списке и нажать ", "на кнопку \"Delete\" (Удалить);", "6) Чтобы отсортировать данные, выберите нужную кафедру, категорию или ", "состяние, после нажмитие на кнопку \"by department\" (Сортировка по кафедре),", "\"by category\" (Сортировка по категории), \"by condition\" (Сортировка по состоянию);", "7) Чтобы распечатать готовый список, нажмите на кнопку \"Print\" (Печать);", "*) Чтобы не стирать данные вручную, можно нажать на кнопку \"Clear\" (Очистить).", " ", "Остались вопросы? Пишите на почту: dasharahman009@gmail.com" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jscrlpnHelp.setViewportView(jlstHelp);

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
                .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kgrdpnlMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jscrlpnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kgrdpnlMainLayout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(kbtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kgrdpnlMainLayout.setVerticalGroup(
            kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kgrdpnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jscrlpnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kbtnBack, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kgrdpnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kgrdpnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        
    /*
     * Метод, который делает видимым окно LoginWindow при нажатии на клавишу и
     * закрывает текущее окно
     *
     * @param evt - класс java.awt.event.MouseEvent для работы с событиями
     */
    private void kbtnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kbtnBackMouseClicked
       new LoginWindow().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_kbtnBackMouseClicked

    // приватные поля компонентов фрейма
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> jlstHelp;
    private javax.swing.JScrollPane jscrlpnHelp;
    private com.k33ptoo.components.KButton kbtnBack;
    private com.k33ptoo.components.KGradientPanel kgrdpnlMain;
    // End of variables declaration//GEN-END:variables
}
