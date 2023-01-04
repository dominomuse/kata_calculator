public class Main {

    public static void main(String[] args) {
        String firstArg = args[0];
        String result = calc(firstArg);
        System.out.println(result);
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
