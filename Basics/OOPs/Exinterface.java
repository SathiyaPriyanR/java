

package com.mycompany.exinterface;


class Sample2 implements Sample {
    @Override
    public void method1(){
        System.out.println("Jhon");
        
    }

    @Override
    public void method2() {
       System.out.println("Peter"); 
    }

    @Override
    public void method3() {
       System.out.println("Parker"); 
    }
}
public class Exinterface {

    public static void main(String[] args) {
        Sample2 obj = new Sample2();
        obj.method1();
        obj.method2();
        obj.method3();
    }
}
