package OverridingBasics;

interface A{
    void fun();   //public and abstract by default
}

class B implements A{
    public void fun(){   //access modifiers must same of greater that's why we make method as public
        System.out.println("we override method of parents class");
    }
}

class C implements A{

//    @Override
//    private void fun() {  results in error as it have weaker access modifiers
//
//    }


    @Override
    public void fun() {
        System.out.println("HE HE");
    }
}


public class AccessModifiers {

}
