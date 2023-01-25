package com.demo;
import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] args) {
        Arithmetic ar=new Arithmetic();
        Scanner sc=new Scanner(System.in);
        int a,b,c,d,e,f,g,h;
        System.out.println("Enter 2 Numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        ar.add(a,b);
        c=sc.nextInt();
        d=sc.nextInt();
        ar.sub(c,d);
        e=sc.nextInt();
        f=sc.nextInt();
        ar.mul(e,f);
        g=sc.nextInt();
        h=sc.nextInt();
        ar.div(g,h);
    }
    public static void add(int x,int y)
    {
        int c=x+y;
        System.out.println("Addition = "+c);
    }
    public static void sub(int x,int y)
    {
        int c=x-y;
        System.out.println("Subtraction = "+c);
    }
    public static void mul(int x,int y)
    {
        int c=x*y;
        System.out.println("Multiplication = "+c);
    }
    public static void div(int x,int y)
    {
        int c=x%y;
        System.out.println("Division = "+c);
    }
}
