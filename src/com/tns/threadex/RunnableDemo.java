package com.tns.threadex;

public class RunnableDemo {
    public static void main(String[] args) {
        UsingRunnable obj = new UsingRunnable(4,0,"Kiran");
        Runnable runnable=new Runnable() {
            @Override
            public void run() { // anonymous class
                System.out.println("Runnable With Anonymous Class");
            }
        };
        //It is similar like lambda expression that why we used ';' symbol it is called ananymous expresion we have to use either any one of it
        //Creating lambda expression
        runnable=() -> {
            System.out.println("Runnable with lambda expression");
        };
        Thread ob1=new Thread(runnable);//implements runnable
        ob1.start();
    }
}
