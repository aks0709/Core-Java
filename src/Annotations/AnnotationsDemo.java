package Annotations;
@SuppressWarnings("all")
class A{
     void someFunction(){
        System.out.println("This is A's Function");
    }
}
class B extends A{
    @Override
    void someFunction(){
        System.out.println("This is B's Function");
    }
}
@Deprecated @SuppressWarnings("all")
class C{
    static void someFunction(){
        System.out.println("THIS IS DEPRECATED CLASS ");
    }
}

public class AnnotationsDemo {
    public static void main(String[] args) {
        B obj=new B();
        obj.someFunction();
//        C obj2=new C();
    }
}
