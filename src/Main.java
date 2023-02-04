import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        double firstNumber = scanner.nextDouble();
        System.out.println("Введите число");
        double secondNumber = scanner.nextDouble();
        System.out.println("Введите знак");
        String sign = scanner.next();

        switch (sign) {
            case "+" :
                System.out.println(firstNumber + secondNumber);
                break;
            case "-" :
                System.out.println(firstNumber - secondNumber);
                break;
            case "*" :
                System.out.println(firstNumber * secondNumber);
            case "/" :
                System.out.println(firstNumber / secondNumber);
        }
    }
}