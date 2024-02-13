package bookofperipheralsapplication;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 * @author Daria Rahman
 * @version 1.0 8.11.22 Класс, реализующий окно PeripheralsWindow для
 * обеспечения работы с периферийными устройствами
 */
public class PeripheralsWindow extends javax.swing.JFrame {

    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;

    public PeripheralsWindow() {
        initComponents();
        selectPeripherals();
    }

    /**
     * Метод подключения к бд и вывода всех данных в таблицу JTable из таблицы
     * бд TBLPERIPHERALS
     */
    public void selectPeripherals() {
        try {
            Con = DBManager.getConnection(); //соединение с бд
            St = Con.createStatement();
            Rs = St.executeQuery("Select * from User1.TBLPERIPHERALS"); //выбрать все данные из таблицы
            jtblPeripherals.setModel(DbUtils.resultSetToTableModel(Rs)); //отображение выбранных данных в jtblPeripherals
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Database connection error");
        }
    }

    /**
     * Создание компонент и оформление интерфейса (расположение, шрифт, фон)
     * Данный метод вызывается из конструктора для инициализации формы
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kgrdpnlMain = new com.k33ptoo.components.KGradientPanel();
        jlblManagePeripherals = new javax.swing.JLabel();
        jlblName = new javax.swing.JLabel();
        jtxtfldName = new javax.swing.JTextField();
        jlblDepartment = new javax.swing.JLabel();
        jcmbbxDepartment = new javax.swing.JComboBox<>();
        jlblCategory = new javax.swing.JLabel();
        jcmbbxCategory = new javax.swing.JComboBox<>();
        jlblCondition = new javax.swing.JLabel();
        jtxtfldPrice = new javax.swing.JTextField();
        jcmbbxCondition = new javax.swing.JComboBox<>();
        jlblPrice = new javax.swing.JLabel();
        jlblListOfPeripherals = new javax.swing.JLabel();
        jscrlpnPeripherals = new javax.swing.JScrollPane();
        jtblPeripherals = new javax.swing.JTable();
        jlblClassroom = new javax.swing.JLabel();
        jtxtfldClassroom = new javax.swing.JTextField();
        jlblAmount = new javax.swing.JLabel();
        jtxtfldAmount = new javax.swing.JTextField();
        jlblID = new javax.swing.JLabel();
        jtxtfldID = new javax.swing.JTextField();
        jlblSort = new javax.swing.JLabel();
        jcmbbxSortByDepartment = new javax.swing.JComboBox<>();
        jcmbbxSortByCategory = new javax.swing.JComboBox<>();
        jcmbbxSortByCondition = new javax.swing.JComboBox<>();
        kbtnAdd = new com.k33ptoo.components.KButton();
        kbtnEdit = new com.k33ptoo.components.KButton();
        kbtnDelete = new com.k33ptoo.components.KButton();
        kbtnClear = new com.k33ptoo.components.KButton();
        kbtnSortByDepartment = new com.k33ptoo.components.KButton();
        kbtnSortByCategory = new com.k33ptoo.components.KButton();
        kbtnSortByCondition = new com.k33ptoo.components.KButton();
        kbtnRefresh = new com.k33ptoo.components.KButton();
        kbtnLogout = new com.k33ptoo.components.KButton();
        kbtnPrint = new com.k33ptoo.components.KButton();
        kbtnExit = new com.k33ptoo.components.KButton();
        jmnbrInformation = new javax.swing.JMenuBar();
        jmnAboutAuthor = new javax.swing.JMenu();
        jmnAboutProgram = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kgrdpnlMain.setkEndColor(new java.awt.Color(0, 153, 153));
        kgrdpnlMain.setkStartColor(new java.awt.Color(153, 153, 255));

        jlblManagePeripherals.setBackground(new java.awt.Color(255, 255, 255));
        jlblManagePeripherals.setFont(new java.awt.Font("Charter", 1, 30)); // NOI18N
        jlblManagePeripherals.setForeground(new java.awt.Color(255, 255, 255));
        jlblManagePeripherals.setText("Manage peripherals");

        jlblName.setBackground(new java.awt.Color(255, 255, 255));
        jlblName.setFont(new java.awt.Font("Charter", 1, 20)); // NOI18N
        jlblName.setForeground(new java.awt.Color(255, 255, 255));
        jlblName.setText("Name");

        jtxtfldName.setFont(new java.awt.Font("Charter", 0, 12)); // NOI18N

        jlblDepartment.setBackground(new java.awt.Color(255, 255, 255));
        jlblDepartment.setFont(new java.awt.Font("Charter", 1, 20)); // NOI18N
        jlblDepartment.setForeground(new java.awt.Color(255, 255, 255));
        jlblDepartment.setText("Department");

        jcmbbxDepartment.setFont(new java.awt.Font("Charter", 0, 12)); // NOI18N
        jcmbbxDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "POISiT", "RTS", " " }));

        jlblCategory.setBackground(new java.awt.Color(255, 255, 255));
        jlblCategory.setFont(new java.awt.Font("Charter", 1, 20)); // NOI18N
        jlblCategory.setForeground(new java.awt.Color(255, 255, 255));
        jlblCategory.setText("Category");

        jcmbbxCategory.setFont(new java.awt.Font("Charter", 0, 12)); // NOI18N
        jcmbbxCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Keyboard", "Mouse", "Monitor", "System unit", "Webcam", "Earphones", "Printer", "Scanner", "Microphone", "Loudspeakers", "CD/DVD drives", "HDD", "USB flash drive", "Projector" }));

        jlblCondition.setBackground(new java.awt.Color(255, 255, 255));
        jlblCondition.setFont(new java.awt.Font("Charter", 1, 20)); // NOI18N
        jlblCondition.setForeground(new java.awt.Color(255, 255, 255));
        jlblCondition.setText("Condition");

        jtxtfldPrice.setFont(new java.awt.Font("Charter", 0, 12)); // NOI18N

        jcmbbxCondition.setFont(new java.awt.Font("Charter", 0, 12)); // NOI18N
        jcmbbxCondition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        jlblPrice.setBackground(new java.awt.Color(255, 255, 255));
        jlblPrice.setFont(new java.awt.Font("Charter", 1, 20)); // NOI18N
        jlblPrice.setForeground(new java.awt.Color(255, 255, 255));
        jlblPrice.setText("Price (BYN)");

        jlblListOfPeripherals.setBackground(new java.awt.Color(255, 255, 255));
        jlblListOfPeripherals.setFont(new java.awt.Font("Charter", 1, 30)); // NOI18N
        jlblListOfPeripherals.setForeground(new java.awt.Color(255, 255, 255));
        jlblListOfPeripherals.setText("List of peripherals");

        jtblPeripherals.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Department", "Classroom", "Category", "Condition", "Price", "Amount"
            }
        ));
        jtblPeripherals.setRowHeight(25);
        jtblPeripherals.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblPeripheralsMouseClicked(evt);
            }
        });
        jscrlpnPeripherals.setViewportView(jtblPeripherals);

        jlblClassroom.setBackground(new java.awt.Color(255, 255, 255));
        jlblClassroom.setFont(new java.awt.Font("Charter", 1, 20)); // NOI18N
        jlblClassroom.setForeground(new java.awt.Color(255, 255, 255));
        jlblClassroom.setText("Classroom");

        jtxtfldClassroom.setFont(new java.awt.Font("Charter", 0, 12)); // NOI18N

        jlblAmount.setBackground(new java.awt.Color(255, 255, 255));
        jlblAmount.setFont(new java.awt.Font("Charter", 1, 20)); // NOI18N
        jlblAmount.setForeground(new java.awt.Color(255, 255, 255));
        jlblAmount.setText("Amount");

        jtxtfldAmount.setFont(new java.awt.Font("Charter", 0, 12)); // NOI18N

        jlblID.setBackground(new java.awt.Color(255, 255, 255));
        jlblID.setFont(new java.awt.Font("Charter", 1, 20)); // NOI18N
        jlblID.setForeground(new java.awt.Color(255, 255, 255));
        jlblID.setText("ID");

        jtxtfldID.setFont(new java.awt.Font("Charter", 0, 12)); // NOI18N

        jlblSort.setBackground(new java.awt.Color(255, 255, 255));
        jlblSort.setFont(new java.awt.Font("Charter", 1, 20)); // NOI18N
        jlblSort.setForeground(new java.awt.Color(255, 255, 255));
        jlblSort.setText("Sort");

        jcmbbxSortByDepartment.setFont(new java.awt.Font("Charter", 0, 12)); // NOI18N
        jcmbbxSortByDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "POISiT", "RTS", " " }));

        jcmbbxSortByCategory.setFont(new java.awt.Font("Charter", 0, 12)); // NOI18N
        jcmbbxSortByCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Keyboard", "Mouse", "Monitor", "System unit", "Webcam", "Earphones", "Printer", "Scanner", "Microphone", "Loudspeakers", "CD/DVD drives", "HDD", "USB flash drive", "Projector" }));

        jcmbbxSortByCondition.setFont(new java.awt.Font("Charter", 0, 12)); // NOI18N
        jcmbbxSortByCondition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        kbtnAdd.setForeground(new java.awt.Color(0, 0, 0));
        kbtnAdd.setText("Add");
        kbtnAdd.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        kbtnAdd.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        kbtnAdd.setkEndColor(new java.awt.Color(204, 204, 255));
        kbtnAdd.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kbtnAdd.setkHoverForeGround(new java.awt.Color(102, 102, 255));
        kbtnAdd.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kbtnAdd.setkPressedColor(new java.awt.Color(204, 204, 255));
        kbtnAdd.setkStartColor(new java.awt.Color(153, 153, 255));
        kbtnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kbtnAddMouseClicked(evt);
            }
        });

        kbtnEdit.setForeground(new java.awt.Color(0, 0, 0));
        kbtnEdit.setText("Edit");
        kbtnEdit.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        kbtnEdit.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        kbtnEdit.setkEndColor(new java.awt.Color(204, 204, 255));
        kbtnEdit.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kbtnEdit.setkHoverForeGround(new java.awt.Color(102, 102, 255));
        kbtnEdit.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kbtnEdit.setkPressedColor(new java.awt.Color(204, 204, 255));
        kbtnEdit.setkStartColor(new java.awt.Color(153, 153, 255));
        kbtnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kbtnEditMouseClicked(evt);
            }
        });

        kbtnDelete.setForeground(new java.awt.Color(0, 0, 0));
        kbtnDelete.setText("Delete");
        kbtnDelete.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        kbtnDelete.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        kbtnDelete.setkEndColor(new java.awt.Color(204, 204, 255));
        kbtnDelete.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kbtnDelete.setkHoverForeGround(new java.awt.Color(102, 102, 255));
        kbtnDelete.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kbtnDelete.setkPressedColor(new java.awt.Color(204, 204, 255));
        kbtnDelete.setkStartColor(new java.awt.Color(153, 153, 255));
        kbtnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kbtnDeleteMouseClicked(evt);
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

        kbtnSortByDepartment.setForeground(new java.awt.Color(0, 0, 0));
        kbtnSortByDepartment.setText("by department");
        kbtnSortByDepartment.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        kbtnSortByDepartment.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        kbtnSortByDepartment.setkEndColor(new java.awt.Color(204, 204, 255));
        kbtnSortByDepartment.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kbtnSortByDepartment.setkHoverForeGround(new java.awt.Color(102, 102, 255));
        kbtnSortByDepartment.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kbtnSortByDepartment.setkPressedColor(new java.awt.Color(204, 204, 255));
        kbtnSortByDepartment.setkStartColor(new java.awt.Color(153, 153, 255));
        kbtnSortByDepartment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kbtnSortByDepartmentMouseClicked(evt);
            }
        });

        kbtnSortByCategory.setForeground(new java.awt.Color(0, 0, 0));
        kbtnSortByCategory.setText("by category");
        kbtnSortByCategory.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        kbtnSortByCategory.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        kbtnSortByCategory.setkEndColor(new java.awt.Color(204, 204, 255));
        kbtnSortByCategory.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kbtnSortByCategory.setkHoverForeGround(new java.awt.Color(102, 102, 255));
        kbtnSortByCategory.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kbtnSortByCategory.setkPressedColor(new java.awt.Color(204, 204, 255));
        kbtnSortByCategory.setkStartColor(new java.awt.Color(153, 153, 255));
        kbtnSortByCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kbtnSortByCategoryMouseClicked(evt);
            }
        });

        kbtnSortByCondition.setForeground(new java.awt.Color(0, 0, 0));
        kbtnSortByCondition.setText("by condition");
        kbtnSortByCondition.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        kbtnSortByCondition.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        kbtnSortByCondition.setkEndColor(new java.awt.Color(204, 204, 255));
        kbtnSortByCondition.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kbtnSortByCondition.setkHoverForeGround(new java.awt.Color(102, 102, 255));
        kbtnSortByCondition.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kbtnSortByCondition.setkPressedColor(new java.awt.Color(204, 204, 255));
        kbtnSortByCondition.setkStartColor(new java.awt.Color(153, 153, 255));
        kbtnSortByCondition.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kbtnSortByConditionMouseClicked(evt);
            }
        });

        kbtnRefresh.setForeground(new java.awt.Color(0, 0, 0));
        kbtnRefresh.setText("Refresh");
        kbtnRefresh.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        kbtnRefresh.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        kbtnRefresh.setkEndColor(new java.awt.Color(204, 204, 255));
        kbtnRefresh.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kbtnRefresh.setkHoverForeGround(new java.awt.Color(102, 102, 255));
        kbtnRefresh.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kbtnRefresh.setkPressedColor(new java.awt.Color(204, 204, 255));
        kbtnRefresh.setkStartColor(new java.awt.Color(153, 153, 255));
        kbtnRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kbtnRefreshMouseClicked(evt);
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

        kbtnPrint.setForeground(new java.awt.Color(0, 0, 0));
        kbtnPrint.setText("Print");
        kbtnPrint.setFont(new java.awt.Font("Charter", 1, 16)); // NOI18N
        kbtnPrint.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        kbtnPrint.setkEndColor(new java.awt.Color(204, 204, 255));
        kbtnPrint.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kbtnPrint.setkHoverForeGround(new java.awt.Color(102, 102, 255));
        kbtnPrint.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kbtnPrint.setkPressedColor(new java.awt.Color(204, 204, 255));
        kbtnPrint.setkStartColor(new java.awt.Color(153, 153, 255));
        kbtnPrint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kbtnPrintMouseClicked(evt);
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

        javax.swing.GroupLayout kgrdpnlMainLayout = new javax.swing.GroupLayout(kgrdpnlMain);
        kgrdpnlMain.setLayout(kgrdpnlMainLayout);
        kgrdpnlMainLayout.setHorizontalGroup(
            kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kgrdpnlMainLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(kgrdpnlMainLayout.createSequentialGroup()
                        .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblID, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(kgrdpnlMainLayout.createSequentialGroup()
                                .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlblDepartment)
                                    .addComponent(jlblClassroom)
                                    .addComponent(jlblName))
                                .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kgrdpnlMainLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jtxtfldClassroom, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(kgrdpnlMainLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jcmbbxDepartment, 0, 320, Short.MAX_VALUE)
                                            .addComponent(jtxtfldName)
                                            .addComponent(jtxtfldID))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblCondition)
                            .addGroup(kgrdpnlMainLayout.createSequentialGroup()
                                .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kgrdpnlMainLayout.createSequentialGroup()
                                        .addComponent(jlblCategory)
                                        .addGap(40, 40, 40))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kgrdpnlMainLayout.createSequentialGroup()
                                        .addComponent(jlblPrice)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(kgrdpnlMainLayout.createSequentialGroup()
                                        .addComponent(jlblAmount)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtfldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jcmbbxCondition, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jcmbbxCategory, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtxtfldAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(kgrdpnlMainLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jlblManagePeripherals)
                        .addGap(350, 350, 350)))
                .addGap(49, 49, 49))
            .addGroup(kgrdpnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jscrlpnPeripherals)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kgrdpnlMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlblListOfPeripherals)
                .addGap(396, 396, 396))
            .addGroup(kgrdpnlMainLayout.createSequentialGroup()
                .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kgrdpnlMainLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jlblSort)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(kbtnSortByDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcmbbxSortByDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jcmbbxSortByCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kbtnSortByCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kgrdpnlMainLayout.createSequentialGroup()
                                .addComponent(kbtnSortByCondition, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(kbtnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jcmbbxSortByCondition, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(kgrdpnlMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(kbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(kbtnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(265, 265, 265)
                        .addComponent(kbtnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kgrdpnlMainLayout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(kbtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(kbtnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(kbtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(kbtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kgrdpnlMainLayout.setVerticalGroup(
            kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kgrdpnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblManagePeripherals)
                .addGap(18, 18, 18)
                .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jlblID)
                    .addComponent(jtxtfldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblCategory)
                    .addComponent(jcmbbxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jlblName)
                    .addComponent(jtxtfldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblCondition)
                    .addComponent(jcmbbxCondition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jlblDepartment)
                    .addComponent(jcmbbxDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblPrice)
                    .addComponent(jtxtfldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jlblClassroom)
                    .addComponent(jtxtfldClassroom, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblAmount)
                    .addComponent(jtxtfldAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(kbtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kbtnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kbtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kbtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(kbtnSortByDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kbtnSortByCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kbtnSortByCondition, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kbtnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblSort))
                .addGap(6, 6, 6)
                .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jcmbbxSortByDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcmbbxSortByCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcmbbxSortByCondition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblListOfPeripherals)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jscrlpnPeripherals, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kgrdpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(kbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kbtnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kbtnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jlblClassroom.getAccessibleContext().setAccessibleName("Аудитория");

        jmnAboutAuthor.setText("About author");
        jmnAboutAuthor.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        jmnAboutAuthor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmnAboutAuthorMouseClicked(evt);
            }
        });
        jmnbrInformation.add(jmnAboutAuthor);

        jmnAboutProgram.setText("About program");
        jmnAboutProgram.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        jmnAboutProgram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmnAboutProgramMouseClicked(evt);
            }
        });
        jmnbrInformation.add(jmnAboutProgram);

        setJMenuBar(jmnbrInformation);

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
     * Метод, который делает видимым окно AboutAuthorWindow при нажатии на
     * клавишу и закрывает текущее окно
     *
     * @param evt - класс java.awt.event.MouseEvent для работы с событиями
     * (нажатие на кнопку)
     */
    private void jmnAboutAuthorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmnAboutAuthorMouseClicked
        new AboutAuthorWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmnAboutAuthorMouseClicked

    /**
     * Метод, который делает видимым окно AboutProgramWindow при нажатии на
     * клавишу и закрывает текущее окно
     *
     * @param evt - класс java.awt.event.MouseEvent для работы с событиями
     * (нажатие на кнопку)
     */
    private void jmnAboutProgramMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmnAboutProgramMouseClicked
        new AboutProgramWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmnAboutProgramMouseClicked

    
    /**
     * Метод установки значений полей по строкам и колонкам
     *
     * @param evt - класс java.awt.event.MouseEvent для работы с событиями
     * (нажатие на кнопку)
     */
    private void jtblPeripheralsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblPeripheralsMouseClicked
        DefaultTableModel model = (DefaultTableModel) jtblPeripherals.getModel();
        int Myindex = jtblPeripherals.getSelectedRow();
        jtxtfldID.setText(model.getValueAt(Myindex, 0).toString());
        jtxtfldName.setText(model.getValueAt(Myindex, 1).toString());
        jtxtfldClassroom.setText(model.getValueAt(Myindex, 3).toString());
        jtxtfldPrice.setText(model.getValueAt(Myindex, 6).toString());
        jtxtfldAmount.setText(model.getValueAt(Myindex, 7).toString());
    }//GEN-LAST:event_jtblPeripheralsMouseClicked

    /**
     * Метод добавления периферийных устройств в список
     *
     * @param evt - класс java.awt.event.MouseEvent для работы с событиями
     * (нажатие на кнопку)
     */
    private void kbtnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kbtnAddMouseClicked
        if (jtxtfldName.getText().isEmpty() || jtxtfldPrice.getText().isEmpty() || jtxtfldClassroom.getText().isEmpty() // проверка на заполненность полей
                || jtxtfldAmount.getText().isEmpty() || jtxtfldID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Information");
        } else {
            try {

                PreparedStatement add = Con.prepareStatement("Insert into TBLPERIPHERALS values(?, ?, ?, ?, ?, ?, ?, ?)");
                //запрос, который позволяет добавить строки в таблицу (? – количество параметров)

                add.setInt(1, Integer.valueOf(jtxtfldID.getText())); //добавление значения поля ID
                add.setString(2, jtxtfldName.getText()); // добавление значения поля Name (Имя)
                add.setString(3, jcmbbxDepartment.getSelectedItem().toString()); // добавление значения поля Department (Кафедра)
                add.setString(4, jtxtfldClassroom.getText()); // добавление значения поля Classroom (Аудитория)
                add.setString(5, jcmbbxCategory.getSelectedItem().toString()); // добавление значения поля Category (Категория)
                add.setString(6, jcmbbxCondition.getSelectedItem().toString()); // добавление значения поля Condition (Состояние)
                add.setInt(7, Integer.valueOf(jtxtfldPrice.getText())); // добавление значения поля Price (Цена)
                add.setInt(8, Integer.valueOf(jtxtfldAmount.getText())); // добавление значения поля Amount (Количество)

                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Peripherals Added Successfully");
                Con.close();
                selectPeripherals();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error Adding Peripherals");

            }
        }
    }//GEN-LAST:event_kbtnAddMouseClicked

    /**
     * Метод для редактирования периферийных устройств
     *
     * @param evt - класс java.awt.event.MouseEvent для работы с событиями
     * (нажатие на кнопку)
     */
    private void kbtnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kbtnEditMouseClicked
        if (jtxtfldName.getText().isEmpty() || jtxtfldPrice.getText().isEmpty() || jtxtfldClassroom.getText().isEmpty()
                || jtxtfldAmount.getText().isEmpty() || jtxtfldID.getText().isEmpty()) { // проверка на заполненность полей
            JOptionPane.showMessageDialog(this, "Missing Information");
        } else {
            try {
                String Query = "Update User1.TBLPERIPHERALS set NAME='" + jtxtfldName.getText() + "'" + ",DEPARTMENT='" 
                        + jcmbbxDepartment.getSelectedItem().toString()
                        + "'" + ",CLASSROOM='" + jtxtfldClassroom.getText() + "'" + ",CATEGORY='" + jcmbbxCategory.getSelectedItem().toString() + "'"
                        + ",CONDITION='" + jcmbbxCondition.getSelectedItem().toString() + "'"
                        + ",PRICE='" + jtxtfldPrice.getText() + "'" + ",AMOUNT='" + jtxtfldAmount.getText() + "'" + "where ID=" + jtxtfldID.getText();
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                selectPeripherals();
                JOptionPane.showMessageDialog(this, "Peripherals Updated Successfully");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error Updating Peripherlas");
            }
        }
    }//GEN-LAST:event_kbtnEditMouseClicked

    /**
     * Метод удаления периферийных устройств из списка
     *
     * @param evt - класс java.awt.event.MouseEvent для работы с событиями
     * (нажатие на кнопку)
     */
    private void kbtnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kbtnDeleteMouseClicked
        if (jtxtfldID.getText().isEmpty()) { //проверка выбрано ли устройство для удаления
            JOptionPane.showMessageDialog(this, "Enter The Peripheral To be Deleted");
        } else {
            try {

                String FID = jtxtfldID.getText();
                String Query = "Delete from User1.TBLPERIPHERALS where ID=" + FID; //удаление устройства по ID
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                selectPeripherals();
                JOptionPane.showMessageDialog(this, "Peripheral Deleted Successfully");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error Deleting Peripherlas");
            }
        }
    }//GEN-LAST:event_kbtnDeleteMouseClicked

    /**
     * Метод для очистки полей
     *
     * @param evt - класс java.awt.event.MouseEvent для работы с событиями
     * (нажатие на кнопку)
     */
    private void kbtnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kbtnClearMouseClicked
        jtxtfldID.setText("");
        jtxtfldName.setText("");
        jtxtfldPrice.setText("");
        jtxtfldClassroom.setText("");
        jtxtfldAmount.setText("");
    }//GEN-LAST:event_kbtnClearMouseClicked

    /**
     * Метод сортировки по кафедре (Department)
     *
     * @param evt - класс java.awt.event.MouseEvent для работы с событиями
     * (нажатие на кнопку)
     */
    private void kbtnSortByDepartmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kbtnSortByDepartmentMouseClicked
        try {
            St = Con.createStatement();
            Rs = St.executeQuery("Select * from User1.TBLPERIPHERALS where DEPARTMENT='"
                    + jcmbbxSortByDepartment.getSelectedItem().toString() + "'"); //выбираем из таблицы TBLPERIPHERALS поле DEPARTMENT
            jtblPeripherals.setModel(DbUtils.resultSetToTableModel(Rs)); //отображаем в jtblPeripherals
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Sorting Error by Department");
        }
    }//GEN-LAST:event_kbtnSortByDepartmentMouseClicked

    /**
     * Метод сортировки по категории (Category)
     *
     * @param evt - класс java.awt.event.MouseEvent для работы с событиями
     * (нажатие на кнопку)
     */
    private void kbtnSortByCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kbtnSortByCategoryMouseClicked
        try {
            St = Con.createStatement();
            Rs = St.executeQuery("Select * from User1.TBLPERIPHERALS where CATEGORY='"
                    + jcmbbxSortByCategory.getSelectedItem().toString() + "'"); //выбираем из таблицы TBLPERIPHERALS поле CATEGORY
            jtblPeripherals.setModel(DbUtils.resultSetToTableModel(Rs)); //отображаем в jtblPeripherals
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Sorting Error by Category");
        }
    }//GEN-LAST:event_kbtnSortByCategoryMouseClicked

    /**
     * Метод сортировки по состоянию (Condition)
     *
     * @param evt - класс java.awt.event.MouseEvent для работы с событиями
     * (нажатие на кнопку)
     */
    private void kbtnSortByConditionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kbtnSortByConditionMouseClicked
        try {
            St = Con.createStatement();
            Rs = St.executeQuery("Select * from User1.TBLPERIPHERALS where CONDITION='"
                    + jcmbbxSortByCondition.getSelectedItem().toString() + "'"); //выбираем из таблицы TBLPERIPHERALS поле CONDITION
            jtblPeripherals.setModel(DbUtils.resultSetToTableModel(Rs)); // отображаем в jtblPeripherals
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Sorting Error by Condition");
        }
    }//GEN-LAST:event_kbtnSortByConditionMouseClicked

    /**
     * Метод, который позволяет привести список устройств в первоначальное
     * состояние после сортировки (обновить)
     *
     * @param evt - класс java.awt.event.MouseEvent для работы с событиями
     * (нажатие на кнопку)
     */
    private void kbtnRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kbtnRefreshMouseClicked
        selectPeripherals();
    }//GEN-LAST:event_kbtnRefreshMouseClicked

    /**
     * Метод, который делает видимым окно LoginWindow при нажатии на клавишу и
     * закрывает текущее окно
     *
     * @param evt - класс java.awt.event.MouseEvent для работы с событиями
     * (нажатие на кнопку)
     */
    private void kbtnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kbtnLogoutMouseClicked
        new LoginWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_kbtnLogoutMouseClicked
    
    /**
     * Метод, который позволяет распечатать итоговый список устройств
     *
     * @param evt - класс java.awt.event.MouseEvent для работы с событиями
     * (нажатие на кнопку)
     */
    private void kbtnPrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kbtnPrintMouseClicked
        try {
            jtblPeripherals.print();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Print Error");
        }
    }//GEN-LAST:event_kbtnPrintMouseClicked
    
    /**
     * Метод, который закрывает программу при нажатии на клавишу
     * @param evt - класс java.awt.event.MouseEvent для работы с событиями (нажатие на кнопку)
     */
    private void kbtnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kbtnExitMouseClicked
        this.dispose();
    }//GEN-LAST:event_kbtnExitMouseClicked

    // приватные поля компонентов фрейма
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jcmbbxCategory;
    private javax.swing.JComboBox<String> jcmbbxCondition;
    private javax.swing.JComboBox<String> jcmbbxDepartment;
    private javax.swing.JComboBox<String> jcmbbxSortByCategory;
    private javax.swing.JComboBox<String> jcmbbxSortByCondition;
    private javax.swing.JComboBox<String> jcmbbxSortByDepartment;
    private javax.swing.JLabel jlblAmount;
    private javax.swing.JLabel jlblCategory;
    private javax.swing.JLabel jlblClassroom;
    private javax.swing.JLabel jlblCondition;
    private javax.swing.JLabel jlblDepartment;
    private javax.swing.JLabel jlblID;
    private javax.swing.JLabel jlblListOfPeripherals;
    private javax.swing.JLabel jlblManagePeripherals;
    private javax.swing.JLabel jlblName;
    private javax.swing.JLabel jlblPrice;
    private javax.swing.JLabel jlblSort;
    private javax.swing.JMenu jmnAboutAuthor;
    private javax.swing.JMenu jmnAboutProgram;
    private javax.swing.JMenuBar jmnbrInformation;
    private javax.swing.JScrollPane jscrlpnPeripherals;
    private javax.swing.JTable jtblPeripherals;
    private javax.swing.JTextField jtxtfldAmount;
    private javax.swing.JTextField jtxtfldClassroom;
    private javax.swing.JTextField jtxtfldID;
    private javax.swing.JTextField jtxtfldName;
    private javax.swing.JTextField jtxtfldPrice;
    private com.k33ptoo.components.KButton kbtnAdd;
    private com.k33ptoo.components.KButton kbtnClear;
    private com.k33ptoo.components.KButton kbtnDelete;
    private com.k33ptoo.components.KButton kbtnEdit;
    private com.k33ptoo.components.KButton kbtnExit;
    private com.k33ptoo.components.KButton kbtnLogout;
    private com.k33ptoo.components.KButton kbtnPrint;
    private com.k33ptoo.components.KButton kbtnRefresh;
    private com.k33ptoo.components.KButton kbtnSortByCategory;
    private com.k33ptoo.components.KButton kbtnSortByCondition;
    private com.k33ptoo.components.KButton kbtnSortByDepartment;
    private com.k33ptoo.components.KGradientPanel kgrdpnlMain;
    // End of variables declaration//GEN-END:variables
}
