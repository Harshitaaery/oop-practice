package com.harshita.comparing;
import java.util.ArrayList; 
import java.util.function.Consumer;


public class LamdaFunctions {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<5; i++){
            arr.add(i*3);
        }

        // arr.forEach((item) ->   System.out.println(item*2));

        Consumer<Integer> fun = (item) -> System.out.println(item*2);
        arr.forEach(fun);

        Operation sum = (a,b) -> a+b;


    }

    int sum(int a, int b){
        return a+b;
    }
}

interface Operation{
    int operation(int a, int b);
}