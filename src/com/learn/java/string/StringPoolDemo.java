package com.learn.java.string;

/**
 * Created by Legend Of Legends on 9/28/2018.
 */
public class StringPoolDemo {

    public static void main(String[] args){

        String s1 = "Moshiur";
        String s2 = "Moshiur";
        String s3 = s1;
        String s4= new String("Moshiur");
        String s5= new String("Moshiur");
        String s6 = "Moshiur" .intern();
        String s7 = "ur";

        System.out.println("s1 == s2 : "+ (s1 == s2));
        System.out.println("s1 == s3 : "+ (s1 == s3));
        System.out.println("s1 == s4 : "+ (s1 == s4));
        System.out.println("s4 == s5 : "+ (s4 == s5));
        System.out.println("s1 == s6 : "+ (s1 == s6));
        System.out.println("s1 == 'Moshi' + s7 : "+ (s1 == "Moshi" + s7));
        System.out.println("s1 == s4.intern() : "+ (s1 == s4.intern()));

    }
}
