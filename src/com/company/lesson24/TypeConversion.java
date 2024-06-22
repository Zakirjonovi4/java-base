package com.company.lesson24;

public class TypeConversion {

    private static void runStringToBite(){
        String str1 = "111";
        Byte b1 = Byte.valueOf(str1);
        System.out.println(b1);

        byte b2 = Byte.parseByte(str1);
        System.out.println(b2);
    }

    private static void runStringToInt(){
        String str = "1234";

        Integer i1 = Integer.valueOf(str);
        int i2 = Integer.parseInt(str);

        System.out.println(i1);
        System.out.println(i2);
    }

    private static void runStringToDouble(){
        Double d1 = Double.valueOf("12.123");
        double d2 = Double.parseDouble("12.23");

        System.out.println(d1);
        System.out.println(d2);
    }

    private static void runStringToBoolean(){
        Boolean b1 = Boolean.valueOf("true");
        Boolean b2 = Boolean.valueOf("false");
        Boolean b3 = Boolean.valueOf("yea");
        Boolean b4 = Boolean.valueOf("no");
        Boolean b5 = Boolean.valueOf("1");

        Boolean b6 = Boolean.valueOf("TrUe");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(b6);


    }



    public static void run() {
        runStringToBite();
        runStringToInt();
        runStringToDouble();
        runStringToBoolean();
    }



}
