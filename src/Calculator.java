import java.util.Scanner;

public class Calculator<T extends Number> {

    private T num1, num2;

    public Calculator(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public T add() {
        if (num1 instanceof Integer) {
            return (T) Integer.valueOf(num1.intValue() + num2.intValue());
        } else if (num1 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() + num2.doubleValue());
        } else {
            return null;
        }
    }

    public T subtract() {
        if (num1 instanceof Integer) {
            return (T) Integer.valueOf(num1.intValue() - num2.intValue());
        } else if (num1 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() - num2.doubleValue());
        } else {
            return null;
        }
    }

    public T multiply() {
        if (num1 instanceof Integer) {
            return (T) Integer.valueOf(num1.intValue() * num2.intValue());
        } else if (num1 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() * num2.doubleValue());
        } else {
            return null;
        }
    }

    public T divide() {
        if (num1 instanceof Integer) {
            return (T) Integer.valueOf(num1.intValue() / num2.intValue());
        } else if (num1 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() / num2.doubleValue());
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = 0;
        try {
            num1 = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Ошибка: неверный формат числа");
            return;
        }
        System.out.print("Введите второе число: ");
        double num2 = 0;
        try {
            num2 = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Ошибка: неверный формат числа");
            return;
        }
        System.out.print("Введите операцию (+, -, *, /): ");
        String op = scanner.next();
        Calculator<? extends Number> calculator = new Calculator<>(num1, num2);
        switch (op) {
            case "+":
                System.out.println("Результат: " + calculator.add());
                break;
            case "-":
                System.out.println("Результат: " + calculator.subtract());
                break;
            case "*":
                System.out.println("Результат: " + calculator.multiply());
                break;
            case "/":
                System.out.println("Результат: " + calculator.divide());
                break;
            default:
                System.out.println("Операция неверна");
                break;
        }
    }
}
