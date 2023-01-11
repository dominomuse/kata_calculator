import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        while(true) {
            System.out.println("Input:");
            String expression = inputScanner.nextLine();
            System.out.println("Output:");
            try {
                String result = calc(expression);
                System.out.println(result);
            } catch (Exception e) {
                System.out.println(e);
                inputScanner.close();
                System.exit(0);
            }
        }
    }


    public static String calc(String input) {
        String[] tokens = input.split(" ");

        if (tokens.length != 3) {
            throw new IllegalArgumentException("Неподходящее количество аргументов");
        }

        int firstNumber = parseInt(tokens[0]);
        int secondNumber = parseInt(tokens[2]);
        String mathOperation = tokens[1];

        switch(mathOperation) {
            case "+":
                return Integer.toString(firstNumber + secondNumber);
            case "-":
                return Integer.toString(firstNumber - secondNumber);
            case "*":
                return Integer.toString(firstNumber * secondNumber);
            case "/":
                return Integer.toString(firstNumber / secondNumber);
            default:
                throw new IllegalArgumentException(mathOperation + " неподдерживаемая математическая операция");
        }
    }

    private static int parseInt(String input) {
        int result = Integer.parseInt(input);

        if (result < 1 || result > 10) {
            throw new IllegalArgumentException(result + " неподходящее число");
        }

        return result;
    }
}
