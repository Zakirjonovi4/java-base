package com.company.lesson23;

public class StringExample {

    private static String str(){
        return "Добро пожаловать";
    }


    private static void rumContentEquals(){
        System.out.println("rumContentEquals");
        String str1 = str();
        String str2 = "Учим java";

        StringBuffer str3 = new StringBuffer(str());
        StringBuffer str4 = new StringBuffer("Добро пожаловать");

        boolean result = str1.contentEquals(str3);
        System.out.println("str1 == str3: " + result);

        result = str2.contentEquals(str3);
        System.out.println("str2 == str3: " + result);

        result = str1.contentEquals(str4);
        System.out.println("str1 == str4: " + result);
    }

    private static void runEqualsIgnoreCase(){
        System.out.println("");
        System.out.println("runEqualsIgnoreCase");

        String str1 = str();
        String str2 = str1;
        String str3 = "Учим java";
        String str4 = "ДобРо ПОЖалоВАть";

        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.equalsIgnoreCase(str4));
    }

    private static void runCompareTo(){
        System.out.println("");
        System.out.println("runCompareTo");

        String str1 = "Я вызываю метод!";
        String str2 = "Я вызываю метод!";
        String str3 = "Я Вызываю класс!";

        System.out.println(str1.compareTo(str2));
        System.out.println(str2.compareTo(str3));
        System.out.println(str3.compareTo(str1));
    }

    private static void runCompareToIgnoreCase(){
        System.out.println("");
        System.out.println("runCompareToIgnoreCase");

        String str1 = "Я вызываю метод!";
        String str2 = "Я Вызываю метод!";
        String str3 = "Я Вызываю класс!";

        System.out.println(str1.compareToIgnoreCase(str2));
        System.out.println(str2.compareToIgnoreCase(str3));
        System.out.println(str3.compareToIgnoreCase(str1));

    }

    private static void runToLowerCase(){
        System.out.println("");
        System.out.println("runToLowerCase");

        String str = "Я вызываю метод!";
        System.out.println(str.toLowerCase());
    }

    private static void runToUpperCase(){
        System.out.println("");
        System.out.println("runToUpperCase");

        String str = "Я вызываю метод!";
        System.out.println(str.toUpperCase());
    }

    private static void runConcat(){
        System.out.println("");
        System.out.println("runConcat");

        String s = "Я вызываю метод! ";
        s = s.concat("И я вызываю класс!");

        System.out.println(s);
    }

    private static void runMatches(){
        System.out.println("");
        System.out.println("runMatches");

        String s = str();

        System.out.println(s.matches("(.*)пож(.*)") );
    }
    23 39
    public static void run() {
        rumContentEquals();
        runEqualsIgnoreCase();
        runCompareTo();
        runCompareToIgnoreCase();
        runToLowerCase();
        runToUpperCase();
        runConcat();
        runMatches();
    }





}
