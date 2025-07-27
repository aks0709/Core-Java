package Functional_Interface;
@FunctionalInterface
interface LE{
    int sum(int i,int j);
}
@SuppressWarnings("all")
public class LambdaExp {
    public static void main(String[] args) {
        LE obj=(i,j) -> i+j;
        System.out.println(obj.sum(4,5));
    }

}
