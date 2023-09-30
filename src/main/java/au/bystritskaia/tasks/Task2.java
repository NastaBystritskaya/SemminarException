package au.bystritskaia.tasks;

import static java.lang.System.*;

/**
 * Задание 2. Семминара 2. Исключения.
 * Если необходимо, исправьте данный код.
 */
public class Task2 implements Runnable {
    /**
     * Запуск задания
     */
    @Override
    public void run() {
        int[] intArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (IndexOutOfBoundsException index) {
            out.println("В массиве отсутсвует 8 цифра.\n Сообщение: " + index.getMessage());
        } catch (ArithmeticException e) {
            out.println("На ноль делить нельзя!");
        } catch (Exception ex) {
            out.println("Непредвиденное исключение:\n" + ex.getMessage());
        }

    }
}
