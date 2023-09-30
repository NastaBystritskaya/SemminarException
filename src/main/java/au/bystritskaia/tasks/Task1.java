package au.bystritskaia.tasks;

import java.util.Scanner;
import static java.lang.System.*;

/**
 * Задание 1. Семминара 2. Исключения.
 *  Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
 *  и возвращает введенное значение.
 *  Ввод текста вместо числа не должно приводить к падению приложения,
 *  вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */
public class Task1 implements Runnable {
    /**
     * Сканер
     */
    private Scanner scanner = new Scanner(System.in);

    /**
     * Запуск задания
     */
    @Override
    public void run() {
        out.println("Ввод дробных чисел. Для остановки введите слово 'Стоп'");
        do {
            System.out.println("Введите дробное число: ");
            String input = this.scanner.nextLine();
            if(input.equalsIgnoreCase("стоп"))
                break;

            try {
                float num = Float.parseFloat(input);
                out.println("Вы ввели число: " + num);
            } catch (NumberFormatException formatException) {
                out.printf("Вы ввели недопустимое число ('%s')%n", input);
            } catch (Exception ex) {
                out.println("Непредвиденное исключение:\n" + ex.getMessage());
            }
        } while (true);
    }
}
