package app;

public class Tut83 {
    public static void main(String[] args) {

        String str1 = "فيصل ";
        String str2 = "عبد العزيز ";
        String str3 = "نجار ";

        System.out.println("النص الاول : " + str1);
        System.out.println("النص الثاني : " + str2);
        System.out.println("النص الثالث : " + str3);

        String str4 = str1.concat(str2.concat(str3));

        System.out.println("النص كاملاً بعد الربط: " + str4);


//        String name = "Java";
//        char nameLength = name.charAt(2);
//        System.out.println(nameLength);

//        Integer i1 = 10;
//        System.out.println(i1 .doubleValue());

//        char c1 = 'B';
//        char c2 = 10;
//
//        Character c11 = 'B';
//        Character c21 = 10;
//
//        System.out.println(Character.isLetter(c11));
//        System.out.println(Character.isDigit(c11));


//        System.out.println("\t مرحباً بك");
//        System.out.println("\b مرحباً بك");
//        System.out.println("\n مرحباً بك");
//        System.out.println("\r مرحباً بك");
//        System.out.println("\f مرحباً بك");
//        System.out.println("\' مرحباً بك");
//        System.out.println("\" مرحباً بك");
//        System.out.println("\tمرحباً بك");


    }

    private static void tset() {
        String str1 = "This is exercise 2";
        String str2 = "This is exercise 2";

        System.out.println("String 1:" + str1);
        System.out.println("String 2:" + str2);


        int result = str1.compareToIgnoreCase(str2);

        if (result < 0) {
            System.out.println("\"" + str1 + "\"" + "اقل من" + "\"" + str2 + "\"");

        } else if (result == 0) {
            System.out.println("\"" + str1 + "\"" + " يساوي" + "\"" + str2 + "\"");
        } else  // if (result > 0)
        {
            System.out.println("\"" + str1 + "\"" + "أكبر من " + "\"" + str2 + "\"");
        }
    }
}
