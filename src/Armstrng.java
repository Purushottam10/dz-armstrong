import java.util.Scanner;

public class Armstrng {

    /**
     * calculate the order of number
     *
     * @return digit  count
     */
    public int orderNum(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number = number / 10;

        }
        return count;
    }

    /**
     * @param x
     * @param y
     * @return power of number
     */
    int power(int x, int y) {
        if (y == 0)
            return 1;
        if (y % 2 == 0)
            return power(x, y / 2) * power(x, y / 2);
        return x * power(x, y / 2) * power(x, y / 2);
    }

    /**
     * @return if number is Armstrng then return true or false
     */
    public boolean armsno() {
        Scanner scanner = new Scanner(System.in);
        int number = 1;
        System.out.println("enter the number ");
        number = scanner.nextInt();
        int order = orderNum(number);
        System.out.println("method called  ");
        int temp = number;
        int sum = 0;
        while (number > 0) {
            int rem = number % 10;
            sum = sum + power(rem, order);
            number = number / 10;
        }
        if (temp == sum) {
            return true;
        }
        return false;
    }
}
