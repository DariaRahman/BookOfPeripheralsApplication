package bookofperipheralsapplication;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author Daria Rahman
 * @version 1.0 8.11.22 
 * Класс, реализующий подключение к базе данных BookOfPeripherals
 */
public class DBManager {
    
    
    public static String URL = "jdbc:derby://localhost:1527/BookOfPeripheralsDB"; //адрес базы данных

    public static String USER = "app"; //логин базы данных

    public static String PASSWORD = ""; //пароль базы данных

    /*
     * Метод для соединения с базой данных
     * @return connection - соединение
     * @throws SQLException - исключение в случае ошибки подключения
     */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

}
