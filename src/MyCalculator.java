import java.util.Scanner;
public class MyCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double x= in.nextDouble();

        Scanner in1 = new Scanner(System.in);
        System.out.print("Введите второе число: ");
        Double y= in1.nextDouble();

        Scanner in2 = new Scanner(System.in);
        System.out.print("Введите арифметическую операцию из предложенных(+,-,*,/) :");
        String op= in2.nextLine();
        double rez;
        switch(op) {
            case "+":
                rez = x + y;
                System.out.print(rez);
                break;
            case "-":
                rez = x - y;
                System.out.print(rez);
                break;
            case "*":
                rez = x * y;
                System.out.print(rez);
                break;
            case "/": if (y != 0) {
                rez = x / y;
                System.out.print(rez); }
                else{
                System.out.print("На ноль делить нельзя!");
            }
                break;
            default: System.out.print("Введена операция, которая отсутствует в списке!");
                break;
        }
    }
}
