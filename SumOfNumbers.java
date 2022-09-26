import java.util.Scanner;

public class SumOfNumbers {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Сумма цифр числа " +a +" равна "+((a%10)+((a/10)%10)+((a/100)%10)));
    }
}
