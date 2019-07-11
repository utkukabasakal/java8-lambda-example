package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class LambdaExample {

    public interface MathOperation {
        int operation(int a, int b);
    }
    public interface Name {
        void name (String message);
    }
    public interface  Lastname{
        void lastname (String message2);
    }
    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
    public static void main(String args[]) {
        LambdaExample sayi = new LambdaExample();
        MathOperation topla = (int a, int b) -> a + b;
        MathOperation cikar = (int a, int b) -> a - b;
        MathOperation carp = (int a, int b) ->  a * b; ;
        MathOperation bol = (int a, int b) -> a / b;
        //
        System.out.println("20 + 45 = " + sayi.operate(20, 45, topla));
        System.out.println("54 - 12 = " + sayi.operate(54, 12, cikar));
        System.out.println("34 x 5 = " + sayi.operate(34, 5, carp));
        System.out.println("90 / 2 = " + sayi.operate(90, 2, bol));
        //
        Name isim = message -> System.out.println("isim: " + message);
        //
        Lastname soyisim = message2 -> System.out.println("Soyisim : " + message2);
        //
        Name isim2 = (message) -> System.out.println("isim: " + message);
        //
        Lastname soyisim2 = message2 -> System.out.println("Soy isim : " + message2);
        //
        System.out.println("---------------");
        //
        isim.name("Ali");
        soyisim.lastname("Koc");
        System.out.println("---------------");
        //
        isim2.name("Veli");
        soyisim2.lastname("Yıldız");
        System.out.println("--------------");
        //
        //
        ArrayList<Integer> liste = new ArrayList<Integer>();
        liste.add(1);
        liste.add(2);
        liste.add(3);
        liste.add(4);
        liste.forEach(n -> System.out.println(n));
        System.out.println("--------------------");
        liste.forEach(n -> { if (n%2 == 0) System.out.println(n);});
        //
        //
        System.out.println("--------------------");
        LinkedList<String> nick = new LinkedList<String>();
        nick.add("Ayse");
        nick.add("Fatma");
        nick.add("Ayhan");
        nick.forEach(m-> System.out.println(m));
        //
        //
    }
}