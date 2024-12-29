// Java is not purwly OO but 99.99% OO.
// primitive types don't have a object class so that variables are not created in heap.

// WRAPPER CLASS - For every primitive variables, we will have a wrapper class

public class Wrapper{
    public static void main(String a[]){
        int num=7;
        Integer num1 = new Integer(num); // deprecated way of storing
        Integer num2 = num; // Autoboxing
        // because num is primitive type and num2 is a reference type
        // automatically storing prmitive into object type is called auto boxing

        int num3 = num1.intValue();
        int num4 = num1; // auto-unboxing

        System.out.println(num1);
        System.out.println(num2);
    }
}