package com.IntroToOOPS;

//--- Access Modifiers ---
//public : accessible from everywhere
//default : accessible within SAME PACKAGE
//protected : accessible within SAME PACKAGE + accessible by CHILD from anywhere (different package or module)
//private : accessible within SAME CLASS

public class Student {

    public String name;
    public int age;
    int gradYear;
    private int psp;

    public Student(){
        name = "new student";
        age = 20;
        gradYear = 2018;
        psp = 80;
    }

    void attendClass(){
        System.out.println("Student " + name + " is attending class");
    }

    public int getPsp() {
        return psp;
    }

    public void setPsp(int pspVar) {
        if(pspVar < 0 || pspVar > 100){
            throw new RuntimeException("Invalid psp");
        }
        this.psp = pspVar;
    }
}

//--- Access Modifiers ---
//public : accessible from everywhere
//default : accessible within SAME PACKAGE
//protected : accessible within SAME PACKAGE + accessible by CHILD from anywhere (different package or module)
//private : accessible within SAME CLASS
