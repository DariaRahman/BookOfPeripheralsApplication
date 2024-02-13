package bookofperipheralsapplication;

/**
 * @author Daria Rahman
 * @version 1.0 8.11.22 
 * Класс запуска приложения
 */
public class Main {

    /**
     * Метод, реализующий запуск приложения с окна SplashWindow и его закрытия
     * в случае отсутствия ответа через определенное время
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        SplashWindow splashWindow = new SplashWindow();
        splashWindow.setVisible(true);
        try {
            for (int i = 0; i <= 100; i++) //создаем счетчик загрузки
            {
                Thread.sleep(600); // устанавливаем таймер в виде 60 секунд, после их истечения программа закрывается
                splashWindow.jprgrsbrLoading.setValue(i); //присваиваем значение i к ProgressBar
                splashWindow.jlblPercent.setText(Integer.toString(i) + "%");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        splashWindow.dispose(); //закрытие окна

    }
}
