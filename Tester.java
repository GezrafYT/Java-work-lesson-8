package class_usage_practice;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter fM: ");
        int fM = scan.nextInt();
        System.out.println("Enter diff: ");
        int diff = scan.nextInt();
        ArithmeticProgression test = new ArithmeticProgression(fM, diff);
        test.printGeneralSeries();
        System.out.println();

        System.out.println("Enter n: ");
        int n = scan.nextInt();

        System.out.println("aN = " + test.memberCalculation(n));

        //בדיקה אם האיבר האחרון שנקלט מהמשתמש הוא חלק מהסדרה
        System.out.println("----------------------------------------------");
        System.out.println("Enter aN to see if its part of the series: : ");
        int aN = scan.nextInt();

        System.out.println("n = " + test.calculateN(aN));
    }
}
