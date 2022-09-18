package study;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int calculate(int first, char operator, int second) {
        if (operator == '+')
            return add(first, second);

        if (operator == '-')
            return subtract(first, second);

        if (operator == '*')
            return multiply(first, second);

        if (operator == '/')
            return divide(first, second);
        else System.out.println("잘못된 숫자 입력");
        throw new RuntimeException();
    }

    public int calculation(String[] str) {
        int result = Integer.parseInt(str[0]);
        for (int i = 0; i < str.length - 2; i += 2) {
            result = calculate(result, str[i + 1].charAt(0), Integer.parseInt(str[i + 2]));
        }
        return result;
    }

    public String[] seperate(String str) {
        return str.split(" ");
    }
}
