package com.demo;

public class Arith {
    public int add(int a,int b)
    {
        return a+b;
    }
    public int sub(int a,int b)
    {
        return a-b;
    }
    public int mul(int a,int b)
    {
        return a*b;
    }
    public int div(int a,int b)
    {
        return a%b;
    }
    public static void main(String[] args) {
        Arith ar=new Arith();
        System.out.println("Adding 2 Numbers ="+ar.add(5,6));
        System.out.println("Subtract 2 Numbers ="+ar.sub(5,6));
        System.out.println("Multiply 2 Numbers ="+ar.mul(5,6));
        System.out.println("Divide 2 Numbers ="+ar.div(5,6));
    }
}
