package qwe;

import java.util.Scanner;

public class ert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int y = 1;
        int s = y;
        System.out.println("Введи число - ");
        y = scanner.nextInt();
        System.out.println("Введи степень числа - ");
        n = scanner.nextInt();
        while (n>0){
            s=s*y;
            n--;
        }
        System.out.println("итог = "+s);
    }
}

