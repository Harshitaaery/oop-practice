package com.harshita.intro;

public class Inheritance {
    public static void main(String[] args){
        Box b1 = new Box();
        System.out.println(b1.l + " " + b1.w + " " + b1.h);
        BoxWeight b2 = new BoxWeight(3,5,2,6);
        System.out.println(b2.l + " " + b2.weight + " " + b2.h);
    }
}

class Box {

    int l;
    int w;
    int h;
    int weight;

    Box(){
        this.h = 1;
        this.w = 1;
        this.l = 1;
    }

    Box(int side)
    {
        this.w = side;
        this.h = side;
        this.l = side;
    }

    Box(int l, int w, int h){
        this.h = h;
        this.w = w;
        this.l = l;
    }

    Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public void info(){
        System.out.println("Running the Box");
    }
}

class BoxWeight extends Box{
    int weight;

    public BoxWeight(){
        this.weight = 5;
    }

    public BoxWeight(int l, int w, int h, int weight){
        super(l,h,w);
        super.weight = weight;
        this.weight = 5;
        this.l = 6;
    }

    
}