package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = 0;
        int schetchik = 0;
        while (b<a){
        b++;
        schetchik +=b;
        if (b<a){
        System.out.print(b+"+");
        }
        else System.out.print(b + "=");
        }
        System.out.print(schetchik);
    }
}
