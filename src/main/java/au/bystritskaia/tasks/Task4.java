package au.bystritskaia.tasks;

import java.security.InvalidParameterException;
import java.util.Scanner;
import static java.lang.System.*;

/**
 * Задание 4. Семминара 2. Исключения

 * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
public class Task4 implements Runnable {
    /**
     * Скпнер
     */
    private Scanner scanner = new Scanner(System.in);

    /**
     * Запуск задания
     */
    @Override
    public void run() {
        out.println("Ввод строк. Для остановки введите 'стоп'");
        do {
            try {
                String input = this.readInput();
                if(input.equalsIgnoreCase("стоп"))
                    break;
            } catch (InvalidParameterException ex) {
                out.println(ex.getMessage());
            }

        } while (true);
    }

    /**
     * Чтение ввода
     */
    private String readInput() throws InvalidParameterException {
        out.print("Введите строку: ");
        String input = this.scanner.nextLine();
        if(input == null || input.trim().length() == 0)
            throw new InvalidParameterException("Вы ввели пустую строку");
        out.println("Вы ввели: " + input);
        return input;
    }
}
