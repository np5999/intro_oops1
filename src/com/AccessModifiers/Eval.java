package com.AccessModifiers;

import com.IntroToOOPS.Student;


//--- Access Modifiers ---
//public : accessible from everywhere
//default : accessible within SAME PACKAGE
//protected : accessible within SAME PACKAGE + accessible by CHILD from anywhere (different package or module)
//private : accessible within SAME CLASS


public class Eval {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Rama Rao";
//        s1.psp = 99;
    }
}
