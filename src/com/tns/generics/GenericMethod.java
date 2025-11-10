package com.tns.generics;


public class GenericMethod {
    //Generic Method
    public<E> void displayArrayElements(E[] elements){
        for(E i: elements)
            System.out.println("the elements are"+i);


    }

}
