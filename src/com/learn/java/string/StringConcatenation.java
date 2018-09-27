package com.learn.java.string;

/**
 * Created by Moshiur on 9/28/2018.
 */
public class StringConcatenation {

    public static void main(String[] args){

        String str = "Hello " + "Everyone! ";

        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.append(" I am").append(" Moshiur");

        System.out.println(stringBuffer);
        System.out.println(stringBuffer.length());

        stringBuffer.delete(5,14);
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.length());

        stringBuffer.insert(6, "Hi!");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.length());
    }
}
