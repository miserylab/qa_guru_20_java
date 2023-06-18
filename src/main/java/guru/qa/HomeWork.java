package guru.qa;



public class HomeWork {
    public static void main(String[] args) {
        //математические операторы
        System.out.println("Addition with int = " + sum(1,2));
        System.out.println("Addition with int and double = " + sum(1.15,2));
        System.out.println("Subtraction with int = " + sub(10, 4));
        System.out.println("Subtraction with int and double = " + sub(10.1, 4));
        System.out.println("Multiplication with int = " + mult(40, 20));
        System.out.println("Multiplication with int and double = " + mult(40.1, 20));
        System.out.println("Division with int = " + div(100, 20));
        System.out.println("Division with int and double = " + div(100.1, 20));
        System.out.println("Modulus with int = " + mod(7,2));
        System.out.println("Modulus with int and double = " + mod(7.1,2));
        //переполнение
        System.out.println("Переполнение Addition " + sum(Integer.MAX_VALUE, 1));
        System.out.println("Переполнение Subtraction " + sum(Integer.MIN_VALUE, 1));
        //логические операторы
        System.out.println(varInt == (sub(3, 2)) && word.equals("Hello!"));
        System.out.println(varInt == sub(3,2) || word.equals("Hello!"));

        System.out.println(checkNumberPositivity(-1));
        System.out.println(checkNumberPositivity(0));
        System.out.println(checkNumberPositivity(1));

        System.out.println(result1);

        System.out.println(switchCase(1));
        System.out.println(switchCase(-1));
        System.out.println(switchCase(0));
    }

    public static int varInt = 5;
    static String word = "Hello!";


    public static int sum ( int a, int b){
        return a + b;
    }

    public static double sum ( double a, int b){
        return a + b;
    }

    public static int sub ( int a, int b){
        return a - b;
    }

    public static double sub ( double a, int b){
        return a - b;
    }

    public static int mult ( int a, int b){
        return a * b;
    }

    public static double mult ( double a, int b){
        return a * b;
    }

    public static int div ( int a, int b){
        return a / b;
    }

    public static double div ( double a, int b){
        return a / b;
    }

    public static int mod ( int a, int b){
        return a % b;
    }

    public static double mod ( double a, int b){
        return a % b;
    }

    public static String checkNumberPositivity(int num) {
        if (num > 0) {
            return "Позитивное число";
        } else if (num < 0) {
            return "Отрицательное число";
        } else {
            return "Введен 0";
        }
    }

    static String result1 = word.equals("Hello!")
            ? "PROFIT"
            : "SAD";


    //switch case

    public static String switchCase (int num) {
        String result;
        switch (num) {
            case 1:
                result = "Позитивное число";
                break;
            case -1:
                result = "Отрицательное число";
                break;
            default:
                result = "Введен 0";
        }
        return result;

    }

}

