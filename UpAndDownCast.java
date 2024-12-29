// One is typecasting used in the variables
// second is the upcasting and down casting used in the objects

class A{
    public void show1(){
        System.out.println("In A show");
    }
}
class B extends A{
    public void show2(){
        System.out.println("In B show");
    }
}

public class UpAndDownCast{
    public static void main(String a[]){
        A ob = new B(); // A ob = (A) new B(); both are same thing, we upcasted the object to the parent class
        ob.show1(); // this will work
        //ob.show2(); // this will not work
        // this is happening because of the up casting becoz in up casting
        // even if the object is of B, java implicitly typecastes it into A Type
        // therefore it can access A methods but not B methods

        B ob2 = (B) ob; // and now we down casted the above ob object to its child class from parent class
        ob2.show2(); // this will work
        ob2.show1(); // this will also work because of inheritance
    }
}