package com.company;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class main {
    public static void main(String[] args){
//        Mystack<Integer> array = new Mystack<>();
////        array.push(1);
////        array.push(2);
////        array.push(3);
////        array.push(4);
////        System.out.println(array.size());
////
////
////
////
////        System.out.println(array.pop());
     //   for(int i=0;i< array.array.length;i++){

   //    }
        MyQueue<Integer> Q=new MyQueue<>();
        Q.push(1);
        Q.push(2);
        Q.push(3);
        Q.push(4);
        System.out.println(Q.popQueue());
        Q.push(6);

        Q.show();


}
}
