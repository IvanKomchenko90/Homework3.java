package by.operators_if_switch;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args){
        //задача 1
        System.out.println("Задача 1");
        int a = 8, b = 7, c = 20;
        if (a%2==0){
            System.out.println("a-кратно 2 ="+a);
        } if (b%2==0) {
            System.out.println("b-кратно 2 ="+b);
        } if (c%2==0) {
        System.out.println("c-кратно 2 =" + c);
        }
        else {
            System.out.println("чисел кратных двум нет");
        }
        //задача 2
        System.out.println("Задача 2");
        int x = 8, y = 7, z = 20;
        if ((x%2==0) && (x%5==0)){
            System.out.println("x-кратно 2 и 5 ="+x);
        } if ((y%2==0) && (y%5==0)) {
            System.out.println("y-кратно 2 и 5 ="+y);
        } if ((z%2==0) && (z%5==0)) {
            System.out.println("z-кратно 2 и 5 =" + z);
        }
        else {
            System.out.println("чисел кратных 2 и 5 нет");
        }
        //задача 3
        System.out.println("Задача 3");
        Scanner scanner=new Scanner(System.in);
        System.out.println("введите k");
        int k = scanner.nextInt();
        int result;
        result=15/k;
        switch (result){
            case 3:
                if (k==5) {
                    System.out.println("результат деления равен 3");
                }
                else {
                    System.out.println("результат деления равен дробному числу = "+(double)15/k);
                }
                break;
            case 5:
                System.out.println("результат деления равен 5");
                break;
            default:
                System.out.println("результат деления равен дробному числу =" +(double)15/k);
        }
    }
}
