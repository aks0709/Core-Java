package Functional_Interface;
@FunctionalInterface   //we use annotation to make sure that the interface will have only 1 method
interface A{
    void fun();

    //void sum();
    String toString();  // it doesnt throw error as this method is already overridden and it is method from Object class
}
class B implements A{
    public void fun(){
        System.out.println("Hey There");
    }
}




public class FI_DEMO {
    public static void main(String[] args) {
        A obj=()->{
                System.out.println("HEY I AM UNDER ANONYMOUS INNER CLASS");
            System.out.println("THIS PRINT IS TO TEST MULTIPLE STATEMENT UNDER LAMBDA EXPRESSION BLOCK");
        };

        A obj2=()-> System.out.println("hELLO I AM SINGLE  LINE STATEMENT");
        obj.fun();
        obj2.fun();

    }
}
