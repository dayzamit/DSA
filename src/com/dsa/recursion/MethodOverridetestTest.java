package com.dsa.recursion;

public class MethodOverridetestTest {

    public static void main(String[] args) {

         String test ="test";
         String test2 =new String("test");

        System.out.println(test==test2);
        System.out.println(test.equals(test2));


      /*  A a = new B();
        a.method1();*/
    }
}

class A
{
    public void method1()
    {
        System.out.println("Method 1 in class A");
    }
}

class B extends A
{

    @Override
    public void method1() {

        System.out.println("Method 1 in class B");
    }

    public void method2() {
        System.out.println("Method 2 in class B");
    }




}
