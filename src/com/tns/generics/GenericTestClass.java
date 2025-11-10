package com.tns.generics;


public class GenericTestClass {
    public static void main(String[] args) {
        GenericClass<String> obj = new GenericClass<String>();
        obj.setData("hello");
        System.out.println(obj);
        // obj.setData(10);   // ❌  type mismatch
        // obj.setData(12.3f); // ❌  type mismatch

        GenericClass<Integer> obj1 = new GenericClass<Integer>();
        obj1.setData(10);
        System.out.println(obj1);
    }
}
