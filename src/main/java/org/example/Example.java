package org.example;

public class Example {
    int a;
    static int count;
    Example(){
        count++;
    }

    Example(int a){
        this.a = a;
    }
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    Example e = new Example();

}
