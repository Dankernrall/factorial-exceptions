import java.util.Scanner;

public class Factorials {

    public static void main(String[] args) {
        String keepGoing = "Y";
        Scanner scan = new Scanner(System.in);

        while (keepGoing.equals("Y")) {
            try {
                System.out.print("Введите число: ");
                int val = scan.nextInt();
                if (val < 1)
                    throw new IllegalArgumentException("Меньше");
                else if (val > 16)
                    throw new IllegalArgumentException("Больше");
                System.out.println(
                        String.format(
                                "Факториал(\"%d\") = %d",
                                val, MathUtils.factorial(val)
                        )
                );
                System.out.print("Вычислить другой факториал? (y/n) ");
                keepGoing = scan.next().toUpperCase();
            } catch (IllegalArgumentException e) {
                if (e.getMessage().equals("Меньше")) {
                    System.out.println("Ошибка!\nВведенное число меньше 1!\n");
                } else if (e.getMessage().equals("Больше")) {
                    System.out.println("Ошибка!\nВведенное число больше 16!\n");
                }
            }
        }
    }
}
