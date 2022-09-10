// Написать программу вычисления n-ого треугольного числа
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = read.nextInt();
        read.close();
        int num = a* (a+1) / 2;
        System.out.printf("%d по счету треугольное число равно %d",a, num);
        System.out.println();
    }
}
