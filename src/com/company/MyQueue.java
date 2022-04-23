package com.company;



public class MyQueue<T> {
    private int len;

    private int SZA;

    public Object[] array;
    int front=0;



    public MyQueue() {
        SZA = 10;
        array = new Object[SZA];
        len = 0;

    }

    public void push(T item) {
        if (len == SZA) {
            increaseCapacity();
            array[len] = item;
        } else {
            array[len] = item;
        }
        len++;
    }

    public boolean empty() {
        return len == 0;
    }

    public int size() {
        return len;
    }

    public T peek() {
        if (len!=0) {
            return (T) array[SZA];
        }
        return (T) "The Stack is empty";
    }

    public T popQueue() {
//
//
        int target=0;
        Object first=array[0];
        for(int i=target;i<len-1;i++){
            array[i]=array[i+1];
        }
        array[len-1]=0;
        len--;
        return (T) first;



















    }

    private void increaseCapacity() {
        SZA = 2 * SZA;
        Object[] old = array;
        array = new Object[SZA];
        for (int i = 0; i < old.length; i++)
            array[i] = old[i];
    }
    public void show(){
        for(int i=0;i<len;i++){
            System.out.print(array[i]+" ");
        }
    }

}
