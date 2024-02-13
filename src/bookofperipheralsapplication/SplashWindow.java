package bookofperipheralsapplication;

/**
 * @author Daria Rahman
 * @version 1.0 8.11.22 
 * Класс, реализующий окно SplashWindow для информации о курсовом проекте (титульный лист)
 */
public class SplashWindow extends javax.swing.JFrame {

   /**
    * Создание формы SplashWindow
    */
    public SplashWindow() {
        initComponents();
    }
    
    /**
     * Создание компонент и оформление интерфейса (расположение, шрифт, фон, цвет)
     * Данный метод вызывается из конструктора для инициализации формы
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kgrdpnlMain = new com.k33ptoo.components.KGradientPanel();
        jprgrsbrLoading = new javax.swing.JProgressBar();
        jlblUniversityName = new javax.swing.JLabel();
        jlblFacultyName = new javax.swing.JLabel();
        jlblDepartmentName = new javax.swing.JLabel();
        jlblСourseWork = new javax.swing.JLabel();
        jlblGroupName = new javax.swing.JLabel();
        jlblCourseWorkName = new javax.swing.JLabel();
        jlblDisciplineName = new javax.swing.JLabel();
        jlblStudentName = new javax.swing.JLabel();
        jlblTeacher = new javax.swing.JLabel();
        jlblTeacherName = new javax.swing.JLabel();
        jlblYear = new javax.swing.JLabel();
        jlblMessageExit = new javax.swing.JLabel();
        jlblPercent = new javax.swing.JLabel();
        kbtnExit = new com.k33ptoo.components.KButton();
        kbtnNext = new com.k33ptoo.components.KButton();
        jlblIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kgrdpnlMain.setFont(new java.awt.Font("Charter", 1, 13)); // NOI18N
        kgrdpnlMain.setkEndColor(new java.awt.Color(0, 153, 153));
        kgrdpnlMain.setkStartColor(new java.awt.Color(153, 153, 255));

        jprgrsbrLoading.setBackground(new java.awt.Color(255, 255, 255));
        jprgrsbrLoading.setForeground(new java.awt.Color(255, 255, 255));

        jlblUniversityName.setBackground(new java.awt.Color(255, 255, 255));
        jlblUniversityName.setFont(new java.awt.Font("Charter", 1, 17)); // NOI18N
        jlblUniversityName.setForeground(new java.awt.Color(255, 255, 255));
        jlblUniversityName.setText("Белорусский национальный технический университет");

        jlblFacultyName.setBackground(new java.awt.Color(255, 255, 255));
        jlblFacultyName.setFont(new java.awt.Font("Charter", 1, 17)); // NOI18N
        jlblFacultyName.setForeground(new java.awt.Color(255, 255, 255));
        jlblFacultyName.setText("Факультет информационных технологий и роботехники");

        jlblDepartmentName.setFont(new java.awt.Font("Charter", 1, 17)); // NOI18N
        jlblDepartmentName.setForeground(new java.awt.Color(255, 255, 255));
        jlblDepartmentName.setText("Кафедра программного обеспечения информационных систем и технологий");

        jlblСourseWork.setFont(new java.awt.Font("Charter", 1, 22)); // NOI18N
        jlblСourseWork.setForeground(new java.awt.Color(255, 255, 255));
        jlblСourseWork.setText("Курсовая работа");

        jlblGroupName.setBackground(new java.awt.Color(255, 255, 255));
        jlblGroupName.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        jlblGroupName.setForeground(new java.awt.Color(255, 255, 255));
        jlblGroupName.setText("Выполнила: студентка группы 10702120");

        jlblCourseWorkName.setBackground(new java.awt.Color(255, 255, 255));
        jlblCourseWorkName.setFont(new java.awt.Font("Charter", 1, 24)); // NOI18N
        jlblCourseWorkName.setForeground(new java.awt.Color(255, 255, 255));
        jlblCourseWorkName.setText("Приложение \"Книга периферийных устройств\"");

        jlblDisciplineName.setFont(new java.awt.Font("Charter", 1, 17)); // NOI18N
        jlblDisciplineName.setForeground(new java.awt.Color(255, 255, 255));
        jlblDisciplineName.setText("по дисциплине \"Программирование на языке Java\"");

        jlblStudentName.setBackground(new java.awt.Color(255, 255, 255));
        jlblStudentName.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        jlblStudentName.setForeground(new java.awt.Color(255, 255, 255));
        jlblStudentName.setText("Рахман С. М. Дарья Каблур");

        jlblTeacher.setBackground(new java.awt.Color(255, 255, 255));
        jlblTeacher.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        jlblTeacher.setForeground(new java.awt.Color(255, 255, 255));
        jlblTeacher.setText("Преподователь: к. ф. - м. н., доц");

        jlblTeacherName.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        jlblTeacherName.setForeground(new java.awt.Color(255, 255, 255));
        jlblTeacherName.setText("Сидорик Валерий Владимирович");

        jlblYear.setBackground(new java.awt.Color(255, 255, 255));
        jlblYear.setFont(new java.awt.Font("Charter", 1, 17)); // NOI18N
        jlblYear.setForeground(new java.awt.Color(255, 255, 255));
        jlblYear.setText("Минск, 2022");

        jlblMessageExit.setBackground(new java.awt.Color(255, 255, 255));
        jlblMessageExit.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        jlblMessageExit.setForeground(new java.awt.Color(255, 255, 255));
        jlblMessageExit.setText("В случае отсутствия ответа программа закроется после загрузки...");

        jlblPercent.setBackground(new java.awt.Color(255, 255, 255));
        jlblPercent.setFont(new java.awt.Font("Charter", 1, 20)); // NOI18N
        jlblPercent.setForeground(new java.awt.Color(255, 255, 255));
        jlblPercent.setText("%");

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

        kbtnNext.setForeground(new java.awt.Color(0, 0, 0));
        kbtnNext.setText("Next");
        kbtnNext.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        kbtnNext.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        kbtnNext.setkEndColor(new java.awt.Color(204, 204, 255));
        kbtnNext.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kbtnNext.setkHoverForeGround(new java.awt.Color(102, 102, 255));
        kbtnNext.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kbtnNext.setkPressedColor(new java.awt.Color(204, 204, 255));
        kbtnNext.setkStartColor(new java.awt.Color(153, 153, 255));
        kbtnNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kbtnNextMouseClicked(evt);
            }
        });

        jlblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookofperipheralsapplication/Images/Icon.png"))); // NOI18N

        javax.swing.GroupLayout kgrdpnlMainLayout = new javax.swing.GroupLayout(kgrdpnlMain);
        kgrdpnlMain.setLayout(kgrdpnlMainLayout);
        kgrdpnlMainLayout.setHorizontalGroup(
            kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kgrdpnlMainLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblCourseWorkName, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jlblYear, javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlblUniversityName, javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jlblFacultyName, javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jlblDepartmentName, javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jlblDisciplineName, javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jlblСourseWork, javax.swing.GroupLayout.Alignment.CENTER)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(kgrdpnlMainLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jlblIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblStudentName)
                    .addComponent(jlblGroupName)
                    .addComponent(jlblTeacher)
                    .addComponent(jlblTeacherName))
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kgrdpnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jprgrsbrLoading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, kgrdpnlMainLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(kbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlblMessageExit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlblPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kbtnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addContainerGap())
        );
        kgrdpnlMainLayout.setVerticalGroup(
            kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kgrdpnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblUniversityName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblFacultyName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblDepartmentName)
                .addGap(78, 78, 78)
                .addComponent(jlblСourseWork)
                .addGap(18, 18, 18)
                .addComponent(jlblDisciplineName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblCourseWorkName)
                .addGap(35, 35, 35)
                .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlblIcon)
                    .addGroup(kgrdpnlMainLayout.createSequentialGroup()
                        .addComponent(jlblGroupName)
                        .addGap(7, 7, 7)
                        .addComponent(jlblStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlblTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlblTeacherName, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addComponent(jlblYear, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(kbtnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblMessageExit, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblPercent)
                    .addComponent(kbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jprgrsbrLoading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kgrdpnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kgrdpnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
       
    /**
     * Метод, который закрывает программу при нажатии на клавишу
     * @param evt - класс java.awt.event.MouseEvent для работы с событиями (нажатие на кнопку)
     */
    private void kbtnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kbtnExitMouseClicked
        this.dispose();
    }//GEN-LAST:event_kbtnExitMouseClicked
    
    /**
     * Метод, который делает видимым окно LoginWindow при нажатии на клавишу и закрывает текущее окно
     * @param evt - класс java.awt.event.MouseEvent для работы с событиями (нажатие на кнопку)
     */
    private void kbtnNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kbtnNextMouseClicked
       new LoginWindow().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_kbtnNextMouseClicked

    // поля компонентов фрейма
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlblCourseWorkName;
    private javax.swing.JLabel jlblDepartmentName;
    private javax.swing.JLabel jlblDisciplineName;
    private javax.swing.JLabel jlblFacultyName;
    private javax.swing.JLabel jlblGroupName;
    private javax.swing.JLabel jlblIcon;
    private javax.swing.JLabel jlblMessageExit;
    protected javax.swing.JLabel jlblPercent;
    private javax.swing.JLabel jlblStudentName;
    private javax.swing.JLabel jlblTeacher;
    private javax.swing.JLabel jlblTeacherName;
    private javax.swing.JLabel jlblUniversityName;
    private javax.swing.JLabel jlblYear;
    private javax.swing.JLabel jlblСourseWork;
    protected javax.swing.JProgressBar jprgrsbrLoading;
    private com.k33ptoo.components.KButton kbtnExit;
    private com.k33ptoo.components.KButton kbtnNext;
    private com.k33ptoo.components.KGradientPanel kgrdpnlMain;
    // End of variables declaration//GEN-END:variables
}
