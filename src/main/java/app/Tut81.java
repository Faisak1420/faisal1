package app;

import java.util.Scanner;

public class Tut81 {
    public static void main(String[] args) {
        int x1 = 1;
        int x2 = 1;
        int x3 = 1;
        System.out.println("فضلاً ادخل الرقم الاول");
        System.out.println("للخروج اضغط على زر w");
        Scanner y = new Scanner(System.in);
        x1 = y.nextInt();
        chack(x1);
        System.out.println("فضلاً ادخل الرقم الثاني");
        System.out.println("للخروج اضغط على زر w");
        x2 = y.nextInt();
        chack(x2);

        System.out.println("ماهي العملية التي تود القيام بها");
        System.out.println("1-الجمع");
        System.out.println("2-الطرح");
        System.out.println("3-الضرب");
        System.out.println("4-القسمة");
        String o = y.next();
        switch (o) {
            case "1":
                int ntegh = x1 + x2;
                System.out.println("ناتج العملية يساوي " + ntegh);
            break;
            case "2":
                int ntegh1 = x1 - x2;
                System.out.println("ناتج العملية يساوي " + ntegh1);
                break;
            case "3":
                int ntegh2 = x1 * x2;
                System.out.println("ناتج العملية يساوي " + ntegh2);
                break;
            case "4":
                int ntegh3 = x1 / x2;
                System.out.println("ناتج العملية يساوي " + ntegh3);
                break;

        }

    }

    private static void chack(int x1) {
        if (x1 == 0) {
            System.out.println("تم الخروج من البرنامج");
            System.exit(0);
        }
    }

}
