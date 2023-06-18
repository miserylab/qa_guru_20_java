package guru.qa;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        //примитивные типы данных
        //целочисленные типы данных
        byte varByte = 1; // -128 +127 (-) 2^8(-1)
        short varShort = 1; // -32768 +32767 (-) 2^16(-1)
        int varInt = 10; // (-) 2^32(-1)
        long varLong = 10; // (-) 2^64(-1)
        //числа с плавающей точкой
        float varFloat = 1.09F; //32b
        double varDouble = 1.09; //64b
        //Символьный
        char varChar = '0';
        //Логический
        boolean varBoolean = false;

        Clock varClock = new Clock();
        String word = "Hello!"; // string создаётся без new
        List<String> list = List.of("1", "2"); //у списка new находится в методе of

        //операторы
        //присвоение =
        //арифметический + - * / %
        System.out.println(7/3);
        System.out.println(7%3);
        //операторы сравнения == != > < >= <=
        System.out.println(10.0 == 10);

        //логические &, |(или), &&, ||, !
        System.out.println(10 > 9 && word.equals("Hello!"));
        System.out.println(10 > 9 || word.equals("Hello!"));

        //оператор instanceof
        if (varClock instanceof Clock) {

        }

        //тернарный оператор
        //если word.equals("dima"), то присвоить PROFIT иначе присвоить SAD

        String result;
        if (word.equals("dima")) {
            result = "PROFIT";
        } else {
            result = "SAD";
        }

        String result1 = word.equals("dima")
                ? "PROFIT"
                : "SAD";


        //switch case

        switch (word){
            case "dima": {
                result = "PROFIT";
                break;
            }
            case "valera": {
                result = "PROFIT!!!!";
                break;
            }
            default:{
                result = "SAD";
            }
        }


        varInt = varInt + 3;
        varInt += 3;







        System.out.println("Hello world!");
    }

    public int sum(int a, int b) {
        return a + b;
    }

    static class Clock{
        int hours = 23;
        int min = 42;
        int sec = 45;


        public void printTime() {
            System.out.println("Current time is: "
                    + hours + " "
                    + min + " "
                    + sec);
        }
    }
}
