package com.jm.geeksforgeeks;

// Class 1
public class Base {

    // Method
    public void display(){
        System.out.println("Base display()");
    }
}

class Derived extends Base{

//    @Override
    public void display(int a){
        System.out.println("Derived display(int)");
    }

    public static void main(String[] args) {
        Derived obj = new Derived();
        obj.display(123);
    }
}
