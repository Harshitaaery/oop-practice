package com.harshita.comparing;

public class ExceptionHandling {
    
}

class Main{
    public static void main(String[] args){
        int a = 5;
        int b = 0;
        try{
           divide(a,b);
        } catch (ArithmeticException e){ //stricter, less general ones first
            System.out.println(e.getMessage());
        } catch (Exception e){ //generalexception later because it'll catch all exception so it wouldn't make sense to put it first
            System.out.println(e.getMessage());
        } finally {
            System.out.println("it's okay you'll learn");
        }

    }

    static int divide(int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException( "please don't do this uwu");
        }

        return a/b;
    }
}
