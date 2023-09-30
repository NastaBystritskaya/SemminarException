package au.bystritskaia.tasks;

/**
 * Задание 3. Семминара 2. Исключения.
 * Если необходимо, исправьте данный код.
 */
public class Task3 implements Runnable {

    /**
     * Запуск задания
     */
    @Override
    public void run() {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
    }

    /**
     * Сумма
     * @param a 1 число
     * @param b 2 число
     */
    public void printSum(Integer a, Integer b)  {
        System.out.println(a + b);
    }
}