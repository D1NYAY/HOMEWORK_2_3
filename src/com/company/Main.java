package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(ageTemp(20, 28));
        System.out.println(ageTemp(40, 15));
        System.out.println(ageTemp(30, 20));
        System.out.println(ageTemp(28, -5));
        System.out.println(ageTemp(13, 10));

    }

    public static String ageTemp(int age, int temp) {
        String permission = ("Можно идти гулять");
        String should = ("Оставайтесь дома");
        if (age >= 20 && age <= 45 && temp >= -20 && temp <= 35) {
            return permission;
        } else if (age < 20 && temp >= 0 && temp <= 28) {
            return permission;
        } else if (age >= 20 && temp >= -10 && temp <= 25){
            return permission;
        }else
            return should;


    }}
