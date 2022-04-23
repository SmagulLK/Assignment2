package com.company;

public class Mystack<T> {
    private int len;
    private int SZA;
    public Object[] array;

    public Mystack() {
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
            return (T) array[len];
        }
        return (T) "The Stack is empty";
    }

    public T pop() {
        if (len==0) {
            return (T) "The Stack is empty";
        }

        len=len-1;
        return (T) array[len];
    }

    private void increaseCapacity() {
        SZA = 2 * SZA;
        Object[] old = array;
        array = new Object[SZA];
        for (int i = 0; i < old.length; i++)
            array[i] = old[i];
    }


}
