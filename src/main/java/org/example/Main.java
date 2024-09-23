package org.example;

import java.util.Arrays;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

        String first = "Hello world!";
        String second = "Hello world!";

        // Сравнение сток
        out.println( first  + " = " + second +  " - " + compareStr(first, second));

        // Склеивание строк
        out.println(clueStr(first, second));

        //Певая половина строки
        out.println("Первая половина " + first + " = " + ourString(first));

        //Каждая вторя сторка в верхнем регистре
        String[] w = {"Hello", "world", "and" ,"good", "morning"};
        out.println(Arrays.toString(ourSrting(w)));

        //Српаснение строк
        out.println("pirozhok" + " = " + strangeStr("pirozhok"));

        //Сравнение сотвествий начал строк
        out.println("Равенство начал " +strangeStr("pirozhok", "pir"));

        //Домашка
        out.println("HellO mY Friend!"  + " -> " + revertStr("HellO mY Friend!"));

    }
    static boolean compareStr(String str, String str2){
        if (str.equals(str2)) return true;
        return false;
    }
    static String clueStr(String str, String str2){
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.append(str2);
        return stringBuilder.toString().toUpperCase();
    }
    //Задача 3
    public static   String ourString(String str){
        int l = str.length() / 2;
        return str.substring(0, l);
    }
    public static String[] ourSrting(String[] value){
        String[] result =new String[value.length] ;
        for (int j = 0; j < value.length; j++) {
            if (j % 2 == 0) {
                result[j] = value[j].toUpperCase();
            }
            else result[j] =value[j];
        }
        return result;
    }
    public static String strangeStr( String str){
        StringBuilder builder = new StringBuilder("");
        for (char s :str.toCharArray())
            if ( s == 'o') builder.append("!");
            else builder.append(s + "");
        return builder.toString();
    }
    public static boolean strangeStr(String str, String str2){
        int lenStr2 = str2.length() -1;
        if (str.substring(0, lenStr2).equals(str2.substring(0, lenStr2))) return true;
        return false;
    }
    public static String revertStr(String str){
        StringBuilder stringBuilder = new StringBuilder("");
        for (char c : str.toCharArray()){
            String t = c + "";
            if (!t.equals(t.toLowerCase())) stringBuilder.append(t.toLowerCase());
            else stringBuilder.append(t.toUpperCase());
        }
        return stringBuilder.toString();
    }

}