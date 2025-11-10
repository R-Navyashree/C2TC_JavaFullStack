package com.tns.generics;



public class GenericClass<E> {  // <-- Added <E> here
    private E data;  // Best practice: make it private

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "GenericClass [data=" + data + "]";
    }
}
