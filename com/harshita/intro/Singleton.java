package com.harshita.intro;

public class Singleton {
    private Singleton(){

    }
    private static Singleton instance;

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }

        return instance;

    }
}

class Main{
    public static void main(String[] args){
        Singleton obj = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();

        //all point to same object
    }
}
