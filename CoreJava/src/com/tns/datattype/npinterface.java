package com.tns.datattype;

import java.io.IOException;

interface CalcInterface
{  
    void multiply();  
    void divide();  
}  
public class npinterface implements CalcInterface {  
      
        // defining the variables of class  
        int a = 10;  
        int b = 20;  
        int c;  
  
        // implementing the interface methods  
        public void multiply() {  
            int c = a * b;  
            System.out.println("Multiplication of numbers is: " + c);  
        }  
        public void divide() {  
            int c = a / b;  
            System.out.println("Division of numbers is: " + c);  
        }  
    // main method  
    public static void main (String[] args) throws IOException {  
        npinterface obj = new npinterface();  
        // calling the methods  
        obj.multiply();  
        obj.divide();  
    }  
}