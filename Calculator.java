public class Calculator {
    
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 22;
        int result = 2;
        char action = '+';
        if (action == '+') {
            result = num1 + num2;
        } else if (action == '-') {
            result = num1 - num2;
        } else if (action == '*') {
            result = num1 * num2;
        } else if (action == '/') {
            result = num1 / num2;
        } else if (action == '^') {
            for (int i = 0; i < num2; i++) {
                result *= num1;
            }
        } else if (action == '%') {
            result = num1 % num2;
        }
        System.out.println(num1 + " " + action + " " + num2 + " = " + result);
    }
}