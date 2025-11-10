package com.tns.generics;



public class GenericMethodTest {
    public static void main(String[] args) {
        GenericMethod obj = new GenericMethod();
        Integer[] intarray = { 10, 20, 30, 40 };
        String[] str = { "java", "programming", "learning" };

        obj.displayArrayElements(intarray);
        obj.displayArrayElements(str);

    }


}