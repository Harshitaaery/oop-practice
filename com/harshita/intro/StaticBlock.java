package com.harshita.intro;

public class StaticBlock {
    static int a=4;
    static int b=9;

    static{
        System.out.println("inside static block"); //executed only once when the class is loaded (first obj created)
        a *= b;
    }

    public static void main(String[] args){
        StaticBlock sb1= new StaticBlock();
        System.out.println(StaticBlock.a);
    }
} 
