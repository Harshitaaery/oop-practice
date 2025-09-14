package com.harshita.generics;
import java.util.Arrays;

public class CustomGenArrayList<T extends Number>{
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size =0; //also working as index value

    public CustomGenArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize(){
        Object[] temp = new Object[data.length*2];
        //copy the old data into new array
        for(int i=0; i<data.length;i++)
        {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull(){
        return size == data.length;

    }

    public int remove(){
        T removed = (T) data[--size];
        return removed;
    }

    public T get(int index){
        return (T)data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, T value){
        data[index] = value;
    }

    @Override
    public String toString()
    {
        return "CustomGenArrayList{" +
    "data=" + Arrays.toString(data) + 
", size=" + size + "}";
    }


    public static void main(String[] args)
    {
        CustomGenArrayList<Integer> list = new CustomGenArrayList<>();
        list.add(3);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(5);
        list.add(9);
        // list.add("gfdf");

       System.out.println(list);
    }
}